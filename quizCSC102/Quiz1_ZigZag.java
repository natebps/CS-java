import java.util.Scanner;

public class Quiz1_ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //credit code by Champpii
        String str = sc.nextLine();
        int row = sc.nextInt();

        if(row==1) System.out.println(str);
        else{
            for(int i=0;i<row;i++){
                int space = row -i;
                int index = 0;
                int current = i;

                while(current<str.length()){
                    char ans = str.charAt(current);
                    System.out.print(ans);

                    index++;
                    current = (i == 0 || i == row-1)? current+row+1: space*index +1;
                }
            }
        }

    }
}
