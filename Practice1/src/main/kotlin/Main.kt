import kotlin.math.PI
import kotlin.math.sqrt
import kotlin.math.*


fun main(args: Array<String>) {
    val exercises: Int = 13
    var exercisesSolved: Int = 0
    exercisesSolved +=1
    val agE: Int = 18
    exercisesSolved +=1
    var middleAge: Double = 18.0
    middleAge = (middleAge + 30) / 2
    exercisesSolved +=1
    val testNumber: Int = 33
    val evenOdd: Int = testNumber % 2
    exercisesSolved +=1
    var answer:Int = 0
    answer +=1
    answer +=10
    answer *=10
    answer shr 3
    exercisesSolved +=1
    var age: Int = 0
    age = 16
    //println(age)
    age = 30
    //println(age)
    exercisesSolved +=1
    val a:Int = 46
    val b:Int = 10
    val answer1:Int = (a * 100) + b
    val answer2:Int = (a * 100) + (b * 100)
    val answer3:Int = (a * 100) + (b/10)
    /*println(answer1)
    println(answer2)
    println(answer3)*/
    exercisesSolved +=1
    ((5 * 3) - ((4 / 2) * 2))
    exercisesSolved +=1
    val a1: Double = 7.0
    val b1: Double = 12.0
    val average: Double = a1 % b1
    exercisesSolved +=1
    val fahrenheit: Double = 10.0
    val celsius: Double = (fahrenheit - 32)/1.8
    exercisesSolved +=1
    val position: Int = 35
    val row: Int = position / 8
    val column: Int = position % 8
    exercisesSolved +=1
    val degrees:Double=45.0
    val radians:Double= PI*degrees/180
    exercisesSolved +=1
    val x1:Double = 1.0
    val x2:Double = 5.0
    val y1:Double = 2.0
    val y2:Double = 6.0
    val distance:Double = sqrt (((x2-x1).pow(2))+((y2-y1).pow(2)))
    println(distance)

}
