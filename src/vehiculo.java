public class vehiculo {

    String placa;
    String color;
    String precio;

    public static void main(String[] args) {
        vehiculo vehiculo1 = new vehiculo();
        vehiculo1.placa = "GFT675";
        vehiculo1.color = "azul";
        vehiculo1.precio = "20000";

        vehiculo vehiculo2 = new vehiculo();
        vehiculo2.placa = "KIO989";
        vehiculo2.color = "fucsia";
        vehiculo2.precio = "10000";

        vehiculo vehiculo3 = new vehiculo();
        vehiculo3.placa = "NJU777";
        vehiculo3.color = "DODRADO";
        vehiculo3.precio = "200003";

        System.out.println("la placa del vehiculo 1 es: " + vehiculo1.placa + "\n");
        System.out.println("el color del vehiculo 1 es: " + vehiculo1.color + "\n");
        System.out.println("El precio del  vehiculo 1 es: " + vehiculo1.precio + "\n");

        System.out.println("la placa del vehiculo 2 es: " + vehiculo2.placa + "\n");
        System.out.println("el color del vehiculo 2 es: " + vehiculo2.color + "\n");
        System.out.println("El precio del vehiculo 3 es: " + vehiculo2.precio + "\n");

        System.out.println("la placa del vehiculo 3 es: " + vehiculo3.placa + "\n");
        System.out.println("el color del vehiculo 3 es: " + vehiculo3.color + "\n");
        System.out.println("El precio del vehiculo 3 es: " + vehiculo3.precio + "\n");


    }
}