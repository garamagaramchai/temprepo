class Printer {
    private String type;
    private int speed;
    private double cost;

    public Printer(String type, int speed, double cost) {
        this.type = type;
        this.speed = speed;
        this.cost = cost;
    }

    public static String findExpensivePrinter(Printer p1, Printer p2) {
        if (p1.cost > p2.cost) {
            return p1.type;
        } else {
            return p2.type;
        }
    }
}

class test4 {
    public static void main(String[] args) {
        // Create two Printer objects
        Printer p1 = new Printer("Laser", 50, 299.99);
        Printer p2 = new Printer("Inkjet", 25, 199.99);

        // Determine which printer is more expensive
        String expensivePrinter = Printer.findExpensivePrinter(p1, p2);

        // Print the result
        System.out.println(expensivePrinter);
    }

}