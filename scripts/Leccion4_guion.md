# Guión de Narración — Lección 4: Repitiendo Tareas con Bucles

**Duración estimada**: 8 minutos  
**Editor a mostrar**: JDoodle (https://www.jdoodle.com/online-java-compiler/)

---

## Introducción [0:00 – 0:40]

"¿Imagina que tienes que escribir 'Hola' 100 veces? Con un bucle, lo haces con tres líneas de código. ¡Eso es el poder de la repetición!"

---

## Bucle for [0:40 – 3:30]

*[Tipear en el editor y ejecutar]*

```java
for (int i = 1; i <= 10; i++) {
    System.out.println("5 x " + i + " = " + (5 * i));
}
```

"El bucle for tiene tres partes entre los paréntesis:"
- "`int i = 1` → donde empezamos"
- "`i <= 10` → hasta cuándo repetimos"
- "`i++` → cómo aumentamos el contador (i++ equivale a i = i + 1)"

*[Ejecutar y mostrar la tabla del 5]*

"Cambia el 5 por otro número para ver su tabla de multiplicar."

---

## Bucle while [3:30 – 6:00]

*[Tipear en el editor]*

```java
int contador = 10;
while (contador > 0) {
    System.out.println(contador + "...");
    contador--;
}
System.out.println("¡Despegue!");
```

"El while repite mientras la condición sea verdadera. Es ideal cuando no sabes de antemano cuántas veces vas a repetir."

"Ojo: siempre debes cambiar el contador dentro del while. Si olvidas `contador--`, el bucle nunca termina. ¡Es un bucle infinito!"

---

## Desafío: Suma del 1 al 100 [6:00 – 7:30]

*[Mostrar en pantalla el código completado]*

```java
int suma = 0;
for (int i = 1; i <= 100; i++) {
    suma += i;
}
System.out.println("La suma de 1 a 100 es: " + suma);
```

"La respuesta es 5050. ¿Puedes modificarlo para sumar solo los números pares?"

---

## Cierre [7:30 – 8:00]

"¡Ahora puedes hacer que el computador repita tareas fácilmente! En la siguiente lección aprenderemos a organizar código en métodos y a hablar con el usuario. ¡Hasta pronto!"
