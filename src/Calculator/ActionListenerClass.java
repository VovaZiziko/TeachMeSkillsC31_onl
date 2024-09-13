package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

// ActionListener must be added
public class ActionListenerClass implements ActionListener {
    private final JTextField textField;

    public ActionListenerClass(JTextField textField){
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Which button was clicked
        // Create JButton instance via e.getSource()
        // e.getSource() -> get button which was clicked
        JButton btn = (JButton) e.getSource();

        setTextField(btn);
    }

    void setTextField(JButton button){
        // StringBuilder
        // textField
        // Button
        // btn + btn.getText()
        // btn + btn.getText() -> append
        if(textField.getText().isEmpty() || Objects.equals(textField.getText(), "0")) {
            String value = button.getText();
            textField.setText(value);

        }else {
            String value = textField.getText() + button.getText();
            textField.setText(value);
        }



    }
}