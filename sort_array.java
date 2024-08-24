
import java.util.Arrays;

public class sort_array {
    public static void main(String[] args) {
        int[] array = {3,4,6,4,44,5,3,3,5,6,7,};
          Arrays.sort(array);

          for(int i=0; i<array.length; i++)
          {
            System.out.print(" "+array[i]);
          }
       
    }
}
