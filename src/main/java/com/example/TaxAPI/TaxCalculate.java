package com.example.TaxAPI;

public class TaxCalculate {

    public String returnValue(double price){
        if (!(price<1 || price>100)) {
        return String.valueOf(taxCal(price));
        }
        else {
           return msg();
        }
    }
public double taxCal(double price){
    double tax;
    tax = (price * 20) / 100;
    tax= tax+price;
    return tax;
}

public String msg(){
    return "The price can not be less then 1 and more than 100";
}

}
