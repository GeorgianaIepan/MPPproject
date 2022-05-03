package model;

import java.util.ArrayList;
import java.util.List;

public class Polynomial {
    List<Monomial> monomialList;

    public Polynomial() {
        this.monomialList = new ArrayList<Monomial>();
    }

    public Polynomial(List<Monomial> monomialList) {
        this.monomialList = monomialList;
    }

    public List<Monomial> getMonomialList() {
        return monomialList;
    }

    public void setMonomialList(List<Monomial> monomialList) {
        this.monomialList = monomialList;
    }

    @Override
    public String toString() {
        String rez = "";

        for (Monomial m : monomialList) {
            if (m.getCoeficient() < 0) {
                rez += Integer.toString(m.getCoeficient());

            } else {
                rez += "+";
                rez += Integer.toString(m.getCoeficient());

            }
            if (m.getExponent() != 0 && m.getExponent() != 1) {
                rez += "*x^";
                rez += Integer.toString(m.getExponent());

            } else if (m.getExponent() == 1) {
                rez += "*x";
            }
        }
        return rez;
    }
}
