package `1ex`

import kotlin.math.sqrt

class Main1ex {


    companion object {
         fun decomposeNumber(number: Int): ArrayList<Int> {  //TODO изменить тип как было
            val sqNum = number * number
            var elemOfSequence = 0
            val firstElemOfSequence = number - 1
            var arrElemOfSequence: ArrayList<Int> = arrayListOf(firstElemOfSequence * firstElemOfSequence)
            val tempOfposition = 0

            while (sqNum > arrElemOfSequence.sum()) {
                var ostatok = sqNum - arrElemOfSequence.sum()
                elemOfSequence = sqrt(ostatok.toDouble()).toInt()
                arrElemOfSequence.add(elemOfSequence * elemOfSequence)
            }

            print(arrElemOfSequence)
            return arrElemOfSequence


        }
    }
}
fun main() {
    val firstNum = 50
    var seq = Main1ex.decomposeNumber(firstNum)
    for (i in 0 until seq.size) {
        if (seq[i] == seq[i + 1]) {

        }
        else print(seq)
    }
}

