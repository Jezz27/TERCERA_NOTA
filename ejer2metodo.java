class empleado_Jordan {
    String nombre;
    String apellido;
    empleado_Jordan(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
public class ejer2metodo {
    public static void cambioDatos (empleado_Jordan r) {
        r.nombre = "Miguel";
        r.apellido = "Zapata";
        System.out.println("Dentro del metodo nombre: " + r.nombre + " apellido: " + r.apellido);
    }
    public static void main(String[] args) {
        empleado_Jordan miJordan = new empleado_Jordan("Jesus", "Lozano");
        System.out.println("Antes del metodo nombre: " + miJordan.nombre + " apellido: " + miJordan.apellido); 
        cambioDatos(miJordan);
        System.out.println("Despues del metodo nombre: " + miJordan.nombre + " apellido: " + miJordan.apellido);
    }
}
