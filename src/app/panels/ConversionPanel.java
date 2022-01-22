package app.panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import java.awt.Image;
// import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.theme.Constants;

public class ConversionPanel extends JPanel{
    public ConversionPanel(JTabbedPane tabbedPane) {
        String inputString = "";
        setLayout(new GridLayout(2, 1));
        // #NOTE: Entire screen is going to be divided in to 2 row 


        // MAIN-ROW - 1
        JPanel mainRow1=new JPanel();
        mainRow1.setLayout(new GridLayout(3,1));
        // Input Screen
        JLabel inputScreen=new JLabel("", JLabel.CENTER);
        inputScreen.setBackground(Constants.rgb_blue);
        inputScreen.setForeground(Constants.rgb_white);
        inputScreen.setOpaque(true);
        inputScreen.setHorizontalAlignment(SwingConstants.CENTER);
        inputScreen.setFont(Constants.title_font);
        mainRow1.add(inputScreen, BorderLayout.NORTH);
        // Output Screen 
        JLabel outputScreen=new JLabel("", JLabel.CENTER);
        outputScreen.setBackground(Constants.rgb_blue);
        outputScreen.setForeground(Constants.rgb_white);
        outputScreen.setOpaque(true);
        outputScreen.setHorizontalAlignment(SwingConstants.CENTER);
        outputScreen.setFont(Constants.title_font);
        mainRow1.add(outputScreen, BorderLayout.NORTH);
        // Button Row 1
        JPanel btnRow1=new JPanel();
        btnRow1.setLayout(new GridLayout(1, 4));
        // Button-7
        JButton sevenButton=new JButton("7");
        sevenButton.setFont(Constants.main_font);
        sevenButton.setBackground(Constants.rgb_white);
        sevenButton.setForeground(Constants.rgb_blue);
        sevenButton.setRolloverEnabled(true);
        sevenButton.setFocusable(false);
        sevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                // inputString = evaluate.evaluate("7", inputString);
                inputScreen.setText(inputString);
			}
		});
        btnRow1.add(sevenButton);
        // Button-8
        JButton eightButton=new JButton("8");
        eightButton.setFont(Constants.main_font);
        eightButton.setBackground(Constants.rgb_white);
        eightButton.setForeground(Constants.rgb_blue);
        eightButton.setRolloverEnabled(true);
        eightButton.setFocusable(false);
        eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                // // inputString = evaluate.evaluate("8", inputString);
                inputScreen.setText(inputString);
			}
		});
        btnRow1.add(eightButton);
        // Button-9
        JButton nineButton=new JButton("9");
        nineButton.setFont(Constants.main_font);
        nineButton.setBackground(Constants.rgb_white);
        nineButton.setForeground(Constants.rgb_blue);
        nineButton.setRolloverEnabled(true);
        nineButton.setFocusable(false);
        nineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                // // inputString = evaluate.evaluate("9", inputString);
                inputScreen.setText(inputString);
			}
		});
        btnRow1.add(nineButton);
        // Button-Home
        ImageIcon home_icon = new ImageIcon(new ImageIcon("./../lib/home_icon.png").getImage().getScaledInstance(40, 35, Image.SCALE_DEFAULT));
        JButton homeButton=new JButton(home_icon);
        homeButton.setFont(Constants.main_font);
        homeButton.setBackground(Constants.rgb_grey);
        homeButton.setForeground(Constants.rgb_blue);
        homeButton.setRolloverEnabled(true);
        homeButton.setFocusable(false);
        homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                tabbedPane.setSelectedIndex(1);
			}
		});
        btnRow1.add(homeButton);
        mainRow1.add(btnRow1);
        add(mainRow1);


        // MAIN-ROW - 2
        JPanel mainRow2=new JPanel();
        mainRow2.setLayout(new GridLayout(1, 4));
        JPanel subColumn1=new JPanel();
        subColumn1.setLayout(new GridLayout(3, 1));
        // Button-4
        JButton fourButton=new JButton("4");
        fourButton.setFont(Constants.main_font);
        fourButton.setBackground(Constants.rgb_white);
        fourButton.setForeground(Constants.rgb_blue);
        fourButton.setRolloverEnabled(true);
        fourButton.setFocusable(false);
        fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                // inputString = evaluate.evaluate("4", inputString);
                inputScreen.setText(inputString);
			}
		});
        subColumn1.add(fourButton);
        // Button-1
        JButton oneButton=new JButton("1");
        oneButton.setFont(Constants.main_font);
        oneButton.setBackground(Constants.rgb_white);
        oneButton.setForeground(Constants.rgb_blue);
        oneButton.setRolloverEnabled(true);
        oneButton.setFocusable(false);
        oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                // inputString = evaluate.evaluate("1", inputString);
                inputScreen.setText(inputString);
			}
		});
        subColumn1.add(oneButton);
        // Button-Clear
        JButton clearButton=new JButton("C");
        clearButton.setFont(Constants.main_font);
        clearButton.setBackground(Constants.rgb_white);
        clearButton.setForeground(Constants.rgb_red);
        clearButton.setRolloverEnabled(true);
        clearButton.setFocusable(false);
        clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                // // inputString = evaluate.evaluate("clear", inputString);
                inputScreen.setText(inputString);
			}
		});
        subColumn1.add(clearButton);
        mainRow2.add(subColumn1);

        JPanel subColumn2=new JPanel();
        subColumn2.setLayout(new GridLayout(3, 1));
        // Button-5
        JButton fiveButton=new JButton("5");
        fiveButton.setFont(Constants.main_font);
        fiveButton.setBackground(Constants.rgb_white);
        fiveButton.setForeground(Constants.rgb_blue);
        fiveButton.setRolloverEnabled(true);
        fiveButton.setFocusable(false);
        fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                // inputString = evaluate.evaluate("5", inputString);
                inputScreen.setText(inputString);
			}
		});
        subColumn2.add(fiveButton);
        // Button-2
        JButton twoButton=new JButton("2");
        twoButton.setFont(Constants.main_font);
        twoButton.setBackground(Constants.rgb_white);
        twoButton.setForeground(Constants.rgb_blue);
        twoButton.setRolloverEnabled(true);
        twoButton.setFocusable(false);
        twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                // inputString = evaluate.evaluate("2", inputString);
                inputScreen.setText(inputString);
			}
		});
        subColumn2.add(twoButton);
        // Button-0
        JButton zeroButton=new JButton("0");
        zeroButton.setFont(Constants.main_font);
        zeroButton.setBackground(Constants.rgb_white);
        zeroButton.setForeground(Constants.rgb_blue);
        zeroButton.setRolloverEnabled(true);
        zeroButton.setFocusable(false);
        zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                // // inputString = evaluate.evaluate("0", inputString);
                inputScreen.setText(inputString);
			}
		});
        subColumn2.add(zeroButton);
        mainRow2.add(subColumn2);

        JPanel subColumn3=new JPanel();
        subColumn3.setLayout(new GridLayout(3, 1));
        // Button-6
        JButton sixButton=new JButton("6");
        sixButton.setFont(Constants.main_font);
        sixButton.setBackground(Constants.rgb_white);
        sixButton.setForeground(Constants.rgb_blue);
        sixButton.setRolloverEnabled(true);
        sixButton.setFocusable(false);
        sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                // inputString = evaluate.evaluate("6", inputString);
                inputScreen.setText(inputString);
			}
		});
        subColumn3.add(sixButton);
        // Button-3
        JButton threeButton=new JButton("3");
        threeButton.setFont(Constants.main_font);
        threeButton.setBackground(Constants.rgb_white);
        threeButton.setForeground(Constants.rgb_blue);
        threeButton.setRolloverEnabled(true);
        threeButton.setFocusable(false);
        threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                // inputString = evaluate.evaluate("3", inputString);
                inputScreen.setText(inputString);
			}
		});
        subColumn3.add(threeButton);
        // Button=dot
        JButton dotButton=new JButton(".");
        dotButton.setFont(Constants.main_font);
        dotButton.setBackground(Constants.rgb_white);
        dotButton.setForeground(Constants.rgb_blue);
        dotButton.setRolloverEnabled(true);
        dotButton.setFocusable(false);
        dotButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                // inputString = evaluate.evaluate(".", inputString);
                inputScreen.setText(inputString);
			}
		});
        subColumn3.add(dotButton);
        mainRow2.add(subColumn3);

        JPanel subColumn4=new JPanel();
        subColumn4.setLayout(new GridLayout(1, 1));
        // Button-equals
        JButton equalButton=new JButton("=");
        equalButton.setFont(Constants.main_font);
        equalButton.setBackground(Constants.rgb_orange);
        equalButton.setForeground(Constants.rgb_blue);
        equalButton.setRolloverEnabled(true);
        equalButton.setFocusable(false);
        equalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                // // inputString = evaluate.evaluate("equals", inputString);
                inputScreen.setText(inputString);
			}
		});
        subColumn4.add(equalButton);
        mainRow2.add(subColumn4);
        add(mainRow2);
    }
}