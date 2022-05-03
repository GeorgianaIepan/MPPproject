/*package com.vogella.junit.first;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import model.Monomial;
import model.Operation;
import model.Polynomial;
import view.CalcView;

import java.util.ArrayList;
import java.util.List;

class Test {
    Monomial m1 = new Monomial(3, 2);
    Monomial m2 = new Monomial(4, 2);
    Monomial m3 = new Monomial(2, 1);
    Monomial m4 = new Monomial(3, 0);

    List<Monomial> list = new ArrayList<Monomial>();
        list.add(m1);
        list.add(m3);
    Polynomial p1 = new Polynomial(list);                // p1 = 3 * x^2 + 2 * x

    List<Monomial> list2 = new ArrayList<Monomial>();
        list2.add(m2);
        list2.add(m4);
    Polynomial p2 = new Polynomial(list2);               // p2 = 4 * x^2 + 3

    private void assertEquals() {
    }

    private void assertTrue(boolean b) {
    }

    @Test
    void sumPol() {
        Polynomial rez = Operation.addPol(p1, p2);
        assertTrue(true);
    }

    @Test
    void subPol() {
        Polynomial rez = Operation.subPol(p1, p2);
    }

    @Test
    void mulPol() {
        Polynomial rez = Operation.mulPol(p1, p2);
    }

    @Test
    void divPol() {
        Polynomial rez = Operation.divPol(p1, p2);
    }

    @Test
    void derivPol() {
        Polynomial rez = Operation.derivPol(p1);
    }

    @Test
    void integPol() {
        Polynomial rez = Operation.integPol(p1);
    }
}
*/

