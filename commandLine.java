class CommandLineArgumentException extends Exception {
    public CommandLineArgumentException(String errorMessage) {
        super(errorMessage);
    }
}

class test6 {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new CommandLineArgumentException("Less arguments");
            }
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;
            System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid arguments: " + e.getMessage());
        } catch (CommandLineArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
