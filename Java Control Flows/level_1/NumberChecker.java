import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the number: ");
        int number = input.nextInt();


        if(number == 0){
            System.out.print("zero");
        }else if(number > 0){
            System.out.print("positive");
        }else{
            System.out.print("negative");
        }


        input.close();
    }
}
