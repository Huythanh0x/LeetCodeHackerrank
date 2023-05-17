package leetcode

//https://leetcode.com/problems/4sum/
object FourSum {
    fun solution(nums: IntArray, target: Int): List<List<Long>> {
        val newNums = nums.map { it.toLong() }.sorted()

        val hashMap = mutableMapOf<Long, Int>()
        for ((idx, num) in newNums.withIndex()) {
            hashMap[num] = idx
        }

        val results = mutableSetOf<List<Long>>()
        for (a_i in newNums.indices) {
            for (b_i in a_i + 1 until newNums.size) {
                for (c_i in newNums.size - 1 downTo (b_i)) {
                    val findingValue = target.toLong() - (newNums[a_i] + newNums[b_i] + newNums[c_i])
                    val foundIndex = hashMap[findingValue]
                    foundIndex?.let { foundIndex ->
                        if (foundIndex != a_i && foundIndex != b_i && foundIndex != c_i && a_i != b_i && b_i != c_i && c_i != a_i) {
                            val subResult =
                                listOf(newNums[a_i], newNums[b_i], newNums[c_i], findingValue).sorted()
                            results.add(subResult)
                        }
                    }
                }
            }
        }
        return results.toList()
    }
}