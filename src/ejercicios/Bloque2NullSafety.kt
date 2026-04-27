package ejercicios

fun ejecutarBloque2() {
    println("=== BLOQUE 2: NULL SAFETY ===\n")

    // Ejercicio 6: Declarar una variable nullable
    val nombre: String? = "María"
    println("6. Variable nullable (con valor): $nombre")

    // Ejercicio 7: Usar el operador ?. (safe call)
    val apellido: String? = null
    println("7. Safe call ?. (null): ${apellido?.uppercase() ?: "No tiene valor"}")

    // Ejercicio 8: Usar el operador ?: (elvis operator)
    val telefono: String? = null
    val telefonoDefault = telefono ?: "No disponible"
    println("8. Elvis operator ?:: $telefonoDefault")

    // Ejercicio 9: Usar el operador !! (not-null assertion)
    val email: String? = "usuario@ejemplo.com"
    println("9. Not-null assertion !!: ${email!!.length} caracteres")

    // Ejercicio 10: Usar let con nullable
    val ciudad: String? = "Bogotá"
    ciudad?.let {
        println("10. Bloque let: La ciudad es $it")
    }

    println()
}
