import java.util.Scanner;

public class Cola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = first=="A"?"B":"A";
        int cola = sc.nextInt();

        int round = 1;
        int endcola = 2;
        int addcola = 4;

        while(cola>(round*(round+1))){
            round++;
        }
        if((round*round)>=cola) System.out.println(first);
        else{System.out.println(second);}
    }
}
