package com.example.baseproject.controller;

import com.example.baseproject.model.EuclideResult;
import com.example.baseproject.service.EuclidianDivisionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EuclidianDivisionControlleur {
    protected EuclidianDivisionService euclidianDivisionService;

    @GetMapping("/")
    public EuclideResult performEuclidianDivision(int dividende, int diviseur) {
        return euclidianDivisionService.divide(dividende, diviseur);
    }
}
