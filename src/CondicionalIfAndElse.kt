fun main(args: Array<String>) {

    var Numero_1 = 34
    var Numero_2 = 87
    var Numero_3 = 85

    if (Numero_1 > Numero_2 && Numero_1 > Numero_3){
        println("La variable mas grande es: $Numero_1")
    }else if(Numero_2 > Numero_1 && Numero_2 > Numero_3){
        println("La variable mas grande es: $Numero_2")
    }else{
        println("La variable mas grande es: $Numero_3")
    }
    println("\nEl programa ha finalizado.")

}