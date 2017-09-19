package assignment6.problem2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Rainbow extends JFrame implements ActionListener{
	
	private static final int FRAME_WIDTH    = 616;
    private static final int FRAME_HEIGHT   = 260;
    private static final int FRAME_X_ORIGIN = 380;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH  = 80;
    private static final int BUTTON_HEIGHT = 200;
	
	private JButton r1, r2, r3, r4, r5, r6, r7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rainbow rainbow = new Rainbow();
		rainbow.setVisible(true);
		rainbow.requestFocus();
	}
	
	public Rainbow() {
		// TODO Auto-generated constructor stub
		
		Container contentPane = getContentPane();
		
		setTitle("FlowLayout Test");
		setBounds(FRAME_X_ORIGIN, FRAME_Y_ORIGIN, FRAME_WIDTH, FRAME_HEIGHT);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		r1 = new JButton("red");
		r1.setFocusPainted(false);
		r1.setForeground(Color.RED);
		r1.setBackground(Color.RED);
		r1.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
		
		r2 = new JButton("orange");
		r2.setFocusPainted(false);
		r2.setBackground(Color.ORANGE);
		r2.setForeground(Color.ORANGE);
		r2.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
		
		r3 = new JButton("yellow");
		r3.setFocusPainted(false);
		r3.setBackground(Color.YELLOW);
		r3.setForeground(Color.YELLOW);
		r3.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
		
		r4 = new JButton("green");
		r4.setFocusPainted(false);
		r4.setBackground(Color.GREEN);
		r4.setForeground(Color.GREEN);
		r4.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
		
		r5 = new JButton("blue");
		r5.setFocusPainted(false);
		r5.setBackground(Color.BLUE);
		r5.setForeground(Color.BLUE);
		r5.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
		
		r6 = new JButton("indigo");
		r6.setFocusPainted(false);
		r6.setBackground(new Color(111, 0, 255));
		r6.setForeground(new Color(111, 0, 255));
		r6.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
		
		r7 = new JButton("violet");
		r7.setFocusPainted(false);
		r7.setBackground(new Color(159, 0, 255));
		r7.setForeground(new Color(159, 0, 255));
		r7.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
		
		contentPane.add(r1);
		contentPane.add(r2);
		contentPane.add(r3);
		contentPane.add(r4);
		contentPane.add(r5);
		contentPane.add(r6);
		contentPane.add(r7);
		
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r4.addActionListener(this);
		r5.addActionListener(this);
		r6.addActionListener(this);
		r7.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton src = (JButton) e.getSource();
		switch(src.getText().toLowerCase()) {
		case "red":
			JOptionPane.showMessageDialog(src, "Red signifies passion, vitality, enthusiasm and security.");
			break;
		case "orange":
			JOptionPane.showMessageDialog(src, "Orange is a dynamic color representing creativity, practicality, playfulness as well as equilibrium or control");
			break;
		case "yellow":
			JOptionPane.showMessageDialog(src, "Yellow represents clarity of thought, wisdom, orderliness and energy.");
			break;
		case "green":
			JOptionPane.showMessageDialog(src, "Green denotes fertility, growth, balance, health and wealth.");
			break;
		case "blue":
			JOptionPane.showMessageDialog(src, "Blue is associated with Spirituality and Divinity.");
			break;
		case "indigo":
			JOptionPane.showMessageDialog(src, "Indigo is sedating. Indigo is mystical as it bridges the Gap between Finite and Infinite.");
			break;
		case "violet":
			JOptionPane.showMessageDialog(src, "Dark tones of violet are associated with sorrow. Deeper shades of violet or purple denote high spiritual mastery.");
			break;
		default:
			// Do nothing
		}
	}

}
