public class JavaTest0001 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print first star
            System.out.print("*");

            // Print middle spaces and second star
            if (i > 1) {
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half Star
        for (int i = n - 1; i >= 1; i--) {

            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print first star
            System.out.print("*");

            // Print middle spaces and second star
            if (i > 1) {
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
