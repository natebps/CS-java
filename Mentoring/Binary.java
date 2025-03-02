
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base10 = sc.nextInt();
        String binary ="";
        while(base10!=0){
            int re = base10%2;
            binary = re+binary;
            base10 = base10/2;
        }
        System.out.println(binary);
    }
}
