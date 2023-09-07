public class statics {
    // Static variable
    static int staticVariable = 0;

    // Non-static variable
    int nonStaticVariable;

    // Constructor
    public statics(int value) {
        this.nonStaticVariable = value;
    }
    //method
    public void printVariables() {
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Non-Static Variable: " + nonStaticVariable);
    }

    public static void main(String[] args) {
        statics obj1 = new statics(10);
        statics obj2 = new statics(20);

        // Modify static variable through one instance
        obj1.staticVariable = 5;

        // Modify non-static variable for each instance
        obj1.nonStaticVariable = 15;
        obj2.nonStaticVariable = 25;

        // Print variables
        System.out.println("Object 1 Variables:");
        obj1.printVariables();

        System.out.println("Object 2 Variables:");
        obj2.printVariables();
    }
}
