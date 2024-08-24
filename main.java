
import java.util.Scanner;




public class main{
    public static void main (String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            String age = sc.nextLine();
            System.out.println(age);
        }
    }
}