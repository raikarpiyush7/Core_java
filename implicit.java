package Core_java;

public class implicit {
    public static void main(String[] args) {
        // Implicit type casting (widening conversion)
        double myInt = 9;
        double myDouble = myInt; // Automatic conversion from int to double

        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value: " + myInt);
        System.out.println("Double value after implicit casting: " + myDouble);
    }
}
