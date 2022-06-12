import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void changeList(List<String> list) {
        // write your code here
        String largestNumber = "";
        for (String str : list) {
            if (str.length() > largestNumber.length()) {
                largestNumber = str;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < largestNumber.length()) {
                list.set(i, largestNumber);
            }
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}