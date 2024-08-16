package org.example.serviceemploye.infrastructure.restProject.config;

import org.example.serviceemploye.shared.dto.ProjectDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClient <T, V>{

    private String apiURL = "http://localhost:3000/";
    private RestTemplate restTemplate;
    private HttpHeaders httpHeaders;

    public RestClient() {
        restTemplate = new RestTemplate();
        httpHeaders = new HttpHeaders();
        httpHeaders.add("Accept", "*/*");
        httpHeaders.add("content-type", "application/json");
    }

    public T get(String uri, Class<T> type) {
        HttpEntity<String> requestEntity = new HttpEntity<>("", httpHeaders);
        ResponseEntity<T> responseEntity = restTemplate.exchange(apiURL+uri, HttpMethod.GET, requestEntity, type);
        return responseEntity.getBody();
    }

    public T post(String uri, Class<ProjectDTO> type, ProjectDTO data) {
        HttpEntity<V> requestEntity = (HttpEntity<V>) new HttpEntity<>(data, httpHeaders);
        ResponseEntity<T> responseEntity = (ResponseEntity<T>) restTemplate.exchange(apiURL+uri, HttpMethod.POST, requestEntity, type);
        return responseEntity.getBody();
    }
}
