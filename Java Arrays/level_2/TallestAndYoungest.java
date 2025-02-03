import java.util.Scanner;

public class TallestAndYoungest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int maxHeight = 0;
        int minAge = 150;
        System.out.print("enter the ages: ");
        int[] age = new int[3];

        for(int  i = 0; i < age.length; i++){
            int ageOfFriends = input.nextInt();
            minAge = Math.min(minAge,ageOfFriends);
            age[i] = ageOfFriends;
        }

        System.out.print("enter the height: ");
        int[] height = new int[3];

        for(int  i = 0; i < age.length; i++){
            int heightOfFriends = input.nextInt();
            maxHeight = Math.max(maxHeight,heightOfFriends);
            height[i] = heightOfFriends;
        }



        System.out.println("the youngest is " + minAge + " years old");
        System.out.println("the tallest is " + maxHeight + " cm tall");

        input.close();
    }
}
