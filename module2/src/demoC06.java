import java.util.Scanner;

public class demoC06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== bai 1 ===");
        System.out.print("nhap vao do c:");
        int doC = input.nextInt();
        int doF = doC * 9/5 + 32;
        System.out.println("Do F la:" + doF);

        System.out.println("=== bai 2 ===");
        System.out.print("nhap vao mét:");
        int met = input.nextInt();
        double feet = met * 3.2808;
        System.out.println("Doi sang feet:" + feet);

        System.out.println("=== bai 3 ===");
        System.out.println("nhap vao canh A");
        int canhA = input.nextInt();
        int dienTichHV = canhA * canhA;
        System.out.println("Dien tich hinh vuong:" + dienTichHV);

        System.out.println("=== bai 4 ===");
        System.out.println("Nhap vao canh A");
        int canhHVA = input.nextInt();
        System.out.println("nhap vao canh B");
        int canhHVB = input.nextInt();
        int dienTichTGV = canhHVA * canhHVB;
        System.out.println("dien tich hinh chu nhat" + dienTichTGV);

        System.out.println("=== bai 5 ===");
        System.out.print("nhap vao canh A");
        int TGVA = input.nextInt();
        System.out.print("nhap vao canh B");
        int TGVB = input.nextInt();
        int DTHTGV = ( TGVA * TGVB ) / 2;

        System.out.println("dien tich hinh tam giac vuong" + DTHTGV);

        System.out.println("=== bai 6 ===");
        System.out.print("nhap vao a");
        int aNumber = input.nextInt();
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

        System.out.print("=== bai 7 ===");


    }
}