public class Leccion4_Bucles {
    public static void main(String[] args) {
        System.out.println("=== Tabla del 5 (bucle for) ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        System.out.println("\n=== Cuenta regresiva (bucle while) ===");
        int contador = 10;
        while (contador > 0) {
            System.out.println(contador + "...");
            contador--;
        }
        System.out.println("¡Despegue!");

        System.out.println("\n=== Suma del 1 al 100 ===");
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("La suma de 1 a 100 es: " + suma);

        System.out.println("\n=== Solo números pares del 2 al 20 ===");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
