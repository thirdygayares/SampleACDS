import java.util.Scanner;
public class Novem {


   static int sumofTwo(int x, int y ){
     
    int sum = x+y;

    return sum;

   }

   public static void printmyCommit(){

    System.out.println("This is my Commit Sir Thirdy");
   }

    public static void main (String args[]){
       
     Scanner scan = new Scanner(System.in);

     System.out.print("Please input first number :");
     int x = scan.nextInt();
     System.out.print("Now input second number :");
     int y = scan.nextInt();

    int sumfrommethod = Novem.sumofTwo(x, y);
    System.out.println(sumfrommethod);
    printmyCommit();

    }
    
}
