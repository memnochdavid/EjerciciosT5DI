package com.example.ejerciciost5

import android.graphics.drawable.Drawable

//ejercicio 1
/*1. Escribe una función que tome una cadena
como parámetro e imprima su longitud.*/

fun longi_cadena(cadena:String): Int {
    return cadena.length
}

//ejercicio 2
/*2. Comparación de Cadenas: Crea dos cadenas y
utiliza el método equals para determinar si
son iguales.*/

fun cadenas_iguales(cad1:String, cad2:String):Boolean{
    return cad1.equals(cad2)
}

//ejercicio 3
/*3. Utiliza el método compareTo para comparar
dos cadenas y muestra el resultado.*/
fun compara_cadenas(cad1:String, cad2:String):Int{
    return cad1.compareTo(cad2)
}

//ejercicio4
/*4. Toma una cadena y conviértela
completamente a mayúsculas.*/
fun cadenaToCap(cadena:String):String{
    return cadena.uppercase()
}

//ejercicio5
/*5. Haz lo mismo, pero esta vez conviértela
completamente a minúsculas.*/
fun cadenaToMinus(cadena:String):String{
    return cadena.lowercase()
}

//ejercicio6
/*6. Toma una cadena con espacios al principio y al
final. Utiliza trim para eliminar esos espacios.*/
fun cadenaTrim(cadena:String):String{
    return cadena.trim()
}

//ejercicio7
/*7. Dada una cadena larga, extrae una subcadena
de la posición 5 a la 10.*/
fun cadenaSubCadena(cadena:String):String{
    return cadena.substring(5,10)
}

//ejercicio8
/*8. Reemplaza todas las ocurrencias de un cierto
carácter en una cadena con otro carácter.*/
fun cadenaReemplaza(cad1:String, busca:String, reemplaza:String):String{
    return cad1.replace(busca, reemplaza)
}

//9. Divide una cadena en un array de subcadenas
//utilizando un carácter específico como separador.
fun cadenaToArray(cad:String, separador:Char): List<String> {
    return cad.split(separador)
}

/*10. Crea dos cadenas y únelas usando el operador
+.*/

fun concatena(cad1:String, cad2:String):String{
    return cad1+cad2
}

/*11. Crea una cadena de formato que incluya
marcadores de posición y luego rellenarlos con
valores.*/

var formateame= "Hola, %s. Eres %s"
var cad1="picha"
var cad2="subnormal"
fun teFormateo(formateamo:String, cad1:String, cad2:String): String {
    return formateame.format(cad1, cad2)
}

/*12. Utiliza substring para extraer una parte de una
cadena, especificando los índices de inicio y final.*/

fun cadenaSubCadena_ej12(cadena:String, ini:Int, fin:Int):String{
    return cadena.substring(ini,fin)
}

/*13. Define dos variables a y b con valores nulos e intenta
realizar operaciones matemáticas (suma, resta,
multiplicación) con ellas. Maneja adecuadamente los casos
de valores nulos*/

var a = null
var b = null
fun operaciones_con_nulos(a:Int?, b:Int?, operacion:String):Int{
    when(operacion){
        "+" -> {
            return a!! + b!!
        }
        "-" -> {
            return a!! - b!!
        }
        "*" -> {
            return a!! * b!!
        }
        else -> return 0
    }
}

/*14. Utiliza el operador elvis (?:) para asignar un valor
predeterminado a una variable si esta es nula.*/
fun elvis(a:Int?):Int{
    return a?:0
}


/*15. Crea una función que tome un parámetro de tipo Any y
comprueba si es de tipo String. Si es así, imprime su longitud.
Utiliza smart cast para trabajar de manera segura con el tipo*/
fun esString(a:Any){
    if(a is String){
        println(a.length)
    }
}
/*16. Escribe una función que divida dos números ingresados
por el usuario. Implementa el manejo de excepciones para el
caso en que el divisor sea cero o si se ingresa un valor no
numérico.*/
fun divide() {
    try {
        print("Número 1: ")
        val dividendo = readLine()?.toDoubleOrNull()
        if (dividendo == null) {
            throw IllegalArgumentException("Debe ser un número")
        }
        print("Número 2: ")
        val divisor = readLine()?.toDoubleOrNull()
        if (divisor == null) {
            throw IllegalArgumentException("Debe ser un número")
        }
        if (divisor == 0.0) {
            throw ArithmeticException("No se puede dividir entre cero")
        }
        val resultado = dividendo / divisor
        println("Resultado: $resultado")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
    }
}

/*17. Utiliza readLine() para leer una entrada del usuario. Asegúrate
de manejar el caso en que el usuario ingrese algo que no pueda
convertirse a un tipo específico.*/
fun leeTecladoYconvierte(tipo:String):Any{
    var escribe = readLine()
    when(tipo){
        "Int" -> {
            return escribe!!.toInt()
        }
        "Double" -> {
            return escribe!!.toDouble()
            }
        "Float" -> {
            return escribe!!.toFloat()
        }
        "Long" -> {
            return escribe!!.toLong()
        }
        else -> {
            return escribe!!
        }
    }
}

