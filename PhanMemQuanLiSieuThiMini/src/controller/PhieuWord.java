package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import model.SPNhap;

public class PhieuWord {

    public static void main(String[] args) {
        SPNhap sp1 = new SPNhap();
        sp1.setStt("1");
        sp1.setIdSanPham("SP1001");
        SPNhap sp2 = new SPNhap();
        sp2.setStt("2");
        sp2.setIdSanPham("SP1002");
        List<SPNhap> list = new ArrayList<>();
        list.add(sp1);
        list.add(sp2);
        
    }
}
