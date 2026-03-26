public class Main {
    public static void main(String[] args) {

        // ===== UC1 =====
        System.out.println("Hello World");

        // ===== UC2 =====
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("No name provided");
        }

    }
}