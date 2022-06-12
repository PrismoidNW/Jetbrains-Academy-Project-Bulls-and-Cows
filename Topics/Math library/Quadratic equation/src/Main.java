import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        int b = scanner.nextInt();
        scanner.nextLine();
        int c = scanner.nextInt();

        double x = (-b + Math.sqrt((Math.pow(b,2) - (4 * (a * c))))) / (2 * a);
        double out = (a * Math.pow(x, 2)) + (b * x) + c;
        System.out.println(x);
        System.out.println(out);
    }
}