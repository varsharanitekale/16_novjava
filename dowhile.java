import java.time.Year;
import java.util.Scanner;
public class dowhile {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char ch;
    


        do{
            
            System.out.println("enter your number");
            long a=sc.nextInt();
            
            long fact=1;
            for(int i=1; i<=a; i++){
                fact=fact*i;


            }
            System.out.println(fact);
            System.out.println("Enter 'y' or 'Y' to"); 
             ch=sc.next().charAt(0);  
        }while(ch=='y'||ch=='Y');



            

        
        



    }


        



    
}
