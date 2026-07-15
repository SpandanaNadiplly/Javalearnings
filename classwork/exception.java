class exception {
    public static void main(String[] args) {

        try {
            int quantity = Integer.parseInt("abc");0-
            double price = 100.0;
            double total = quantity * price;
            System.out.println("Total: " + total);

        } catch (NumberFormatException e) {
            System.out.println("Invalid quantity entered. Please enter a number.");
            System.out.println("Using default quantity: 1");

            double total = 100.0;
            System.out.println("Total: " + total);
        }
    }
}