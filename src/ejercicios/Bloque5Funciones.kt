package ejercicios

fun ejecutarBloque5() {
    println("=== BLOQUE 5: FUNCIONES ===\n")

    // Ejercicio 26: Función simple sin parámetros
    fun saludar() {
        println("26. ¡Hola desde una función!")
    }
    saludar()

    // Ejercicio 27: Función con parámetros
    fun sumar(a: Int, b: Int): Int {
        return a + b
    }
    val suma = sumar(5, 3)
    println("27. Suma de 5 + 3 = $suma")

    // Ejercicio 28: Función con parámetros por defecto
    fun saludarPersona(nombre: String, saludo: String = "Hola") {
        println("28. $saludo, $nombre")
    }
    saludarPersona("Carlos")
    saludarPersona("Diana", "Buenos días")

    // Ejercicio 29: Función con parámetros nombrados
    fun crearPerfil(nombre: String, edad: Int, ciudad: String) {
        println("29. Perfil - Nombre: $nombre, Edad: $edad, Ciudad: $ciudad")
    }
    crearPerfil(edad = 30, nombre = "Elena", ciudad = "Cali")

    // Ejercicio 30: Función con varargs (parámetros variables)
    fun imprimirNumeros(vararg numeros: Int) {
        println("30. Números recibidos:")
        numeros.forEach { println("   - $it") }
    }
    imprimirNumeros(1, 2, 3, 4, 5)

    println()
}
