package `1ex`

import kotlin.math.sqrt

class Main3ex {

    fun decomposeNumber(number: Int): Array<Int>? {
        if (number > 5) {
            val numberLong = number.toLong()
            val seq = decomposeNumberMethod((numberLong * numberLong))
            val seqResult = ArrayList<Long>()
            seqResult.addAll(seq)
            println(seq) //TODO Delete
            var count = 0
            if (number > 1000000 && number < 7000000){
                count++
            } else if (number > 1000000 && number > 7000000) {count = count + 2}

            while (reDecompose(seq)) {
                var numFromDecomp = seq.sum()
                seqResult.clear()
                for (i in 0..count) { //TODO Think about it
                    seqResult.add(seq[i])
                    numFromDecomp = numFromDecomp - seq[i]
                }
                val seq2 = decomposeNumberMethod(numFromDecomp)
                println(seq2)
                seqResult.addAll(seq2)
                seq.clear()
                seq.addAll(seqResult)
                count++
            }
            println(seq) //TODO Delete

            seqResult.reverse()
            val resultArr = Array(seqResult.size) { 0 }
            var countArr = 0
            for (i in seqResult) {
                resultArr[countArr] = sqrt(i.toDouble()).toInt()
                countArr++
            }

            for (i in resultArr) {
                println(i)
            } //TODO Delete

            return resultArr
        } else return null
    }

    fun decomposeNumberMethod(number: Long): ArrayList<Long> {

        var elemOfSequence = 0L
        val firstElemOfSequence = sqrt(number.toDouble()).toLong() - 1L
        val arrElemOfSequence: ArrayList<Long> = arrayListOf(firstElemOfSequence * firstElemOfSequence)

        while (number > arrElemOfSequence.sum()) {
            var remainderOfMinus = number - arrElemOfSequence.sum()
            elemOfSequence = sqrt(remainderOfMinus.toDouble()).toLong()
            arrElemOfSequence.add(elemOfSequence * elemOfSequence)
        }
        return arrElemOfSequence
    }

    fun reDecompose(arr: ArrayList<Long>): Boolean {
        var rez = false
        for (i in 0..arr.size - 2) {
            if (arr[i] == arr[i + 1]) {
                rez = true
                break
            }
        }
        return rez
    }


}
fun main() {
    val myObjects:Main3ex = Main3ex()
    myObjects.decomposeNumber(5000000)

}



