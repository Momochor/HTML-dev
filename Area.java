import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = 0;
        int wid = 0;
        System.out.println("Enter the value of Length: ");
        len = sc.nextInt();
        System.out.println("Enter the value of Width: ");
        wid = sc.nextInt();
        int a = len * wid;
        System.out.println("The area of Rectangle is = " + a);

    }
}