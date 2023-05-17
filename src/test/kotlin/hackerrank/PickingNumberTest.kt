package hackerrank

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test


class PickingNumberTest {

    @Test
    fun test1() {
        val testArray = arrayOf(4, 6, 5, 3, 3, 1)
        assertThat(PickingNumber.solution(testArray)).isEqualTo(3)
    }

    @Test
    fun test2() {
        val testArray = arrayOf(1, 2, 2, 3, 1, 2)
        assertThat(PickingNumber.solution(testArray)).isEqualTo(5)
    }

}