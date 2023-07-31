
package org.daniel._01_checked_and_unchecked_execptions._03_handle_exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final Logger log = LoggerFactory.getLogger(CarService.class);

    public void process(String input) {
        CarState carState = CarState.from(input);

        //      even simpler
        log.info("Entering Application");
        log.debug("processing car : {} ", input);
        log.info("Exiting Application");
    }
}

