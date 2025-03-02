import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double c = Math.pow(a,2);
        double d = Math.pow(b,2);
        System.out.println("Hypotenuse: "+Math.sqrt(c+d));

    }
}
