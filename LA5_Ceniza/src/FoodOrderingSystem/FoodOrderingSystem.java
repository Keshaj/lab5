package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FoodOrderingSystem {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Food Ordering System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        // Food prices
        double pizzaPrice = 100.0;
        double burgerPrice = 80.0;
        double friesPrice = 65.0;
        double softDrinksPrice = 55.0;
        double teaPrice = 50.0;
        double sundaePrice = 40.0;

        // JCheckBoxes for food items
        JCheckBox cPizza = new JCheckBox("Pizza - Php " + pizzaPrice);
        cPizza.setBounds(20, 20, 200, 30);
        cPizza.setName("cPizza");
        frame.add(cPizza);

        JCheckBox cBurger = new JCheckBox("Burger - Php " + burgerPrice);
        cBurger.setBounds(20, 50, 200, 30);
        cBurger.setName("cBurger");
        frame.add(cBurger);

        JCheckBox cFries = new JCheckBox("Fries - Php " + friesPrice);
        cFries.setBounds(20, 80, 200, 30);
        cFries.setName("cFries");
        frame.add(cFries);

        JCheckBox cSoftDrinks = new JCheckBox("Soft drinks - Php " + softDrinksPrice);
        cSoftDrinks.setBounds(20, 110, 200, 30);
        cSoftDrinks.setName("cSoftDrinks");
        frame.add(cSoftDrinks);

        JCheckBox cTea = new JCheckBox("Tea - Php " + teaPrice);
        cTea.setBounds(20, 140, 200, 30);
        cTea.setName("cTea");
        frame.add(cTea);

        JCheckBox cSundae = new JCheckBox("Sundae - Php " + sundaePrice);
        cSundae.setBounds(20, 170, 200, 30);
        cSundae.setName("cSundae");
        frame.add(cSundae);

        // Radio buttons for discounts
        JRadioButton rbNone = new JRadioButton("None");
        rbNone.setBounds(250, 20, 100, 30);
        rbNone.setSelected(true);  // Default selection
        rbNone.setName("rbNone");

        JRadioButton rb5 = new JRadioButton("5% off");
        rb5.setBounds(250, 50, 100, 30);
        rb5.setName("rb5");

        JRadioButton rb10 = new JRadioButton("10% off");
        rb10.setBounds(250, 80, 100, 30);
        rb10.setName("rb10");

        JRadioButton rb15 = new JRadioButton("15% off");
        rb15.setBounds(250, 110, 100, 30);
        rb15.setName("rb15");

        ButtonGroup discountGroup = new ButtonGroup();
        discountGroup.add(rbNone);
        discountGroup.add(rb5);
        discountGroup.add(rb10);
        discountGroup.add(rb15);

        frame.add(rbNone);
        frame.add(rb5);
        frame.add(rb10);
        frame.add(rb15);

        // Order button
        JButton btnOrder = new JButton("Order");
        btnOrder.setBounds(150, 220, 100, 30);
        btnOrder.setName("btnOrder");
        frame.add(btnOrder);

        // Action listener for the order button
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0.0;

                // Add selected food items to total
                if (cPizza.isSelected()) total += pizzaPrice;
                if (cBurger.isSelected()) total += burgerPrice;
                if (cFries.isSelected()) total += friesPrice;
                if (cSoftDrinks.isSelected()) total += softDrinksPrice;
                if (cTea.isSelected()) total += teaPrice;
                if (cSundae.isSelected()) total += sundaePrice;

                // Apply discount if any
                if (rb5.isSelected()) total *= 0.95;
                else if (rb10.isSelected()) total *= 0.90;
                else if (rb15.isSelected()) total *= 0.85;

                // Format to 2 decimal places
                DecimalFormat df = new DecimalFormat("#.00");
                String formattedTotal = df.format(total);

                // Show total price in a dialog
                JOptionPane.showMessageDialog(frame, "The total price is Php " + formattedTotal, "Order Total", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.setVisible(true);
    }
}

