
package org.daniel._02_interfaces;

import org.daniel._01_checked_and_unchecked_execptions._01_checked_exception.CarState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final Logger log = LoggerFactory.getLogger(CarService.class);

    public void process(String input) throws Exception {
        CarState carState = CarState.from(input);
    }

    public void drive() {
        Car[] cars = {new BMW(), new Porsche(), new Mercedes()};
        for (Car carItem : cars) {
            carItem.drive();
        }
    }

}

