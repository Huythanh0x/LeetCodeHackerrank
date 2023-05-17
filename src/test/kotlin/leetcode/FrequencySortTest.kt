package leetcode

import org.junit.jupiter.api.Test
import com.google.common.truth.Truth.assertThat

class FrequencySortTest {
    @Test
    fun test1() {
        val intArray = intArrayOf(1, 1, 2, 2, 2, 3)
        val output = intArrayOf(3, 1, 1, 2, 2, 2)
        assertThat(FrequencySort.solution(intArray)).isEqualTo(output)
    }

    @Test
    fun test2() {
        val intArray = intArrayOf(2, 3, 1, 3, 2)
        val output = intArrayOf(1, 3, 3, 2, 2)
        assertThat(FrequencySort.solution(intArray)).isEqualTo(output)
    }

    @Test
    fun test3() {
        val intArray = intArrayOf(-1, 1, -6, 4, 5, -6, 1, 4, 1)
        val output = intArrayOf(5, -1, 4, 4, -6, -6, 1, 1, 1)
        assertThat(FrequencySort.solution(intArray)).isEqualTo(output)
    }
}