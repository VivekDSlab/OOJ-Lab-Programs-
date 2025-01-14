
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionApp extends JFrame {
    JTextField num1Field, num2Field, resultField;
    JButton divideButton;

    public DivisionApp() {
        setTitle("Division App");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        num1Field = new JTextField();
        num2Field = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);
        divideButton = new JButton("Divide");

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }

                    resultField.setText(String.valueOf(num1 / num2));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Enter valid integers.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setLayout(new GridLayout(4, 2));
        add(new JLabel("Num1:"));
        add(num1Field);
        add(new JLabel("Num2:"));
        add(num2Field);
        add(new JLabel("Result:"));
        add(resultField);
        add(new JLabel());
        add(divideButton);
    }

    public static void main(String[] args) {
        new DivisionApp().setVisible(true);
    }
}
