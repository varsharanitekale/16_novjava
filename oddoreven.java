import java.util.Scanner;
public class oddoreven {
    

    public static int oddeven(int num){
        if(num%2==0){
            System.out.println("entered number is even");
        }
        else{
            System.out.println("entered number is odd");
        }
        return num;
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your number");
    
            int a=sc.nextInt();
             oddeven(a);
        
    

    
         
        

    }

    }
    

