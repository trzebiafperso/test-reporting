package com.example.baseproject.jgiven;

import com.tngtech.jgiven.junit5.ScenarioTest;
import org.junit.jupiter.api.Test;

public class PreOrderBookScenarioTest extends ScenarioTest<GivenOperators, WhenOrderService, ThenLibrary> {

    @Test
    public void premium_customer_can_order_book_earlier() {
        final String bookId = "123";

        given().dividende_$(10)
                .with().diviseur_$(2);

        when().make_an_euclidian_division();

        then().dividende_is_$(10)
                .diviseur_is_$(2)
                .quotient_is_$(5)
                .reste_is_$(0);
    }

    //Implementation of 2 other AC cases...
}
