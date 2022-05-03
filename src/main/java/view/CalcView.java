package view;


import controller.Controller;
import model.Polynomial;

import javax.swing.*;

public class CalcView extends JFrame {

    JFrame f = new JFrame("Polynomial Calculator");

    private JLabel titleLabel = new JLabel("Polynomial Calculator");

    private JLabel polynomialLabel1 = new JLabel("First Polynomial = ");
    private JLabel polynomialLabel2 = new JLabel("Second Polynomial = ");
    private JLabel polynomialLabelRez = new JLabel("Rez Polynomial = ");

    private JTextField polynomial1 = new JTextField(20);
    private JTextField polynomial2 = new JTextField(20);
    private JTextField polynomialRez = new JTextField(20);

    private JButton addButton = new JButton("AddPol");
    private JButton subButton = new JButton("SubPol");
    private JButton mulButton = new JButton("MulPol");
    private JButton divButton = new JButton("DivPol");
    private JButton derivButton = new JButton("DerivPol");
    private JButton integButton = new JButton("IntegPol");

    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");
    private JButton button0 = new JButton("0");

    private JButton buttonPlus = new JButton("+");
    private JButton buttonMinus = new JButton("-");
    private JButton buttonSteluta = new JButton("*");
    private JButton buttonSupra = new JButton("/");
    private JButton buttonPutere = new JButton("^");
    private JButton buttonPunct = new JButton(".");
    private JButton buttonX = new JButton("x");
    private JButton buttonDel = new JButton("del");

    Controller controller = new Controller(this);

    public JFrame getF() {
        return f;
    }

    public JLabel getTitleLabel() {
        return titleLabel;
    }

    public JLabel getPolynomialLabel1() {
        return polynomialLabel1;
    }

    public JLabel getPolynomialLabel2() {
        return polynomialLabel2;
    }

    public JLabel getPolynomialLabelRez() {
        return polynomialLabelRez;
    }

    public JTextField getPolynomial1() {
        return polynomial1;
    }

    public JTextField getPolynomial2() {
        return polynomial2;
    }

    public JTextField getPolynomialRez() {
        return polynomialRez;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getSubButton() {
        return subButton;
    }

    public JButton getMulButton() {
        return mulButton;
    }

    public JButton getDivButton() {
        return divButton;
    }

    public JButton getDerivButton() {
        return derivButton;
    }

    public JButton getIntegButton() {
        return integButton;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public JButton getButton4() {
        return button4;
    }

    public JButton getButton5() {
        return button5;
    }

    public JButton getButton6() {
        return button6;
    }

    public JButton getButton7() {
        return button7;
    }

    public JButton getButton8() {
        return button8;
    }

    public JButton getButton9() {
        return button9;
    }

    public JButton getButton0() {
        return button0;
    }

    public JButton getButtonPlus() {
        return buttonPlus;
    }

    public JButton getButtonMinus() {
        return buttonMinus;
    }

    public JButton getButtonSteluta() {
        return buttonSteluta;
    }

    public JButton getButtonSupra() {
        return buttonSupra;
    }

    public JButton getButtonPutere() {
        return buttonPutere;
    }

    public JButton getButtonPunct() {
        return buttonPunct;
    }

    public JButton getButtonX() {
        return buttonX;
    }

    public JButton getButtonDel() {
        return buttonDel;
    }

    public CalcView() {

        f.setSize(415, 470);
        f.setLayout(null);
        f.setVisible(true);

        f.setName("Polynomial Calculator");

        polynomialLabel1.setBounds(10, 10, 185, 30);
        f.add(polynomialLabel1);

        polynomialLabel2.setBounds(10, 40, 185, 30);
        f.add(polynomialLabel2);

        polynomialLabelRez.setBounds(10, 70, 185, 30);
        f.add(polynomialLabelRez);

        polynomial1.setBounds(205, 10, 195, 30);
        f.add(polynomial1);

        polynomial2.setBounds(205, 40, 195, 30);
        f.add(polynomial2);

        polynomialRez.setBounds(205, 70, 195, 30);
        f.add(polynomialRez);


        mulButton.setBounds(0, 110, 195, 50);
        f.add(mulButton);
        mulButton.addActionListener(controller);

        divButton.setBounds(0, 160, 195, 50);
        f.add(divButton);
        divButton.addActionListener(controller);

        addButton.setBounds(0, 210, 195, 50);
        f.add(addButton);
        addButton.addActionListener(controller);

        subButton.setBounds(205, 110, 195, 50);
        f.add(subButton);
        subButton.addActionListener(controller);

        derivButton.setBounds(205, 160, 195, 50);
        f.add(derivButton);
        derivButton.addActionListener(controller);

        integButton.setBounds(205, 210, 195, 50);
        f.add(integButton);
        integButton.addActionListener(controller);


        button1.setBounds(0, 270, 65, 50);
        f.add(button1);
        button1.addActionListener(controller);

        button2.setBounds(65, 270, 65, 50);
        f.add(button2);
        button2.addActionListener(controller);

        button3.setBounds(130, 270, 65, 50);
        f.add(button3);
        button3.addActionListener(controller);

        button4.setBounds(0, 320, 65, 50);
        f.add(button4);
        button4.addActionListener(controller);

        button5.setBounds(65, 320, 65, 50);
        f.add(button5);
        button5.addActionListener(controller);

        button6.setBounds(130, 320, 65, 50);
        f.add(button6);
        button6.addActionListener(controller);

        button7.setBounds(0, 370, 65, 50);
        f.add(button7);
        button7.addActionListener(controller);

        button8.setBounds(65, 370, 65, 50);
        f.add(button8);
        button8.addActionListener(controller);

        button9.setBounds(130, 370, 65, 50);
        f.add(button9);
        button9.addActionListener(controller);


        button0.setBounds(205, 270, 65, 50);
        f.add(button0);
        button0.addActionListener(controller);

        buttonPlus.setBounds(270, 270, 65, 50);
        f.add(buttonPlus);
        buttonPlus.addActionListener(controller);

        buttonMinus.setBounds(335, 270, 65, 50);
        f.add(buttonMinus);
        buttonMinus.addActionListener(controller);

        buttonSupra.setBounds(205, 320, 65, 50);
        f.add(buttonSupra);
        buttonSupra.addActionListener(controller);

        buttonSteluta.setBounds(270, 320, 65, 50);
        f.add(buttonSteluta);
        buttonSteluta.addActionListener(controller);

        buttonPutere.setBounds(335, 320, 65, 50);
        f.add(buttonPutere);
        buttonPutere.addActionListener(controller);

        buttonPunct.setBounds(205, 370, 65, 50);
        f.add(buttonPunct);
        buttonPunct.addActionListener(controller);

        buttonX.setBounds(270, 370, 65, 50);
        f.add(buttonX);
        buttonX.addActionListener(controller);

        buttonDel.setBounds(335, 370, 65, 50);
        f.add(buttonDel);
        buttonDel.addActionListener(controller);
    }
}
