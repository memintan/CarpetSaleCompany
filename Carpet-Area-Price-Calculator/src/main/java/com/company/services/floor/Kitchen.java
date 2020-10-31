package com.company.services.floor;

import com.company.interfaces.floorType.Floor;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;

public class Kitchen implements Floor {

    BigDecimal radius;

    @Value("${radius}")
    @Override
    public BigDecimal getArea() {
        return radius.pow(2).multiply(new BigDecimal(Math.PI) );
    }
}
