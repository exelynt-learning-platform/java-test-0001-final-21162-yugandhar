public class JavaTest0002 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }

            // Print numbers Increasing
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print numbers Decriasing
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Go next line
            System.out.println();
        }
    }
}