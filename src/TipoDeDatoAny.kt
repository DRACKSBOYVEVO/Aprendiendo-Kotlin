fun main(args: Array<String>) {
    /*Este es un dato muy interesante, ya que pone a prueba a kotlin.

    Aqui podemos ver el tipo de dato "Any"
    que nos sera de mucha ayuda cuando estemos desarrollando, no importa el dato que nosotros le demos a Any, igual kotlin solo va a imprimir el dato que paresca mas adecuado.*/

    /*Float*/
    var EjemploAny:Any = 18.18F
    println(EjemploAny)

    /*Entero / Int*/
    var AnyEntero: Any = 21
    println (AnyEntero)

    /*String / Cadena de texto*/
    var AnyString: Any = "Hola Aakaanksha!"
    println (AnyString)

    /*Ahora bien, por que ocurre esto? o.O*/

    /*La razón es por que kotlin, Automaticamente decide por medio de la asignación, que tipo de dato sera. */

    //IMPORTANTE!

    /*Cuando vas empezando, no es muy adecuado utilizarlo por que suele ocasionar algunos problemas logicos, suele utilizarse este terlino mas adelante cuando tengamos unas bases del lenguaje un poco mas amplias*/

}