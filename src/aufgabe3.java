public class aufgabe3 {
    public static void main(String[] args) {
        erste_variant();
        zweite_variant();
    }

    // Single-loop variant
    private static void erste_variant() {
        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0 || (i / 10 == 7 || i % 10 == 7)) {
                System.out.print("bumm ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Add a line break after output
    }

    // kettende-loop variant
    private static void zweite_variant() {
        for (int tens = 0; tens < 10; tens++) {
            for (int ones = 0; ones < 10; ones++) {
                int number = tens * 10 + ones;
                if (number % 7 == 0 || tens == 7 || ones == 7) {
                    System.out.print("bumm ");
                } else {
                    System.out.print(number + " ");
                }
            }
        }
        System.out.println(); // Add a line break after output
    }
}
