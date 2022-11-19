import java.util.Scanner;
public class Cassino_Club {

    public static void main(String args[]) {
       Scanner scan = new Scanner(System.in);
       int op1 = 1 ;
        int op2 = 2;
        int op3 = 3; 
        int r1  = 0;
        boolean i= true;
        System.out.println("pergunta ");
        System.out.println(" escolhha uma das opcoes");
        System.out.println(op1 + " vai vai ");
            System.out.println(op2 + " vai vai11 ");
                System.out.println(op3 + " vai vai 22");
         r1 = scan.nextInt();
         if (r1 == 3 ){
               i = true;
               }else {
               i = false;
               }  
     
         while ( false == i  ){
           
         switch ( r1 ) {
             case 1 : 
                 System.out.println("vc errou ");
              break;
             case 2 : 
                 System.out.println("vc errou");
             break;            
             case 3 : 
                 System.out.println("vc acertou !!");
                 
             break;
             default:
                 System.out.println("tente novamente");
                 
               
            } 
         }
    }
}
        
  
         