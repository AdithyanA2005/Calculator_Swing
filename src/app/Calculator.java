package app;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JTabbedPane;
import javax.swing.BorderFactory;

import java.awt.Insets;
import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentAdapter;

import app.theme.Constants;
import app.panels.HomePanel;
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
        frame.setLayout(null);
        frame.setSize(frame_width, frame_height);
        frame.setLocation(700, 200);
        frame.setBackground(Constants.rgb_blue);
        frame.setMinimumSize(new Dimension(300, 400));
        frame.setResizable(true);

        // INITIALIZE TABBED PANE
        JTabbedPane tabbedPane=new JTabbedPane();
        tabbedPane.setBorder(BorderFactory.createEmptyBorder());
        tabbedPane.setLocation(0, -21);

        // ADDING ARITHMETICAL PANEL
        ArithmeticPanel arithmeticPanel=new ArithmeticPanel(tabbedPane);
        tabbedPane.add(arithmeticPanel);

        // ADDING HOME PANEL
        HomePanel homePanel = new HomePanel(tabbedPane);
        tabbedPane.add(homePanel);
        
        // resizing tabbedpane on changing frame size
        frame.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent componentEvent) {
                tabbedPane.setSize(frame.getBounds().width-13, frame.getBounds().height-16);
            }
        });
        frame.add(tabbedPane);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}