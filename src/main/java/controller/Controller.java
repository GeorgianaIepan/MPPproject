package controller;

import model.Monomial;
import model.Operation;
import model.Polynomial;
import view.CalcView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller implements ActionListener {
    private CalcView view;
    public int nrPolVar = 0;
    public Polynomial poly1, poly2;
    private Operation op = new Operation();

    /**
     *
     * @param view
     */
    public Controller(CalcView view) {
        view.getPolynomial1().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                nrPolVar = 1;
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });

        view.getPolynomial2().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                nrPolVar = 2;
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });

        this.view = view;
    }


    public void polynoms() {
        String polyText1 = view.getPolynomial1().getText();
        String polyText2 = view.getPolynomial2().getText();

        poly1 = regexPoly(polyText1);
        poly2 = regexPoly(polyText2);
    }

    /**
     *
     * @param s
     * @return
     */
    public Polynomial regexPoly(String s) {
        Pattern pattern = Pattern.compile("([+-]?[^-+]+)");
        Matcher matcher = pattern.matcher(s);
        Polynomial rez = new Polynomial();

        while (matcher.find()) {
            Monomial mono;
            Pattern pattern1 = Pattern.compile( "(-?\\b\\d+)\\*[xX]\\^(-?\\d+\\b)");
            Matcher matcher1 = pattern1.matcher(matcher.group(1));

            if (matcher1.find()) {
                int coeficient = Integer.valueOf(matcher1.group(1));
                int exponent = Integer.valueOf(matcher1.group(2));
                mono = new Monomial(coeficient, exponent);
                rez.getMonomialList().add(mono);

                //System.out.println(coeficient + " " + exponent);
                continue;
            }

            Pattern pattern2 = Pattern.compile("(-?\\b\\d+)\\*[xX]");
            Matcher matcher2 = pattern2.matcher(matcher.group(1));

            if (matcher2.find()) {
                int coeficient = Integer.parseInt(matcher2.group(1));
                mono = new Monomial(coeficient, 1);
                rez.getMonomialList().add(mono);

                //System.out.println(coeficient);
                continue;
            }

            int coeficient = Integer.parseInt(matcher.group(1));
            mono = new Monomial(coeficient, 0);
            rez.getMonomialList().add(mono);
        }
        return rez;
    }

    /**
     *
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == view.getAddButton()) {
            polynoms();
            view.getPolynomialRez().setText(op.addPol(poly1, poly2).toString());

        } else if (source == view.getSubButton()) {
            polynoms();
            view.getPolynomialRez().setText(op.subPol(poly1, poly2).toString());

        } else if (source == view.getMulButton()) {
            polynoms();
            view.getPolynomialRez().setText(op.mulPol(poly1, poly2).toString());

        } else if (source == view.getDivButton()) {
            polynoms();
            view.getPolynomialRez().setText(op.divPol(poly1, poly2).toString());

        } else if (source == view.getDerivButton()) {
            polynoms();
            view.getPolynomialRez().setText(op.derivPol(poly1).toString());

        } else if (source == view.getIntegButton()) {
            polynoms();
            view.getPolynomialRez().setText(op.integPol(poly1).toString());

        } else if (source == view.getButton1()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + "1";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + "1";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButton2()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + "2";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + "2";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButton3()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + "3";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + "3";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButton4()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + "4";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + "4";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButton5()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + "5";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + "5";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButton6()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + "6";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + "6";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButton7()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + "7";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + "7";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButton8()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + "8";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + "8";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButton9()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + "9";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + "9";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButton0()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + "0";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + "0";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButtonPlus()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + "+";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + "+";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButtonMinus()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + "-";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + "-";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButtonSupra()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + "/";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + "/";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButtonSteluta()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + "*";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + "*";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButtonPutere()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + "^";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + "^";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButtonPunct()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + ".";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + ".";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButtonX()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText() + "x";
                view.getPolynomial1().setText(s);
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText() + "x";
                view.getPolynomial2().setText(s);
            }

        } else if (source == view.getButtonDel()) {
            if (nrPolVar == 1) {
                String s = view.getPolynomial1().getText();
                if (s.length() != 0) {
                    s = s.substring(0, s.length() - 1);
                    view.getPolynomial1().setText(s);
                }
            } else if (nrPolVar == 2) {
                String s = view.getPolynomial2().getText();
                if (s.length() != 0) {
                    s = s.substring(0, s.length() - 1);
                    view.getPolynomial2().setText(s);
                }
            }
        }
    }
}
