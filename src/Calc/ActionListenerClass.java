package Calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;


public class ActionListenerClass implements ActionListener {
    private final JTextField textField;

    public ActionListenerClass(JTextField textField){
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        setTextField(btn);
    }

    void setTextField(JButton button){
            if(textField.getText().isEmpty() || Objects.equals(textField.getText(), "0")) {
            String value = button.getText();
            textField.setText(value);

        }else {
            String value = textField.getText() + button.getText();
            textField.setText(value);
        }



    }
}