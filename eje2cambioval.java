class Rectangulo {
    int alto;
    int ancho;
    Rectangulo(int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
    }
}
public class eje2cambioval {
    public static void cambioRectangulo (Rectangulo r) {
        r.alto = 50;
        r.ancho = 100;
        System.out.println("Dentro del metodo cambio rectangulo alto " + r.alto + " ancho " + r.ancho);
    }
    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(5, 10);
        System.out.println("Antes del metodo rectangulo alto " + miRectangulo.alto + " ancho " + miRectangulo.ancho);
        cambioRectangulo(miRectangulo);
        System.out.println("Despues de cambiarlo rectangulo alto " + miRectangulo.alto + " ancho " + miRectangulo.ancho);
    }
}
