package app;

import javax.swing.JFrame;
import javax.swing.UIManager;

import java.awt.Insets;
import java.awt.Dimension;
import java.awt.GridLayout;

import app.theme.Constants;
import app.panels.ArithmeticPanel;


public class Calculator {
    public Calculator(String title) {
        // INTIALIZING VARIABLES
        int frame_width = 445;
        int frame_height = 617;

        // ADDING UIMANAGER VALUES 
        UIManager.getDefaults().put("TabbedPane.contentBorderInsets", new Insets(0,0,0,0));
        UIManager.getDefaults().put("TabbedPane.tabsOverlapBorder", true);

        // INTIALIZING JFRAME 
        JFrame frame=new JFrame(title);
        frame.setLayout(new GridLayout());
        frame.setSize(frame_width, frame_height);
        frame.setLocation(700, 200);
        frame.setMinimumSize(new Dimension(300, 400));

        // ADDING ARITHMETICAL PANEL
        ArithmeticPanel arithmeticPanel=new ArithmeticPanel(frame);
        frame.add(arithmeticPanel);

        // DISPLAYING FRAME
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}