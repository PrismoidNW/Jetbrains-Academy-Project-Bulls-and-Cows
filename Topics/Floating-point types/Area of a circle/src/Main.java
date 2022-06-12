import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double pi = Math.PI;
        double output = pi * (radius * radius);
        System.out.println(output);
    }
}