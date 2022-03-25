package com.example.baseproject.jgiven;

import com.example.baseproject.model.EuclideResult;
import com.example.baseproject.service.EuclidianDivisionService;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;

public class WhenOrderService extends Stage<WhenOrderService> {
    @ExpectedScenarioState
    protected Operators operators;

    @ProvidedScenarioState
    protected EuclideResult euclideResult;

    protected EuclidianDivisionService euclidianDivisionService;

    @BeforeStage
    private void init() {
        euclidianDivisionService = new EuclidianDivisionService();
    }

    public WhenOrderService make_an_euclidian_division() {
        euclideResult=euclidianDivisionService.divide(operators.getDividende(),operators.getDeviseur());
        return self();
    }
}
