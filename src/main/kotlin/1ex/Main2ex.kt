package `1ex`

import kotlin.math.sqrt

class Main2ex {


    companion object {

         fun decomposeNumber(number: Int): ArrayList<Int> {  //TODO изменить тип как было
            val sqNum = number
            var elemOfSequence = 0
            val firstElemOfSequence = sqrt(number.toDouble()).toInt() - 1
            var arrElemOfSequence: ArrayList<Int> = arrayListOf(firstElemOfSequence * firstElemOfSequence)
            val tempOfposition = 0

            while (sqNum > arrElemOfSequence.sum()) {
                var ostatok = sqNum - arrElemOfSequence.sum()
                elemOfSequence = sqrt(ostatok.toDouble()).toInt()
                arrElemOfSequence.add(elemOfSequence * elemOfSequence)
            }

            return arrElemOfSequence


        }

        fun reDec(arr: ArrayList<Int>): Boolean {
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
}
fun main() {
    val firstNum = 2
    val sqnum = firstNum * firstNum
    var seq = Main2ex.decomposeNumber(sqnum)
    var seqResult = ArrayList<Int>()
    seqResult.addAll(seq)
    print(seq)
    var count = 0

    while (Main2ex.reDec(seq)) {
        var numFromDecomp = seq.sum()
        seqResult.clear()
        for (i in 0..count) {
            seqResult.add(seq[i])
            numFromDecomp = numFromDecomp - seq[i]
        }
        val seq2 = Main2ex.decomposeNumber(numFromDecomp)
        print(seq2)
        seqResult.addAll(seq2)
        seq.clear()
        seq.addAll(seqResult)
        count++
    }
    print(seq)
}



