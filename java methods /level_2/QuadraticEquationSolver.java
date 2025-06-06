import java.util.Scanner;

public class QuadraticEquationSolver {

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c); 

        if (delta < 0) {
            return new double[0];
        }

        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        double sqrtDelta = Math.sqrt(delta);
        double root1 = (-b + sqrtDelta) / (2 * a);
        double root2 = (-b - sqrtDelta) / (2 * a);

        return new double[]{root1, root2}; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quadratic Equation Solver");
        
        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("No real roots exist for this quadratic equation.");
        } else if (roots.length == 1) {
            System.out.println("There is only one root: x = " + roots[0]);
        } else {
            System.out.println("The two roots of the equation are:");
            System.out.println("x₁ = " + roots[0]);
            System.out.println("x₂ = " + roots[1]);
        }

        input.close();
    }
}
