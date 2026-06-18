public class Leccion3_Decisiones {
    public static void main(String[] args) {
        int nota = 75;

        System.out.println("Nota obtenida: " + nota);

        if (nota >= 90) {
            System.out.println("Calificación: Excelente");
        } else if (nota >= 70) {
            System.out.println("Calificación: Bueno");
        } else if (nota >= 50) {
            System.out.println("Calificación: Regular");
        } else {
            System.out.println("Calificación: Necesita mejorar");
        }

        boolean puedeJugar = nota >= 60;
        System.out.println("¿Puede jugar videojuegos hoy? " + puedeJugar);

        int num1 = 15;
        int num2 = 8;
        System.out.println("\n=== Comparando " + num1 + " y " + num2 + " ===");
        System.out.println("¿Son iguales? " + (num1 == num2));
        System.out.println("¿El primero es mayor? " + (num1 > num2));
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Residuo de " + num1 + " / " + num2 + ": " + (num1 % num2));
    }
}
