package org.example.collections

fun main() {
//    val sampleList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    println("Before: $sampleList")
//    for( i in 0 until sampleList.size) {
//        println(sampleList[i])
//    }
//
//    sampleList.add(11)
//    sampleList.add(12)
//    sampleList.remove(10)
//    println("After: $sampleList")

//    val sampleSet: MutableSet<String> = mutableSetOf("A", "B", "A")
//    println(sampleSet.size)
//    sampleSet.forEach { println(it) }
//
//    println("Check if C is in sampleSet: " + sampleSet.contains("C"))
//    sampleSet.add("C")
//
//    for(s in sampleSet) {
//        println("$s ")
//    }

    val sampleMap: MutableMap<String, String> = mutableMapOf("a" to "A", "b" to "B", "c" to "C")

    for(e in sampleMap) {
        println("key: ${e.key} value: ${e.value}")
    }

    println(sampleMap.size)
    sampleMap.put("c", "C")

    println(sampleMap)
}