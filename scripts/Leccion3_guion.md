# Guión de Narración — Lección 3: Operadores y Tomando Decisiones

**Duración estimada**: 10 minutos  
**Editor a mostrar**: JDoodle (https://www.jdoodle.com/online-java-compiler/)

---

## Introducción [0:00 – 0:40]

"Hasta ahora nuestros programas siempre hacen lo mismo. Hoy aprenderemos a que hagan cosas diferentes según una condición, como un semáforo que cambia según el tráfico."

---

## Operadores matemáticos [0:40 – 2:30]

*[Mostrar en pantalla: código de operaciones básicas]*

```java
int a = 10, b = 3;
System.out.println(a + b);  // 13
System.out.println(a - b);  // 7
System.out.println(a * b);  // 30
System.out.println(a / b);  // 3 (división entera)
System.out.println(a % b);  // 1 (residuo)
```

"El operador `%` es el residuo de la división. Es muy útil para saber si un número es par: si `numero % 2` es 0, es par."

---

## Operadores de comparación [2:30 – 4:30]

*[Mostrar en pantalla: tabla de operadores]*

```java
int nota = 75;
System.out.println(nota > 60);   // true
System.out.println(nota == 100); // false
System.out.println(nota != 0);   // true
```

"Importante: `==` compara si dos valores son iguales. `=` asigna un valor. ¡No los confundas!"

---

## Estructura if-else [4:30 – 8:00]

*[Tipear el código despacio en el editor]*

```java
int nota = 75;

if (nota >= 90) {
    System.out.println("Calificación: Excelente");
} else if (nota >= 70) {
    System.out.println("Calificación: Bueno");
} else if (nota >= 50) {
    System.out.println("Calificación: Regular");
} else {
    System.out.println("Calificación: Necesita mejorar");
}
```

"Java evalúa las condiciones de arriba hacia abajo. Cuando encuentra una verdadera, ejecuta ese bloque y salta los demás."

*[Ejecutar y cambiar el valor de nota para demostrar distintos resultados]*

"Cambia el valor de nota a 95, luego a 40. ¡Mira cómo el programa reacciona diferente!"

---

## Cierre [8:00 – 10:00]

"¡Excelente! Tu programa ahora puede tomar decisiones. En la próxima lección aprenderemos a repetir tareas con bucles. ¡Nos vemos!"
