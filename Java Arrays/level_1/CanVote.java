import java.util.Scanner;

public class CanVote {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] studentAge = new int[10]; 
        int age = 0;
        for(int i = 0; i < 10; i++){
            System.out.print("enter the marks for student number " + i + ": ");
            age = input.nextInt();
            studentAge[i] = age;
        }

        for(int i = 0; i < studentAge.length; i++){
            if(studentAge[i] >= 18){
                System.out.println("student " + i + " is eligible");
            }else{
                System.out.println("student " + i + " is not eligible");
            }
        }
        input.close();

    }
}
