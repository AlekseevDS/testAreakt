class mainApp {
}

fun main(){
    val arr: Array<Int> = arrayOf(1, 2, 2, 9, 93, 2, 6, 9, 6, 10)
    //val arrGood =  convertToHappy(arr.toIntArray())
   // arrGood.forEach { e -> print(e) }

}
/*

fun convertToHappy(sadArray: IntArray): IntArray {
    //throw NotImplementedError("Not implemented")
    var arrNum = IntArray(sadArray.size){sadArray[it]}

    while (true) {
        val newArr = arrFinderBadElem(arrNum)
        if  (newArr.size == arrNum.size) {
            return arrNum
            break
        } else {
            arrNum = IntArray(newArr.size){newArr[it]}
        }
    }

    //val numbers = IntArray(sadArray.size){sadArray[it]}.toMutableList()
    //val mutableIterator = numbers.iterator()
    //val listIterator = numbers.listIterator()



    //while





}

fun arrFinderBadElem(analisArray: IntArray): IntArray {
    var items = analisArray.toMutableList()
    val numbers = analisArray.toMutableList()

    var index = 1
    while (index < items.size - 1) {
        var i = items[index - 1]
        var j = items[index + 1]
        var diff = items[index]
        if (i + j < diff) {
            numbers.remove(items[index])
        }
        index++
    }
    return numbers.toIntArray()
}
*/
