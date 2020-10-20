fun main(args: Array<String>) {

    var MiCaracter: Char = '@'
    println(MiCaracter)

    /*Tambien podria agregar caracteres unicode en hexadecimal, para representar un caracter en concreto*/
    var CaracterUnicode: Char = '\uFA10'
    println (CaracterUnicode)

    var MiCadenaString: String = "Hola Juan"
    println (MiCadenaString)

    var CaracterNum: Char = '5'
    println (CaracterNum)

    var CaracterToInt: Int = CaracterNum.toInt() - 4
    println (CaracterToInt)

    var SumarCadena: Int = CaracterToInt + 5
    println (SumarCadena)

    /*Cadenas de caracteres y sus propiedades*/

    var MiNombre: String = "Juan José"
    println(MiNombre[6])


}