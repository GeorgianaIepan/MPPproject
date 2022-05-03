package model;

public class Operation {

    /**
     *
     * @param P
     * @param Q
     * @return
     */
    public static Polynomial addPol(Polynomial P, Polynomial Q) {
        Polynomial R = new Polynomial();

        for (Monomial i : P.monomialList) {
            int ok = 0;
            for (Monomial j : Q.monomialList) {
                if (i.getExponent() == j.getExponent()) {
                    Monomial k = new Monomial(i.getCoeficient() + j.getCoeficient(), i.getExponent());
                    R.monomialList.add(k);
                    ok = 1;
                }
            }
            if (ok == 0) {
                Monomial k = new Monomial(i.getCoeficient(), i.getExponent());
                R.monomialList.add(k);
            }
        }

        for (Monomial i : Q.monomialList) {
            int ok = 0;
            for (Monomial j : R.monomialList) {
                if (i.getExponent() == j.getExponent()) {
                    ok = 1;
                }
            }
            if (ok == 0) {
                Monomial k = new Monomial(i.getCoeficient(), i.getExponent());
                R.monomialList.add(k);
            }
        }

        return R;
    }

    /**
     *
     * @param P
     * @param Q
     * @return
     */
    public static Polynomial subPol(Polynomial P, Polynomial Q) {
        Polynomial R = new Polynomial();

        for (Monomial i : P.monomialList) {
            int ok = 0;
            for (Monomial j : Q.monomialList) {
                if (i.getExponent() == j.getExponent()) {
                    Monomial k = new Monomial(i.getCoeficient() - j.getCoeficient(), i.getExponent());
                    R.monomialList.add(k);
                    ok = 1;
                }
            }
            if (ok == 0) {
                Monomial k = new Monomial(i.getCoeficient(), i.getExponent());
                R.monomialList.add(k);
            }
        }

        for (Monomial i : Q.monomialList) {
            int ok = 0;
            for (Monomial j : R.monomialList) {
                if (i.getExponent() == j.getExponent()) {
                    ok = 1;
                }
            }
            if (ok == 0) {
                Monomial k = new Monomial(i.getCoeficient(), i.getExponent());
                R.monomialList.add(k);
            }
        }

        return R;
    }

    /**
     *
     * @param P
     * @param Q
     * @return
     */
    public static Polynomial mulPol(Polynomial P, Polynomial Q) {
        Polynomial R = new Polynomial();

        for (Monomial i : P.monomialList) {
            for (Monomial j : Q.monomialList) {
                if (i.getExponent() != 0 && j.getExponent() != 0) {
                    Monomial k = new Monomial(i.getCoeficient() * j.getCoeficient(), i.getExponent() + j.getExponent());
                    R.monomialList.add(k);
                } else if (i.getExponent() != 0) {
                    Monomial k = new Monomial(i.getCoeficient() * j.getCoeficient(), i.getExponent());
                    R.monomialList.add(k);
                } else if (j.getExponent() != 0){
                    Monomial k = new Monomial(i.getCoeficient() * j.getCoeficient(), j.getExponent());
                    R.monomialList.add(k);
                }
            }
        }
        return R;
    }

    /**
     *
     * @param P
     * @param Q
     * @return
     */
    public static Polynomial divPol(Polynomial P, Polynomial Q) {
        Polynomial R = new Polynomial();

        return R;
    }

    /**
     *
     * @param P
     * @return
     */
    public static Polynomial derivPol(Polynomial P) {
        Polynomial R = new Polynomial();

        for (Monomial i : P.monomialList) {
            Monomial k = new Monomial(i.getCoeficient() * i.getExponent(), i.getExponent() - 1);
            R.monomialList.add(k);
        }
        return R;
    }

    /**
     *
     * @param P
     * @return
     */
    public static Polynomial integPol(Polynomial P) {
        Polynomial R = new Polynomial();

        for (Monomial i : P.monomialList) {
            Monomial k = new Monomial(i.getCoeficient()/ (i.getExponent() + 1), i.getExponent() + 1);
            R.monomialList.add(k);
        }
        return R;
    }
}
