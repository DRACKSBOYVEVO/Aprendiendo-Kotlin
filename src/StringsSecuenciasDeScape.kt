fun main(args: Array<String>) {
    /*strings de escape:

    /n Salto de linea
    \t Una tabulacion*/
    var MiNombre: String = "Hola Amigo\nComo te fue hoy?"
    println(MiNombre)

    /*Strings Puros*/

    var StringPuro: String = """
    Hola
    chicos
    Este es un ejemplo
    de multiples lineas 
    con un string puro
    """
    println(StringPuro)

    var Cadena_1: String = "Juan Jose"
    var Cadena_2: String = " Henao"
    /*Para saber la longitud de una cadena*/
    println (Cadena_1.length)
    /*Para concatenar Strings utilizo el +*/
    println (Cadena_1 + Cadena_2)


    var Nombre: String = "Juan"
    /*Primera forma*/
    println("Mi nombre es: " + Nombre)
    /*Segunda forma*/
    println("Mi Nombre es: $Nombre")

    /*Si quiero acceder a una parte de mi codigo, dentro de un string, tendria que utilizar los simbolos $ y {}*/

    println ("Mi nombre es $Nombre y Tiene ${Nombre.length} Caracteres")


    /*En caso de que quisiera utilizar un simbolo en particular, tendria que hacerlo de la siguiente manera.*/

    var Usuario: String = "Jose"
    var Dinero: Int = 200
    println ("Hola, me llamo $Usuario y tengo${'$'}$Dinero Dolares")
    /*Hola, me llamo Jose y tengo $200 Dolares*/
}