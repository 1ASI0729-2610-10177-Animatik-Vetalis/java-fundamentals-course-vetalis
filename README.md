# Fundamentos de Java para Principiantes — Grupo 3

Repositorio de código fuente del curso introductorio de Java para estudiantes de secundaria (12-17 años), sin experiencia previa en programación.

## Estructura del repositorio

```
java-fundamentals-course-grupo3/
├── course-plan.md          # Plan de curso completo (artefacto principal)
├── README.md               # Este archivo
├── starter-files/          # Código inicial para que los estudiantes completen
│   ├── Leccion1_HolaMundo.java
│   ├── Leccion2_Variables.java
│   ├── Leccion3_Decisiones.java
│   ├── Leccion4_Bucles.java
│   ├── Leccion5_MetodosIO.java
│   ├── Leccion6_POO.java
│   └── Leccion7_ProyectoFinal.java
├── completed-examples/     # Soluciones completas de cada lección
│   ├── Leccion1_HolaMundo.java
│   ├── Leccion2_Variables.java
│   ├── Leccion3_Decisiones.java
│   ├── Leccion4_Bucles.java
│   ├── Leccion5_MetodosIO.java
│   ├── Leccion6_POO.java
│   └── Leccion7_ProyectoFinal.java
└── scripts/                # Guiones de narración para los videos
    ├── Leccion1_guion.md
    ├── Leccion2_guion.md
    ├── Leccion3_guion.md
    ├── Leccion4_guion.md
    ├── Leccion5_guion.md
    ├── Leccion6_guion.md
    └── Leccion7_guion.md
```

## Cómo usar este repositorio

### Para estudiantes

No necesitas instalar nada. Abre cualquiera de los editores en línea gratuitos:

- [JDoodle (Java)](https://www.jdoodle.com/online-java-compiler/) — sin registro
- [OnlineGDB (Java)](https://www.onlinegdb.com/online_java_compiler) — sin registro
- [Replit](https://replit.com/languages/java) — registro opcional

**Pasos para practicar:**
1. Abre el editor en línea de tu preferencia.
2. Copia el código del archivo correspondiente en `starter-files/`.
3. Pégalo en el editor.
4. Lee los comentarios `TODO` y completa el código.
5. Haz clic en **Run / Ejecutar** para ver el resultado.
6. Si te atascas, consulta la solución en `completed-examples/`.

### Para docentes / instructores

Los guiones de narración para cada video se encuentran en la carpeta `/scripts`. Cada guion indica el tiempo estimado, el contenido a mostrar en pantalla y el texto de narración en off.

## Configuración de Java (solo para entorno local)

Si deseas ejecutar el código localmente (no es obligatorio para el curso):

**Requisitos:**
- Java JDK 17 o superior: [https://adoptium.net/](https://adoptium.net/)

**Compilar y ejecutar:**
```bash
javac NombreArchivo.java
java NombreClase
```

**Ejemplo:**
```bash
javac completed-examples/Leccion1_HolaMundo.java
java -cp completed-examples Leccion1_HolaMundo
```

## Lecciones del curso

| # | Lección | Duración | Temas |
|---|---|---|---|
| 1 | ¿Qué es Java y la Programación? | 7 min | Hello World, sintaxis básica |
| 2 | Variables y Tipos de Datos | 8 min | int, String, double, boolean |
| 3 | Operadores y Decisiones | 10 min | if-else, operadores |
| 4 | Bucles | 8 min | for, while |
| 5 | Métodos y Entrada/Salida | 10 min | métodos, Scanner |
| 6 | Introducción a la POO | 10 min | clases, objetos, encapsulación |
| 7 | Proyecto Final | 7 min | arrays, integración POO |
| | **Total** | **~60 min** | |

## Plan de curso completo

Ver [course-plan.md](./course-plan.md) para el plan de curso detallado con enlaces a videos y actividades.

---

Universidad Peruana de Ciencias Aplicadas — Ingeniería de Software  
1ASI0729 Desarrollo de Aplicaciones Open Source — 2026-10
