package view.quanli;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;

public class phieuXuatKho extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    phieuXuatKho frame = new phieuXuatKho();
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
    public phieuXuatKho() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 864, 548);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 848, 59);
        contentPane.add(panel);
        panel.setLayout(null);

        JButton btnNewButton = new JButton("Th\u00EAm");
        btnNewButton.setBounds(10, 9, 89, 42);
        panel.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("S\u1EEDa");
        btnNewButton_1.setBounds(109, 9, 89, 42);
        panel.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("X\u00F3a");
        btnNewButton_2.setBounds(208, 10, 89, 40);
        panel.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("In");
        btnNewButton_3.setBounds(307, 10, 89, 40);
        panel.add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("\u0110\u00F3ng");
        btnNewButton_4.setBounds(406, 10, 89, 40);
        panel.add(btnNewButton_4);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 60, 848, 223);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel = new JLabel("Phi\u1EBFu xu\u1EA5t kho");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setBounds(10, 5, 132, 30);
        panel_1.add(lblNewLabel);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(142, 11, 213, 22);
        panel_1.add(comboBox);

        JLabel lblNewLabel_1 = new JLabel("Hi\u1EC3n th\u1ECB tr\u00EAn s\u1ED1");
        lblNewLabel_1.setBounds(573, 7, 91, 30);
        panel_1.add(lblNewLabel_1);

        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setBounds(665, 11, 173, 22);
        panel_1.add(comboBox_1);

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(null, "Th\u00F4ng tin chung", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_2.setBounds(10, 44, 582, 174);
        panel_1.add(panel_2);
        panel_2.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("\u0110\u1ED1i t\u01B0\u1EE3ng");
        lblNewLabel_2.setBounds(10, 21, 76, 14);
        panel_2.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Ng\u01B0\u1EDDi nh\u1EADn");
        lblNewLabel_3.setBounds(10, 46, 76, 14);
        panel_2.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("\u0110\u1ECBa ch\u1EC9");
        lblNewLabel_4.setBounds(10, 71, 76, 14);
        panel_2.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("L\u00FD do xu\u1EA5t");
        lblNewLabel_5.setBounds(10, 96, 76, 14);
        panel_2.add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("K\u00E8m theo");
        lblNewLabel_6.setBounds(10, 121, 76, 14);
        panel_2.add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("Tham chi\u1EBFu");
        lblNewLabel_7.setBounds(10, 146, 76, 14);
        panel_2.add(lblNewLabel_7);

        JComboBox comboBox_2 = new JComboBox();
        comboBox_2.setBounds(85, 17, 172, 22);
        panel_2.add(comboBox_2);

        textField = new JTextField();
        textField.setBounds(267, 18, 305, 20);
        panel_2.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(85, 43, 487, 20);
        panel_2.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(85, 68, 487, 20);
        panel_2.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(85, 93, 487, 20);
        panel_2.add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(85, 118, 395, 20);
        panel_2.add(textField_4);
        textField_4.setColumns(10);

        JLabel lblNewLabel_8 = new JLabel("Ch\u1EE9ng t\u1EEB g\u1ED1c");
        lblNewLabel_8.setBounds(490, 121, 82, 14);
        panel_2.add(lblNewLabel_8);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new TitledBorder(null, "Ch\u1EE9ng t\u1EEB", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_3.setBounds(592, 44, 256, 174);
        panel_1.add(panel_3);
        panel_3.setLayout(null);

        JLabel lblNewLabel_9 = new JLabel("Ng\u00E0y h\u1EA1ch to\u00E1n");
        lblNewLabel_9.setBounds(10, 23, 92, 14);
        panel_3.add(lblNewLabel_9);

        JComboBox comboBox_3 = new JComboBox();
        comboBox_3.setBounds(101, 19, 145, 22);
        panel_3.add(comboBox_3);

        JLabel lblNewLabel_10 = new JLabel("Ng\u00E0y ch\u1EE9ng t\u1EEB");
        lblNewLabel_10.setBounds(10, 48, 92, 14);
        panel_3.add(lblNewLabel_10);

        JComboBox comboBox_4 = new JComboBox();
        comboBox_4.setBounds(101, 44, 145, 22);
        panel_3.add(comboBox_4);

        JLabel lblNewLabel_11 = new JLabel("S\u1ED1 ch\u1EE9ng t\u1EEB");
        lblNewLabel_11.setBounds(10, 73, 92, 14);
        panel_3.add(lblNewLabel_11);

        textField_5 = new JTextField();
        textField_5.setBounds(101, 70, 145, 20);
        panel_3.add(textField_5);
        textField_5.setColumns(10);

        JPanel panel_4 = new JPanel();
        panel_4.setBounds(0, 287, 848, 241);
        contentPane.add(panel_4);
        panel_4.setLayout(null);

        JButton btnNewButton_5 = new JButton("1. Ti\u1EC1n h\u00E0ng");
        btnNewButton_5.setBounds(10, 0, 105, 23);
        panel_4.add(btnNewButton_5);

        JButton btnNewButton_6 = new JButton("2. Th\u1ED1ng k\u00EA");
        btnNewButton_6.setBounds(120, 0, 105, 23);
        panel_4.add(btnNewButton_6);

        JPanel panel_5 = new JPanel();
        panel_5.setBounds(10, 27, 828, 192);
        panel_4.add(panel_5);
        panel_5.setLayout(new GridLayout(1, 0, 0, 0));

        table = new JTable();
        panel_5.add(table);
    }
}
