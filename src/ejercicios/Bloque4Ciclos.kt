package ejercicios

fun ejecutarBloque4() {
    println("=== BLOQUE 4: CICLOS ===\n")

    // Ejercicio 16: Usar for con rango
    print("16. For con rango (1-5): ")
    for (i in 1..5) {
        print("$i ")
    }
    println()

    // Ejercicio 17: Usar for con rango descendente
    print("17. For descendente (5-1): ")
    for (i in 5 downTo 1) {
        print("$i ")
    }
    println()

    // Ejercicio 18: Usar for con step
    print("18. For con step de 2 (1-10): ")
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println()

    // Ejercicio 19: Usar for con iterador
    val colores = listOf("Rojo", "Verde", "Azul", "Amarillo")
    println("19. For con iterador:")
    for (color in colores) {
        println("   - $color")
    }

    // Ejercicio 20: Usar while
    println("20. While loop:")
    var contador = 1
    while (contador <= 3) {
        println("   Iteración $contador")
        contador++
    }

    // Ejercicio 21: Usar do-while
    println("21. Do-while loop:")
    var numero = 1
    do {
        println("   Número: $numero")
        numero++
    } while (numero <= 3)

    // Ejercicio 22: Usar break
    println("22. Break en ciclo:")
    for (i in 1..10) {
        if (i == 5) break
        print("$i ")
    }
    println(" (paró en 5)")

    // Ejercicio 23: Usar continue
    print("23. Continue en ciclo: ")
    for (i in 1..5) {
        if (i == 3) continue
        print("$i ")
    }
    println(" (saltó 3)")

    // Ejercicio 24: Usar forEach
    println("24. forEach:")
    val numeros = listOf(10, 20, 30, 40)
    numeros.forEach { numero ->
        println("   Número: $numero")
    }

    // Ejercicio 25: Usar repeat
    println("25. repeat:")
    repeat(3) {
        println("   Esto se repite 3 veces")
    }

    println()
}
