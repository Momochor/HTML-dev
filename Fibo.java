import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prev = 1;
        int next = 1;
        int temp;
        System.out.println("enter Number of elements(not the band) you want");
        int n = sc.nextInt();
        System.out.println(prev);
        System.out.println(next);
        for (int i = 3; i <= n; i++) {
            temp = next;
            next = prev + next;
            System.out.println(next);
            prev = temp;
        }
    }
}