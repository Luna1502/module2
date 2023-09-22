package quanlisach;

import java.util.ArrayList;
import java.util.Scanner;

class TaiLieu {
    private final int maTaiLieu;
    private final String tenNhaXuatBan;
    private final int soBanPhatHanh;

    public TaiLieu(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public String loaiTaiLieu() {
        return "Tài liệu";
    }

    @Override
    public String toString() {
        return "Mã tài liệu: " + maTaiLieu +
                ", Nhà xuất bản: " + tenNhaXuatBan +
                ", Số bản phát hành: " + soBanPhatHanh;
    }
}

class Sach extends TaiLieu {
    private final String tenTacGia;
    private final int soTrang;

    public Sach(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String loaiTaiLieu() {
        return "Sách";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Tác giả: " + tenTacGia +
                ", Số trang: " + soTrang;
    }
}

class TapChi extends TaiLieu {
    private final int soPhatHanh;
    private final int thangPhatHanh;

    public TapChi(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String loaiTaiLieu() {
        return "Tạp chí";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Số phát hành: " + soPhatHanh +
                ", Tháng phát hành: " + thangPhatHanh;
    }
}

class Bao extends TaiLieu {
    private final String ngayPhatHanh;

    public Bao(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String loaiTaiLieu() {
        return "Báo";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Ngày phát hành: " + ngayPhatHanh;
    }
}

class QuanLySach {
    private final ArrayList<TaiLieu> danhSachTaiLieu = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void themTaiLieu() {
        System.out.println("Chọn loại tài liệu: ");
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập mã tài liệu: ");
        int maTaiLieu = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập tên nhà xuất bản: ");
        String tenNhaXuatBan = scanner.nextLine();

        System.out.print("Nhập số bản phát hành: ");
        int soBanPhatHanh = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Nhập tên tác giả: ");
            String tenTacGia = scanner.nextLine();
            System.out.print("Nhập số trang: ");
            int soTrang = scanner.nextInt();
            danhSachTaiLieu.add(new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang));
        } else if (choice == 2) {
            System.out.print("Nhập số phát hành: ");
            int soPhatHanh = scanner.nextInt();
            System.out.print("Nhập tháng phát hành: ");
            int thangPhatHanh = scanner.nextInt();
            danhSachTaiLieu.add(new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh));
        } else if (choice == 3) {
            System.out.print("Nhập ngày phát hành: ");
            String ngayPhatHanh = scanner.next();
            danhSachTaiLieu.add(new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh));
        }

        System.out.println("Thêm tài liệu thành công!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void xoaTaiLieu() {
        System.out.print("Nhập mã tài liệu cần xoá: ");
        int maTaiLieu = scanner.nextInt();
        boolean found = false;
        for (TaiLieu tl : danhSachTaiLieu) {
            if (tl.getMaTaiLieu() == maTaiLieu) {
                danhSachTaiLieu.remove(tl);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Xoá tài liệu thành công!");
        } else {
            System.out.println("Không tìm thấy tài liệu có mã " + maTaiLieu);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void hienThiTaiLieu() {
        for (TaiLieu tl : danhSachTaiLieu) {
            System.out.println(tl.loaiTaiLieu() + ": " + tl);
        }
    }

    public void timKiemTheoLoai(String loai) {
        for (TaiLieu tl : danhSachTaiLieu) {
            if (tl.loaiTaiLieu().equals(loai)) {
                System.out.println(tl);
            }
        }
    }

    public static void main(String[] args) {
        QuanLySach quanLy = new QuanLySach();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----- Quản lý tài liệu -----");
            System.out.println("1. Thêm mới tài liệu");
            System.out.println("2. Xoá tài liệu theo mã");
            System.out.println("3. Hiển thị tất cả tài liệu");
            System.out.println("4. Hiển thị tất cả Sách");
            System.out.println("5. Hiển thị tất cả Tạp chí");
            System.out.println("6. Hiển thị tất cả Báo");
            System.out.println("7. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    quanLy.themTaiLieu();
                    break;
                case 2:
                    quanLy.xoaTaiLieu();
                    break;
                case 3:
                    quanLy.hienThiTaiLieu();
                    break;
                case 4:
                    quanLy.timKiemTheoLoai("Sách");
                    break;
                case 5:
                    quanLy.timKiemTheoLoai("Tạp chí");
                    break;
                case 6:
                    quanLy.timKiemTheoLoai("Báo");
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}

