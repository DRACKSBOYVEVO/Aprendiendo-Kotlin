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
es necesario porque es el valor por defecto.*/

fun main(args: Array<String>){
    /*De esta forma, se declaran las variables en kotlin*/
    var EdadPerro = 4 //valor viejo
    EdadPerro = 8 // nuevo valor
    println(EdadPerro)

    /*Voy a declarar una variable constante,
    es un tipo de dato que no cambiara con el tiempo*/
    val NombrePerro = "Rocky"
    println(NombrePerro)
}

/*
* Y si, lo de interoperable quiere decir que desde el código Java se puede
* llamar al código escrito en Kotlin y viceversa ya que ambos generan el
* mismo bytecode y por eso Kotlin se puede ejecutar en la máquina virtual de Java.
* */

/*
* Para empezar en Kotlin no es necesario declarar una clase, ya que se pueden
* crear funciones a nivel de package (top level functions), que para casos
* como el main o para las típicas funciones de «utilidad» que solemos tener
* en todos los proyectos pues está bien porque no es necesario que toodo sean
* clases y si se meten dentro de una clase es precisamente porque no hay otra
* opción (Kotlin las convierte en clases por detras).
* */