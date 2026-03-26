public class Main {
    public static void main(String[] args) {

        // ===== UC6 =====
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String result = "";

            // enhanced for loop
            for (String name : args) {
                result += name + ", ";
            }

            // remove last ", "
            result = result.substring(0, result.length() - 2);

            System.out.println("Hello " + result);
        }
    }
}