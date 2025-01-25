public class Problem2 {
    // Method overloading example
    public void display(int number) {
        System.out.println("Integer: " + number);
    }

    public void display(String text) {
        System.out.println("String: " + text);
    }

    public void display(double decimal) {
        System.out.println("Double: " + decimal);
    }

    public static void main(String[] args) {
        Problem2 obj = new Problem2();
        
        obj.display(10);          // Calls the method with an integer
        obj.display("Hello");     // Calls the method with a string
        obj.display(3.14);        // Calls the method with a double
    }
}