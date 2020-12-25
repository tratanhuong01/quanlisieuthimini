package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.JTableHeader;
import model.KhachHang;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class XuatFile {
    
    public String getValueAtTable(JTable table,int index,int num) {
        if (table.getModel().getValueAt(index, num).toString().isEmpty()) 
            return "empty";
        else
         return table.getModel().getValueAt(index, num).toString();
    }
    public HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    } 
    public HSSFWorkbook xuat(JTable table,String tenSheet) {
        HSSFWorkbook workbook = new HSSFWorkbook();
        try {
            HSSFSheet sheet = workbook.createSheet(tenSheet);
            Cell cell;
            Row row;
            HSSFCellStyle style = createStyleForTitle(workbook);
            row = sheet.createRow(0);
            int rowNumTable = table.getRowCount();
            int columNumTable = table.getColumnCount();
            for (int i = 0; i < columNumTable ; i++) {
                cell = row.createCell(i);
                cell.setCellValue(table.getColumnName(i));
                cell.setCellStyle(style);
            }
             
            for (int i = 0; i < rowNumTable; i++) {
                row = sheet.createRow(i + 1);
                for (int j = 0; j < columNumTable; j++) {
                    cell = row.createCell(j);
                    cell.setCellValue(getValueAtTable(table, i, j));
                    cell.setCellStyle(style);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return workbook;
    }
    public void execute(JTable table,JProgressBar process,String nameSheet) {
        JFileChooser jf = new JFileChooser();
        if (jf.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = new File(jf.getSelectedFile().getAbsolutePath());
            try {
                FileOutputStream fos = new FileOutputStream(file);
                fos.flush();
                HSSFWorkbook workBook = new XuatFile().xuat(table,nameSheet);
                workBook.write(fos);
                workBook.close();
                fos.close();
                int i = 0;
                Timer time = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        int i = process.getValue();
                        i += 25;
                        process.setValue(i);
                        if (i == process.getMaximum()) 
                            JOptionPane.showMessageDialog(null, "Xuất File Thành Công");
                    }
                });
                time.start();
                if (i == process.getMaximum()) {
                    time.stop();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
