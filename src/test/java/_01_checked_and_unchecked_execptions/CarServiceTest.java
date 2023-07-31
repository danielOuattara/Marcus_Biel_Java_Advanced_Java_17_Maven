package _01_checked_and_unchecked_execptions;


import org.daniel._01_checked_and_unchecked_execptions._02_unchecked_exception.CarService;
import org.junit.jupiter.api.Test;

public class CarServiceTest {
    @Test
    public  void shouldDemonstrateLogging () throws Exception {
        CarService carService = new CarService();
        carService.process("BMW");
    }
}
