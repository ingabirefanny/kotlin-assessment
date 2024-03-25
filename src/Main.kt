fun main(){
    println(numbers(intArrayOf(20,30,40)))
    println(average(intArrayOf(20,30,40)))
    println(counting(intArrayOf(20,30,40)))
    println(volumeOfSphere(4.3,3.14,14,))
}

fun numbers(num: IntArray): Int{
    var num= intArrayOf(20,30,40)
    return num.sum()
}
fun  average(aver: IntArray): Double{
    var aver= intArrayOf(20,30,40)
    return aver.average()
}

fun counting(digits: IntArray): Int{
    var digits= intArrayOf(20,30,40)
    return digits.count()
}


fun volumeOfSphere(v: Double , r: Double,p: Int) : Double{
    var volume= v*p*r
    return volume

}



