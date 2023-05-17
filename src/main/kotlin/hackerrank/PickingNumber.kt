package hackerrank


//https://www.hackerrank.com/challenges/picking-numbers/problem?isFullScreen=true
object PickingNumber {
    fun solution(arr: Array<Int>): Int {
        var maxFreqNumber = 0
        var pickingNumber = 0
        for (number in arr) {
            if (arr.count { it == number } >= maxFreqNumber) {
                maxFreqNumber = arr.count { it == number }
                if (maxFreqNumber + arr.count { it == number + 1 } > pickingNumber) {
                    pickingNumber = maxFreqNumber + arr.count { it == number + 1 }
                } else if (maxFreqNumber + arr.count { it == number - 1 } > pickingNumber) {
                    pickingNumber = maxFreqNumber + arr.count { it == number - 1 }
                }
            }
        }
        return pickingNumber
    }
}
