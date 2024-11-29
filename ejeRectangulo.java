class Rectangulo{
    double Alto;
    double Ancho;
    Rectangulo( double Alto, double Ancho){
        this.Alto = Alto;
        this.Ancho = Ancho;
    }
}
public class ejeRectangulo {
    public static void cambiarMedidas(Rectangulo r){
        r.Alto = 10;
        r.Ancho = 12;
        System.out.println("Dentro del metodo Medidas de ancho " + r.Ancho + " y alto " + r.Alto);
    }
    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(5,6 );
        System.out.println(" Antes del metodo  de ancho " + miRectangulo.Alto + " y alto " + miRectangulo.Ancho);
        cambiarMedidas(miRectangulo);
        System.out.println("Despues del metodo de ancho " + miRectangulo.Alto + " y alto " + miRectangulo.Ancho);
    }
}