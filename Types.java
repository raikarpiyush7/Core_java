package Core_java;

public class Types {
    public static void main(String[] args) {
         // Primitive data types store simple values directly in memory.
        int myInt = 10; // Stores whole numbers
        double myDouble = 5.99;// Stores decimal numbers
        char myChar = 'A';// Stores a single character
        boolean myBoolean = true;// Stores true/false values

        // Reference data types store references to objects in memory.
        String myString = "Hello, World!";// Stores text
        Integer myIntegerObject = Integer.valueOf(myInt);// Wrapper class for int
        Double myDoubleObject = Double.valueOf(myDouble);// Wrapper class for double

        // Print primitive data type values
        System.out.println("Primitive Data Types:");
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        // Print reference data type values
        System.out.println("\nReference Data Types:");
        System.out.println("String: " + myString);
        System.out.println("Integer Object: " + myIntegerObject);
        System.out.println("Double Object: " + myDoubleObject);
    }
    
}
