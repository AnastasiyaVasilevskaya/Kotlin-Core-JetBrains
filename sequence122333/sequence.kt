fun main() {
    val count = readln().toInt()
    var num = 1
    var i = 1
    while (i <= count){
        repeat(num){
            if (i <= count) { print("$num ")}
            i++
        }
        num++
    }
}