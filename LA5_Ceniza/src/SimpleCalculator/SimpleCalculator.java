package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {

    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JLabel lblResult;
    private JLabel lbl1;
    private JLabel lbl3;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

        JLabel lbl1 = new JLabel();
        lbl1.setName("lbl1");
        frame.add(lbl1);

        JTextField tfNumber1 = new JTextField();
        tfNumber1.setBounds(50, 30, 80, 30);
        tfNumber1.setName("tfNumber1");
        frame.add(tfNumber1);

        JTextField tfNumber2 = new JTextField();
       tfNumber2.setBounds(250, 30, 80, 30);
        tfNumber2.setName("tfNumber2");
        frame.add(tfNumber2);

        // JComboBox for operations
        String[] operations = {"+", "-", "*", "/"};
        JComboBox<String> cbOperations = new JComboBox<>(operations);
       cbOperations.setBounds(150, 30, 80, 30);
        cbOperations.setName("cbOperations");
        frame.add(cbOperations);

        // JButton to compute result
        JButton btnCompute = new JButton("Compute Result");
      btnCompute.setBounds(125, 80, 150, 30);
        btnCompute.setName("btnCompute");
        frame.add(btnCompute);

        JLabel lbl1stNumber = new JLabel("1st Number");
        lbl1stNumber.setBounds(55, 0, 100, 30);
        lbl1stNumber.setName("lbl1stNumber");
        frame.add(lbl1stNumber);

        JLabel lbl2ndNumber = new JLabel("2nd Number");
        lbl2ndNumber.setBounds(255, 0, 100, 30);
        lbl2ndNumber.setName("lbl2ndNumber");
        frame.add(lbl2ndNumber);

        JLabel lblResultText = new JLabel("Result");
        lblResultText.setBounds(350, 0, 100, 30);
        lblResultText.setName("lblResultText");
        frame.add(lblResultText);

        JLabel lblResult = new JLabel("Result");
        lblResult.setBounds(350, 30, 100, 30);
        lblResult.setName("lblResult");
        frame.add(lblResult);



        // Action listener for the button
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    double num1 = Double.parseDouble(tfNumber1.getText());
                    double num2 = Double.parseDouble(tfNumber2.getText());
                    String operation = (String) cbOperations.getSelectedItem();
                    double result = 0;

                    switch (operation) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = num1 / num2;
                            break;
                    }

                    lblResult.setText("" + result);

            }
        });

        frame.setVisible(true);
    }
}
