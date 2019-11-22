package pl.samouczekprogramisty.patterns.decorator;

import java.math.BigDecimal;

public class PizzaWithMozzarella extends Pizza {

    private static final BigDecimal MOZZARELLA_PRICE = new BigDecimal(5);
    private final Pizza basePizza;

    public PizzaWithMozzarella(Pizza basePizza) {
        this.basePizza = basePizza;
        this.toppings.addAll(basePizza.toppings);
        this.toppings.add("mozzarella");
    }

    @Override
    public BigDecimal getPrice() {
        return basePizza.getPrice().add(MOZZARELLA_PRICE);
    }
}
