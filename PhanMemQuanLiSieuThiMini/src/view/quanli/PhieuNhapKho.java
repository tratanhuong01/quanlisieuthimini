package controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class PhieuNhapKho extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhieuNhapKho frame = new PhieuNhapKho();
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
	public PhieuNhapKho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 716);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 717, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PHI\u1EBEU NH\u1EACP KHO");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(223, 11, 249, 30);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 74, 717, 253);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 318, 231);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u0110\u01A1n v\u1ECB giao d\u1ECBch : ");
		lblNewLabel_1.setBounds(10, 11, 86, 20);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u0110\u1EA1i di\u1EC7n : ");
		lblNewLabel_1_1.setBounds(10, 44, 86, 20);
		panel_2.add(lblNewLabel_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(133, 10, 175, 22);
		panel_2.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(133, 44, 175, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("H\u1ECD t\u00EAn ng\u01B0\u1EDDi nh\u1EADn : ");
		lblNewLabel_1_1_1.setBounds(10, 75, 99, 20);
		panel_2.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(133, 75, 175, 20);
		panel_2.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("\u0110i\u1EC7n tho\u1EA1i ng\u01B0\u1EDDi nh\u1EADn : ");
		lblNewLabel_1_1_1_1.setBounds(10, 106, 116, 20);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(133, 106, 175, 20);
		panel_2.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("NV b\u00E1n h\u00E0ng : ");
		lblNewLabel_1_1_1_1_1.setBounds(10, 138, 116, 20);
		panel_2.add(lblNewLabel_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(133, 138, 175, 20);
		panel_2.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("NV L\u1EADp phi\u1EBFu : ");
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 172, 116, 20);
		panel_2.add(lblNewLabel_1_1_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(133, 169, 175, 20);
		panel_2.add(textField_5);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Lo\u1EA1i nh\u1EADp : ");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(10, 200, 116, 20);
		panel_2.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(133, 200, 175, 22);
		panel_2.add(comboBox_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(338, 11, 369, 57);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 11, 46, 14);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\u0110/C :");
		lblNewLabel_2_1.setBounds(10, 32, 46, 14);
		panel_3.add(lblNewLabel_2_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(338, 79, 369, 163);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("\u0110C ng\u01B0\u1EDDi nh\u1EADn : ");
		lblNewLabel_3.setBounds(10, 11, 93, 20);
		panel_4.add(lblNewLabel_3);
		
		textField_6 = new JTextField();
		textField_6.setBounds(118, 8, 241, 20);
		panel_4.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Ng\u00E0y : ");
		lblNewLabel_3_1.setBounds(10, 42, 93, 20);
		panel_4.add(lblNewLabel_3_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(118, 39, 93, 22);
		panel_4.add(comboBox_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("S\u1ED1 phi\u1EBFu : ");
		lblNewLabel_3_1_1.setBounds(216, 39, 61, 20);
		panel_4.add(lblNewLabel_3_1_1);
		
		textField_7 = new JTextField();
		textField_7.setBounds(276, 39, 83, 20);
		panel_4.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("T\u1EF7 gi\u00E1 : ");
		lblNewLabel_3_1_2.setBounds(10, 73, 93, 20);
		panel_4.add(lblNewLabel_3_1_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(118, 73, 93, 20);
		panel_4.add(textField_8);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Ng\u00E0y TT : ");
		lblNewLabel_3_1_1_1.setBounds(216, 73, 61, 20);
		panel_4.add(lblNewLabel_3_1_1_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(276, 73, 83, 20);
		panel_4.add(textField_9);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("Ti\u1EC1n h\u00E0ng : ");
		lblNewLabel_3_1_2_1.setBounds(10, 102, 93, 20);
		panel_4.add(lblNewLabel_3_1_2_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(118, 104, 93, 20);
		panel_4.add(textField_10);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Gi\u00E1 tr\u1ECB Q\u0110 : ");
		lblNewLabel_3_1_1_1_1.setBounds(216, 105, 61, 20);
		panel_4.add(lblNewLabel_3_1_1_1_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(276, 102, 83, 20);
		panel_4.add(textField_11);
		
		JLabel lblNewLabel_3_1_2_1_1 = new JLabel("Kho h\u00E0ng : ");
		lblNewLabel_3_1_2_1_1.setBounds(10, 132, 93, 20);
		panel_4.add(lblNewLabel_3_1_2_1_1);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBounds(118, 135, 93, 22);
		panel_4.add(comboBox_2_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 338, 721, 33);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("C\u1EADp nh\u1EADt gi\u00E1 m\u1EDBi");
		chckbxNewCheckBox.setBounds(473, 7, 123, 23);
		panel_5.add(chckbxNewCheckBox);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Th\u00F4ng tin s\u1EA3n ph\u1EA9m v\u1EEBa nh\u1EADp", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_6.setBounds(10, 382, 717, 176);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 25, 677, 37);
		panel_6.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("M\u00E3 v\u1EA1ch : ");
		lblNewLabel_4.setBounds(10, 11, 66, 14);
		panel_7.add(lblNewLabel_4);
		
		textField_12 = new JTextField();
		textField_12.setBounds(99, 8, 73, 20);
		panel_7.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(181, 8, 113, 20);
		panel_7.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(308, 8, 73, 20);
		panel_7.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(376, 8, 227, 20);
		panel_7.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setBounds(608, 8, 59, 20);
		panel_7.add(textField_16);
		textField_16.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(20, 68, 671, 97);
		panel_6.add(panel_8);
		panel_8.setLayout(new GridLayout(1, 0, 0, 0));
		
		table = new JTable();
		panel_8.add(table);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(10, 569, 721, 33);
		contentPane.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Ghi ch\u00FA : ");
		lblNewLabel_5.setBounds(10, 11, 46, 14);
		panel_9.add(lblNewLabel_5);
		
		textField_17 = new JTextField();
		textField_17.setBounds(66, 8, 504, 20);
		panel_9.add(textField_17);
		textField_17.setColumns(10);
		
		JButton btnNewButton = new JButton("Thanh To\u00E1n");
		btnNewButton.setBounds(590, 7, 89, 23);
		panel_9.add(btnNewButton);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(20, 613, 707, 38);
		contentPane.add(panel_10);
		panel_10.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("L\u01B0u");
		btnNewButton_1.setBounds(10, 11, 89, 23);
		panel_10.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("In");
		btnNewButton_1_1.setBounds(109, 11, 89, 23);
		panel_10.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("In Bill");
		btnNewButton_1_1_1.setBounds(214, 11, 89, 23);
		panel_10.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Nh\u1EADp m\u1EDBi");
		btnNewButton_1_1_1_1.setBounds(313, 11, 89, 23);
		panel_10.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("S\u1EEDa");
		btnNewButton_1_1_1_1_1.setBounds(412, 11, 89, 23);
		panel_10.add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_2 = new JButton("X\u00F3a");
		btnNewButton_1_1_1_1_2.setBounds(507, 11, 89, 23);
		panel_10.add(btnNewButton_1_1_1_1_2);
		
		JButton btnNewButton_1_1_1_1_3 = new JButton("Tho\u00E1t");
		btnNewButton_1_1_1_1_3.setBounds(608, 11, 89, 23);
		panel_10.add(btnNewButton_1_1_1_1_3);
	}
}
