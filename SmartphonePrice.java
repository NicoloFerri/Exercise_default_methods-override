package javaOOPAdvanced_V2.defaultMethodsOverride;

import java.util.Objects;

public class SmartphonePrice implements Cloneable{
    public SmartphonePrice(String priceType, double priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }

    private String priceType;
    private double priceInEuros;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(priceInEuros, that.priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }


    @Override
    public String toString() {
        return  "\n"+ "priceType = " + priceType + "\n" + "priceInEuros = " + priceInEuros + "\n";
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        SmartphonePrice clonedSmarthphonePrice = (SmartphonePrice) super.clone();
        return clonedSmarthphonePrice;
    }




}
