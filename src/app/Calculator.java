package app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import app.operate.Evaluate;
    
public class Calculator implements ActionListener{
    JFrame jf;
    JLabel inputScreen;
    String inputString = "";
    Evaluate evaluate=new Evaluate();
    int btn_column_gap = 110;
    int btn_row_gap = 100;
    int btn_width = 110;
    int equal_button_height = 200;
    int normal_btn_height = 100;
    Color rgb_grey = new Color(203, 210, 217);
    Color rgb_white = new Color(245, 247, 250);
    Color rgb_blue = new Color(31, 41, 51);
    Color rgb_orange = new Color (249, 112, 62);
    JButton nineButton=new JButton("9");
    JButton eightButton=new JButton("8");
    JButton sevenButton=new JButton("7");
    JButton sixButton=new JButton("6");
    JButton fiveButton=new JButton("5");
    JButton fourButton=new JButton("4");
    JButton threeButton=new JButton("3");
    JButton twoButton=new JButton("2");
    JButton oneButton=new JButton("1");
    JButton zeroButton=new JButton("0");
    JButton divButton=new JButton("/");
    JButton multiButton=new JButton("*");
    JButton minusButton=new JButton("-");
    JButton plusButton=new JButton("+");
    JButton dotButton=new JButton(".");
    JButton percentButton=new JButton("%");
    JButton equalButton=new JButton("=");
    JButton clearButton=new JButton("AC");
    JButton raiseToButton=new JButton("^");


    public Calculator(String title) {
        jf = new JFrame(title);
        jf.setLayout(null);
        jf.setSize(455, 639);
        jf.setLocation(700, 200);
        jf.setResizable(false);
        jf.setBackground(rgb_blue);

        
        // DISPAY SCREEN
        inputScreen = new JLabel("", JLabel.CENTER);
        inputScreen.setLocation(0, 0);
        inputScreen.setSize(440, 100);
        inputScreen.setBackground(rgb_blue);
        inputScreen.setForeground(rgb_white);
        inputScreen.setOpaque(true);
        inputScreen.setHorizontalAlignment(SwingConstants.CENTER);
        inputScreen.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(inputScreen);


        // BUTTONS :-
        equalButton = createButton(3, 3, 40, rgb_orange, equal_button_height, equalButton);
        dotButton = createButton(4, 2, 40, rgb_white, normal_btn_height, dotButton);
        clearButton = createButton(4, 0, 30, rgb_white, normal_btn_height, clearButton);

        plusButton =  createButton(0, 0, 40, rgb_grey, normal_btn_height, plusButton);
        minusButton = createButton(0, 1, 40, rgb_grey, normal_btn_height, minusButton);
        divButton =   createButton(0, 2, 40, rgb_grey, normal_btn_height, divButton);
        multiButton = createButton(0, 3, 40, rgb_grey, normal_btn_height, multiButton);
        raiseToButton = createButton(1, 3, 40, rgb_grey, normal_btn_height, raiseToButton);       
        percentButton = createButton(2, 3, 40, rgb_grey, normal_btn_height, percentButton);

        zeroButton = createButton(4, 1, 40, rgb_white, normal_btn_height, zeroButton);
        oneButton = createButton(3 ,0, 40, rgb_white, normal_btn_height, oneButton);
        twoButton = createButton(3, 1, 40, rgb_white, normal_btn_height, twoButton);
        threeButton = createButton(3, 2, 40, rgb_white, normal_btn_height, threeButton);
        fourButton = createButton(2, 0, 40, rgb_white, normal_btn_height, fourButton);
        fiveButton = createButton(2, 1, 40, rgb_white, normal_btn_height, fiveButton);
        sixButton = createButton(2, 2, 40, rgb_white, normal_btn_height, sixButton);
        sevenButton = createButton(1, 0, 40, rgb_white, normal_btn_height, sevenButton);
        eightButton = createButton(1, 1, 40, rgb_white, normal_btn_height, eightButton);
        nineButton = createButton(1, 2, 40, rgb_white, normal_btn_height, nineButton);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public JButton createButton(int row, int column, int font_size, Color color, int height, JButton obj) {
        obj.setBounds(column*btn_column_gap, (row+1)*btn_row_gap, btn_width, height);
        obj.setFont(new Font("Helvetica", Font.PLAIN, font_size));
        obj.setBackground(color);
        obj.addActionListener(this);
        obj.setForeground(rgb_blue);
        obj.setRolloverEnabled(true);
        obj.setFocusable(false);
        jf.add(obj);
        return obj;
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nineButton) {
            inputString =  evaluate.evaluate("9", inputString);
        } else if (e.getSource() == eightButton) {
            inputString = evaluate.evaluate("8", inputString);
        } else if (e.getSource() == sevenButton) {
            inputString = evaluate.evaluate("7", inputString);
        } else if (e.getSource() == sixButton) {
            inputString = evaluate.evaluate("6", inputString);
        } else if (e.getSource() == fiveButton) {
            inputString = evaluate.evaluate("5", inputString);
        } else if (e.getSource() == fourButton) {
            inputString = evaluate.evaluate("4", inputString);
        } else if (e.getSource() == threeButton) {
            inputString = evaluate.evaluate("3", inputString);
        } else if (e.getSource() == twoButton) {
            inputString = evaluate.evaluate("2", inputString);
        } else if (e.getSource() == oneButton) {
            inputString = evaluate.evaluate("1", inputString);
        } else if (e.getSource() == zeroButton) {
            inputString = evaluate.evaluate("0", inputString);
        } else if (e.getSource() == dotButton) {
            inputString = evaluate.evaluate(".", inputString);
        } else if (e.getSource() == divButton) {
            inputString = evaluate.evaluate("d", inputString);
        } else if (e.getSource() == multiButton) {
            inputString = evaluate.evaluate("m", inputString);
        } else if (e.getSource() == minusButton) {
            inputString = evaluate.evaluate("s", inputString);
        } else if (e.getSource() == plusButton) {
            inputString = evaluate.evaluate("a", inputString);
        } else if (e.getSource() == percentButton) {
            inputString = evaluate.evaluate("p", inputString);
        } else if (e.getSource() == raiseToButton) {
            inputString = evaluate.evaluate("r", inputString);
        } else if (e.getSource() == equalButton) {
            inputString = evaluate.evaluate("equals", inputString);
        } else if (e.getSource() == clearButton) {
            inputString = evaluate.evaluate("clear", inputString);
        } 
        inputScreen.setText(inputString);
    }
}