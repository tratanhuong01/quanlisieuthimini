package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class StringUtil {

    public static String taoID(String id, String tenBang, String firstID) {
        int num = 0;
        String string = "";
        try (Connection conn = new ConnectDAO().getConnection()) {
            String query = "SELECT TOP 1 " + id + " FROM " + tenBang + " ORDER BY "
                    + id + " DESC";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                string = rs.getString(1);
                String[] arr = string.split(firstID);
                num = Integer.parseInt(arr[1]);
            }
            num++;
            string = firstID + String.valueOf(num);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return string;
    }

    public static String implode(String delim, Object[] objects) {
        return implode(delim, Arrays.asList(objects));
    }
    public static String implode(String delimiter, Iterable objects) {
        Iterator<?> iterator = objects.iterator();
        if (!iterator.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iterator.next().toString());

        while (iterator.hasNext()) {
            sb.append(delimiter).append(iterator.next());
        }

        return sb.toString();
    }
    public static void format(JTextField txt) {
        DecimalFormat deFormat1 = new DecimalFormat("###,###,###");
        txt.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {

            }

            public void removeUpdate(DocumentEvent e) {

            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        if (txt.getText().length() <= 0) {

                        } else {
                            long money = Long.parseLong(txt.getText().replace(",", ""));
                            txt.setText(deFormat1.format(money));
                        }
                    }

                };
                SwingUtilities.invokeLater(runnable);
            }
        });
    }
}
