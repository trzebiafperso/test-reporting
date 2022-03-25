package com.example.baseproject.service;

import com.example.baseproject.model.EuclideResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EuclidianDivisionService {
    public EuclideResult divide(int dividende, int diviseur) {
        int quotien = 0;
        int reste = dividende;
        if (diviseur != 0) {
            quotien = dividende / diviseur;
            reste = dividende % diviseur;
        }
        return EuclideResult.builder()
                .dividende(dividende)
                .diviseur(diviseur)
                .quotien(quotien)
                .reste(reste)
                .build();
    }
}
