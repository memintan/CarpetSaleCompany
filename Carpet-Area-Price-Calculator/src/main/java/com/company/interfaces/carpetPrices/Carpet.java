package com.company.interfaces.carpetPrices;

import com.company.enums.Cities;

import java.math.BigDecimal;

public interface Carpet {
    BigDecimal getSqFtPrice(Cities city);
}
