package Calc;


import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField textField;
    private String value1;
    private String value2;
    private String sign;
    private String result;

    public Calculator() {
        // constructor super()
        super("Calculator Swing"); // JFrame super() -> title of the window

        // to set how to draw elements
        setLayout(new BorderLayout());

        add(setTop(), BorderLayout.NORTH); // top, fully covers top part
        add(setBody(), BorderLayout.CENTER); // Covers the rest
        // frame -> рамка
        setDefaultCloseOperation(EXIT_ON_CLOSE); // to terminate window if we push X
        setSize(300, 500); // set size
        setResizable(false); // prohibit resize
        setVisible(true); // make it visible
    }

    JPanel setTop() {
        JPanel top = new JPanel();
        textField = new JTextField("0");
        textField.setEditable(false);

        top.setLayout(new BorderLayout());
        top.add(textField, BorderLayout.CENTER);

        return top;
    }

    JPanel setBody() {
        JPanel body = new JPanel();
        body.setLayout(new GridLayout(5, 4));


        ActionListener click = new ActionListenerClass(textField);


        JButton clear = new JButton("C");
        JButton backspace = new JButton("Backs");
        JButton pow = new JButton("**");
        JButton minus = new JButton("-");
        JButton addition = new JButton("+");
        JButton division = new JButton("/");
        JButton multiply = new JButton("*");
        JButton modus = new JButton("%");
        JButton dot = new JButton(".");
        JButton equals = new JButton("=");


        for (int counter = 9; counter >= 0; counter--) {
            // String.valueOf -> transforms accessible value to a String
            JButton btn = new JButton(String.valueOf(counter));
            btn.addActionListener(click);
            body.add(btn);
        }




        dot.addActionListener(click);

        pow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource();
                sign = btn.getText();
                value1 = textField.getText();
                textField.setText("");
            }
        });

        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource();
                sign = btn.getText();
                value1 = textField.getText();
                textField.setText("");
            }
        });

        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource();
                sign = btn.getText();
                value1 = textField.getText();
                textField.setText("");
            }
        });

        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource();
                sign = btn.getText();
                value1 = textField.getText();
                textField.setText("");
            }
        });

        modus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource();
                sign = btn.getText();
                value1 = textField.getText();
                textField.setText("");
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource();
                sign = btn.getText();
                value1 = textField.getText();
                textField.setText("");
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
            }
        });

        backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textField.setText(textField.getText(0, textField.getText().length() - 1));
                } catch (BadLocationException ex) {
                    textField.setText("");
                    //throw new RuntimeException(ex);

                }
            }
        });

        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                                JButton btn = (JButton) e.getSource();
                                value2 = textField.getText();
                                result = String.valueOf(calc(Double.valueOf(value1), Double.valueOf(value2), sign));
                                textField.setText(result);
                            }
        });










        body.add(clear);
        body.add(backspace);
        body.add(pow);
        body.add(minus);
        body.add(addition);
        body.add(division);
        body.add(multiply);
        body.add(modus);
        body.add(dot);
        body.add(equals);


        return body;
    }

    public double calc(double num1, double num2, String sign) {
        double res = 0;
        switch (sign) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                try {
                    res = num1 / num2;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            case "%":
                res = num1 % num2;
                break;
            case "**":
                res = Math.pow(num1, num2);
                break;
        }
        return res;
    }
}
