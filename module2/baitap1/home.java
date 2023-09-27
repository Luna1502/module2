package baitap1;

import java.util.ArrayList;
import java.util.Scanner;

class Nguoi {
    private final String hoTen;
    private final int tuoi;
    private final String ngheNghiep;
    private final String soCMND;

    public Nguoi(String hoTen, int tuoi, String ngheNghiep, String soCMND) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.soCMND = soCMND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public String getSoCMND() {
        return soCMND;
    }
}

class HoGiaDinh {
    private int soThanhVien;
    private final int soNha;
    private final ArrayList<Nguoi> thanhVien;

    public HoGiaDinh(int soNha) {
        this.soThanhVien = 0;
        this.soNha = soNha;
        this.thanhVien = new ArrayList<>();
    }

    public int getSoNha() {
        return soNha;
    }

    public void themNguoi(Nguoi nguoi) {
        thanhVien.add(nguoi);
        soThanhVien++;
    }

    public void hienThiThongTin() {
        System.out.println("Thông tin hộ gia đình tại số nhà " + soNha + ":");
        System.out.println("Số thành viên trong gia đình: " + soThanhVien);
        System.out.println("Danh sách thành viên:");
        for (Nguoi nguoi : thanhVien) {
            System.out.println("Họ tên: " + nguoi.getHoTen());
            System.out.println("Tuổi: " + nguoi.getTuoi());
            System.out.println("Nghề nghiệp: " + nguoi.getNgheNghiep());
            System.out.println("Số CMND: " + nguoi.getSoCMND());
            System.out.println("--------------");
        }
    }
}

class KhuPho {
    private final ArrayList<HoGiaDinh> danhSachHoGiaDinh;

    public KhuPho() {
        danhSachHoGiaDinh = new ArrayList<>();
    }

    public void themHoGiaDinh(HoGiaDinh hoGiaDinh) {
        danhSachHoGiaDinh.add(hoGiaDinh);
    }

    public void hienThiThongTin() {
        System.out.println("Danh sách các hộ gia đình trong khu phố:");
        for (HoGiaDinh hoGiaDinh : danhSachHoGiaDinh) {
            hoGiaDinh.hienThiThongTin();
            System.out.println("====================");
        }
    }
}

public class home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hộ dân trong khu phố: ");
        int n = scanner.nextInt();

        KhuPho khuPho = new KhuPho();

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số nhà cho hộ gia đình thứ " + i + ": ");
            int soNha = scanner.nextInt();
            HoGiaDinh hoGiaDinh = new HoGiaDinh(soNha);

            System.out.print("Nhập số thành viên trong hộ gia đình: ");
            int soThanhVien = scanner.nextInt();

            for (int j = 0; j < soThanhVien; j++) {
                scanner.nextLine(); // Xóa bộ nhớ đệm
                System.out.println("Nhập thông tin thành viên thứ " + (j + 1) + ":");
                System.out.print("Họ tên: ");
                String hoTen = scanner.nextLine();
                System.out.print("Tuổi: ");
                int tuoi = scanner.nextInt();
                scanner.nextLine(); // Xóa bộ nhớ đệm
                System.out.print("Nghề nghiệp: ");
                String ngheNghiep = scanner.nextLine();
                System.out.print("Số CMND: ");
                String soCMND = scanner.nextLine();

                Nguoi nguoi = new Nguoi(hoTen, tuoi, ngheNghiep, soCMND);
                hoGiaDinh.themNguoi(nguoi);
            }

            khuPho.themHoGiaDinh(hoGiaDinh);
        }

        khuPho.hienThiThongTin();
    }
}
