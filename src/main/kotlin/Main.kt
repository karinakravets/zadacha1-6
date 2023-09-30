fun main() {
    print("Введите 1 число: ")
    val str1 = readln()
    print("Введите 2 число: ")
    val str2 = readln()
    println("Нечетные числа из чисел: " + shestaya(str1, str2))
}
fun shestaya(a: String, b: String): String {
    var str1: String? = null
    var str2: String? = null
    if ("$a$b".toInt() % 2 != 0) {
        str1 = "$a$b"
    }
    if ("$b$a".toInt() % 2 != 0) {
        str2 = "$b$a"
    }
    var result = ""
    if (str1 == null && str2 == null) return "Создать нечетное число невозможно"
    if (str1 != null) result += str1
    if (str2 != null) {
        if (str1 != null) result += " "
        result += str2
    }
    return result
}
