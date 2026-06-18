# Guión de Narración — Lección 2: Variables y Tipos de Datos

**Duración estimada**: 8 minutos  
**Editor a mostrar**: JDoodle (https://www.jdoodle.com/online-java-compiler/)

---

## Introducción [0:00 – 0:40]

"En la lección anterior aprendimos a mostrar texto en pantalla. Ahora aprenderemos a guardar información usando variables. ¡Empecemos!"

---

## ¿Qué es una variable? [0:40 – 2:00]

*[Mostrar en pantalla: ilustración de cajas etiquetadas]*

"Imagina que tienes cajas con etiquetas en tu cuarto: una que dice 'libros', otra que dice 'ropa'. Eso es exactamente una variable: una caja con nombre donde guardas un valor."

"En Java, declaramos una variable así: primero el tipo de dato, luego el nombre, luego el valor."

---

## Los cuatro tipos básicos [2:00 – 5:00]

*[Abrir el editor y tipear cada tipo mientras se explica]*

```java
int edad = 15;
```
"int guarda números enteros, es decir, sin decimales: 1, 15, 100, -5."

```java
String nombre = "Alex";
```
"String guarda texto. Siempre va entre comillas dobles."

```java
double promedio = 8.5;
```
"double guarda números con decimales, como las notas o precios."

```java
boolean estaEstudiando = true;
```
"boolean solo puede ser true (verdadero) o false (falso). Perfecto para preguntas de sí o no."

---

## Usando variables en pantalla [5:00 – 7:00]

*[Completar el programa en el editor]*

```java
System.out.println("Nombre: " + nombre);
System.out.println("Edad: " + edad + " años");
```

"El símbolo `+` une texto con variables. Ejecutemos y vemos el resultado."

*[Ejecutar y mostrar salida]*

"Prueba cambiar los valores de las variables. ¿Qué pasa si cambias la edad? ¡Modifica el código!"

---

## Cierre [7:00 – 8:00]

"Ahora sabes guardar información en tu programa. En la próxima lección usaremos estas variables para tomar decisiones con if-else. ¡Hasta pronto!"
