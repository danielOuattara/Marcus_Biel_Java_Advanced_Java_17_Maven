package _03_inheritance;

import org.daniel._03_inheritance.*;
import org.junit.jupiter.api.Test;

public class ZooTest {
    @Test
    public void shouldFeedAnimals() {
        Zoo zoo = new Zoo();
        Animal[] animals = {new Dog(), new Gorilla(), new Lion(), new Tiger()};
        zoo.feedAnimals(animals);
    }
}
