public class pattern {
   public static void main(String[] args) {
       
     for(int i = 0 ; i<7; i++)
     {
        for(int j=0; j<13; j++)
        {
            if(i==6||(j==6 && i==0)||(i==1&&(j==5 || j==7) || (i==2 && (j==4||j==8)) || (i==3 && (j==3||j==9)) || (i==4 && (j==2||j==10) || (i==5 && (j==1||j==11)||(i==6 && (j==0||j==12))))))
            {
                System.out.print(" *");
            }else{
                System.out.print("  ");
            }
           
        }
        System.out.println( );
     }

   } 
}
//(j==6 && i==0)||(i==1&&(j==5 || j==7) || (i==2 && (j==4||j==8)) || (i==3 && (j==3||j==9)) || (i==4 && (j==2||j==10) || (i==5 && (j==1||j==11)||(i==6 && (j==0||j==12)))))