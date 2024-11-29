public class cambioVal_2 {
    public static void intercambio (int a , int b ) {
        int valor_Cambio = a;
        a = b;
        b = valor_Cambio;
        System.out.println("Valor de a = " + a + " valor d = " + b + " en el metodo ");
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        System.out.println("Valor de a = " + a + " valor d = " + b + " antes del metodo ");
        intercambio(a, b);
        System.out.println("Valor de a = " + a + " valor d = " + b + " despues del metodo");
    }        
}
