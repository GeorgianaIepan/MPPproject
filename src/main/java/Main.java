import model.Monomial;
import model.Polynomial;
import model.Operation;
import view.CalcView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {

        CalcView panel = new CalcView();

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

        System.out.println("Addition of two polynomials: ");
        Polynomial rez = Operation.addPol(p1, p2);
        for (Monomial m : rez.getMonomialList()) {
            System.out.println(m.getCoeficient() + " " + m.getExponent());
        }
        System.out.println(rez.toString());

        System.out.println("Subtraction of two polynomials: ");
        Polynomial rez2 = Operation.subPol(p1, p2);
        for (Monomial m : rez2.getMonomialList()) {
            System.out.println(m.getCoeficient() + " " + m.getExponent());
        }
        System.out.println(rez2.toString());

        System.out.println("Multiplication of two polynomials: ");
        Polynomial rez3 = Operation.mulPol(p1, p2);
        for (Monomial m : rez3.getMonomialList()) {
            System.out.println(m.getCoeficient() + " " + m.getExponent());
        }
        System.out.println(rez3.toString());

        System.out.println("Division of two polynomials: ");
        Polynomial rez4 = Operation.divPol(p1, p2);
        for (Monomial m : rez4.getMonomialList()) {
            System.out.println(m.getCoeficient() + " " + m.getExponent());
        }
        System.out.println(rez4.toString());

        System.out.println("Derivative of a polynomial: ");
        Polynomial rez5 = Operation.derivPol(p1);
        for (Monomial m : rez5.getMonomialList()) {
            System.out.println(m.getCoeficient() + " " + m.getExponent());
        }
        System.out.println(rez5.toString());

        System.out.println("Integral of polynomials: ");
        Polynomial rez6 = Operation.integPol(p1);
        for (Monomial m : rez6.getMonomialList()) {
            System.out.println(m.getCoeficient() + " " + m.getExponent());
        }
        System.out.println(rez6.toString());
    }
}
