import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        checkSquareNumber();
    }

    private static int promptForInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void checkSquareNumber() {
        int number1 = promptForInt("Nhập số a: ");
        int number2 = promptForInt("Nhập số b: ");

        int start = Math.min(number1, number2);
        int end = Math.max(number1, number2);

        for (int i = start; i <= end; i++) {
            if (Math.sqrt(i) == Math.round(Math.sqrt(i))) {
                System.out.println(i);
            }
        }
    }

    public static void check() {
        int number = promptForInt("Nhập số: ");
        if (number % 2 == 0) {
            System.out.println("Đây là số chẵn");
        } else {
            System.out.println("Đây là số lẻ");
        }
    }

    public static void findMax() {
        int number1 = promptForInt("Nhập số 1: ");
        int number2 = promptForInt("Nhập số 2: ");
        int number3 = promptForInt("Nhập số 3: ");

        if (number1 > number2 && number1 > number3) {
            System.out.println("Số lớn nhất là số " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Số lớn nhất là số " + number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Số lớn nhất là số " + number3);
        } else {
            System.out.println("Không có");
        }
    }

    public static void times() {
        int number = promptForInt("Số bánh cần rán: ");
        int times;

        if (number >= 9) {
            times = number / 9;
            System.out.println("Số lần rán: " + times);
        } else if (number < 9 && number > 0) {
            System.out.println("Số lần rán: 1");
        } else {
            System.out.println("Không có");
        }
    }

    public static void interestRate() {
        double money = promptForInt("Số tiền bạn muốn gửi: ");
        double year = promptForInt("Thời gian(Năm): ");
        double interest = money * (5.0 / 100.0) * year;
        System.out.println("Lãi suất hàng năm là: " + interest);
    }

    public static void classification() {
        double point = promptForDouble("Nhập điểm học sinh: ");

        if (point <= 10 && point >= 8) {
            System.out.println("Học sinh giỏi");
        } else if (point < 8 && point >= 3.5) {
            System.out.println("Học sinh khá");
        } else if (point < 3.5 && point >= 0) {
            System.out.println("Ngu");
        } else {
            System.out.println("Không có");
        }
    }

    public static void odd() {
        int number1 = promptForInt("Nhập số a: ");
        int number2 = promptForInt("Nhập số b: ");

        int start = Math.min(number1, number2);
        int end = Math.max(number1, number2);

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void fizzBuzz() {
        int number1 = promptForInt("Nhập số a: ");
        int number2 = promptForInt("Nhập số b: ");

        int start = Math.min(number1, number2);
        int end = Math.max(number1, number2);

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
        }
    }

    public static void sum() {
        int number1 = promptForInt("Nhập số a: ");
        int number2 = promptForInt("Nhập số b: ");
        int sum = 0;

        int start = Math.min(number1, number2);
        int end = Math.max(number1, number2);

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("Tổng: " + sum);
    }

    public static void sumTotal() {
        int number1 = promptForInt("Nhập số a: ");
        int number2 = promptForInt("Nhập số b: ");
        int sum = 0;

        int start = Math.min(number1, number2);
        int end = Math.max(number1, number2);

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Tổng số chẵn: " + sum);
    }

    public static void sumSquare() {
        int number1 = promptForInt("Nhập số x: ");
        int number2 = promptForInt("Nhập số y: ");
        int sum = 0;

        int start = Math.min(number1, number2);
        int end = Math.max(number1, number2);

        for (int i = start; i <= end; i++) {
            sum += i * i;
        }

        System.out.println("Tổng: " + sum);
    }

    public static void calS1() {
        int number = promptForInt("Nhập n: ");
        int result = 0;

        for (int i = 0; i <= number; i++) {
            result += i * (i + 1);
        }

        System.out.println("S = " + result);
    }

    public static void calS2() {
        int number = promptForInt("Nhập n: ");
        double result = 0;

        for (double i = 0; i <= number; i++) {
            result += (2 * i + 1) / (2 * i + 2);
        }

        System.out.println("S = " + result);
    }

    private static double promptForDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
}
