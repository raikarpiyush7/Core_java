package Core_java;

public class Types {
    public static void main(String[] args) {
        // Primitive data types
        int myInt = 10;
        double myDouble = 5.99;
        char myChar = 'A';
        boolean myBoolean = true;

        // Reference data types
        String myString = "Hello, World!";
        Integer myIntegerObject = Integer.valueOf(myInt);
        Double myDoubleObject = Double.valueOf(myDouble);

        // Displaying the values
        System.out.println("Primitive Data Types:");
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        System.out.println("\nReference Data Types:");
        System.out.println("String: " + myString);
        System.out.println("Integer Object: " + myIntegerObject);
        System.out.println("Double Object: " + myDoubleObject);
    }
    
}
