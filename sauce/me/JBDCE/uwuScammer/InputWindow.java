package sauce.me.JBDCE.uwuScammer;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.image.*;

public class InputWindow extends JFrame {
    private JPanel alluringImagePanel = new JPanel();
    private JLabel alluringImage = new JLabel();

    private JPanel inputOptionsPanel = new JPanel();
    private JTextArea alluringText = new JTextArea("Loading subtile Messages...");

    private JPanel creditCardNumberPanel = new JPanel();
    private JLabel creditCardNumberLabel = new JLabel(" Card Number:");
    private JTextField creditCardNumberInput = new JTextField(10);

    private JPanel expriyDatePanel = new JPanel();
    private JLabel expiryDateLabel = new JLabel("     Expiry Date:");
    private JTextField expiryDateInput = new JTextField(10);

    private JPanel securityNumberPanel = new JPanel();
    private JLabel securityNumberLabel = new JLabel("Security Code:");
    private JTextField securityNumberInput = new JTextField(10);

    private JPanel confirmPanel = new JPanel();
    private JLabel confirmLabel = new JLabel("Confirm?");
    private JCheckBox confirmCheckBox = new JCheckBox();
    private JButton confirmButton = new JButton("Send Information UwU?");

    private void arrangeElements() {

        // this.setLayout(new GridLayout(1,0));
        this.add(alluringImagePanel, BorderLayout.WEST);
        this.add(new JSeparator(SwingConstants.VERTICAL), BorderLayout.CENTER);
        this.add(inputOptionsPanel, BorderLayout.EAST);

        alluringImagePanel.add(alluringImage);

        inputOptionsPanel.setLayout(new BoxLayout(inputOptionsPanel, BoxLayout.Y_AXIS));
        inputOptionsPanel.add(alluringText);
        alluringText.setAlignmentX(CENTER_ALIGNMENT);
        alluringText.setEditable(false);
        alluringText.setBackground(this.getBackground());
        alluringText.setFont(alluringText.getFont().deriveFont(18.0f));
        alluringText.setMinimumSize(new Dimension(100, 10));

        inputOptionsPanel.add(creditCardNumberPanel);
        creditCardNumberPanel.add(creditCardNumberLabel, BorderLayout.WEST);
        creditCardNumberLabel.setAlignmentX(LEFT_ALIGNMENT);
        creditCardNumberPanel.add(creditCardNumberInput, BorderLayout.EAST);
        creditCardNumberInput.setAlignmentX(RIGHT_ALIGNMENT);

        inputOptionsPanel.add(expriyDatePanel);
        expriyDatePanel.add(expiryDateLabel, BorderLayout.WEST);
        expiryDateLabel.setAlignmentX(LEFT_ALIGNMENT);
        expriyDatePanel.add(expiryDateInput, BorderLayout.EAST);
        expiryDateInput.setAlignmentX(RIGHT_ALIGNMENT);

        inputOptionsPanel.add(securityNumberPanel);
        securityNumberPanel.add(securityNumberLabel);
        securityNumberPanel.add(securityNumberInput);

        inputOptionsPanel.add(confirmPanel);
        confirmPanel.add(confirmLabel);
        confirmPanel.add(confirmCheckBox);
        confirmPanel.add(confirmButton);
    }

    private void constructBait(BufferedImage alluringImage, String alluringText){
        this.alluringImage.setIcon(new ImageIcon(alluringImage));;
        this.alluringText.setText(alluringText);
    }

    public InputWindow(BufferedImage alluringImage, String alluringText) {
        // Build that shit
        this.setSize(500, 270);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Sample Text");
        this.setResizable(false);

        constructBait(alluringImage, alluringText);
        arrangeElements();

        
        this.setVisible(true);
    }


}