/*18. Crea una función que acepte dos números y realice operaciones
matemáticas básicas (suma, resta, multiplicación, división). Maneja
casos especiales, como la división por cero.*/

fun operaciones_basicas(a:Int, b:Int, operacion:String): Int {
    try {
        when (operacion) {
            "+" -> {
                return a + b
            }
            "-" -> {
                return a - b
            }
            "*" -> {
                return a * b
            }
            "/" -> {
                return a / b
            }
            else -> return 0
        }
    }
    catch (e:ArithmeticException){
        throw ArithmeticException("No se puede dividir entre cero")
    }
}

/*19. Declara una variable de tipo Any y realiza un casting seguro e
inseguro a otros tipos. Maneja los casos donde el casting inseguro
podría generar una excepción*/

fun ej19(a:Any){
    when(a){
        a as Int -> {
            println(a as Int)
        }
        a as String -> {
            try{
                println(a as String)
            }
            catch(e:Exception){
                throw Exception("No se puede castear a String")
            }
        }
        a as Double -> {
            println(a as Double)
        }
    }
}


/*20. Escribe un bloque try que contenga código propenso a errores.
En el bloque catch, maneja las excepciones y, en el bloque finally,
imprime un mensaje independientemente de si se lanzó una
excepción o no.*/
fun ejemploTryCatchFinally() {
    var resultado: Int? = null
    try {
        val numeroString = "abc"
        val num = numeroString.toInt()
        resultado = 10 / num // Esto podría lanzar una ArithmeticException si numero es 0
        println("El resultado es: $resultado") // Esto no se ejecutará si hay una excepción
    } catch (e: NumberFormatException) {
        println("Error: No se pudo convertir la cadena a un número.")
        resultado = null
    } catch (e: ArithmeticException) {
        println("Error: División por cero.")
        resultado = null
    } finally {
        println("Bloque finally ejecutado. El valor de resultado es: $resultado")
    }
}
/*21. Crea una clase Point con propiedades x e y. Implementa una función infix
que calcule la distancia entre dos puntos.*/
class Punto(val x: Double, val y: Double){
    infix fun distancia(otroPunto: Punto): Double {
        val dx = otroPunto.x - this.x
        val dy = otroPunto.y - this.y
        return Math.sqrt((dx * dx) + (dy * dy))
    }
}
/*22. Define una variable lazy que almacene la suma de dos números. La suma
debe calcularse solo cuando se accede a la variable. Luego, usa lateinit para
inicializar una variable de tipo String antes de asignarle un valor.*/
class LazyLateinit {

    val suma: Int by lazy {
        println("suma...")
        5 + 10
    }

    lateinit var mensaje: String
    fun inicializarMensaje() {
        mensaje = "mensaje de prueba"
    }
    fun mostrarMensaje() {
        println(mensaje)
    }
}
fun probar() {
    val ejemplo = LazyLateinit()
    println("Antes de acceder a la suma")
    println("La suma es: ${ejemplo.suma}")
    println("Después de acceder a la suma")
    ejemplo.inicializarMensaje()
    ejemplo.mostrarMensaje()
}
/*23. Utiliza la función with para configurar un objeto StringBuilder. Agrega tres
líneas de texto al objeto y luego imprime el resultado.*/
fun prueba_with() {
    val resultado = with(StringBuilder()) {
        append("Caca.\n")
        append("Perro.\n")
        append("Coche.\n")
        toString()
    }
    println(resultado)
}
/*Crea una clase Persona con propiedades como nombre, edad, y direccion. Utiliza
la función apply para construir una instancia de Person con valores
específicos*/

data class Persona(var nombre: String = "", var edad: Int = 0, var direccion: String = "")

fun prueba_apply() {
    val persona = Persona().apply {
        nombre = "Juanito de los Palotes"
        edad = 69
        direccion = "Calle Falsa 123"
    }
    println(persona)
}

/*25. Define una función calculateArea que toma la longitud y el
ancho de un rectángulo y devuelve su área. Luego, utiliza run
para imprimir el área de un rectángulo específico.*/
fun calculateArea(longitud: Double, ancho: Double): Double {
    return longitud * ancho
}
fun prueba_run() {
    val area = run {
        val longitud = 5.0
        val ancho = 3.0
        calculateArea(longitud, ancho)
        }
    println("El área del es: $area")
}
/*26. Declara una cadena nullable y utiliza la función let para
imprimir su longitud solo si no es nula.*/
fun prueba_let() {
    val cadena: String? = null
    cadena?.let {
        println("La longitud de la cadena es: ${it.length}")
    }
}
/*27. Crea una lista de números y utiliza la función also para
imprimir un mensaje antes y después de aplicar una
operación a cada elemento de la lista.*/
fun prueba_also() {
    val numeros = listOf(55, 21, 63, 94, 5)
    numeros.also {
        println("Lista original: $it")
    }.map {
        it * 2
    }.also {
        println("Lista modificada: $it")
    }
}




























