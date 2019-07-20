package com.java.optional.project.modem;

import java.util.Optional;

public class ModemService {

    public boolean priceIsInRange (Modem modem) {
        return Optional.ofNullable(modem)
                .map(Modem::getPrice)
                .filter(p -> p < 18)
                .filter(p -> p> 15)
                .isPresent();

    }
}
