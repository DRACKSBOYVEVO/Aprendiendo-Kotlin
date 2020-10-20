/*
En Kotlin se pueden declarar funciones que estén dentro de clases como por ejemplo en Java,
pero también se pueden crear funciones que no estén dentro de ninguna clase o que estén
dentro de otra función, e incluso se pueden declarar funciones para extender las
funcionalidades de cualquier clase aunque no tengamos acceso al código fuente de
la clase en cuestión.

Realmente interesante, pero eso no es toodo también tenemos expresiones Lambda,
funciones de orden superior (funciones que pueden recibir como parámetros otras
funciones y/o devolverlas como resultado) o funciones de una sola línea.
* */

/*
//¿Cómo se declaran las funciones en Kotlin?

Para definir una función en kotlin tenemos que usar la palabra reservada
fun seguida del nombre de la función y entre paréntesis se pueden indicar
los parámetros que recibe la función en caso de que los tenga y finalmente
tenemos que indicar el tipo de retorno, las llaves {} y dentro pondremos
el contenido de nuestra función.
* */

//fun nombreFuncion(parametro1:Tipo, ..., parametroN:Tipo): TipoRespuesta {
    // Cuerpo de la funcion

//}


/*Si la función no devuelve nada el tipo de retorno es Unit,
    que es el equivalente al void de Java, aunque en estos casos
    se puede omitir el tipo sin ningún problema.*/

// Indicando que la función no devuelve nada
fun saludar(nombre: String): Unit {
    println("Hola, " + nombre)
}

// Sin indicar el tipo de retorno
fun despedirse(nombre: String) {
    println("Adios, " + nombre)
}

/*
* Para llamar a una función simplemente tenemos que poner su nombre, pasarle
* los parámetros que necesite y listo. Vamos a ver un ejemplo.
* */
/*Si, he puesto a propósito la llamada a una función con el tipo de retorno
Unit dentro de la cadena para que se vea que realmente devuelve un objeto
de esa clase aunque a efectos prácticos es como que no devuelva nada.*/
fun sumar(numero1: Int, numero2: Int): Int {
    return numero1 + numero2
}

fun esPar(numero: Int): Unit {
    if (numero % 2 == 0) {
        println("Si, el numero $numero es par")
    } else {
        println("No, el numero $numero es impar")
    }
}

fun main(args: Array<String>) {
    val numA = 2
    val numB = 5
    var resultado = sumar(numA, numB)

    println("$numA + $numB = $resultado => ¿Es par? ${esPar(resultado)}")
    // No, el numero 7 es impar
    // 2 + 5 = 7 => ¿Es par? kotlin.Unit
}

//Funciones de una sola línea en Kotlin

/*
* Si la función tiene una sola expresión se pueden omitir las llaves {}
* y en su lugar añadir un = seguido de la expresión. También se puede
* quitar el tipo de retorno si el compilador lo puede detectar automáticamente.
* */

fun sumar(numero1: Int, numero2: Int) = numero1 + numero2

fun mayor(numero1: Int, numero2: Int) = if (numero1 > numero2) numero1 else numero2

fun entreCeroYMax(numero: Int, max: Int) = numero in 0..max

fun main(args: Array<String>) {
    val numA = 2
    val numB = 5
    var suma = sumar(numA, numB)

    println("$numA + $numB = $suma")
    // 2 + 5 = 7

    var numeroMayor = mayor(numA, numB);
    // El numero mas grande de 2 y 5 es 5
    println("El numero mas grande de $numA y $numB es $numeroMayor")

    // ¿2 esta entre 0 y 5?
    println("¿$numA esta entre 0 y $numB? ${entreCeroYMax(numA,numB)}")
    // true
}

//Ahora, Pasar los parámetros de la función por nombre
/*Kotlin nos brinda la opción de pasar los parámetros desordenados
si se indica su nombre para no tener que utilizar la posición en la
que están definidos, también se puede utilizar simplemente para que
quede claro que es cada parámetro en una llamada a una función sin
tener que mirar ni la definición ni la documentación.*/

