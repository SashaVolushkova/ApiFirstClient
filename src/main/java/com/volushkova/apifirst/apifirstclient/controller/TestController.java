package com.volushkova.apifirst.apifirstclient.controller;

import com.volushkova.apifirst.generated.petclient.PetsApiClient;
import com.volushkova.apifirst.generated.server.TestsApi;
import com.volushkova.apifirst.generated.server.model.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class TestController implements TestsApi {
    private final PetsApiClient petsApiClient;

    public TestController(PetsApiClient petsApiClient) {
        this.petsApiClient = petsApiClient;
    }

    @Override
    public ResponseEntity<Test> showTestById(String testId) {

        return TestsApi.super.showTestById(testId);
    }
}
