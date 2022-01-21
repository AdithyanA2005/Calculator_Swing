package app;
import javax.swing.*;
// import javax.swing.ImageIcon.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import app.operate.Evaluate;
import app.panels.HomePanel;
import app.panels.ArithmeticPanel;

    
// public class Calculator implements ActionListener{
public class Calculator {
    JFrame frame;
    // JLabel inputScreen;
JTabbedPane tabbedPane;    
    String inputString = "";
    Evaluate evaluate=new Evaluate();
    Font main_font = new Font("Helvetica", Font.PLAIN, 40);
    
    Color rgb_red = new Color(249, 62, 62);
    Color rgb_grey = new Color(223, 235, 242);
    Color rgb_blue = new Color(31, 41, 51);
    Color rgb_white = new Color(245, 247, 250);
    Color rgb_orange = new Color (249, 112, 62);

    
    // JPanel arithmeticPanel;
    JPanel btnPanel = new JPanel();

    int frame_width = 445;
    int frame_height = 617;
    int nav_width = 180;


    public Calculator(String title) {
        UIManager.getDefaults().put("TabbedPane.contentBorderInsets", new Insets(0,0,0,0));
        UIManager.getDefaults().put("TabbedPane.tabsOverlapBorder", true);

        // INTIALIZING JFRAME 
        frame = new JFrame(title);
        frame.setLayout(null);
        frame.setSize(frame_width, frame_height);
        frame.setLocation(700, 200);
        frame.setBackground(rgb_blue);
        frame.setMinimumSize(new Dimension(300, 400));
        frame.setResizable(true);


        // INTIALIZING CONTENT PANELS
        // 1 - Creating Panel Container 
        tabbedPane=new JTabbedPane();
        tabbedPane.setBorder(BorderFactory.createEmptyBorder());
        // tabbedPane.setLocation(0, -21);
        // resizing tabbedpane on changing frame size
        frame.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent componentEvent) {
                tabbedPane.setSize(frame.getBounds().width-13, frame.getBounds().height-16);
            }
        });


        // 2 - Creating Arithemetical Panel 
        ArithmeticPanel arithmeticPanel=new ArithmeticPanel(tabbedPane);
        tabbedPane.add(arithmeticPanel);

        // 3 - Creating Home Page 
        HomePanel homePanel = new HomePanel(tabbedPane);
        tabbedPane.add(homePanel);
       
        frame.add(tabbedPane);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    


    // // @Override
    // // public void actionPerformed(ActionEvent e) {
        // if (e.getSource() == nineButton) {
        //     inputString =  evaluate.evaluate("9", inputString);
        // } else if (e.getSource() == eightButton) {
        //     inputString = evaluate.evaluate("8", inputString);
        // } else if (e.getSource() == sevenButton) {
        //     inputString = evaluate.evaluate("7", inputString);
        // } else if (e.getSource() == sixButton) {
        //     inputString = evaluate.evaluate("6", inputString);
        // } else if (e.getSource() == fiveButton) {
        //     inputString = evaluate.evaluate("5", inputString);
        // } else if (e.getSource() == fourButton) {
        //     inputString = evaluate.evaluate("4", inputString);
        // } else if (e.getSource() == threeButton) {
        //     inputString = evaluate.evaluate("3", inputString);
        // } else if (e.getSource() == twoButton) {
        //     inputString = evaluate.evaluate("2", inputString);
        // } else if (e.getSource() == oneButton) {
        //     inputString = evaluate.evaluate("1", inputString);
        // } else if (e.getSource() == zeroButton) {
        //     inputString = evaluate.evaluate("0", inputString);
        // } else if (e.getSource() == dotButton) {
        //     inputString = evaluate.evaluate(".", inputString);
        // } else if (e.getSource() == divButton) {
        //     inputString = evaluate.evaluate("d", inputString);
        // } else if (e.getSource() == multiButton) {
        //     inputString = evaluate.evaluate("m", inputString);
        // } else if (e.getSource() == minusButton) {
        //     inputString = evaluate.evaluate("s", inputString);
        // } else if (e.getSource() == plusButton) {
        //     inputString = evaluate.evaluate("a", inputString);
        // } else if (e.getSource() == percentButton) {
        //     inputString = evaluate.evaluate("p", inputString);
        // } else if (e.getSource() == raiseToButton) {
        //     inputString = evaluate.evaluate("r", inputString);
        // } else if (e.getSource() == equalButton) {
        //     inputString = evaluate.evaluate("equals", inputString);
        // } else if (e.getSource() == clearButton) {
        //     inputString = evaluate.evaluate("clear", inputString);
        // } else if (e.getSource() == homeButton) {
            // inputString = evaluate.evaluate("home", inputString);
        // }
    //     inputScreen.setText(inputString);
    // }
}