fun restar(numero1:Int, numero2:Int) = numero1 - numero2

fun main(args: Array<String>) {
    val resta = restar(numero2 = 20, numero1 = 5)
    println("El resultado de la resta es $resta")
    // El resultado de la resta es -15
}

//Parámetros con valores por defecto

/*
* Otra de las posibilidades que tenemos con las funciones en Kotlin
* es indicar valores por defecto para los parámetros.
*
Si se define un valor por defecto para un parámetro se puede hacer la llamada
* sin pasar dicho parámetro y en tal caso se utilizara el valor por defecto
* definido para el parámetro en la función.
*
Para asignar un valor por defecto hay que añadir el signo igual =
* seguido del valor por defecto detrás del parámetro.
* */


//En este ejemplo como hemos puesto como valor por defecto para el segundo parámetro
// 2 si llamamos a la función dividir con un solo parámetro hará la división entre 2.
fun dividir(numero1:Int, numero2:Int = 2) = numero1 / numero2

fun main(args: Array<String>) {
    val division1 = dividir(20, 5)
    println("El resultado de la division1 es $division1")
    // El resultado de la division1 es 4

    val division2 = dividir(20)
    println("El resultado de la division2 es $division2")
    // El resultado de la division2 es 10
}

//Ambitos de las funciones - Funciones de nivel superior

/*
* Las top level functions de Kotlin no son más que funciones que están
* definidas fuera de cualquier clase, objeto o interfaz, es decir
* que están definidas directamente a nivel de paquete.
* */

package com.poi

fun suma(numeroA: Int, numeroB: Int): Int {
    return numeroA + numeroB
}

/*
* Aunque normalmente vamos a querer tener las funciones dentro de alguna clase para tener
* 4un cierto orden, es habitual tener clases «de utilidad» que simplemente tienen métodos
* 4estáticos y que hacen ciertas operaciones que reutilizamos en múltiples sitios pero que
* 4no encajan en ninguna de nuestras clases, con este tipo de funciones Kotlin nos ofrece
* esos «métodos estáticos» de forma que vamos a poder llamar a la función sin tener que
* instanciar ninguna clase, simplemente tendremos que importar la función o funciones como
* si fuesen una clase más si la función esta un paquete distinto al de la llamada y ya las
* podemos utilizar.
* */

import com.poi.suma

fun main(args:Array<String>) {
    val numeroA = 2
    val numeroB = 5
    var resultado = suma(numeroA, numeroB)

    println("${numeroA} + ${numeroB} = ${resultado}")
}

//Funciones miembro

/*
* Las funciones miembro son las funciones que se definen dentro de una clase o un objeto.
* son funciones normales y corrientes que están dentro de una clase, interfaz, etc. y que
* para llamarlas debemos de poner por delante el nombre del objeto objeto.nombreFuncion()
* o el de la clase si es un método «estatico» (Companion object) y que además de los propios
* parámetros que pueda tener la función también pueden acceder a las propiedades de la clase.
* */

class Persona(var nombre: String, var edad: Int) {
    fun esMayorEdad(): Boolean = edad >= 18
}

fun main(args:Array<String>) {
    var alguien = Persona("Luis", 25)
    println("¿Es ${alguien.nombre} mayor de edad? ${alguien.esMayorEdad()}")
}

//Funciones locales

/*
* También es posible declarar funciones dentro de otras funciones. Las funciones
* locales pueden acceder a las variables declaradas en el mismo ámbito en el
* que están declaradas o en ámbitos superiores.
* */

fun eliminaPares(numeros: List<Int>): List<Int> {
    var resultado: MutableList<Int> = ArrayList()

    // Funcion local
    fun esPar(numero: Int): Boolean = (numero % 2 == 0)

    for (numero in numeros) {
        if (!esPar(numero)) {
            resultado.add(numero)
        }
    }

    return resultado
}

fun main(args:Array<String>) {
    val numeros: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numeroImpares = eliminaPares(numeros)
    println("Numeros impares: ${numeroImpares}")
    // Numeros impares: [1, 3, 5, 7, 9]
}





