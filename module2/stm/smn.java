package stm;

import java.util.Scanner;

public class smn {
    private final Student[] students;
    private int studentCount;

    public smn(int maxSize) {
        students = new Student[maxSize];
        studentCount = 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh tối đa: ");
        int maxSize = scanner.nextInt();

        smn management = new smn(maxSize);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Thêm học sinh mới.");
            System.out.println("2. Sửa thông tin học sinh.");
            System.out.println("3. Xóa học sinh.");
            System.out.println("4. Hiển thị học sinh 20 tuổi.");
            System.out.println("5. Số lượng học sinh 23 tuổi và quê ở Đà Nẵng.");
            System.out.println("6. Thoát.");
            System.out.print("Chọn một chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    management.addStudent(scanner);
                    break;
                case 2:
                    management.editStudent(scanner);
                    break;
                case 3:
                    management.deleteStudent(scanner);
                    break;
                case 4:
                    management.displayStudents20YearsOld();
                    break;
                case 5:
                    management.countStudents23YearsOldInDaNang();
                    break;
                case 6:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        } while (choice != 6);
    }

    public void addStudent(Scanner scanner) {
        if (studentCount < students.length) {
            System.out.print("Nhập ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập Họ tên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập Tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập Quê quán: ");
            String hometown = scanner.nextLine();
            System.out.print("Nhập Lớp: ");
            String className = scanner.nextLine();

            students[studentCount++] = new Student(id, name, age, hometown, className);
            System.out.println("Học sinh đã được thêm.");
        } else {
            System.out.println("Danh sách học sinh đã đầy.");
        }
    }

    public void editStudent(Scanner scanner) {
        System.out.print("Nhập ID của học sinh cần sửa: ");
        int idToEdit = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getID() == idToEdit) {
                System.out.print("Nhập Họ tên mới: ");
                String newName = scanner.nextLine();
                System.out.print("Nhập Tuổi mới: ");
                int newAge = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nhập Quê quán mới: ");
                String newHometown = scanner.nextLine();
                System.out.print("Nhập Lớp mới: ");
                String newClassName = scanner.nextLine();

                students[i].setName(newName);
                students[i].setAge(newAge);
                students[i].setHometown(newHometown);
                students[i].setClassName(newClassName);
                System.out.println("Thông tin học sinh đã được cập nhật.");
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh có ID " + idToEdit);
    }

    public void deleteStudent(Scanner scanner) {
        System.out.print("Nhập ID của học sinh cần xóa: ");
        int idToDelete = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getID() == idToDelete) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                studentCount--;
                System.out.println("Học sinh đã được xóa.");
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh có ID " + idToDelete);
    }

    public void displayStudents20YearsOld() {
        System.out.println("Học sinh 20 tuổi:");
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getAge() == 20) {
                System.out.println(students[i]);
            }
        }
    }

    public void countStudents23YearsOldInDaNang() {
        int count = 0;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getAge() == 23 && students[i].getHometown().equalsIgnoreCase("Đà Nẵng")) {
                count++;
            }
        }
        System.out.println("Số lượng học sinh 23 tuổi và quê ở Đà Nẵng: " + count);
    }
}

class Student {
    private final int id;
    private String name;
    private int age;
    private String hometown;
    private String className;

    public Student(int id, String name, int age, String hometown, String className) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.className = className;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }

    public String getClassName() {
        return className;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Họ tên: " + name + ", Tuổi: " + age + ", Quê quán: " + hometown + ", Lớp: " + className;
    }
}
