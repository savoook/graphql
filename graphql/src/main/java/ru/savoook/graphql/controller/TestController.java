package ru.savoook.graphql.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.savoook.graphql.entity.Vehicle;
import ru.savoook.graphql.service.VehicleService;

import java.util.List;

@RestController
@RequestMapping("/rest")
@RequiredArgsConstructor
public class TestController {

    private final VehicleService service;

    @GetMapping("/getAll")
    public ResponseEntity<List<Vehicle>> getAllVehicles(@RequestParam int count) {

        return new ResponseEntity<>(service.getAllVehicles(count), HttpStatus.OK);

    }
}
