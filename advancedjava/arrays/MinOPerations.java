package JavaPrograms.arrays;


public class MinOPerations {
    public static void main(String[] args) {
        
        
        System.out.println(getMinimalMultiples(10)+getMinimalMultiples(9));
    
    }

    public static int getMinimalMultiples(int n) {
        if (n <= 0) {
            System.out.println("Input must be a positive integer.");
            return -1;
        }
int ops = 0;
        System.out.print("Number " + n + " as sum of 2s and 3s: ");

        // Divide by 3 as much as possible
        while (n >= 3) {
            System.out.print("3 ");
            n -= 3;
            ops++;
        }

        // Use remaining value (which can be 0, 1, or 2) as a sum of 2s
        while (n > 0) {
            System.out.print("2 ");
            n -= 2;
            ops++;
        }

       return  (n>0 && n%3>1 ||n%2>=1) ? -1:ops;
  
    }
}
