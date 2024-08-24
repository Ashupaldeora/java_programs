
import java.util.Scanner;

public class sum_of_prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        
        for(int i=1; i<=n ; i++)
        {
              if(i%2!=0 && i%i==0  )
              {
                  System.out.print(i+" ");
                  sum+=i;
              }
        }

     System.out.println("\nsum : "+sum);

        scanner.close();



    }
}
