import java.util.Scanner;  // Bước 1: import thư viện Scanner

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Bước 2: tạo đối tượng Scanner

        // Bước 3: nhập dữ liệu
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();   // nhập chuỗi

        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();        // nhập số nguyên

        System.out.print("Nhập chiều cao (m): ");
        double height = sc.nextDouble();  // nhập số thực

        // Bước 4: in ra kết quả
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Chiều cao: " + height);

        sc.close(); // Bước 5: đóng Scanner
    }
}
