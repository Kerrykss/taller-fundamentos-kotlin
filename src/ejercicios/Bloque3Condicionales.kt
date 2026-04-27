package ejercicios

fun ejecutarBloque3() {
    println("=== BLOQUE 3: CONDICIONALES ===\n")

    // Ejercicio 11: Usar if-else simple
    val edad = 20
    if (edad >= 18) {
        println("11. Es mayor de edad")
    } else {
        println("11. Es menor de edad")
    }

    // Ejercicio 12: Usar if-else if-else múltiple
    val calificacion = 8
    val resultado = if (calificacion >= 9) {
        "Excelente"
    } else if (calificacion >= 7) {
        "Bueno"
    } else if (calificacion >= 5) {
        "Regular"
    } else {
        "Reprobado"
    }
    println("12. Calificación $calificacion es: $resultado")

    // Ejercicio 13: Usar when
    val dia = 3
    val nombreDia = when (dia) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Día inválido"
    }
    println("13. Día $dia es: $nombreDia")

    // Ejercicio 14: Usar when con rangos
    val numero = 15
    val tipo = when (numero) {
        in 1..10 -> "Número pequeño"
        in 11..20 -> "Número medio"
        in 21..100 -> "Número grande"
        else -> "Número muy grande"
    }
    println("14. El número $numero es: $tipo")

    // Ejercicio 15: Usar when con tipos
    val valor: Any = "Hola"
    when (valor) {
        is String -> println("15. Es una cadena: $valor")
        is Int -> println("15. Es un número entero: $valor")
        is Double -> println("15. Es un decimal: $valor")
        else -> println("15. Tipo desconocido")
    }

    println()
}
