fun main(args: Array<String>) {
    var count = 0

    var correctAnswer1 = "pledge"
    var correctAnswer2 = "United"
    var correctAnswer3 = "Republic"
    var correctAnswer4 = "Nation"
    var correctAnswer5 = "all"

    println("Fill in the blanks for 'The Pledge of Allegiance':\n(Each # is one character)")
    println("I ###### allegiance")
    var guess1 = readLine()!!.toString()
    var result1 = correctAnswer1.compareTo(guess1, ignoreCase = true)
    if (result1 == 0){
        println("Correct")
        count += 1}
    else
        println("Incorrect the right answer was " + correctAnswer1)

    println("to the Flag of the ###### States of America,")
    var guess2 = readLine()!!.toString()
    var result2 = correctAnswer2.compareTo(guess2, ignoreCase = true)
    if (result2 == 0){
        println("Correct")
        count += 1}
    else
        println("Incorrect the right answer was " + correctAnswer2)


    println("And to the ######## for which it stands,")
    var guess3 = readLine()!!.toString()
    var result3 = correctAnswer3.compareTo(guess3, ignoreCase = true)
    if (result3 == 0){
        println("Correct")
        count += 1}
    else
        println("Incorrect the right answer was " + correctAnswer3)

    println("one ######, under God, indivisible,")
    var guess4 = readLine()!!.toString()
    var result4 = correctAnswer4.compareTo(guess4, ignoreCase = true)
    if (result4 == 0){
        println("Correct")
        count += 1}
    else
        println("Incorrect the right answer was " + correctAnswer4)

    println("with liberty and justice for ###.")
    var guess5 = readLine()!!.toString()
    var result5 = correctAnswer5.compareTo(guess5, ignoreCase = true)
    if (result5 == 0){
        println("Correct")
        count += 1}
    else
        println("Incorrect the right answer was " + correctAnswer5)

    println("You answered " + count + "/5 fill in the blanks correctly")
}