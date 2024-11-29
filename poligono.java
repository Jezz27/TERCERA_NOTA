import java.util.Scanner;
public class poligono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Poligono  / cod  ");
        System.out.println(" Triangulo /  1   ");
        System.out.println(" Cuadrado  /  2  ");
        System.out.println(" Rectangulo/  3  ");
        System.out.println("Ingrese codigo ");
        int cod = scanner.nextInt();
        switch (cod) {
            case 1:
                System.out.println("Ingrese base y altura ");
                double base = scanner.nextDouble();
                double altura = scanner.nextDouble();
                double area = (base * altura) / 2;
                System.out.println(" area " + area);
                break;
            case 2:
                System.out.println("Ingrese lado");
                double lado = scanner.nextDouble();
                area = lado * lado;
                System.out.println(" area " + area);
                break;
            case 3:
            System.out.println("Ingrese base y altura ");
                base = scanner.nextDouble();
                altura = scanner.nextDouble();
                area= base * altura;
                System.out.println(" area " + area);
                break;
            default:
                System.out.println("Codigo fuera de rango");
                break;
                
        }
        
    }
}
