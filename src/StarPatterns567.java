public class StarPatterns567 {
    public static void main(String[] args) {
        System.out.println("TASK 5");
        for (int i =1; i<=5; i++){
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("TASK 6");
        for (int i = 5; i >= 1; i--){
            for(int j =1; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("TASK 7");
        for (int i = 1; i <= 5; i++) { // Outer loop for the number of lines
            for (int j = 1; j <= 5; j++) { // Inner loop for printing 5 stars in each line
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after finishing a row
        }





    }
}


