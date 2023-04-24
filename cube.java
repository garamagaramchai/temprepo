import java.util.Scanner;

class CubeException extends Exception {

}

class test5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        int cube = num * num * num;
        System.out.println("Cube of " + num + " is " + cube);
        try {
            if (cube % 2 != 0) {
                throw new CubeException();
            }
        } catch (CubeException e) {
            System.out.println("Not a even number");
        }
        input.close();
    }
}
