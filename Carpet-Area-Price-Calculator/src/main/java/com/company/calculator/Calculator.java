package com.company.calculator;

import com.company.enums.Cities;
import com.company.interfaces.carpetPrices.Carpet;
import com.company.interfaces.floorType.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Calculator {


    @Qualifier("carpetVA")
    @Autowired
    private Carpet carpet;

    @Qualifier("bedroom")
    @Autowired
    private Floor floor;

    public String getTotalCarpetCost(Cities city) throws Exception{
        BigDecimal cost = carpet.getSqFtPrice(city).multiply(floor.getArea());

        if (cost.compareTo(BigDecimal.ZERO) == 0){
            throw  new Exception("This city does not exist");
        }

        return "Total Cost for Carpet: "+ cost;
    }

}