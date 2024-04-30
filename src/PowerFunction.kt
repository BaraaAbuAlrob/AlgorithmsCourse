import kotlin.system.measureNanoTime

fun main() {

    val y = 5
    val thePower:Int

    val elapsed = measureNanoTime  {
        thePower = iterativePower(2,y)
    }
    println("Elapsed time for x = 2, y = $y is: \"$elapsed ns\" --- The Power is $thePower")

}

fun iterativePower (x: Int, y: Int) : Int{
    var p = 1.0
    for (i in y downTo 1 step 1)
        p *= x
    return p.toInt()
}

fun recursivePower (x: Int, y: Int) : Int{
    if (y==1)
        return x
    return x * recursivePower(x, y-1)
}