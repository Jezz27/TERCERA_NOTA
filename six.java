
import java.util.Scanner;
public class six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero que quiere saber cuantas cifras tiene");
        int num = scanner.nextInt();
        int contador = 0;
        while( num != 0 ){
            num/=10;
            contador ++;
        }
        System.out.println(contador);
    }
}
