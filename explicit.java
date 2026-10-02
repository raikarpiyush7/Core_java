package Datatypes;

public class explicit {
    public static void main(String[] args) {
        // Explicit type casting (narrowing conversion)
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual conversion from double to int

        System.out.println("Explicit Type Casting:");
        System.out.println("Double value: " + myDouble);
        System.out.println("Integer value after explicit casting: " + myInt);
    }
}
