
fun Sum_ind(listOfNumbs: Array <Int>): Int {
    var indNumb = 2
    var listNumberChoice = listOfNumbs [indNumb]
    var arrLength = listOfNumbs.size
    var sum = 0
    var countnum = 0
    var i = 0


    while( i <= arrLength ){
        ++i
        indNumb += 2
        countnum +=1
        sum += listNumberChoice

    }
    var rtdata =sum/countnum

    return rtdata
}

fun palidrom(word : String ){
    var reverse = ""

    for (c in word.length -1 downTo  0){
        reverse += word[c]

    }
    if (word == reverse){
        println(word == reverse)
    }
    else {
        println(word == reverse)
    }

}




fun main () {

    var rev_text = readln()
    palidrom(rev_text)

    val rawNumbs = arrayOf(10,20,30,40,60,20,80,70)
    println( Sum_ind(rawNumbs))
}