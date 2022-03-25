package com.example.baseproject.service;

import com.example.baseproject.model.EuclideResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EuclidianDivisionServiceTest {

    protected EuclidianDivisionService euclidianDivisionService;

    @BeforeEach
    public void init() {
        euclidianDivisionService = new EuclidianDivisionService();
    }

    @Test
    public void shouldDoAnEuclidianDivision() {
        EuclideResult euclideResult = euclidianDivisionService.divide(10, 3);
        assertNotNull(euclideResult);
        assertEquals(10, euclideResult.getDividende());
        assertEquals(3, euclideResult.getDiviseur());
        assertEquals(3, euclideResult.getQuotien());
        assertEquals(1, euclideResult.getReste());
    }

    @Test
    public void shouldDoAnEuclidianDivisionwithNoReste() {
        EuclideResult euclideResult = euclidianDivisionService.divide(8, 4);
        assertNotNull(euclideResult);
        assertEquals(8, euclideResult.getDividende());
        assertEquals(4, euclideResult.getDiviseur());
        assertEquals(2, euclideResult.getQuotien());
        assertEquals(0, euclideResult.getReste());
    }

    @Test
    public void shouldDoAnEuclidianDivisionwithNoQuotien() {
        EuclideResult euclideResult = euclidianDivisionService.divide(3, 5);
        assertNotNull(euclideResult);
        assertEquals(3, euclideResult.getDividende());
        assertEquals(5, euclideResult.getDiviseur());
        assertEquals(0, euclideResult.getQuotien());
        assertEquals(3, euclideResult.getReste());
    }

    @Test
    public void shouldDoAnEuclidianDivisionWhenDivideByZero() {
        EuclideResult euclideResult = euclidianDivisionService.divide(125, 0);
        assertNotNull(euclideResult);
        assertEquals(125, euclideResult.getDividende());
        assertEquals(0, euclideResult.getDiviseur());
        assertEquals(0, euclideResult.getQuotien());
        assertEquals(125, euclideResult.getReste());
    }
}
