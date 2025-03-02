import java.util.Scanner;

public class ArrayCountEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        
        int count=0;
        for(int i = 0; i<n;i++){
            num[i] = sc.nextInt();
            if(num[i]%2==0) count++;
        }
        System.out.println("Count of Even Numbers: "+count);
    }
}