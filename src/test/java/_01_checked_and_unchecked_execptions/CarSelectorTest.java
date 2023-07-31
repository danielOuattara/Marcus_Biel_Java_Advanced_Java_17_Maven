package _01_checked_and_unchecked_execptions;

import org.daniel._01_checked_and_unchecked_execptions._02_unchecked_exception.CarSelector;
import org.junit.jupiter.api.Test;

public class CarSelectorTest {

    @Test
    public void shouldReturnSomething() throws Exception {
        String[] brands = {"BMW", "Porsche", "Audi"};
        CarSelector.main(brands);
    }
}
