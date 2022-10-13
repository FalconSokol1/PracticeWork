import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>)
{
    //Задание 1
    val myAge:Int=18
    val isTeenager:Boolean = myAge >= 13 && myAge <= 19
    println(isTeenager)
    //Задание 2
    val theirAge:Int=30
    val bothTeenagers:Boolean = theirAge >= 13 && theirAge <= 19 && isTeenager
    println(bothTeenagers)
    //Задание 3
    val reader:String="Соколов"
    val author:String="Richard Lucas"
    val authorIsReader:Boolean=reader==author
    println(authorIsReader)
    //Задание 4
    val readerBeforeAuthor = reader<author
    println(readerBeforeAuthor)
    //Задание 5
    val myAge2:Int=18
    if (myAge2>=13&&myAge2<=19)
        println("Подросток")
    else println("Не подросток")
    //Задание 6
    val answer = if (myAge2>=13&&myAge2<=19) "Подросток" else "Не подросток"
    println(answer)
    //Задание7
    var counter:Int=0
    while (counter<10)
    {
        println(counter)
        counter+=1
    }
    //Задание 8
    counter=0
    var roll:Int=0
    do
    {
        roll= Random().nextInt(6)
        counter+=1
        println ("После $counter бросков, roll равен $roll")

    } while (roll!=0)
    //Задание 9
    val range = 1..10
    for (i in range)
        println (i*i)
    //Задание 10
    for (i in range)
        println(sqrt(i.toDouble()))
    //Задание 11
    var sum:Int = 0
    for (row in 1 until 8 step 2)
    {
        for (column in 0 until 8)
        {
            sum += row * column
        }
    }
    println("результат: $sum")
}