package leetcode

//    https://leetcode.com/problems/sort-array-by-increasing-frequency/
object FrequencySort {
    fun solution(nums: IntArray): IntArray {
        val sortedNums = nums.sortedByDescending { it }
        val hashMap = mutableMapOf<Int, Int>()
        for (num in sortedNums) {
            hashMap[num] = (hashMap[num] ?: 0) + 1
        }
        val result = mutableListOf<Int>()
        hashMap.toList().sortedBy { it.second }.forEach { pair ->
            println(pair)
            repeat(pair.second) {
                result.add(pair.first)
            }
        }
        return result.toIntArray()
    }
}