public class Main {
    public static void main(String[] args) {

        // ===== UC3 =====
        String name;

        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello " + name);
    }
}