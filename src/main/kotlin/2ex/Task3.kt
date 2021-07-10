package `2ex`

class Task3 {
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        var arrResult: MutableList<String>? = mutableListOf()

        if (number.toInt() >= 0) {
            val arrChar = number.toCharArray()

            //1  - 2,4
            //2 - 1,5,3
            //3- 2,6
            //4 - 1,5,7
            //5- 4,2,6,8
            //6 - 5,3,9
            //7-4,8
            //8-7,5,9
            //9-8,6
            //0-8


            for ((i, digit) in arrChar.withIndex()) {
                val tempArr = arrChar.clone()
                when (digit) {
                    '0' -> {
                        tempArr[i] = '8'
                        arrResult?.add(tempArr.toString())
                    }
                    '1' -> {
                        tempArr[i] = '2'
                        arrResult?.add(tempArr.toString())
                        tempArr[i] = '4'
                        arrResult?.add(tempArr.toString())
                    }
                    '2' -> {
                        tempArr[i] = '1'
                        arrResult?.add(tempArr.toString())
                        tempArr[i] = '5'
                        arrResult?.add(tempArr.toString())
                        tempArr[i] = '3'
                        arrResult?.add(tempArr.toString())
                    }
                    '3' -> {
                        tempArr[i] = '2'
                        arrResult?.add(tempArr.toString())
                        tempArr[i] = '6'
                        arrResult?.add(tempArr.toString())
                    }
                    '4' -> {
                        tempArr[i] = '1'
                        arrResult?.add(tempArr.toString())
                        tempArr[i] = '5'
                        arrResult?.add(tempArr.toString())
                        tempArr[i] = '7'
                        arrResult?.add(tempArr.toString())
                    }
                    '5' -> {
                        tempArr[i] = '2'
                        arrResult?.add(tempArr.toString())
                        tempArr[i] = '4'
                        arrResult?.add(tempArr.toString())
                        tempArr[i] = '6'
                        arrResult?.add(tempArr.toString())
                        tempArr[i] = '8'
                        arrResult?.add(tempArr.toString())
                    }
                    '6' -> {
                        tempArr[i] = '5'
                        arrResult?.add(tempArr.toString())
                        tempArr[i] = '3'
                        arrResult?.add(tempArr.toString())
                        tempArr[i] = '9'
                        arrResult?.add(tempArr.toString())
                    }
                    '7' -> {
                        tempArr[i] = '4'
                        arrResult?.add(tempArr.toString())
                        tempArr[i] = '8'
                        arrResult?.add(tempArr.toString())
                    }
                    '8' -> {
                        tempArr[i] = '5'
                        arrResult?.add(tempArr.concatToString())
                        println(tempArr)
                        println(tempArr.toString())
                        println(tempArr.concatToString())
                        arrResult?.add("5")
                        tempArr[i] = '7'
                        arrResult?.add(String(tempArr))
+                        tempArr[i] = '9'
                        arrResult?.add(tempArr.toString())
                    }
                    '9' -> {
                        tempArr[i] = '8'
                        arrResult?.add(tempArr.toString())
                        tempArr[i] = '6'
                        arrResult?.add(tempArr.toString())
                    }
                }
            }
        } else arrResult = null

        return arrResult?.toTypedArray()
/*        if (arrResult != null) { //TODO Если не сработает toTyped
            return arrResult.toArray() as Array<String>?
        } else return null*/

    }
}
fun main(){
    val myObjects:Task3 = Task3()
    myObjects.findAllNumbersFromGivenNumber("8")
}