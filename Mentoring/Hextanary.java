import java.util.Scanner;

public class Hextanary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base10 = sc.nextInt();
        String base16 ="";
        while(base10!=0){
            int re = base10%16;
            base10 = base10/16;
            base16 = switch (re) {
                default -> String.valueOf(re);
                case 10 -> 'A';
                case 11 -> 'B';
                case 12 -> 'C';
                case 13 -> 'D';
                case 14 -> 'E';
                case 15 -> 'F';
            } + base16;
        }
        System.out.println(base16);
    }
}
