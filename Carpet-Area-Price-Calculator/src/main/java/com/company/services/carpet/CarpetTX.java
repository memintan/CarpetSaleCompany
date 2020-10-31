package com.company.services.carpet;

import com.company.enums.Cities;
import com.company.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetTX implements Carpet {

    private static final Map<Cities, BigDecimal> sqPriceForCity = new HashMap<>();

    static {
        sqPriceForCity.put(Cities.DALLAS, new BigDecimal(1.75));
        sqPriceForCity.put(Cities.AUSTIN, new BigDecimal(1.32));
        sqPriceForCity.put(Cities.SAN_ANTONIO, new BigDecimal(2.20));


    }


    @Override
    public BigDecimal getSqFtPrice(Cities city) {

        BigDecimal defaultValue = BigDecimal.ZERO;

        Optional<Map.Entry<Cities,BigDecimal>> collect = sqPriceForCity.entrySet().stream()
                .filter(x->x.getKey() == city).findFirst();

        return collect.isPresent() ? collect.get().getValue(): defaultValue;
    }
}