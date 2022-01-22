package app.panels;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
// import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import java.awt.Image;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.theme.Constants;
import app.operate.Evaluate;

public class ArithmeticPanel extends JPanel {
    String inputString = "";
    Evaluate evaluate=new Evaluate();

    // #NOTE: We are going to keep everthing in arithmeticPanel as a row(3) including inputScreen 
    public ArithmeticPanel(JFrame frame) {
        // INITIALIZE ARITHEMETICAL PANEL
        setLayout(new GridLayout(3, 1));


        // MAIN CONTAINER - 1
        JPanel mainContainer1=new JPanel();
        mainContainer1.setLayout(new GridLayout(2, 1));
        // Input Screen
        JLabel inputScreen=new JLabel("", JLabel.CENTER);
        inputScreen.setBackground(Constants.rgb_blue);
        inputScreen.setForeground(Constants.rgb_white);
        inputScreen.setOpaque(true);
        inputScreen.setHorizontalAlignment(SwingConstants.CENTER);
        inputScreen.setFont(Constants.title_font);
        mainContainer1.add(inputScreen);

        // Buttons Row - 1
        JPanel btn_row1=new JPanel();
        btn_row1.setLayout(new GridLayout(1, 4));
        // Button-plus 
        JButton plusButton=new JButton("+");
        plusButton.setFont(Constants.main_font);
        plusButton.setBackground(Constants.rgb_grey);
        plusButton.setForeground(Constants.rgb_blue);
        plusButton.setRolloverEnabled(true);
        plusButton.setFocusable(false);
        plusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("a", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row1.add(plusButton);
        // Button-minus 
        JButton minusButton=new JButton("-");
        minusButton.setFont(Constants.main_font);
        minusButton.setBackground(Constants.rgb_grey);
        minusButton.setForeground(Constants.rgb_blue);
        minusButton.setRolloverEnabled(true);
        minusButton.setFocusable(false);
        minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("s", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row1.add(minusButton);
        // Button-multiply 
        JButton multiButton=new JButton("*");
        multiButton.setFont(Constants.main_font);
        multiButton.setBackground(Constants.rgb_grey);
        multiButton.setForeground(Constants.rgb_blue);
        multiButton.setRolloverEnabled(true);
        multiButton.setFocusable(false);
        multiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("m", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row1.add(multiButton);
        // Button-div
        JButton divButton=new JButton("/");
        divButton.setFont(Constants.main_font);
        divButton.setBackground(Constants.rgb_grey);
        divButton.setForeground(Constants.rgb_blue);
        divButton.setRolloverEnabled(true);
        divButton.setFocusable(false);
        divButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("d", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row1.add(divButton);
        mainContainer1.add(btn_row1);
        add(mainContainer1);


        // MAIN CONTAINER - 2 
        JPanel mainContainer2=new JPanel();
        mainContainer2.setLayout(new GridLayout(2, 1));
        JPanel btn_row2=new JPanel();
        btn_row2.setLayout(new GridLayout(1, 4));
        // Button-seven 
        JButton sevenButton=new JButton("7");
        sevenButton.setFont(Constants.main_font);
        sevenButton.setBackground(Constants.rgb_white);
        sevenButton.setForeground(Constants.rgb_blue);
        sevenButton.setRolloverEnabled(true);
        sevenButton.setFocusable(false);
        sevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("7", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row2.add(sevenButton);
        // Button-eight 
        JButton eightButton=new JButton("8");
        eightButton.setFont(Constants.main_font);
        eightButton.setBackground(Constants.rgb_white);
        eightButton.setForeground(Constants.rgb_blue);
        eightButton.setRolloverEnabled(true);
        eightButton.setFocusable(false);
        eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("8", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row2.add(eightButton);
        // Button-nine 
        JButton nineButton=new JButton("9");
        nineButton.setFont(Constants.main_font);
        nineButton.setBackground(Constants.rgb_white);
        nineButton.setForeground(Constants.rgb_blue);
        nineButton.setRolloverEnabled(true);
        nineButton.setFocusable(false);
        nineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("9", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row2.add(nineButton);
        // Button-raiseto
        JButton raiseToButton=new JButton("^");
        raiseToButton.setFont(Constants.main_font);
        raiseToButton.setBackground(Constants.rgb_grey);
        raiseToButton.setForeground(Constants.rgb_blue);
        raiseToButton.setRolloverEnabled(true);
        raiseToButton.setFocusable(false);
        raiseToButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("r", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row2.add(raiseToButton);
        mainContainer2.add(btn_row2);
        
        JPanel btn_row3=new JPanel();
        btn_row3.setLayout(new GridLayout(1, 4));
        // Button-four 
        JButton fourButton=new JButton("4");
        fourButton.setFont(Constants.main_font);
        fourButton.setBackground(Constants.rgb_white);
        fourButton.setForeground(Constants.rgb_blue);
        fourButton.setRolloverEnabled(true);
        fourButton.setFocusable(false);
        fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("4", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row3.add(fourButton);
        // Button-five 
        JButton fiveButton=new JButton("5");
        fiveButton.setFont(Constants.main_font);
        fiveButton.setBackground(Constants.rgb_white);
        fiveButton.setForeground(Constants.rgb_blue);
        fiveButton.setRolloverEnabled(true);
        fiveButton.setFocusable(false);
        fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("5", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row3.add(fiveButton);
        // Button-six 
        JButton sixButton=new JButton("6");
        sixButton.setFont(Constants.main_font);
        sixButton.setBackground(Constants.rgb_white);
        sixButton.setForeground(Constants.rgb_blue);
        sixButton.setRolloverEnabled(true);
        sixButton.setFocusable(false);
        sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("6", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row3.add(sixButton);
        // Button-percent 
        JButton percentButton=new JButton("%");
        percentButton.setFont(Constants.main_font);
        percentButton.setBackground(Constants.rgb_grey);
        percentButton.setForeground(Constants.rgb_blue);
        percentButton.setRolloverEnabled(true);
        percentButton.setFocusable(false);
        percentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("p", inputString);
                inputScreen.setText(inputString);
			}
		});
        btn_row3.add(percentButton);
        mainContainer2.add(btn_row3);
        add(mainContainer2);
        
        // MAIN CONTAINER - 3
        JPanel mainContainer3=new JPanel();
        mainContainer3.setLayout(new GridLayout(1, 4));
        JPanel btnColumn1=new JPanel();
        btnColumn1.setLayout(new GridLayout(2, 1));
        // Button-one 
        JButton oneButton=new JButton("1");
        oneButton.setFont(Constants.main_font);
        oneButton.setBackground(Constants.rgb_white);
        oneButton.setForeground(Constants.rgb_blue);
        oneButton.setRolloverEnabled(true);
        oneButton.setFocusable(false);
        oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("1", inputString);
                inputScreen.setText(inputString);
			}
		});
        btnColumn1.add(oneButton);
        // Button-clear 
        JButton clearButton=new JButton("C");
        clearButton.setFont(Constants.main_font);
        clearButton.setBackground(Constants.rgb_white);
        clearButton.setForeground(Constants.rgb_red);
        clearButton.setRolloverEnabled(true);
        clearButton.setFocusable(false);
        clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("clear", inputString);
                inputScreen.setText(inputString);
			}
		});
        btnColumn1.add(clearButton);
        mainContainer3.add(btnColumn1);

        JPanel btnColumn2=new JPanel();
        btnColumn2.setLayout(new GridLayout(2, 1));
        // Button-two 
        JButton twoButton=new JButton("2");
        twoButton.setFont(Constants.main_font);
        twoButton.setBackground(Constants.rgb_white);
        twoButton.setForeground(Constants.rgb_blue);
        twoButton.setRolloverEnabled(true);
        twoButton.setFocusable(false);
        twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("2", inputString);
                inputScreen.setText(inputString);
			}
		});
        btnColumn2.add(twoButton);
        // Button-zero 
        JButton zeroButton=new JButton("0");
        zeroButton.setFont(Constants.main_font);
        zeroButton.setBackground(Constants.rgb_white);
        zeroButton.setForeground(Constants.rgb_blue);
        zeroButton.setRolloverEnabled(true);
        zeroButton.setFocusable(false);
        zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("0", inputString);
                inputScreen.setText(inputString);
			}
		});
        btnColumn2.add(zeroButton);
        mainContainer3.add(btnColumn2);

        JPanel btnColumn3=new JPanel();
        btnColumn3.setLayout(new GridLayout(2, 1));
        // Button-three 
        JButton threeButton=new JButton("3");
        threeButton.setFont(Constants.main_font);
        threeButton.setBackground(Constants.rgb_white);
        threeButton.setForeground(Constants.rgb_blue);
        threeButton.setRolloverEnabled(true);
        threeButton.setFocusable(false);
        threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("3", inputString);
                inputScreen.setText(inputString);
			}
		});
        btnColumn3.add(threeButton);
        // Button-dot 
        JButton dotButton=new JButton(".");
        dotButton.setFont(Constants.main_font);
        dotButton.setBackground(Constants.rgb_white);
        dotButton.setForeground(Constants.rgb_blue);
        dotButton.setRolloverEnabled(true);
        dotButton.setFocusable(false);
        dotButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate(".", inputString);
                inputScreen.setText(inputString);
			}
		});
        btnColumn3.add(dotButton);
        mainContainer3.add(btnColumn3);

        JPanel btnColumn4=new JPanel();
        btnColumn4.setLayout(new GridLayout(1, 1));
        // Button-equals 
        JButton equalButton=new JButton("=");
        equalButton.setFont(Constants.main_font);
        equalButton.setBackground(Constants.rgb_orange);
        equalButton.setForeground(Constants.rgb_blue);
        equalButton.setRolloverEnabled(true);
        equalButton.setFocusable(false);
        equalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                inputString = evaluate.evaluate("equals", inputString);
                inputScreen.setText(inputString);
			}
		});
        btnColumn4.add(equalButton);
        mainContainer3.add(btnColumn4);
        add(mainContainer3);
    }
}






        // Button-home
        // ImageIcon home_icon = new ImageIcon(new ImageIcon("./../lib/home_icon.png").getImage().getScaledInstance(40, 35, Image.SCALE_DEFAULT));
        // JButton homeButton=new JButton(home_icon);
        // homeButton.setFont(Constants.main_font);
        // homeButton.setBackground(Constants.rgb_grey);
        // homeButton.setForeground(Constants.rgb_blue);
        // homeButton.setRolloverEnabled(true);
        // homeButton.setFocusable(false);
        // homeButton.addActionListener(new ActionListener() {
		// 	public void actionPerformed(ActionEvent e) {
        //         // tabbedPane.setSelectedIndex(1);

		// 	}
		// });
        // btn_row1.add(homeButton);
