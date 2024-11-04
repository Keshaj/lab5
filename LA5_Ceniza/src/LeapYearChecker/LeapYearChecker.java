package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker {
    private JTextField yearTextField;
    private JButton checkYearButton;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Leap Year Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(null);

        JTextField yearTextField = new JTextField();
        yearTextField.setBounds(50, 20, 200, 30);
        yearTextField.setName("yearTextField"); // Set component name
        frame.add(yearTextField);

        JButton checkYearButton = new JButton("Check Year");
        checkYearButton.setBounds(80, 60, 120, 30);
        checkYearButton.setName("checkYearButton"); // Set component name
        frame.add(checkYearButton);

        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int year = Integer.parseInt(yearTextField.getText());
                    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

                    String message = isLeapYear ? "Leap year" : "Not a leap year";
                    JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid year.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}


