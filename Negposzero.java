import java.util.Scanner;
public class Negposzero {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if (a>0){
            System.out.println("the number is positive");
        }else if (a<0){
            System.out.println("the number is negative");
        }else{
            System.out.println("the number is zero");
        }
        scanner.close();
    }
    
}
