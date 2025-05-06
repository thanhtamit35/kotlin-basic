package org.example.extension_function

/**
 * Tính năng extension function cho phép mở rộng logic của 1 class và tái sử dụng chúng 1 cách hiệu quả mà
 * không phải kế thừa class đó.
 * Điểm giới hạn của extension function là nó không thể truy cập vào các thuộc tính private của class
 * Bản chất của extension function là 1 static function được viết gọn lại để dễ sử dụng và debug
 */

fun String.countVowels(): Int {
    var count: Int = 0

    for (char in this) {
        if (char in "aeiouAEIOU") {
            count++
        }
    }

    return count
}

fun main() {
    val word = "Hello"
    println("The word '$word' has ${word.countVowels()} vowel(s).")
}