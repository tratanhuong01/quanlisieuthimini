package controller;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import static javax.management.Query.lt;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFileExel {

    public boolean readNhap(JTable jTable) {
        try {
            DecimalFormat format = new DecimalFormat("###,###,###");
            JFileChooser jf = new JFileChooser();
            if (jf.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = new File(jf.getSelectedFile().getAbsolutePath());
                FileInputStream fis = new FileInputStream(file);
                HSSFWorkbook xssfW = new HSSFWorkbook(fis);
                HSSFSheet excelSheet = xssfW.getSheetAt(0);
                Vector vTitle = new Vector(11);
                CellStyle cellStyle = xssfW.createCellStyle();
                CreationHelper creationHelper = xssfW.getCreationHelper();
                cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy-MM-dd hh:mm:ss"));
                DefaultTableModel tableModel = new DefaultTableModel(vTitle, 0);
                for (int row = 0; row < excelSheet.getLastRowNum(); row++) {
                    HSSFRow excelRow = excelSheet.getRow(row);
                    if (row == 0) {
                        vTitle.add(excelRow.getCell(0).toString());
                        vTitle.add(excelRow.getCell(1).toString());
                        vTitle.add(excelRow.getCell(2).toString());
                        vTitle.add(excelRow.getCell(3).toString());
                        vTitle.add(excelRow.getCell(4).toString());
                        vTitle.add(excelRow.getCell(5).toString());
                        vTitle.add(excelRow.getCell(6).toString());
                        vTitle.add(excelRow.getCell(7).toString());
                        vTitle.add(excelRow.getCell(8).toString());
                        vTitle.add(excelRow.getCell(9).toString());
                        vTitle.add(excelRow.getCell(10).toString());
                    } else {
                        Vector vData = new Vector();
                        vData.add(excelRow.getCell(0).toString());
                        vData.add(excelRow.getCell(1).toString());
                        vData.add(excelRow.getCell(2).toString());
                        vData.add(excelRow.getCell(3).toString());
//                        String date4 = new SimpleDateFormat("yyyy-MM-dd").format(
//                        (java.util.Date) new SimpleDateFormat("dd-MMM-yyyy").
//                                parse(excelRow.getCell(4).toString()));
//                        String date5 = new SimpleDateFormat("yyyy-MM-dd").format(
//                        (java.util.Date) new SimpleDateFormat("dd-MMM-yyyy").
//                                parse(excelRow.getCell(5).toString()));
                        vData.add(excelRow.getCell(4).toString());
                        vData.add(excelRow.getCell(5).toString());
                        vData.add(excelRow.getCell(6));
                        vData.add(excelRow.getCell(7));
                        vData.add(excelRow.getCell(8));
                        vData.add(excelRow.getCell(9).toString());
                        vData.add(format.format(formatString(excelRow.getCell(10))));
                        tableModel.addRow(vData);
                    }
                }
                jTable.setModel(tableModel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean readXuat(JTable jTable) {
        try {
            DecimalFormat format = new DecimalFormat("###,###,###");
            JFileChooser jf = new JFileChooser();
            if (jf.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = new File(jf.getSelectedFile().getAbsolutePath());
                FileInputStream fis = new FileInputStream(file);
                HSSFWorkbook xssfW = new HSSFWorkbook(fis);
                HSSFSheet excelSheet = xssfW.getSheetAt(0);
                Vector vTitle = new Vector(11);
                CellStyle cellStyle = xssfW.createCellStyle();
                CreationHelper creationHelper = xssfW.getCreationHelper();
                cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy-MM-dd hh:mm:ss"));
                DefaultTableModel tableModel = new DefaultTableModel(vTitle, 0);
                for (int row = 0; row < excelSheet.getLastRowNum(); row++) {
                    HSSFRow excelRow = excelSheet.getRow(row);
                    if (row == 0) {
                        vTitle.add(excelRow.getCell(0).toString());
                        vTitle.add(excelRow.getCell(1).toString());
                        vTitle.add(excelRow.getCell(2).toString());
                        vTitle.add(excelRow.getCell(3).toString());
                        vTitle.add(excelRow.getCell(4).toString());
                        vTitle.add(excelRow.getCell(5).toString());
                        vTitle.add(excelRow.getCell(6).toString());
                        vTitle.add(excelRow.getCell(7).toString());
                        vTitle.add(excelRow.getCell(8).toString());
                        vTitle.add(excelRow.getCell(9).toString());
                        vTitle.add(excelRow.getCell(10).toString());
                    } else {
                        Vector vData = new Vector();
                        vData.add(excelRow.getCell(0).toString());
                        vData.add(excelRow.getCell(1).toString());
                        vData.add(excelRow.getCell(2).toString());
                        vData.add(excelRow.getCell(3).toString());
//                        String date4 = new SimpleDateFormat("yyyy-MM-dd").format(
//                        (java.util.Date) new SimpleDateFormat("dd-MMM-yyyy").
//                                parse(excelRow.getCell(4).toString()));
//                        String date5 = new SimpleDateFormat("yyyy-MM-dd").format(
//                        (java.util.Date) new SimpleDateFormat("dd-MMM-yyyy").
//                                parse(excelRow.getCell(5).toString()));
                        vData.add(excelRow.getCell(4).toString());
                        vData.add(excelRow.getCell(5).toString());
                        vData.add(excelRow.getCell(6));
                        vData.add(format.format(formatString(excelRow.getCell(7))));
                        vData.add(excelRow.getCell(8));
                        vData.add(excelRow.getCell(9).toString());
                        vData.add(format.format(formatString(excelRow.getCell(10))));
                        tableModel.addRow(vData);
                    }
                }
                jTable.setModel(tableModel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public long formatString(HSSFCell cell) {
        String s = cell.toString();
        long num = 0;
        s = s.replace(".0", "");
        num = Long.parseLong(s);
        return num;
    }
    public boolean readThem(JTable jTable) {
        try {
            DecimalFormat format = new DecimalFormat("###,###,###");
            JFileChooser jf = new JFileChooser();
            if (jf.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = new File(jf.getSelectedFile().getAbsolutePath());
                FileInputStream fis = new FileInputStream(file);
                HSSFWorkbook xssfW = new HSSFWorkbook(fis);
                HSSFSheet excelSheet = xssfW.getSheetAt(0);
                Vector vTitle = new Vector(9);
                CellStyle cellStyle = xssfW.createCellStyle();
                CreationHelper creationHelper = xssfW.getCreationHelper();
                cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy-MM-dd hh:mm:ss"));
                DefaultTableModel tableModel = new DefaultTableModel(vTitle, 0);
                for (int row = 0; row < excelSheet.getLastRowNum(); row++) {
                    HSSFRow excelRow = excelSheet.getRow(row);
                    if (row == 0) {
                        vTitle.add(excelRow.getCell(0).toString().replace(".0", ""));
                        vTitle.add(excelRow.getCell(1).toString());
                        vTitle.add(excelRow.getCell(2).toString());
                        vTitle.add(excelRow.getCell(3).toString());
                        vTitle.add(excelRow.getCell(4).toString());
                        vTitle.add(excelRow.getCell(5).toString());
                        vTitle.add(excelRow.getCell(6).toString());
                        vTitle.add(excelRow.getCell(7).toString());
                        vTitle.add(excelRow.getCell(8).toString());
                    } else {
                        Vector vData = new Vector();
                        vData.add(excelRow.getCell(0).toString());
                        vData.add(excelRow.getCell(1).toString());
                        vData.add(excelRow.getCell(2).toString());
                        vData.add(excelRow.getCell(3).toString());
                        String date4 = new SimpleDateFormat("yyyy-MM-dd").format(
                        (java.util.Date) new SimpleDateFormat("dd-MMM-yyyy").
                                parse(excelRow.getCell(4).toString()));
                        String date5 = new SimpleDateFormat("yyyy-MM-dd").format(
                        (java.util.Date) new SimpleDateFormat("dd-MMM-yyyy").
                                parse(excelRow.getCell(5).toString()));
                        vData.add(date4);
                        vData.add(date5);
                        vData.add(format.format(formatString(excelRow.getCell(6))) + " VNĐ");
                        vData.add(format.format(formatString(excelRow.getCell(7))));
                        vData.add(format.format(formatString(excelRow.getCell(8))) + " VNĐ");
                        tableModel.addRow(vData);
                    }
                }
                jTable.setModel(tableModel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
