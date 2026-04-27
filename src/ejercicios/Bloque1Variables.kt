package ejercicios

fun ejecutarBloque1() {
    println("=== BLOQUE 1: VARIABLES ===\n")

    // Ejercicio 1: Declarar una variable inmutable de tipo String
    val nombre = "Juan"
    println("1. Nombre (val): $nombre")

    // Ejercicio 2: Declarar una variable mutable de tipo Int
    var edad = 25
    println("2. Edad inicial (var): $edad")
    edad = 26
    println("   Edad actualizada: $edad")

    // Ejercicio 3: Declarar una variable de tipo Double
    val altura = 1.75
    println("3. Altura (Double): $altura metros")

    // Ejercicio 4: Declarar una variable de tipo Boolean
    val esEstudiante = true
    println("4. ¿Es estudiante? (Boolean): $esEstudiante")

    // Ejercicio 5: Usar inferencia de tipos
    val ciudad = "Medellín"
    val poblacion = 2500000
    val temperaturaPromedio = 22.5
    println("5. Inferencia de tipos:")
    println("   Ciudad: $ciudad (${ciudad::class.simpleName})")
    println("   Población: $poblacion (${poblacion::class.simpleName})")
    println("   Temperatura: $temperaturaPromedio (${temperaturaPromedio::class.simpleName})")

    println()
}
