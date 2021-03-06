import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;

import java.awt.FlowLayout;

import javax.swing.JRadioButton;


public class ButtonGroupExample {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonGroupExample window = new ButtonGroupExample();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ButtonGroupExample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton rdbtnSmall = new JRadioButton("Small");
		frame.getContentPane().add(rdbtnSmall);
		rdbtnSmall.setSelected(true);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		frame.getContentPane().add(rdbtnMedium);
		
		JRadioButton rdbtnLarge = new JRadioButton("Large");
		frame.getContentPane().add(rdbtnLarge);
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnSmall);
		btnGroup.add(rdbtnMedium);
		btnGroup.add(rdbtnLarge);
	}

}
