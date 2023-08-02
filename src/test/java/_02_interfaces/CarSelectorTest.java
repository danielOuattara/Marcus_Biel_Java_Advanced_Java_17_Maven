package _02_interfaces;

import org.daniel._02_interfaces.CarSelector;
import org.junit.jupiter.api.Test;

public class CarSelectorTest {

    @Test
    public void shouldReturnSomething() throws Exception {
        String[] brands = {"BMW", "Porsche", "Audi"};
        CarSelector.main(brands);
    }
}
