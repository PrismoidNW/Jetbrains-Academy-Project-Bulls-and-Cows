import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 4 || num <= 0){
            System.out.println("Unknown number");
        }else if (num == 1){
            System.out.println("Yes!");
        }else{
            System.out.println("No!");
        }
    }
}