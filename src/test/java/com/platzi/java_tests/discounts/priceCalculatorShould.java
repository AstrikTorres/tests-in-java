package com.platzi.java_tests.discounts;

import org.junit.Test;
import static org.junit.Assert.*;

public class priceCalculatorShould {

    @Test
    public void TotalZeroWhenThereArePrices() {
        PriceCalculator calculator = new PriceCalculator();

        assertEquals(0.0, calculator.getTotal(), 0.0);
    }

    @Test
    public void TotalIsTheSumOfPrices() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(10.2);
        calculator.addPrice(13.7);

        assertEquals(10.2 + 13.7,
                calculator.getTotal(),
                0.0
        );
    }

    @Test
    public void addDiscountOf25PercentToPrice() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(11.9);
        calculator.addPrice(30.7);

        calculator.addDiscount(25);

        assertEquals((11.9 + 30.7) *.75,
                calculator.getTotal(),
                0.0)
        ;
    }

    @Test
    public void addTwoDiscountsToPrice() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(11.9);
        calculator.addPrice(30.7);
        calculator.addPrice(28.6);

        calculator.addDiscount(25);
        calculator.addDiscount(10);

        assertEquals((11.9 + 30.7 + 28.6) *.75 *.90,
                calculator.getTotal(),
                0.0
        );
    }

}