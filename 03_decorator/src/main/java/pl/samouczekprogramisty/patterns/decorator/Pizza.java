package pl.samouczekprogramisty.patterns.decorator;

import java.math.BigDecimal;

public class Pizza {
    private static final BigDecimal BASE_PRICE = new BigDecimal(12);

    public BigDecimal getPrice() {
        return BASE_PRICE;
    }
}