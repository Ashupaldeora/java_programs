
import java.util.Scanner;

class Recursion
{
   int sum = 0 ;
    int sumOfEven(int n)
    {
      if(n%2==0 )
      {
         sum += n;
      }
      if(n==0)
      {
        return 0;
      }
        
     return sumOfEven(n-1);

    }
}


public class sum_of_even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
         Recursion recursion = new Recursion();
       recursion.sumOfEven(n);
 System.out.println("sum : "+recursion.sum);
       scanner.close();

    }
}
