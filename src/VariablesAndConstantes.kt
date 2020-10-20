/*
* Kotlin es un lenguaje de programación tipado estáticamente (la comprobación de
* los tipos se hace en tiempo de compilación) para aplicaciones multiplataforma
* que es 100% interoperable con Java y Android y que se ejecuta en la JVM (Java
* Virtual Machine) y que también se puede transpilar a javaScript para hacer
* aplicaciones para navegadores, vamos un lenguaje de programación para toodo,
* la verdad es que suena bien… además Google lo ha hecho oficial para Android
* así que por lo menos en este ámbito va a ser importante.
* */

/*La forma de definir métodos o funciones en Kotlin es con fun y
el modificador public no es necesario porque las funciones por
defecto son públicas, pero si no queremos que sea así pues podemos
usar private, protected, internal o public que como hemos dicho no
es necesario porque es el valor por defecto.

fun main(args: Array<String>){
    /*De esta forma, se declaran las variables en kotlin*/
    var EdadPerro = 4 //valor viejo
    EdadPerro = 8 // nuevo valor
    println(EdadPerro)

    /*Voy a declarar una variable constante,
    es un tipo de dato que no cambiara con el tiempo*/
    val Perro = "Rocky"
    println(Perro)
}

* Y si, lo de interoperable quiere decir que desde el código Java se puede
* llamar al código escrito en Kotlin y viceversa ya que ambos generan el
* mismo bytecode y por eso Kotlin se puede ejecutar en la máquina virtual de Java.

* Para empezar en Kotlin no es necesario declarar una clase, ya que se pueden
* crear funciones a nivel de package (top level functions), que para casos
* como el main o para las típicas funciones de «utilidad» que solemos tener
* en todos los proyectos pues está bien porque no es necesario que toodo sean
* clases y si se meten dentro de una clase es precisamente porque no hay otra
* opción (Kotlin las convierte en clases por detras).

* En Kotlin hay 2 tipos de variables, las variables «de verdad» que se
* definen con var, ej. var diasMes: Int y cuyo valor se puede modificar
* tantas veces como queramos a lo largo de la ejecución del programa y
* con val las variables de asignación única val dni: String a las que
* solo se les puede asignar un único valor y a partir de ese momento
* actúan como variables de solo lectura y no se pueden modificar,
* vamos como si fuesen constantes.

//Variables en Kotlin var o val

* La decisión de usar var o val depende del uso que queramos darle, pero
* resumiendo podríamos decir que si es para almacenar una constante debemos
* usar val y lo mismo si es un dato que queramos garantizar que no se modifique,
* y para el resto nos quedamos con var.

//Definir los tipos de las variables en Kotlin

* El tipo de la variable en Kotlin se especifica después del nombre de la variable
* y precedido de «:«, vamos a ver cuáles son los tipos básicos que tenemos en Kotlin:
*
*     Tipos númericos:
        Int: Para enteros de hasta 32bits. Ej. val diasSiglo: Int = 36526
        Long: Para enteros de hasta 64bits. Ej. val distanciaLunaMetros: Long = 384400000L
        Short: Para enteros de hasta 16bits. Ej. val diasAno: Byte = 3650
        Byte: Para enteros de hasta 8bits. Ej. var edad: Byte = 30
        Float: Para decimales de hasta 32bits. Ej. var peso: Float = 86.7F
        Double: Para decimales de hasta 64bits. Ej. var temperatura: Double = 12.23
    Char: Para almacenar caracteres de forma individual. Ej. var letraDNI: Char = 'D'
    Boolean: Para almacenar los valores lógicos true y false. Ej. val esUnaVariable: Boolean = true
    String: Permite almacenar cadenas de caracteres. Ej. var nombre: String = "Ivan"
    Arrays: Permite almacenar listas de objetos. Ej. val misColoresFavoritos = arrayOf("naranja", "azul", "rojo", "negro")*/