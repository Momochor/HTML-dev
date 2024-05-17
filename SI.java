import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        int p = 0;
        float r = 0f;
        System.out.println("Enter the value of Principle: ");
        p = sc.nextInt();
        System.out.println("Enter the value of Time: ");
        t = sc.nextInt();
        System.out.println("Enter the value of Rate: ");
        r = sc.nextFloat();
        float SI = (p * t * r) / 100;
        System.out.println("The Simple Interest is = " + SI);

    }
}