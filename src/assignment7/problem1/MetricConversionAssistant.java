package assignment7.problem1;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class MetricConversionAssistant extends JFrame {
	
	private static final int FRAME_WIDTH    = 500;
    private static final int FRAME_HEIGHT   = 400;
    private static final int FRAME_X_ORIGIN = 350;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH  = 150;
    private static final int BUTTON_HEIGHT = 30;
    
    private static final int LABEL_WIDTH  = 70;
    private static final int LABEL_HEIGHT  = 30;
    private static final int TEXTFIELD_WIDTH  = 100;
    private static final int TEXTFIELD_HEIGHT = 30;
    
    private static final int OFFSET_X = 40;
    private static final int OFFSET_Y = 40;
    private static final int OFFSET_GAP = 15;
    
    private JTextField lt1, lt2, lt3, lt4, rt1, rt2, rt3, rt4;
    private JLabel l1, l2, l3, l4, r1, r2, r3, r4;
    private JButton convertBtn;
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	MetricConversionAssistant mca = new MetricConversionAssistant();
    	mca.setVisible(true);
	}
    
    public MetricConversionAssistant() {
		// TODO Auto-generated constructor stub
    	
    	Container contentPane = getContentPane();
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Metric Conversion Assistant");
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);
        
        convertBtn = new JButton("Convert");
        convertBtn.setBounds(175, 300, BUTTON_WIDTH, BUTTON_HEIGHT);
     
        
        l1 = new JLabel();
        l1.setText("Mile:");
        l1.setHorizontalAlignment(SwingConstants.RIGHT);
        l1.setBounds(OFFSET_X, OFFSET_Y, LABEL_WIDTH, LABEL_HEIGHT);
        
        l2 = new JLabel();
        l2.setText("Pound:");
        l2.setHorizontalAlignment(SwingConstants.RIGHT);
        l2.setBounds(OFFSET_X, OFFSET_Y + 4*OFFSET_GAP, LABEL_WIDTH, LABEL_HEIGHT);
        
        l3 = new JLabel();
        l3.setText("Gallon:");
        l3.setHorizontalAlignment(SwingConstants.RIGHT);
        l3.setBounds(OFFSET_X, OFFSET_Y + 8*OFFSET_GAP, LABEL_WIDTH, LABEL_HEIGHT);
        
        l4 = new JLabel();
        l4.setText("Fahrenheit:");
        l4.setHorizontalAlignment(SwingConstants.RIGHT);
        l4.setBounds(OFFSET_X, OFFSET_Y + 12*OFFSET_GAP, LABEL_WIDTH, LABEL_HEIGHT);
        
        r1 = new JLabel();
        r1.setText("Kilometer:");
        r1.setHorizontalAlignment(SwingConstants.RIGHT);
        r1.setBounds(2*(OFFSET_X + LABEL_WIDTH + OFFSET_GAP), OFFSET_Y, LABEL_WIDTH, LABEL_HEIGHT);
        
        r2 = new JLabel();
        r2.setText("Kilograms:");
        r2.setHorizontalAlignment(SwingConstants.RIGHT);
        r2.setBounds(2*(OFFSET_X + LABEL_WIDTH + OFFSET_GAP), OFFSET_Y + 4*OFFSET_GAP, LABEL_WIDTH, LABEL_HEIGHT);
        
        r3 = new JLabel();
        r3.setText("Liters:");
        r3.setHorizontalAlignment(SwingConstants.RIGHT);
        r3.setBounds(2*(OFFSET_X + LABEL_WIDTH + OFFSET_GAP), OFFSET_Y + 8*OFFSET_GAP, LABEL_WIDTH, LABEL_HEIGHT);
        
        r4 = new JLabel();
        r4.setText("Cetigarde:");
        r4.setHorizontalAlignment(SwingConstants.RIGHT);
        r4.setBounds(2*(OFFSET_X + LABEL_WIDTH + OFFSET_GAP), OFFSET_Y + 12*OFFSET_GAP, LABEL_WIDTH, LABEL_HEIGHT);
        
        
        
        lt1  = new JTextField();
        lt1.setBounds(OFFSET_X + LABEL_WIDTH + OFFSET_GAP, OFFSET_Y, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        
        lt2  = new JTextField();
        lt2.setBounds(OFFSET_X + LABEL_WIDTH + OFFSET_GAP, OFFSET_Y + 4*OFFSET_GAP, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        
        lt3  = new JTextField();
        lt3.setBounds(OFFSET_X + LABEL_WIDTH + OFFSET_GAP, OFFSET_Y + 8*OFFSET_GAP, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        
        lt4  = new JTextField();
        lt4.setBounds(OFFSET_X + LABEL_WIDTH + OFFSET_GAP, OFFSET_Y + 12*OFFSET_GAP, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        
        rt1  = new JTextField();
        rt1.setBounds(2*(2*OFFSET_X + LABEL_WIDTH + OFFSET_GAP), OFFSET_Y, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        
        rt2  = new JTextField();
        rt2.setBounds(2*(2*OFFSET_X + LABEL_WIDTH + OFFSET_GAP), OFFSET_Y + 4*OFFSET_GAP , TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        
        rt3  = new JTextField();
        rt3.setBounds(2*(2*OFFSET_X + LABEL_WIDTH + OFFSET_GAP), OFFSET_Y + 8*OFFSET_GAP, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        
        rt4  = new JTextField();
        rt4.setBounds(2*(2*OFFSET_X + LABEL_WIDTH + OFFSET_GAP), OFFSET_Y + 12*OFFSET_GAP, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        
		
		contentPane.add(l1);
		contentPane.add(l2);
		contentPane.add(l3);
		contentPane.add(l4);
		
		contentPane.add(r1);
		contentPane.add(r2);
		contentPane.add(r3);
		contentPane.add(r4);
		
		contentPane.add(lt1);
		contentPane.add(lt2);
		contentPane.add(lt3);
		contentPane.add(lt4);
		
		contentPane.add(rt1);
		contentPane.add(rt2);
		contentPane.add(rt3);
		contentPane.add(rt4);
		
		contentPane.add(convertBtn);
		
		convertBtn.addActionListener(evt -> {
			String mile, pound, gallon, fh;
			
			mile = lt1.getText();
			pound = lt2.getText();
			gallon = lt3.getText();
			fh = lt4.getText();
			
			if(mile.length() == 0) {
				rt1.setText("0");
			}
			
			if(pound.length() == 0) {
				rt2.setText("0");
			}
			
			if(gallon.length() == 0) {
				rt3.setText("0");
			}
			
			if(fh.length() == 0) {
				rt4.setText("0");
			}
			
			try {
				Double mileI = Double.parseDouble(mile);
				Double kilo = mileI * 1.609344;
				rt1.setText(kilo.toString());
			}catch(NumberFormatException e) {
				rt1.setText("Number Error");
			}
			
			try {
				Double poundI = Double.parseDouble(pound);
				Double kg = poundI * 0.453592;
				rt2.setText(kg.toString());
			}catch(NumberFormatException e) {
				rt2.setText("Number Error");
			}
			
			try {
				Double gallonI = Double.parseDouble(gallon);
				Double ltr = gallonI * 3.78541;
				rt3.setText(ltr.toString());
			}catch(NumberFormatException e) {
				rt3.setText("Number Error");
			}
			
			try {
				Double fhI = Double.parseDouble(fh);
				Double cs = (Double) ((fhI - 32) * 0.5556);
				rt4.setText(cs.toString());
			}catch(NumberFormatException e) {
				rt4.setText("Number Error");
			}
			
		});
		
    }

}
