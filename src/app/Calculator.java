package app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import app.Operate;

    
public class Calculator implements ActionListener{
    JFrame jf;
    JLabel inputScreen = new JLabel();
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
    JButton backspaceButton=new JButton("<=");
    JButton dotButton=new JButton(".");
    JButton percentButton=new JButton("%");
    JButton equalButton=new JButton("=");
    JButton clearButton=new JButton("C");
    String inputString = "";
    Operate operate=new Operate();


    //HANDILING CLICKS
    public JButton createButton(JButton obj, int row, int column) {
        obj.setBounds(30+(column*100), 30+((row+1)*100), 80, 80);
        obj.setFont(new Font("Arial", Font.PLAIN, 40));
        obj.addActionListener(this);
        jf.add(obj);
        return obj;
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO: TRY TO GET A METHOD TO DIRECTYLE GET TEXT INSIDE A BTN AND USE THIS WITH FOR LOOP
        if (e.getSource() == nineButton) {
            inputString =  operate.appendCharacter("9", inputString);
        }
        else if (e.getSource() == eightButton) {
            inputString = operate.appendCharacter("8", inputString);
        }
        else if (e.getSource() == sevenButton) {
            inputString = operate.appendCharacter("7", inputString);
        }
        else if (e.getSource() == sixButton) {
            inputString = operate.appendCharacter("6", inputString);
        }
        else if (e.getSource() == fiveButton) {
            inputString = operate.appendCharacter("5", inputString);
        }
        else if (e.getSource() == fourButton) {
            inputString = operate.appendCharacter("4", inputString);
        }
        else if (e.getSource() == threeButton) {
            inputString = operate.appendCharacter("3", inputString);
        }
        else if (e.getSource() == twoButton) {
            inputString = operate.appendCharacter("2", inputString);
        }
        else if (e.getSource() == oneButton) {
            inputString = operate.appendCharacter("1", inputString);
        }
        else if (e.getSource() == zeroButton) {
            inputString = operate.appendCharacter("0", inputString);
        }
        else if (e.getSource() == divButton) {
            inputString = operate.appendCharacter("/", inputString);
        }
        else if (e.getSource() == multiButton) {
            inputString = operate.appendCharacter("*", inputString);
        }
        else if (e.getSource() == minusButton) {
            inputString = operate.appendCharacter("-", inputString);
        }
        else if (e.getSource() == plusButton) {
            inputString = operate.appendCharacter("+", inputString);
        }
        else if (e.getSource() == dotButton) {
            inputString = operate.appendCharacter(".", inputString);
        }
        else if (e.getSource() == percentButton) {
            inputString = operate.appendCharacter("%", inputString);
        }
        else if (e.getSource() == backspaceButton) {
            inputString = operate.appendCharacter("backspace", inputString);
        }
        else if (e.getSource() == equalButton) {
            inputString = operate.appendCharacter("equals", inputString);
        }
        else if (e.getSource() == clearButton) {
            inputString = operate.appendCharacter("clear", inputString);
        }
        else {
            // TODO: CRETE A ERROR HANDILING SCREEN
        }
        inputScreen.setText(inputString);
    }

    public Calculator() {
        jf = new JFrame("ADCALARATOR");
        jf.setLayout(null);
        jf.setSize(455, 800);
        jf.setLocation(400, 130);


        // DISPAY SCREEN
        inputScreen = new JLabel();
        inputScreen.setBounds(30, 25, 380, 75);
        inputScreen.setBackground(Color.gray);
        inputScreen.setOpaque(true);
        inputScreen.setHorizontalAlignment(SwingConstants.CENTER);
        inputScreen.setForeground(Color.black);
        inputScreen.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 30));
        jf.add(inputScreen);


        // BUTTONS :-
        clearButton = createButton(clearButton, 0, 0);
        backspaceButton = createButton(backspaceButton, 0, 1);
        percentButton = createButton(percentButton, 0, 2);
        divButton = createButton(divButton, 0, 3);

        sevenButton = createButton(sevenButton, 1, 0);
        eightButton = createButton(eightButton, 1, 1);
        nineButton = createButton(nineButton, 1, 2);
        multiButton = createButton(multiButton, 1, 3);

        fourButton = createButton(fourButton, 2, 0);
        fiveButton = createButton(fiveButton, 2, 1);
        sixButton = createButton(sixButton, 2, 2);
        minusButton = createButton(minusButton, 2, 3);

        oneButton = createButton(oneButton, 3 ,0);
        twoButton = createButton(twoButton, 3, 1);
        threeButton = createButton(threeButton, 3, 2);
        plusButton = createButton(plusButton, 3, 3);

        zeroButton = createButton(zeroButton, 4, 1);
        dotButton = createButton(dotButton, 4, 2);
        equalButton = createButton(equalButton, 4, 3);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}