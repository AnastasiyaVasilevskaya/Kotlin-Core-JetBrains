fun main() {
    print ("Input the length of the sequence ")
    val n = readln().toInt()
    var count = 0
    repeat(n){
        val a = readln().toInt()
        if (a > 0) count++ else count
    }
    println("Number of positive elements is $count")
}