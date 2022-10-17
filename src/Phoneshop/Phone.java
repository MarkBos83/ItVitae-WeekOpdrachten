package Phoneshop;

import java.math.BigDecimal;

public class Phone {

    int id;
    String brand;
    String type;
    BigDecimal price;
    String description;

    public Phone(int id, String brand, String type, BigDecimal price, String description) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.description = description;
    }

    double getPriceWithoutBTW(){
        double a = price.doubleValue()/121*100;
        return Math.round(a * 100.0) / 100.0;
    }
}
