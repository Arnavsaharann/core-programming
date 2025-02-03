import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter the number: ");
        int number = input.nextInt();

        if(number <= 0){
            System.out.println("not a natural number");
        }else{
            for(int i = 1; i <= number; i++){
                if(i % 2 == 0){
                    System.out.println("the number " + i + " is even");
                }else{
                    System.out.println("the number " + i + " is odd");
                }
            }
        }
        input.close();
    }
}
