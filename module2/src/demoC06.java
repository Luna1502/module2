import java.util.Scanner;

public class demoC06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== bai 1 ===");
        System.out.println("");
        System.out.print("nhap vao do c:");
        int doC = input.nextInt();
        int doF = doC * 9/5 + 32;
        System.out.println("Do F la:" + doF);

        System.out.println("");

        System.out.println("=== bai 2 ===");
        System.out.println("");
        System.out.print("nhap vao mét:");
        int met = input.nextInt();
        double feet = met * 3.2808;
        System.out.println("Doi sang feet:" + feet);

        System.out.println("");

        System.out.println("=== bai 3 ===");
        System.out.println("");
        System.out.print("nhap vao canh A:");
        int canhA = input.nextInt();
        int dienTichHV = canhA * canhA;
        System.out.println("Dien tich hinh vuong = " + dienTichHV);

        System.out.println("");

        System.out.println("=== bai 4 ===");

        System.out.println("");

        System.out.print("Nhap vao canh A:");
        int canhHVA = input.nextInt();
        System.out.print("nhap vao canh B:");
        int canhHVB = input.nextInt();
        int dienTichTGV = canhHVA * canhHVB;
        System.out.println("dien tich hinh chu nhat = " + dienTichTGV);

        System.out.println("");

        System.out.println("=== bai 5 ===");
        System.out.println("");
        System.out.print("nhap vao canh A:");
        int TGVA = input.nextInt();
        System.out.print("nhap vao canh B:");
        int TGVB = input.nextInt();
        int DTHTGV = ( TGVA * TGVB ) / 2;

        System.out.println("dien tich hinh tam giac vuong = " + DTHTGV);

        System.out.println("");

        System.out.println("=== bai 6 ===");

        System.out.println("");

        System.out.print("nhap vao a:");
        int aNumber = input.nextInt();
        System.out.print("nhap vao b:");
        int bNumber = input.nextInt();
        double nghiem;
        System.out.println("Phương trình bạn vừa nhập vào là: " + aNumber + "x + " + bNumber + " = 0.");
        if (aNumber == 0) {
            if (bNumber == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            nghiem = (double) -bNumber / aNumber;
            System.out.println("Phương trình có nghiệm x = " + nghiem + ".");
        }

        System.out.println("");

        System.out.print("=== bai 7 ===");
        System.out.println("");
        System.out.println();
        System.out.print("nhập hệ số bậc 2, a = ");
        float heSoA = input.nextFloat();
        System.out.print("nhập hệ số bậc 1, b = ");
        float heSoB = input.nextFloat();
        System.out.print("nhập hằng số tự do, c =");
        float hangSoTuDo = input.nextFloat();

        if (heSoA == 0) {
            if (heSoB == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-hangSoTuDo / heSoB ) );
            }
            return;
        }
        float delta = heSoB * heSoB - 4 * heSoA * hangSoTuDo;
        float x1;
        float x2;

        if (delta > 0) {
            x1 = (float) ((-heSoB + Math.sqrt(delta)) / ( 2 * heSoA ) );
            x2 = (float) ((-heSoB - Math.sqrt(delta)) / ( 2 * heSoA ) );
            System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-heSoB / (2 * heSoA ) );
            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }

        System.out.println("=== bai 8 ===");
        System.out.println("");
        System.out.print("Nhập vào một số nguyên: ");
        int age = input.nextInt();

        if (age > 0 && age < 120) {
            System.out.println(age + " là tuổi của một người.");
        } else {
            System.out.println(age + " không phải là tuổi của một người.");
        }

        System.out.println("=== bai 9 ===");
        System.out.println("");
        System.out.print("Nhập vào 3 số thực a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
            System.out.println("a, b, c là cạnh của một tam giác.");
        } else {
            System.out.println("a, b, c không phải là cạnh của một tam giác.");
        }

        System.out.println("=== bai 10 ===");
        System.out.println("");
        System.out.print("Nhập vào số điện tiêu thụ (kWh): ");
        double soDienTieuThu = input.nextDouble();
        double giaDien = 0;

        // Tính giá điện theo tỉ giá năm 2021
        if (soDienTieuThu <= 50) {
            giaDien = soDienTieuThu * 1678;
        } else if (soDienTieuThu <= 100) {
            giaDien = 50 * 1678 + (soDienTieuThu - 50) * 1734;
        } else if (soDienTieuThu <= 200) {
            giaDien = 50 * 1678 + 50 * 1734 + (soDienTieuThu - 100) * 2014;
        } else if (soDienTieuThu <= 300) {
            giaDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDienTieuThu - 200) * 2536;
        } else if (soDienTieuThu <= 400) {
            giaDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soDienTieuThu - 300) * 2834;
        } else {
            giaDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (soDienTieuThu - 400) * 2927;
        }

        System.out.println("Số tiền điện cần thanh toán: " + giaDien + " VND");

        System.out.println("=== bai 11 ===");
        System.out.println("");
        System.out.print("Nhập vào thu nhập cá nhân (VND): ");
        double thuNhap = input.nextDouble();
        double thue = 0;

        if (thuNhap <= 5000000) {
            thue = thuNhap * 0.05;
        } else if (thuNhap <= 10000000) {
            thue = 5000000 * 0.05 + (thuNhap - 5000000) * 0.1;
        } else if (thuNhap <= 18000000) {
            thue = 5000000 * 0.05 + 5000000 * 0.1 + (thuNhap - 10000000) * 0.15;
        } else if (thuNhap <= 32000000) {
            thue = 5000000 * 0.05 + 5000000 * 0.1 + 8000000 * 0.15 + (thuNhap - 18000000) * 0.2;
        } else if (thuNhap <= 52000000) {
            thue = 5000000 * 0.05 + 5000000 * 0.1 + 8000000 * 0.15 + 14000000 * 0.2 + (thuNhap - 32000000) * 0.25;
        } else if (thuNhap <= 80000000) {
            thue = 5000000 * 0.05 + 5000000 * 0.1 + 8000000 * 0.15 + 14000000 * 0.2 + 20000000 * 0.25 + (thuNhap - 52000000) * 0.3;
        } else {
            thue = 5000000 * 0.05 + 5000000 * 0.1 + 8000000 * 0.15 + 14000000 * 0.2 + 20000000 * 0.25 + 28000000 * 0.3 + (thuNhap - 80000000) * 0.35;
        }

        System.out.println("Số tiền thuế thu nhập cá nhân cần đóng: " + thue + " VND");
    }
}
