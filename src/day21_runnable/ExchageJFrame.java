package day21_runnable;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ExchageJFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExchageJFrame frame = new ExchageJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ExchageJFrame() {
		setTitle("我的匯率");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JComboBox currencyCombo1 = new JComboBox();
		currencyCombo1.setMaximumRowCount(15);
		currencyCombo1.setFont(new Font("新細明體", Font.PLAIN, 24));
		contentPane.add(currencyCombo1);
		
		JLabel priceLabel = new JLabel("New label");
		priceLabel.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(priceLabel);
		
		JLabel timeLabel = new JLabel("New label");
		timeLabel.setFont(new Font("新細明體", Font.PLAIN, 24));
		contentPane.add(timeLabel);
		
		JButton exchangeButton = new JButton("New button");
		exchangeButton.setFont(new Font("新細明體", Font.PLAIN, 24));
		contentPane.add(exchangeButton);
		
		JComboBox currencyCombo2 = new JComboBox();
		currencyCombo2.setFont(new Font("新細明體", Font.PLAIN, 24));
		contentPane.add(currencyCombo2);
	}

}
