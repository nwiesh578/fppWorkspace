package assignment6.problem1;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class StringUtil extends JFrame implements ActionListener {
	
	private static final int FRAME_WIDTH    = 500;
    private static final int FRAME_HEIGHT   = 250;
    private static final int FRAME_X_ORIGIN = 450;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int TEXTFIELD_WIDTH  = 200;
    private static final int TEXTFIELD_HEIGHT = 30;
    private static final int BUTTON_WIDTH  = 150;
    private static final int BUTTON_HEIGHT = 30;

    
    private JTextField ip, op;
    private JLabel l1, l2;
    private JButton countLetters, reverseLetters, removeDuplicates;
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringUtil su = new StringUtil();
		su.setVisible(true);
	}
	
	public StringUtil() {
		// TODO Auto-generated constructor stub
		
		Container contentPane = getContentPane();
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("String Utility");
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);
        
        countLetters = new JButton("Count Letters");
        countLetters.setBounds(40, 40, BUTTON_WIDTH, BUTTON_HEIGHT);
        
        reverseLetters = new JButton("Reverse Letters");
        reverseLetters.setBounds(40, 90, BUTTON_WIDTH, BUTTON_HEIGHT);
        
        removeDuplicates = new JButton("Remove Duplicates");
        removeDuplicates.setBounds(40, 140, BUTTON_WIDTH, BUTTON_HEIGHT);
        
        ip  = new JTextField();
        ip.setBounds(250, 65, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        
        op  = new JTextField();
        op.setBounds(250, 120, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        
        l1 = new JLabel();
        l1.setText("Input");
        l1.setBounds(250, 45, TEXTFIELD_WIDTH, 20);
        
        l2 = new JLabel();
        l2.setText("Output");
        l2.setBounds(250, 100, TEXTFIELD_WIDTH, 20);
        
        contentPane.add(countLetters);
		contentPane.add(reverseLetters);
		contentPane.add(removeDuplicates);
		contentPane.add(ip);
		contentPane.add(op);
		contentPane.add(l1);
		contentPane.add(l2);
		
		countLetters.addActionListener(this);
		reverseLetters.addActionListener(this);
		removeDuplicates.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton src = (JButton) e.getSource();
		
		if(ip.getText().length() == 0) {
			JOptionPane.showMessageDialog(null, "No input. Please provide input.", "Failure", JOptionPane.ERROR_MESSAGE);
		} else {
			String in = ip.getText();
			switch(src.getText().toLowerCase()) {
			case "count letters":
				op.setText("Counted Letters: " + in.length());
				break;
			case "reverse letters":
				op.setText("Reversed Letters: " + new StringBuffer(in).reverse().toString());
				break;
			case "remove duplicates":
				String out = "";
				for(int i=0;i<in.length();i++) {
					boolean present = false;
					for(int j=0;j<out.length();j++) {
						if(in.substring(i, i+1).equals(out.substring(j, j+1))) {
							present = true;
						}
					}
					
					if(!present) {
						out += in.substring(i, i+1);
					}
				}
				op.setText("Removed Duplicates: " + out);
				break;
			default:
				// Do Nothing..
			}
		}
		
	}

}
