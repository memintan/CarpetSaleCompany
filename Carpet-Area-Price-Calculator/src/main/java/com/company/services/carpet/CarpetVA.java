package com.company.services.carpet;

import com.company.enums.Cities;
import com.company.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetVA implements Carpet {

    private static final Map<Cities, BigDecimal> sqPriceForCity = new HashMap<>();

    static {
        sqPriceForCity.put(Cities.MCLEAN, new BigDecimal(4.32));
        sqPriceForCity.put(Cities.ARLINGTON, new BigDecimal(2.92));
        sqPriceForCity.put(Cities.FAIRFAX, new BigDecimal(4.65));


    }


    @Override
    public BigDecimal getSqFtPrice(Cities city) {

        BigDecimal defaultValue = BigDecimal.ZERO;

        Optional<Map.Entry<Cities,BigDecimal>> collect = sqPriceForCity.entrySet().stream()
                .filter(x->x.getKey() == city).findFirst();

        return collect.isPresent() ? collect.get().getValue(): defaultValue;
    }
}
