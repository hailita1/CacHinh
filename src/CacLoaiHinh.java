import java.util.Scanner;

public class CacLoaiHinh {
    public static void main(String[] args) {
        int check;
        Scanner nhap = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.print("Nhap lua chon cua ban: ");
        check = nhap.nextInt();

        switch (check) {
            case 1: {
                for (int i = 1; i <= 4; i++) {
                    System.out.println(" ");
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("* ");
                    }
                }
                break;
            }
            case 2: {
                for (int i = 1; i <= 7; i++) {
                    System.out.println(" ");
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                }
                break;
            }
            case 3: {
                for (int i = 7; i >= 1; i--) {
                    System.out.println(" ");
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }

                }
                break;
            }
            case 4:
                System.exit(0);
        }

    }
}
