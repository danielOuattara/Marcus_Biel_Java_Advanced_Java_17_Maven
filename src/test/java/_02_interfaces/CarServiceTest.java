package _02_interfaces;


import org.daniel._02_interfaces.CarService;
import org.junit.jupiter.api.Test;

public class CarServiceTest {
    @Test
    public  void shouldDemonstrateLogging () throws Exception {
        CarService carService = new CarService();
        carService.drive();

    }
}
