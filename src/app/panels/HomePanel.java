package app.panels;
import javax.swing.JTabbedPane;
import javax.swing.*;
// import javax.swing.ImageIcon.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

// import javax.swing.JPanel;
// import javax.swing.BoxLayout;
// import java.awt.GridLayout;
// import javax.swing.JButton;
// import java.awt.FlowLayout;
// import java.awt.event.ActionListener;
// import java.awt.event.ActionEvent;
// import java.awt.CardLayout;
// import javax.swing.SpringLayout;
// import java.awt.GridBagLayout;
// import java.awt.GridBagConstraints;
// import java.awt.Insets;
// import com.jgoodies.forms.layout.FormLayout;
// import com.jgoodies.forms.layout.ColumnSpec;
// import com.jgoodies.forms.layout.RowSpec;
// import com.jgoodies.forms.layout.FormSpecs;
// import net.miginfocom.swing.MigLayout;
// import javax.swing.GroupLayout;
// import javax.swing.GroupLayout.Alignment;
// import java.awt.BorderLayout;
// import javax.swing.JPopupMenu;
// import java.awt.Component;
// import java.awt.event.MouseAdapter;
// import java.awt.event.MouseEvent;
// import javax.swing.JMenuItem;
// import javax.swing.JSpinner;
// import javax.swing.JProgressBar;
// import javax.swing.JLabel;
// import javax.swing.JToolBar;
// import javax.swing.JMenu;
// import javax.swing.JDesktopPane;
// import javax.swing.JTextArea;
// import javax.swing.JComboBox;
// import javax.swing.JInternalFrame;
// import javax.swing.JMenuBar;
// import java.awt.Color;
// import javax.swing.border.LineBorder;
// import javax.swing.SwingConstants;
// import java.awt.Font;
// import java.awt.Panel;
// import javax.swing.JSeparator;
// import javax.swing.JLayeredPane;
// import javax.swing.JScrollPane;
// import javax.swing.Box;
// import java.awt.Button;

public class HomePanel extends JPanel {
	public HomePanel(JTabbedPane tabbedPane) {
		// INITIALIZE HOME PANNEL 
		setLayout(new BorderLayout(0, 30));
        setBorder(BorderFactory.createEmptyBorder());
		
		// INTIALIZING HOME PANNEL NAVBAR 
		JPanel topBar = new JPanel();
		topBar.setBackground(Color.RED);
		add(topBar, BorderLayout.NORTH);
		
		JLabel topBarText = new JLabel("ADCALATOR");
		topBarText.setFont(new Font("Tahoma", Font.PLAIN, 40));
		topBar.add(topBarText);
		

		// INITIALIZE CARDS 
		JPanel cardsPanel = new JPanel();
		add(cardsPanel, BorderLayout.CENTER);
		cardsPanel.setLayout(new GridLayout(4, 3, 0, 30));
		
		Component spacer1 = Box.createHorizontalStrut(20);
		cardsPanel.add(spacer1);
		
		JButton arithmeticBtn = new JButton("Arithemetic");
		arithmeticBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		cardsPanel.add(arithmeticBtn);
		
		Component spacer2 = Box.createHorizontalStrut(20);
		cardsPanel.add(spacer2);
		
		Component spacer3 = Box.createHorizontalStrut(20);
		cardsPanel.add(spacer3);
		
		JButton conversionBtn = new JButton("Conversions");
		cardsPanel.add(conversionBtn);
		
		Component spacer4 = Box.createHorizontalStrut(20);
		cardsPanel.add(spacer4);
		
		Component spacer5 = Box.createHorizontalStrut(20);
		cardsPanel.add(spacer5);
		
		JButton Trignometry = new JButton("Trignometry");
		cardsPanel.add(Trignometry);
		
		Component spacer6 = Box.createHorizontalStrut(20);
		cardsPanel.add(spacer6);
		
		Component spacer7 = Box.createVerticalStrut(20);
		cardsPanel.add(spacer7);

	}
}
