package com.example.baseproject.jgiven;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;


public class GivenOperators extends Stage<GivenOperators> {
    @ProvidedScenarioState
    protected Operators operators;


    @BeforeStage
    private void init() {
        operators = new Operators();
    }

    public GivenOperators diviseur_$( int diviseur) {
        operators.setDeviseur(diviseur);
        return self();
    }

    public GivenOperators dividende_$( int dividende) {
        operators.setDividende(dividende);
        return self();
    }
}
