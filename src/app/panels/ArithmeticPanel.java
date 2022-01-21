package app.panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.operate.Evaluate;

public class ArithmeticPanel extends JPanel {
    Font main_font = new Font("Helvetica", Font.PLAIN, 40);
    String inputString = "";
    Evaluate evaluate=new Evaluate();

    Color rgb_red = new Color(249, 62, 62);
    Color rgb_grey = new Color(223, 235, 242);
    Color rgb_blue = new Color(31, 41, 51);
    Color rgb_white = new Color(245, 247, 250);
    Color rgb_orange = new Color (249, 112, 62);


    public ArithmeticPanel(JTabbedPane tabbedPane) {
        // INITIALIZE ARITHEMETICAL PANEL
        setLayout(new GridLayout(6, 1));
        setBorder(BorderFactory.createEmptyBorder());
        
        
        // INPUT SCREEN ( Arithemetic-Pane-Row - 1 )
        JLabel inputScreen=new JLabel("", JLabel.CENTER);
        inputScreen.setBackground(rgb_blue);
        inputScreen.setForeground(rgb_white);
        inputScreen.setOpaque(true);
        inputScreen.setHorizontalAlignment(SwingConstants.CENTER);
        inputScreen.setFont(new Font("Arial", Font.PLAIN, 50));
        add(inputScreen, BorderLayout.NORTH);


        // BUTTONS :-
        // Arithemetic-Pane-Row - 2
        JPanel btn_row1=new JPanel();
        btn_row1.setLayout(new GridLayout(1, 4));
        
        ImageIcon home_icon = new ImageIcon(new ImageIcon("./../lib/home_icon.png").getImage().getScaledInstance(40, 35, Image.SCALE_DEFAULT));
        JButton homeButton=new JButton(home_icon);
        homeButton.setFont(main_font);
        homeButton.setBackground(rgb_grey);
        homeButton.setForeground(rgb_blue);
        homeButton.setRolloverEnabled(true);
        homeButton.setFocusable(false);
        homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                tabbedPane.setSelectedIndex(1);
			}
		});
        btn_row1.add(homeButton);

        JButton plusButton=new JButton("+");
        plusButton.setFont(main_font);
        plusButton.setBackground(rgb_grey);
        plusButton.setForeground(rgb_blue);
        plusButton.setRolloverEnabled(true);
        plusButton.setFocusable(false);
        plusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("a", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row1.add(plusButton);

        JButton minusButton=new JButton("-");
        minusButton.setFont(main_font);
        minusButton.setBackground(rgb_grey);
        minusButton.setForeground(rgb_blue);
        minusButton.setRolloverEnabled(true);
        minusButton.setFocusable(false);
        minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("s", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row1.add(minusButton);

        JButton multiButton=new JButton("*");
        multiButton.setFont(main_font);
        multiButton.setBackground(rgb_grey);
        multiButton.setForeground(rgb_blue);
        multiButton.setRolloverEnabled(true);
        multiButton.setFocusable(false);
        multiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("m", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row1.add(multiButton);

        add(btn_row1);


        // Arithemetic-Pane-Row - 3
        JPanel btn_row2=new JPanel();
        btn_row2.setLayout(new GridLayout(1, 4));
        
        JButton sevenButton=new JButton("7");
        sevenButton.setFont(main_font);
        sevenButton.setBackground(rgb_white);
        sevenButton.setForeground(rgb_blue);
        sevenButton.setRolloverEnabled(true);
        sevenButton.setFocusable(false);
        sevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("7", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row2.add(sevenButton);

        JButton eightButton=new JButton("8");
        eightButton.setFont(main_font);
        eightButton.setBackground(rgb_white);
        eightButton.setForeground(rgb_blue);
        eightButton.setRolloverEnabled(true);
        eightButton.setFocusable(false);
        eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("8", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row2.add(eightButton);

        JButton nineButton=new JButton("9");
        nineButton.setFont(main_font);
        nineButton.setBackground(rgb_white);
        nineButton.setForeground(rgb_blue);
        nineButton.setRolloverEnabled(true);
        nineButton.setFocusable(false);
        nineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("9", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row2.add(nineButton);

        JButton divButton=new JButton("/");
        divButton.setFont(main_font);
        divButton.setBackground(rgb_grey);
        divButton.setForeground(rgb_blue);
        divButton.setRolloverEnabled(true);
        divButton.setFocusable(false);
        divButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("d", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row2.add(divButton);
        add(btn_row2);


        // Arithemetic-Pane-Row - 4
        JPanel btn_row3=new JPanel();
        btn_row3.setLayout(new GridLayout(1, 4));

        JButton fourButton=new JButton("4");
        fourButton.setFont(main_font);
        fourButton.setBackground(rgb_white);
        fourButton.setForeground(rgb_blue);
        fourButton.setRolloverEnabled(true);
        fourButton.setFocusable(false);
        fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("4", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row3.add(fourButton);
        
        JButton fiveButton=new JButton("5");
        fiveButton.setFont(main_font);
        fiveButton.setBackground(rgb_white);
        fiveButton.setForeground(rgb_blue);
        fiveButton.setRolloverEnabled(true);
        fiveButton.setFocusable(false);
        fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("5", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row3.add(fiveButton);
        
        JButton sixButton=new JButton("6");
        sixButton.setFont(main_font);
        sixButton.setBackground(rgb_white);
        sixButton.setForeground(rgb_blue);
        sixButton.setRolloverEnabled(true);
        sixButton.setFocusable(false);
        sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("6", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row3.add(sixButton);
        
        JButton raiseToButton=new JButton("^");
        raiseToButton.setFont(main_font);
        raiseToButton.setBackground(rgb_grey);
        raiseToButton.setForeground(rgb_blue);
        raiseToButton.setRolloverEnabled(true);
        raiseToButton.setFocusable(false);
        raiseToButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("r", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row3.add(raiseToButton);

        add(btn_row3);


        // Arithemetic-Pane-Row - 5
        JPanel btn_row4=new JPanel();
        btn_row4.setLayout(new GridLayout(1, 4));

        JButton oneButton=new JButton("1");
        oneButton.setFont(main_font);
        oneButton.setBackground(rgb_white);
        oneButton.setForeground(rgb_blue);
        oneButton.setRolloverEnabled(true);
        oneButton.setFocusable(false);
        oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("1", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row4.add(oneButton);
                
        JButton twoButton=new JButton("2");
        twoButton.setFont(main_font);
        twoButton.setBackground(rgb_white);
        twoButton.setForeground(rgb_blue);
        twoButton.setRolloverEnabled(true);
        twoButton.setFocusable(false);
        twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("2", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row4.add(twoButton);
        
        JButton threeButton=new JButton("3");
        threeButton.setFont(main_font);
        threeButton.setBackground(rgb_white);
        threeButton.setForeground(rgb_blue);
        threeButton.setRolloverEnabled(true);
        threeButton.setFocusable(false);
        threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("3", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row4.add(threeButton);

        JButton percentButton=new JButton("%");
        percentButton.setFont(main_font);
        percentButton.setBackground(rgb_grey);
        percentButton.setForeground(rgb_blue);
        percentButton.setRolloverEnabled(true);
        percentButton.setFocusable(false);
        percentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("p", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row4.add(percentButton);

        add(btn_row4);


        // Arithemetic-Pane-Row - 6
        JPanel btn_row5=new JPanel();
        btn_row5.setLayout(new GridLayout(1, 4));

        JButton clearButton=new JButton("C");
        clearButton.setFont(main_font);
        clearButton.setBackground(rgb_white);
        clearButton.setForeground(rgb_red);
        clearButton.setRolloverEnabled(true);
        clearButton.setFocusable(false);
        clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("clear", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row5.add(clearButton);

        JButton zeroButton=new JButton("0");
        zeroButton.setFont(main_font);
        zeroButton.setBackground(rgb_white);
        zeroButton.setForeground(rgb_blue);
        zeroButton.setRolloverEnabled(true);
        zeroButton.setFocusable(false);
        zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("0", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row5.add(zeroButton);

        JButton dotButton=new JButton(".");
        dotButton.setFont(main_font);
        dotButton.setBackground(rgb_white);
        dotButton.setForeground(rgb_blue);
        dotButton.setRolloverEnabled(true);
        dotButton.setFocusable(false);
        dotButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate(".", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row5.add(dotButton);
  
        JButton equalButton=new JButton("=");
        equalButton.setFont(main_font);
        equalButton.setBackground(rgb_orange);
        equalButton.setForeground(rgb_blue);
        equalButton.setRolloverEnabled(true);
        equalButton.setFocusable(false);
        equalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("equals", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row5.add(equalButton);

        add(btn_row5);
    }
}