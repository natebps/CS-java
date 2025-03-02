import java.util.Scanner;

public class SqrtAbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Sqrt: "+Math.sqrt(a));
        System.out.println("Abs: "+(double) Math.abs(a));
    }
}
