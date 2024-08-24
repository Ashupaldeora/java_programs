

public class largest_element {
    public static void main(String[] args) {
       
        byte[] array = {5,6,7,2,3,4,5,6,4,5,};
         byte max = 0;
        for(int i = 0 ; i<array.length; i++)
        {
                for(int j =0; j<array.length; j++ )
                {
                    if( max < array[j])
                    {
                        max = array[i];
                        System.out.println(max);
                    }
                }
        }


        System.out.println("max element : "+ max);



        
    }
}
