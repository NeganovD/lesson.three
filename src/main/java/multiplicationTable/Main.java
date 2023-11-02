package multiplicationTable;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
            System.out.println("*************");
        }
    }
}