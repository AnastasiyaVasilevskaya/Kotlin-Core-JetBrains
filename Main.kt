fun main() {
    val index = readln().toInt()
    val word = readln()
    val mess = "There isn't such an element in the given string, please fix the index!"
    println(if (index < 0 || index >= word.length) mess else word[index])
}