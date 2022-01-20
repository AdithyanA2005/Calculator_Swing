package app;
import javax.swing.*;
// import javax.swing.ImageIcon.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import app.operate.Evaluate;

    
public class Calculator implements ActionListener{
    JFrame frame;
    JLabel inputScreen;
    JPanel btnPanel = new JPanel();
    String inputString = "";
    Evaluate evaluate=new Evaluate();
    Font main_font = new Font("Helvetica", Font.PLAIN, 40);
    
    Color rgb_red = new Color(249, 62, 62);
    // Color rgb_grey = new Color(203, 210, 217);
    Color rgb_grey = new Color(223, 235, 242);
    Color rgb_blue = new Color(31, 41, 51);
    Color rgb_white = new Color(245, 247, 250);
    Color rgb_orange = new Color (249, 112, 62);

    
    ImageIcon icon = new ImageIcon(new ImageIcon("./../lib/home_icon.png").getImage().getScaledInstance(40, 35, Image.SCALE_DEFAULT));
    JButton homeButton=new JButton(icon);
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
    JButton clearButton=new JButton("C");
    JButton raiseToButton=new JButton("^");
    JButton tabBar = new JButton("se");

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
        JTabbedPane tabbedPane=new JTabbedPane();
        tabbedPane.setBorder(BorderFactory.createEmptyBorder());
        tabbedPane.setLocation(0, -21);
        // resizing tabbedpane on changing frame size
        frame.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent componentEvent) {
                tabbedPane.setSize(frame.getBounds().width-13, frame.getBounds().height-16);
            }
        });

        // 2 - Creating Arithemetical Panel 
        JPanel arithmeticPanel=new JPanel();
        arithmeticPanel.setLayout(null);
        arithmeticPanel.setBorder(BorderFactory.createEmptyBorder());
        arithmeticPanel.setLayout(new GridLayout(6, 1));
        tabbedPane.add("Arithemetic", arithmeticPanel);

        // 3 - Creating Conversion Panel
        JPanel conversionPanel=new JPanel();
        conversionPanel.setLayout(new GridLayout());
        conversionPanel.setBorder(BorderFactory.createEmptyBorder());
        tabbedPane.add("Conversions", conversionPanel);


        // DISPAY SCREEN
        // Arithemetic-Pane-Row - 1
        inputScreen = new JLabel("", JLabel.CENTER);
        inputScreen.setBackground(rgb_blue);
        inputScreen.setForeground(rgb_white);
        inputScreen.setOpaque(true);
        inputScreen.setHorizontalAlignment(SwingConstants.CENTER);
        inputScreen.setFont(new Font("Arial", Font.PLAIN, 50));
        arithmeticPanel.add(inputScreen, BorderLayout.NORTH);


        // Arithemetic-Pane-Row - 2
        JPanel btn_row1=new JPanel();
        btn_row1.setLayout(new GridLayout(1, 4));
        homeButton.setFont(main_font);
        homeButton.setBackground(rgb_grey);
        homeButton.addActionListener(this);
        homeButton.setForeground(rgb_blue);
        homeButton.setRolloverEnabled(true);
        homeButton.setFocusable(false);
        btn_row1.add(homeButton);

        plusButton.setFont(main_font);
        plusButton.setBackground(rgb_grey);
        plusButton.addActionListener(this);
        plusButton.setForeground(rgb_blue);
        plusButton.setRolloverEnabled(true);
        plusButton.setFocusable(false);
        btn_row1.add(plusButton);

        minusButton.setFont(main_font);
        minusButton.setBackground(rgb_grey);
        minusButton.addActionListener(this);
        minusButton.setForeground(rgb_blue);
        minusButton.setRolloverEnabled(true);
        minusButton.setFocusable(false);
        btn_row1.add(minusButton);

        multiButton.setFont(main_font);
        multiButton.setBackground(rgb_grey);
        multiButton.addActionListener(this);
        multiButton.setForeground(rgb_blue);
        multiButton.setRolloverEnabled(true);
        multiButton.setFocusable(false);
        btn_row1.add(multiButton);
        arithmeticPanel.add(btn_row1);


        // Arithemetic-Pane-Row - 3
        JPanel btn_row2=new JPanel();
        btn_row2.setLayout(new GridLayout(1, 4));
        sevenButton.setFont(main_font);
        sevenButton.setBackground(rgb_white);
        sevenButton.addActionListener(this);
        sevenButton.setForeground(rgb_blue);
        sevenButton.setRolloverEnabled(true);
        sevenButton.setFocusable(false);
        btn_row2.add(sevenButton);

        eightButton.setFont(main_font);
        eightButton.setBackground(rgb_white);
        eightButton.addActionListener(this);
        eightButton.setForeground(rgb_blue);
        eightButton.setRolloverEnabled(true);
        eightButton.setFocusable(false);
        btn_row2.add(eightButton);

        nineButton.setFont(main_font);
        nineButton.setBackground(rgb_white);
        nineButton.addActionListener(this);
        nineButton.setForeground(rgb_blue);
        nineButton.setRolloverEnabled(true);
        nineButton.setFocusable(false);
        btn_row2.add(nineButton);

        divButton.setFont(main_font);
        divButton.setBackground(rgb_grey);
        divButton.addActionListener(this);
        divButton.setForeground(rgb_blue);
        divButton.setRolloverEnabled(true);
        divButton.setFocusable(false);
        btn_row2.add(divButton);
        arithmeticPanel.add(btn_row2);


        // Arithemetic-Pane-Row - 4
        JPanel btn_row3=new JPanel();
        btn_row3.setLayout(new GridLayout(1, 4));
        fourButton.setFont(main_font);
        fourButton.setBackground(rgb_white);
        fourButton.addActionListener(this);
        fourButton.setForeground(rgb_blue);
        fourButton.setRolloverEnabled(true);
        fourButton.setFocusable(false);
        btn_row3.add(fourButton);
        
        fiveButton.setFont(main_font);
        fiveButton.setBackground(rgb_white);
        fiveButton.addActionListener(this);
        fiveButton.setForeground(rgb_blue);
        fiveButton.setRolloverEnabled(true);
        fiveButton.setFocusable(false);
        btn_row3.add(fiveButton);
        
        sixButton.setFont(main_font);
        sixButton.setBackground(rgb_white);
        sixButton.addActionListener(this);
        sixButton.setForeground(rgb_blue);
        sixButton.setRolloverEnabled(true);
        sixButton.setFocusable(false);
        btn_row3.add(sixButton);
        
        raiseToButton.setFont(main_font);
        raiseToButton.setBackground(rgb_grey);
        raiseToButton.addActionListener(this);
        raiseToButton.setForeground(rgb_blue);
        raiseToButton.setRolloverEnabled(true);
        raiseToButton.setFocusable(false);
        btn_row3.add(raiseToButton);
        arithmeticPanel.add(btn_row3);


        // Arithemetic-Pane-Row - 5
        JPanel btn_row4=new JPanel();
        btn_row4.setLayout(new GridLayout(1, 4));
        oneButton.setFont(main_font);
        oneButton.setBackground(rgb_white);
        oneButton.addActionListener(this);
        oneButton.setForeground(rgb_blue);
        oneButton.setRolloverEnabled(true);
        oneButton.setFocusable(false);
        btn_row4.add(oneButton);
                
        twoButton.setFont(main_font);
        twoButton.setBackground(rgb_white);
        twoButton.addActionListener(this);
        twoButton.setForeground(rgb_blue);
        twoButton.setRolloverEnabled(true);
        twoButton.setFocusable(false);
        btn_row4.add(twoButton);
        
        threeButton.setFont(main_font);
        threeButton.setBackground(rgb_white);
        threeButton.addActionListener(this);
        threeButton.setForeground(rgb_blue);
        threeButton.setRolloverEnabled(true);
        threeButton.setFocusable(false);
        btn_row4.add(threeButton);

        percentButton.setFont(main_font);
        percentButton.setBackground(rgb_grey);
        percentButton.addActionListener(this);
        percentButton.setForeground(rgb_blue);
        percentButton.setRolloverEnabled(true);
        percentButton.setFocusable(false);
        btn_row4.add(percentButton);
        arithmeticPanel.add(btn_row4);


        // Arithemetic-Pane-Row - 6
        JPanel btn_row5=new JPanel();
        btn_row5.setLayout(new GridLayout(1, 4));

        clearButton.setFont(main_font);
        clearButton.setBackground(rgb_white);
        clearButton.addActionListener(this);
        clearButton.setForeground(rgb_red);
        clearButton.setRolloverEnabled(true);
        clearButton.setFocusable(false);
        btn_row5.add(clearButton);

        zeroButton.setFont(main_font);
        zeroButton.setBackground(rgb_white);
        zeroButton.addActionListener(this);
        zeroButton.setForeground(rgb_blue);
        zeroButton.setRolloverEnabled(true);
        zeroButton.setFocusable(false);
        btn_row5.add(zeroButton);

        dotButton.setFont(main_font);
        dotButton.setBackground(rgb_white);
        dotButton.addActionListener(this);
        dotButton.setForeground(rgb_blue);
        dotButton.setRolloverEnabled(true);
        dotButton.setFocusable(false);
        btn_row5.add(dotButton);
  
        equalButton.setFont(main_font);
        equalButton.setBackground(rgb_orange);
        equalButton.addActionListener(this);
        equalButton.setForeground(rgb_blue);
        equalButton.setRolloverEnabled(true);
        equalButton.setFocusable(false);
        btn_row5.add(equalButton);
        arithmeticPanel.add(btn_row5);
        
        frame.add(tabbedPane);


        JLabel la=new JLabel("This is Conversion pannel");
        conversionPanel.add(la);

        // frame.add(app);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        } else if (e.getSource() == homeButton) {
            // inputString = evaluate.evaluate("home", inputString);
        }
        inputScreen.setText(inputString);
    }
}