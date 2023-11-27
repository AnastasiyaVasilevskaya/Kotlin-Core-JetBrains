fun main() {
    val num = readln().toInt()
    var a = 1
    while(a * a <= num){
        val sq = a * a
        println (sq)
        a++
    }
}