package com.example.ejerciciost5

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





