package view.nvbanhang;

import view.*;
import controller.LoadDiaChi;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import model.NhanVien;

public class jf_The extends javax.swing.JFrame {

    JTextField _txtLoaiThe;
    List<JButton> listlb;
    List<Bank> listBank;
    JTextField tenNganHang;
    public jf_The(JTextField txtLoaiThe,JTextField tenNganHang) {
        initComponents();
        this._txtLoaiThe = txtLoaiThe;
        this.tenNganHang = tenNganHang;
        pnListNganHang.setLayout(new BoxLayout(pnListNganHang, BoxLayout.Y_AXIS));
        listBank = getListBanK();
        listlb = load(listBank);
        loadData(listlb);
        txtLoaiThe.addKeyListener(new KeyListener() {
            public void keyPressed(JTextComponent.KeyBinding e) {
                List<JButton> listlbs = getList(txtLoaiThe.getText(), listBank, listlb);
                loadData(listlbs);
            }

            @Override
            public void keyTyped(KeyEvent e) {
                List<JButton> listlbs = getList(txtLoaiThe.getText(), listBank, listlb);
                loadData(listlbs);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                List<JButton> listlbs = getList(txtLoaiThe.getText(), listBank, listlb);
                loadData(listlbs);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                List<JButton> listlbs = getList(txtLoaiThe.getText(), listBank, listlb);
                loadData(listlbs);
            }
        });
    }

    public List<JButton> getList(String search,List<Bank> list,List<JButton> listlb) {
        List<JButton> listNew = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLoaiThe().contains(search)) {
                listNew.add(listlb.get(i));
            }
        }
        return listNew;
    }
    public List<Bank> getListBanK() {
        List<Bank> listBank = new ArrayList<>();
        try {
            File file = new File("D:\\pmquanlisieuthimini\\NganHang.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String toString = "";
            while ((line = br.readLine()) != null) {
                toString += line + "=";
            }
            String[] arr = toString.split("=");
            for (int i = 0; i < arr.length; i++) {
                String[] arrI = arr[i].split("@");
                Bank bank = new Bank(arrI[2], arrI[1]);
                listBank.add(bank);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listBank;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnF = new javax.swing.JPanel();
        btnOk = new javax.swing.JButton();
        txtLoaiThe = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnListNganHang = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(364, 383));
        setUndecorated(true);
        setSize(new java.awt.Dimension(364, 383));

        pnF.setBackground(java.awt.Color.white);
        pnF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 4));
        pnF.setMaximumSize(new java.awt.Dimension(364, 383));
        pnF.setMinimumSize(new java.awt.Dimension(364, 383));
        pnF.setLayout(null);

        btnOk.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        pnF.add(btnOk);
        btnOk.setBounds(113, 316, 129, 40);

        txtLoaiThe.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtLoaiThe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnF.add(txtLoaiThe);
        txtLoaiThe.setBounds(64, 24, 217, 40);

        pnListNganHang.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout pnListNganHangLayout = new javax.swing.GroupLayout(pnListNganHang);
        pnListNganHang.setLayout(pnListNganHangLayout);
        pnListNganHangLayout.setHorizontalGroup(
            pnListNganHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );
        pnListNganHangLayout.setVerticalGroup(
            pnListNganHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnListNganHang);

        pnF.add(jScrollPane1);
        jScrollPane1.setBounds(14, 84, 330, 220);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnF, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnF, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        List<Bank> list = getListBanK();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (txtLoaiThe.getText().equals(list.get(i).getLoaiThe())) {
                this.dispose();
                _txtLoaiThe.setText(txtLoaiThe.getText());
                tenNganHang.setText(list.get(i).getTenNganHang());
            } else {
                count = 1;
            }
        }
    }//GEN-LAST:event_btnOkActionPerformed
    public List<JButton> load(List<Bank> listBank) {
        List<JButton> listlb = new ArrayList<>();
        for (int i = 0; i < listBank.size(); i++) {
            JButton btn = new JButton();
            btn.setMaximumSize(new Dimension(315, 30));
            btn.setMinimumSize(new Dimension(315, 30));
            btn.setSize(new Dimension(315, 30));
            btn.setPreferredSize(new Dimension(315, 30));
            btn.setBackground(Color.WHITE);
            btn.setText(listBank.get(i).getLoaiThe());
            listlb.add(btn);
        }
        return listlb;
    }
    public void loadData(List<JButton> listlb) {
        pnListNganHang.removeAll();
        pnListNganHang.validate();
        jScrollPane1.getViewport().revalidate();
        pnListNganHang.updateUI();
        for (int i = 0; i < listlb.size(); i++) {
            int num = pnListNganHang.getComponentCount();
            int j = i;
            listlb.get(i).addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    for (int a = 0; a < listlb.size(); a++) {
                        if (a == j) {
                            listlb.get(j).setBackground(Color.BLUE);
                            listlb.get(j).setForeground(Color.WHITE);
                            txtLoaiThe.setText(listlb.get(j).getText());
                        } else {
                            listlb.get(a).setBackground(Color.WHITE);
                            listlb.get(a).setForeground(Color.BLACK);
                        }
                    }
                }
            });
            pnListNganHang.add(listlb.get(i));
            pnListNganHang.setPreferredSize(new Dimension(315, num * 30));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnF;
    private javax.swing.JPanel pnListNganHang;
    private javax.swing.JTextField txtLoaiThe;
    // End of variables declaration//GEN-END:variables
}
