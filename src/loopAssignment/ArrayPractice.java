package loopAssignment;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 1; i <= array.length; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
