package hackerrank.hackerrank30days

import kotlin.math.round

fun day2() {
    val meal_cost = readLine()!!.trim().toDouble()

    val tip_percent = readLine()!!.trim().toInt()

    val tax_percent = readLine()!!.trim().toInt()

    solve(meal_cost, tip_percent, tax_percent)
}

fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit {
    val tip = meal_cost / 100 * tip_percent
    val tax = meal_cost / 100 * tax_percent
    print(round(meal_cost + tip + tax).toInt())

}

fun day6() {
    val numberOfInput = readLine()?.toInt()
    numberOfInput?.let {
        for (index in 0 until numberOfInput) {
            val inputString = readLine()
            println(inputString?.filterIndexed { idx, _ -> idx % 2 == 0 } + " " + inputString?.filterIndexed { idx, _ -> idx % 2 == 1 })
        }
    }
}

fun day8() {
    val numberOfInput = readLine()!!.toInt()
    val phoneBookMap = mutableMapOf<String, String>()
    for (idx in 0 until numberOfInput) {
        val inputString = readLine()
        val (name, phoneNumber) = inputString!!.split(" ")
        phoneBookMap[name] = phoneNumber
    }
    while (true) {
        val query = readLine() ?: break
        if (phoneBookMap[query] != null) {
            println("$query=${phoneBookMap[query]}")
        } else {
            println("Not found")
        }
    }
}

fun day9() {
    val n = readLine()!!.trim().toInt()

    val result = factorial(n)

    println(result)
}

fun factorial(n: Int): Int {
    if (n > 1) return n * factorial(n - 1)
    else return 1
}

fun day10() {
    val inputNumber = readLine()!!.trim().toInt()
    val base2Number = getBase2Number(inputNumber)
    for (longestChar in base2Number.length downTo (0)) {
        if ("1".repeat(longestChar) in base2Number) {
            print(longestChar)
            break
        }
    }
}

fun day11() {
    val arr = Array(6) { Array(6) { 0 } }
    for (i in 0 until 6) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }
    var maxSum = Int.MIN_VALUE
    for (i in 0 until 6 - 2) {
        for (j in 0 until 6 - 2) {
            val hourglassArr = arr.sliceArray(i..i + 2).map { it.sliceArray(j..j + 2) }.toTypedArray()
            val currentSum = getHourglassSum(hourglassArr)
            if (currentSum > maxSum) {
                maxSum = currentSum
            }
        }
    }
    print(maxSum)
}


fun getHourglassSum(hourglass: Array<Array<Int>>): Int {
    return hourglass.flatten().filterIndexed { idx, _ -> idx != 3 && idx != 5 }.sum()
}

fun getBase2Number(base10Number: Int): String {
    var number = base10Number
    var result = ""
    while (number > 1) {
        result += if (number % 2 == 1) {
            "1"
        } else {
            "0"
        }
        number /= 2
    }
    if (number == 1) result += "1"
    return result
}

fun sampleReadInput() {
    val numberOfInput = readLine()!!.toInt()
    for (index in 0 until numberOfInput) {
        val inputString = readLine()

    }
}