package model;

public class Monomial {
    private int coeficient;
    private int exponent;

    public Monomial(int coeficient, int exponent) {
        this.coeficient = coeficient;
        this.exponent = exponent;
    }

    public int getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(int coeficient) {
        this.coeficient = coeficient;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

}
