package model;

import java.awt.Dimension;
import javax.swing.JScrollPane;

public class FormatScroll {
    public static void format(JScrollPane jScrollPane1) {
        jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
        jScrollPane1.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 10));
    }
}
