class Regalo{
    String Zapatos;
    String Oro;
    Regalo(String Zapatos, String Oro){
        this.Zapatos = Zapatos;
        this.Oro = Oro;
    }
}

public class eje3Referencia {
public static void cambioregalo( Regalo r){
    r.Zapatos = "Adidas";
    r.Oro = "Cadena con dije ";
    System.out.println("Dentro del metodo los regalos serán " + r.Zapatos + " y " + r.Oro);
}
public static void main(String[] args) {
    Regalo miregalo = new Regalo("Gazzell", "Cadena");
    miregalo.Zapatos = "Chanclas";
    miregalo.Oro = "Una pepita #0";
    System.out.println("Antes del metodo los regalos son : " + miregalo.Zapatos + "  " + miregalo.Oro);
    cambioregalo(miregalo);
    System.out.println("Despues del metodo los regalos serian: " + miregalo.Zapatos + "  " + miregalo.Oro);
    }

}

