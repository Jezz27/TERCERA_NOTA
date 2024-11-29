import java.util.Scanner;
public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de la tabla ");
        int num = scanner.nextInt();
        for ( int i = 1; i <= num; i++){
            int tabla = num*i;
            System.out.println(num + " x " + i  + " = " + tabla );
        }
        
    }
}
