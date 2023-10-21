package Activity_5;
import java.util.Scanner;
public class PrimePassword {
    static boolean checkPrime(int num){
        if (num<=1) {
            return false;
        }
        for (int i = 2; i < num; i++)
        if (num % i == 0)
            return false;
  
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int arr[] = new int[l];
        for(int i = 0; i < l ; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            if(checkPrime(arr[i]) == true){
                sum = sum + arr[i];
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
