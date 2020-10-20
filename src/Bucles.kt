/*
* El bucle for es el que se utiliza más habitualmente y
* en Kotlin es un poco distinto a como es en Java, aquí
* tenemos una variable que itera sobre un rango o sobre
* una lista, array, map,… y como tal en cada iteración
* toma el siguiente valor.
*
* */

/*
* Por ejemplo para imprimir los números del 1 al 5 podemos
* hacer un bucle for en el que indiquemos el rango 1..5 y no
* tenemos que preocuparnos de declarar el índice ni de actualizarlo.
* */
/*
for(num in 1..5) {
    println("numero: $num")
}

/* Resultado:
numero: 1
numero: 2
numero: 3
numero: 4
numero: 5
*/


//Bucle While

/*
Con while podemos hacer que se ejecute un bloque de código determinado hasta
que se cumpla una condición.

Cuando usamos este tipo de bucles hay que tener cuidado para evitar producir
bucles infinitos no deseados, para lo que necesitamos que dentro del bucle se
actualice el valor que usemos en la condición de salida bajo alguna circunstancia.

En el siguiente ejemplo se ejecuta el bucle mientras (while) el día sea menor
que 6 y cuando deja de cumplirse termina.
*/
/*
var dia= 1
println("Empiza la semana")
while(dia < 6) {
    if  (dia == 1) {
        println("$dia dia trabajando")
    } else {
        println("$dia dias trabajando")
    }

    dia++ // Actualizamos la condicion
}
println("A descansar")

/* Resultado:
Empiza la semana
1 dia trabajando
2 dias trabajando
3 dias trabajando
4 dias trabajando
5 dias trabajando
A descansar
*/

//Bucles do While

/*
* Los bucles do while son muy similares a los bucles while, puesto que en ambos
* se evalúa una condición y mientras se siga cumpliendo se seguirá ejecutando.
* La diferencia reside en que con while la condición se evalúa antes de entrar
* al bucle por lo que existe la posibilidad de que no se entre nunca si no se
* cumple la condición, mientras que con el do while la comprobación se hace
* después de cada iteración asique al menos se va a ejecutar una vez.

Por ejemplo si queremos que el usuario introduzca un numero dentro de un rango
* el do while es una buena opción porque se ejecutará al menos una vez y si mete
* un número no valido pues seguimos en el bucle hasta que se decida a poner uno correcto.
* */
/*
var numero:Int
do {
    println("Introduce un numero entre 1 y 100")
    numero = readLine()!!.toInt()
} while(numero !in 1..100) // numero < 1 || numero > 100
println("Gracias")

/* Resultado:
Introduce un numero entre 1 y 100
423
Introduce un numero entre 1 y 100
-71
Introduce un numero entre 1 y 100
7
Gracias
*/


//Como salir de un bucle en Kotlin (break y continue)

/*
* A veces queremos que un bucle deje de ejecutarse antes de que termine si se
* da alguna condición o también puede ser que queramos que no se ejecute el
* contenido del bucle en algunos casos pero sí que queremos que el bucle
Saltar a la siguiente iteración con continue

Con continue podemos hacer que se deje de ejecutarse el código dentro del bucle
* y que se pase directamente a la siguiente iteración, por ejemplo, si queremos
* hacer en Kotlin un bucle que solo imprima los números impares podríamos hacerlo
* continue de la siguiente forma:
* */
/*
for (num in 1..10) {
    if (num % 2 == 0) {
        continue
    }
    print("$num ")
}

/* Resultado:
1 3 5 7 9
*/

//Como el flujo de ejecución se interrumpe al llegar al continue solo se ejecuta el
// print("$num ") cuando el número no es par.

/*
* Salir de un bucle con break

Mientras que con continue seguimos dentro del bucle con
* break se sale completamente aunque aún no se haya cumplido
* la condición para que termine. Vamos con otro ejemplo con números,
* supongamos que queremos que se impriman todos los números de un rango,
* pero si encontramos un múltiplo de 5 el bucle tiene que terminarse.
* */
/*
for (num in 1..10) {
    if (num % 5 == 0) {
        break
    }
    print("$num ")
}

/* Resultado:
1 2 3 4
*/