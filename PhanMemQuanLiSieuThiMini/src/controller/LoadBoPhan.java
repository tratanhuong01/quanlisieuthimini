package controller;

import java.util.ArrayList;
import javax.swing.JComboBox;
import model.DAO;

public class LoadBoPhan {
    public void load(JComboBox cbox) {
        ArrayList list = new DAO().getBoPhan();
        cbox.removeAllItems();
        for (int i = 0; i < list.size(); i++) {
            String[] arr = (String[]) list.get(i);
            cbox.addItem(arr[1]);
        }
    }
}
