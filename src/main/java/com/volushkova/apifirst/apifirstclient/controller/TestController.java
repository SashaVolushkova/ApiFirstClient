package com.volushkova.apifirst.apifirstclient.controller;


import com.volushkova.apifirst.generated.petclient.PetsApiClient;
import com.volushkova.apifirst.generated.petclient.model.Pet;
import com.volushkova.apifirst.generated.server.TestsApi;
import com.volushkova.apifirst.generated.server.model.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TestController implements TestsApi {
    private final PetsApiClient petsApiClient;

    public TestController(PetsApiClient petsApiClient) {
        this.petsApiClient = petsApiClient;
    }

    @Override
    public ResponseEntity<Test> showTestById(String testId) {
        petsApiClient.createPets();
        ResponseEntity<List<Pet>> listResponseEntity = petsApiClient.listPets(10);
        List<Pet> petList = listResponseEntity.getBody();
        StringBuilder result = new StringBuilder();
        if (petList != null) {
            for (Pet pet : petList) {
                result.append(pet.getName());
            }
        }
        Test test = new Test();
        test.setId(1L);
        test.setTag(result.toString());
        test.setName(result.toString());
        return ResponseEntity.ok(test);
    }
}
