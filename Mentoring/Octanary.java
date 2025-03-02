import java.util.Scanner;

public class Octanary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base10 = sc.nextInt();
        String octnary ="";
        while(base10!=0){
            int re = base10%8;
            octnary = re+octnary;
            base10 = base10/8;
        }
        System.out.println(octnary);
    }
}
