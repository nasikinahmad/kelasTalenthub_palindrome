fun isPalindrome(str: String): Boolean {
    val cleanStr = str.toLowerCase().replace(Regex("[^a-z0-9]"), "")
    return cleanStr == cleanStr.reversed()
}

fun main() {
    val input = "katak"
    if (isPalindrome(input)) {
        println("$input adalah palindrome.")
    } else {
        println("$input bukan palindrome.")
    }
}
