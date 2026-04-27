package ejercicios

fun ejecutarBloque6() {
    println("=== BLOQUE 6: COLECCIONES ===\n")

    // Ejercicio 31: Crear una List inmutable
    val frutas = listOf("Manzana", "Plátano", "Naranja", "Fresa")
    println("31. Lista inmutable:")
    frutas.forEach { println("   - $it") }

    // Ejercicio 32: Crear una MutableList
    val numeros = mutableListOf(1, 2, 3, 4, 5)
    println("32. MutableList original: $numeros")
    numeros.add(6)
    println("    MutableList después de add(6): $numeros")

    // Ejercicio 33: Acceder a elementos de una lista
    println("33. Acceso a elementos:")
    println("   Primer elemento: ${frutas[0]}")
    println("   Último elemento: ${frutas[frutas.size - 1]}")
    println("   Segundo elemento: ${frutas.getOrNull(1)}")

    // Ejercicio 34: Crear un Set
    val colores = setOf("Rojo", "Verde", "Azul", "Rojo")
    println("34. Set (sin duplicados): $colores")
    println("    Tamaño del Set: ${colores.size}")

    // Ejercicio 35: Crear un Map
    val capitales = mapOf(
        "Colombia" to "Bogotá",
        "Perú" to "Lima",
        "Chile" to "Santiago"
    )
    println("35. Map (diccionario):")
    capitales.forEach { (pais, capital) ->
        println("   $pais -> $capital")
    }

    // Ejercicio 36: Usar filter en colecciones
    val numerosPares = numeros.filter { it % 2 == 0 }
    println("36. Números pares de $numeros: $numerosPares")

    // Ejercicio 37: Usar map para transformar
    val frutasEnMayusculas = frutas.map { it.uppercase() }
    println("37. Frutas en mayúsculas: $frutasEnMayusculas")

    // Ejercicio 38: Usar any y all
    val tieneNumerosGrandes = numeros.any { it > 4 }
    val todosMayoresQueCero = numeros.all { it > 0 }
    println("38. ¿Hay números > 4? $tieneNumerosGrandes")
    println("    ¿Todos > 0? $todosMayoresQueCero")

    // Ejercicio 39: Usar find y firstOrNull
    val primerNumeroGrande = numeros.find { it > 3 }
    val frutaConA = frutas.firstOrNull { it.contains("a") }
    println("39. Primer número > 3: $primerNumeroGrande")
    println("    Primera fruta con 'a': $frutaConA")

    // Ejercicio 40: Usar groupBy
    val numerosAgrupados = numeros.groupBy { if (it % 2 == 0) "Par" else "Impar" }
    println("40. Números agrupados por paridad:")
    numerosAgrupados.forEach { (tipo, valores) ->
        println("   $tipo: $valores")
    }

    println()
}
