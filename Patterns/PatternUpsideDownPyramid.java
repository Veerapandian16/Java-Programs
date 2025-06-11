public class PatternUpsideDownPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pyramid
        for (int i = 0; i < rows; i++) {
            System.out.println("*".repeat(rows - i));
        }
    }
}
