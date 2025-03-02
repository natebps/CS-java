import java.util.Scanner;

public class Quiz1_Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1st prize 6 million
        //3 front or back 4000
        //2 back 2000
        
        //this time
        //199606
        //173, 220
        //388, 094
        //94

        String lottery = sc.nextLine();
        int total = 0;

        if(lottery.equals("199606")){
            total += 6000000;
        } 
        if(lottery.substring(0,3).equals("173")||lottery.substring(0,3).equals("220")){
            total += 4000;
        }
        if(lottery.substring(3,6).equals("388")||lottery.substring(3,6).equals("094")){
            total += 4000;
        }
        if(lottery.substring(4,6).equals("94")){
            total += 2000;
        }

        System.out.println(total);
    }
}
