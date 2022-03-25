package com.example.baseproject.jgiven;

import com.example.baseproject.model.EuclideResult;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThenLibrary extends Stage<ThenLibrary> {
    @ExpectedScenarioState
    protected EuclideResult euclideResult;

    public ThenLibrary diviseur_is_$(int diviseur) {
        assertEquals(diviseur, euclideResult.getDiviseur());
        return self();
    }

    public ThenLibrary dividende_is_$(int dividende) {
        assertEquals(dividende, euclideResult.getDividende());
        return self();
    }

    public ThenLibrary reste_is_$(int reste) {
        assertEquals(reste, euclideResult.getReste());
        return self();
    }

    public ThenLibrary quotient_is_$(int quotient) {
        assertEquals(quotient, euclideResult.getQuotien());
        return self();
    }
}
