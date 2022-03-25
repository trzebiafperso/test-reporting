package com.example.baseproject.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EuclideResult {
    private int reste;
    private int quotien;
    private int diviseur;
    private int dividende;
}
