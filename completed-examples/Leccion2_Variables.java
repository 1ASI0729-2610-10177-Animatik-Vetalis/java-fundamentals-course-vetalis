public class Leccion2_Variables {
    public static void main(String[] args) {
        int edad = 15;
        String nombre = "Alex";
        double promedio = 8.5;
        boolean estaEstudiando = true;

        System.out.println("=== Mi Información ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Promedio: " + promedio);
        System.out.println("¿Está estudiando? " + estaEstudiando);

        int anioNacimiento = 2025 - edad;
        System.out.println("Año de nacimiento aproximado: " + anioNacimiento);

        String mensaje = "Hola, me llamo " + nombre + " y tengo " + edad + " años.";
        System.out.println(mensaje);
    }
}
