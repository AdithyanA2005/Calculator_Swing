package app.panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import app.theme.Constants;


public class HomePanel extends JPanel {
	public HomePanel(JTabbedPane tabbedPane) {
		Color rgb_background = Constants.rgb_grey;
		Color rgb_btn_background = Constants.rgb_white;
		Color rgb_btn_foreground = Constants.rgb_blue;
		
		// INITIALIZE HOME PANNEL
		setLayout(new BorderLayout(0, 0));
				
		// INITIALIZE TITLE BAR 
		JPanel topBar = new JPanel();
		topBar.setBackground(Constants.rgb_blue);
		JLabel topBarText = new JLabel("ADCALATOR");
		topBarText.setForeground(Constants.rgb_white);
		topBarText.setFont(Constants.title_font);
		topBar.add(topBarText);
		add(topBar, BorderLayout.NORTH);

		// INITIALIZE HOME CONTAINER 
		JPanel homeContainer = new JPanel();
		add(homeContainer, BorderLayout.CENTER);
		homeContainer.setLayout(new GridLayout(3, 1, 0, -55));
		

		// ROW-1
		JPanel arithmetic_row = new JPanel();
		arithmetic_row.setBorder(new LineBorder(rgb_background, 55));
		arithmetic_row.setLayout(new GridLayout(0, 1, 0, 0));
		JButton arithmeticBtn = new JButton("Arithmetic");
		arithmeticBtn.setRolloverEnabled(false);
        arithmeticBtn.setFocusable(false);
		arithmeticBtn.setBackground(rgb_btn_background);
		arithmeticBtn.setForeground(rgb_btn_foreground);
		arithmeticBtn.setFont(Constants.main_font);
		arithmeticBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		arithmetic_row.add(arithmeticBtn);
		homeContainer.add(arithmetic_row);

		// ROW-2
		JPanel conversionRow = new JPanel();
		conversionRow.setBorder(new LineBorder(rgb_background, 55));
		conversionRow.setLayout(new GridLayout(0, 1, 0, 0));
		JButton conversionBtn = new JButton("Conversion");
		conversionBtn.setRolloverEnabled(false);
        conversionBtn.setFocusable(false);
		conversionBtn.setBackground(rgb_btn_background);
		conversionBtn.setForeground(rgb_btn_foreground);
		conversionBtn.setFont(Constants.main_font);
		conversionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		conversionRow.add(conversionBtn);
		homeContainer.add(conversionRow);
		
		// ROW-3
		JPanel trignometryRow = new JPanel();
		trignometryRow.setBorder(new LineBorder(rgb_background, 55));
		trignometryRow.setLayout(new GridLayout(0, 1, 0, 0));
		JButton trignometryBtn = new JButton("Trignometry");
		trignometryBtn.setRolloverEnabled(false);
        trignometryBtn.setFocusable(false);
		trignometryBtn.setBackground(rgb_btn_background);
		trignometryBtn.setForeground(rgb_btn_foreground);
		trignometryBtn.setFont(Constants.main_font);
		trignometryBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		trignometryRow.add(trignometryBtn);
		homeContainer.add(trignometryRow);
	}
}
