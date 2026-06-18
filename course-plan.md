# Fundamentos de Java para Principiantes

## Resumen del Curso

Este curso de 1 hora introduce a estudiantes de secundaria a los fundamentos de la programación con Java, incluyendo los conceptos básicos de la programación orientada a objetos (POO). **¡No requiere descargas!** Solo abre tu navegador web.

**Duración total**: ~60 minutos  
**Público objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación  
**Prerrequisitos**: Ninguno  
**Herramientas necesarias**: **¡Solo tu navegador web!** (Chrome, Firefox, Safari, Edge)

📂 **Repositorio de Código Fuente**: [https://github.com/grupo3/java-fundamentals-course-grupo3](https://github.com/1ASI0729-2610-10177-Animatik-Vetalis/java-fundamentals-course-vetalis)

---

## Secuencia de la Lección

### Lección 1: ¿Qué es Java y la Programación? (7 minutos)

- **Descripción**: Descubre qué es la programación y por qué Java es uno de los lenguajes más importantes del mundo. Escribirás tu primer programa "¡Hola, Mundo!" en minutos, sin instalar nada.
- **Conclusiones clave**:
  - La programación es dar instrucciones precisas y ordenadas a una computadora.
  - Java se usa en aplicaciones móviles, juegos y sistemas bancarios.
  - Todo programa Java necesita un método `main` para arrancar: `public static void main(String[] args)`.
  - `System.out.println("texto")` muestra texto en pantalla.
- **Enlace**: [Ver la lección en YouTube](https://youtu.be/B0KuWScgv8c) *
- **Empieza a programar**: [Abrir editor - Hola Mundo](https://www.jdoodle.com/ga/zPEUCJnmE5VDUawxV2l4XQ%3D%3D) 👈 **¡No necesitas cuenta!**

---

### Lección 2: Variables y Tipos de Datos (8 minutos)

- **Descripción**: Aprende a guardar información en tu programa usando variables. Es como tener cajas etiquetadas donde guardas números, nombres o valores verdadero/falso.
- **Conclusiones clave**:
  - `int` guarda números enteros → `int edad = 15;`
  - `String` guarda texto → `String nombre = "Alex";`
  - `double` guarda números decimales → `double promedio = 8.5;`
  - `boolean` guarda verdadero o falso → `boolean aprobado = true;`
  - Los nombres de variables deben ser descriptivos (usa camelCase: `miVariable`).
- **Enlace**: [Ver la lección en YouTube](https://youtu.be/T60eD1hccJw) *
- **Práctica**: [Abrir ejercicio de variables](https://www.jdoodle.com/ga/Sh85kEFDcVnQIE82ZSMe8Q%3D%3D) 👈 **¡Inicio inmediato!**

---

### Lección 3: Operadores y Tomando Decisiones (10 minutos)

- **Descripción**: Haz que tu programa sea inteligente. Aprenderás a hacer cálculos matemáticos y a que el programa tome caminos diferentes según una condición, como lo hace un semáforo.
- **Conclusiones clave**:
  - Operadores matemáticos: `+`, `-`, `*`, `/`, `%` (residuo)
  - Comparaciones: `>`, `<`, `>=`, `<=`, `==` (igual), `!=` (diferente)
  - `if (condicion) { }` ejecuta código cuando la condición es verdadera
  - `else { }` se ejecuta cuando la condición es falsa
  - `else if (otraCondicion) { }` evalúa otra condición si la anterior fue falsa
- **Enlace**: [Ver la lección en YouTube](https://youtu.be/ewIHEkKHFwI) *(próximamente)*
- **Práctica**: [Abrir ejercicio de decisiones](https://www.jdoodle.com/ga/j5dmcejXW5%2BxSlMYKnjXNA%3D%3D) 👈 **¡No necesitas registrarte!**

---

### Lección 4: Repitiendo Tareas con Bucles (8 minutos)

- **Descripción**: En lugar de escribir el mismo código 100 veces, aprende a usar bucles. ¡Es como poner una canción en repetición, pero para instrucciones de computadora!
- **Conclusiones clave**:
  - Bucle `for`: ideal cuando sabes cuántas veces repetir → `for (int i = 0; i < 5; i++) { }`
  - Bucle `while`: ideal cuando repites hasta que una condición cambie → `while (condicion) { }`
  - `i++` es equivalente a `i = i + 1` (incremento de uno)
  - ¡Cuidado con los bucles infinitos! Siempre debe existir una condición de salida.
- **Enlace**: [Ver la lección en YouTube](https://www.youtube.com/watch?v=PENDIENTE-LECCION-4) *(próximamente)*
- **Práctica**: [Abrir ejercicio de bucles](https://www.jdoodle.com/online-java-compiler/) 👈 **¡Empieza ahora!**

---

### Lección 5: Métodos y Comunicación con el Usuario (10 minutos)

- **Descripción**: Aprende a organizar tu código en bloques reutilizables llamados métodos, y a que tu programa interactúe con el usuario a través del teclado usando `Scanner`.
- **Conclusiones clave**:
  - Un método agrupa código que puedes reutilizar: `public static void saludar(String nombre) { }`
  - Los parámetros son datos que le pasas al método: `saludar("Ana")`
  - `return` devuelve un resultado: `public static int sumar(int a, int b) { return a + b; }`
  - `Scanner scanner = new Scanner(System.in);` permite leer del teclado
  - `scanner.nextLine()` captura texto, `scanner.nextInt()` captura enteros, `scanner.nextDouble()` captura decimales
- **Enlace**: [Ver la lección en YouTube](https://www.youtube.com/watch?v=PENDIENTE-LECCION-5) *(próximamente)*
- **Práctica**: [Abrir ejercicio de métodos e I/O](https://www.jdoodle.com/online-java-compiler/) 👈 **¡Interactúa con tu programa!**

---

### Lección 6: Introducción a la POO: Clases y Objetos (10 minutos)

- **Descripción**: Descubre la programación orientada a objetos (POO), la base de los programas modernos. Crearás tu primera clase, como el "molde" de un personaje de videojuego, y tus primeros objetos.
- **Conclusiones clave**:
  - Una **clase** es un molde o plano: `class Estudiante { }`
  - Un **objeto** es una instancia creada con ese molde: `Estudiante ana = new Estudiante("Ana", 15, 16.5);`
  - Los **atributos** son las características del objeto (`nombre`, `edad`, `nota`)
  - El **constructor** inicializa el objeto: `public Estudiante(String nombre, int edad, double nota) { }`
  - La **encapsulación** protege los datos con `private` y los expone con getters (`getNombre()`) y setters (`setNota(14.0)`)
- **Enlace**: [Ver la lección en YouTube](https://www.youtube.com/watch?v=PENDIENTE-LECCION-6) *(próximamente)*
- **Práctica**: [Abrir ejercicio de clases y objetos](https://www.jdoodle.com/online-java-compiler/) 👈 **¡Crea tu primera clase!**

---

### Lección 7: Proyecto Final - Sistema de Registro de Notas (7 minutos)

- **Descripción**: ¡Pon todo en práctica! Construirás un programa completo que registra estudiantes, guarda sus notas con arrays, calcula promedios y determina si aprobaron. Además, aprenderás los errores más comunes y dónde seguir aprendiendo.
- **Conclusiones clave**:
  - Los **arrays** guardan múltiples valores del mismo tipo: `double[] notas = new double[3];`
  - Iterar un array con for-each: `for (double nota : notas) { }`
  - Errores comunes: olvidar `;`, confundir `=` (asignación) con `==` (comparación), índice fuera de rango en arrays
  - Mejores prácticas: nombres descriptivos, una responsabilidad por método, probar con datos de prueba
  - Recursos para seguir: [Oracle Java Docs](https://docs.oracle.com/javase/tutorial/), [Codecademy Java](https://www.codecademy.com/learn/learn-java), [Stack Overflow](https://stackoverflow.com/questions/tagged/java)
- **Enlace**: [Ver la lección en YouTube](https://www.youtube.com/watch?v=PENDIENTE-LECCION-7) *(próximamente)*
- **Proyecto final**: [Construye tu Sistema de Registro](https://www.jdoodle.com/online-java-compiler/) 👈 **¡Guarda y comparte tu código!**

---

## Recursos Adicionales

**Código fuente completo**: [Repositorio de GitHub](https://github.com/1ASI0729-2610-10177-Animatik-Vetalis/java-fundamentals-course-vetalis/tree/main/completed-examples)

**Todas las actividades prácticas**:

| N° Lección | Actividad | Editor en línea | Código inicial |
|---|---|---|---|
| 1 | Hola Mundo | [JDoodle](https://www.jdoodle.com/online-java-compiler/) | [Ver código](https://github.com/1ASI0729-2610-10177-Animatik-Vetalis/java-fundamentals-course-vetalis/blob/main/starter-files/Leccion1_HolaMundo.java) |
| 2 | Variables y Tipos de Datos | [JDoodle](https://www.jdoodle.com/online-java-compiler/) | [Ver código](https://github.com/1ASI0729-2610-10177-Animatik-Vetalis/java-fundamentals-course-vetalis/blob/main/starter-files/Leccion2_Variables.java) |
| 3 | Operadores y Decisiones | [JDoodle](https://www.jdoodle.com/online-java-compiler/) | [Ver código](https://github.com/1ASI0729-2610-10177-Animatik-Vetalis/java-fundamentals-course-vetalis/blob/main/starter-files/Leccion3_Decisiones.java) |
| 4 | Bucles for y while | [JDoodle](https://www.jdoodle.com/online-java-compiler/) | [Ver código](https://github.com/1ASI0729-2610-10177-Animatik-Vetalis/java-fundamentals-course-vetalis/blob/main/starter-files/Leccion4_Bucles.java) |
| 5 | Métodos y Scanner | [JDoodle](https://www.jdoodle.com/online-java-compiler/) | [Ver código](https://github.com/1ASI0729-2610-10177-Animatik-Vetalis/java-fundamentals-course-vetalis/blob/main/starter-files/Leccion5_MetodosIO.java) |
| 6 | Clases y Objetos (POO) | [JDoodle](https://www.jdoodle.com/online-java-compiler/) | [Ver código](https://github.com/grupo3/java-fundamentals-course-grupo3/blob/main/starter-files/Leccion6_POO.java](https://github.com/1ASI0729-2610-10177-Animatik-Vetalis/java-fundamentals-course-vetalis/blob/main/starter-files/Leccion6_POO.java)) |
| 7 | Proyecto Final | [JDoodle](https://www.jdoodle.com/online-java-compiler/) | [Ver código](https://github.com/grupo3/java-fundamentals-course-grupo3/blob/main/starter-files/Leccion7_ProyectoFinal.java](https://github.com/1ASI0729-2610-10177-Animatik-Vetalis/java-fundamentals-course-vetalis/blob/main/starter-files/Leccion7_ProyectoFinal.java)) |

**¡Gracias por completar el curso!**

---

## Elaboración

Universidad Peruana de Ciencias Aplicadas  
Carrera de Ingeniería de Software  
Período 2026-10  
1ASI0729 Desarrollo de Aplicaciones Open Source

**NRC**: [10177]  
**Nombre del equipo**: Grupo 3  
**Líder del equipo**: [Mario Sejuro]  
**Integrantes del equipo**: [Leonardo Sanchez, Dario Romero, Lui Gamero, Sebastian Roman]  
**Fecha de entrega**: [18-06-2026]
