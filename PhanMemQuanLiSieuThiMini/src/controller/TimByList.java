package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.SanPham;

public class TimByList {

    public List<SanPham> timByWord(String search, List<SanPham> list) {
        List<SanPham> matches = new ArrayList<SanPham>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdSanPham().contains(search) || 
                list.get(i).getTenSanPham().contains(search)) {
                matches.add(list.get(i));
            }
        }
        return matches;
    }
    public List<SanPham> locByNhom(String search, List<SanPham> list) {
        List<SanPham> matches = new ArrayList<SanPham>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTenNhom().equals(search)) {
                matches.add(list.get(i));
            }
        }
        return matches;
    }
    public static void main(String[] args) {
        while (true) {
            String search = new Scanner(System.in).nextLine();
            System.out.println(new TimByList().timByWord(search, new Kho().getSanPhamBy("")).size());;
        }
    }
}
