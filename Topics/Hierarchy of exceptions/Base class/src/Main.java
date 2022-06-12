// update the class
class MyException extends Throwable {

    public MyException(String message) {
        super(message);
    }
}

//do not change the code
class Main {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abcdefg");
        } catch (RuntimeException e) {
            System.out.println("runtime");
        } catch (Exception e) {
            System.out.println("exception");
        } finally {
            System.out.println("finally");
        }
    }
}