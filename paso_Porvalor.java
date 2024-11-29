public class paso_Porvalor {
    
    public static void main(String[] args) {
        double number = 5.10;
        System.out.println("Después de llamar a cambiarValor: " + number);  
        cambiarValor(number);
    }

    public static void cambiarValor(double Number) {
        Number = 100.5;
        System.out.println("Dentro de cambiarValor: " + Number); 
    }
}
