import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int number = scanner.nextInt();
        for(int i  = 1 ; i <= number ; i++ ){
            System.out.println(i);
        }
    }
}
