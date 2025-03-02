import java.util.Scanner;

public class Quiz1_MinusMod13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //next 5 nums ex.10 -> 10+11+12-13+14+15
        //if the number %13==0 -> minus it
        //calculation of %13 exclude n
        int n = sc.nextInt();
        int total = n;
        for(int i = n+1;i<n+5+1;i++){
            if(i%13==0){
                total += -i;
            }
            else{
                total += i;
            }
        }
        System.out.println(total);

    }
}
