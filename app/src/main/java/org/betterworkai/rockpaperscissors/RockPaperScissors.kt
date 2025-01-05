package org.betterworkai.rockpaperscissors

fun main(){
    var computerChoice =""
    var playerChoice =""
    println("Rock / Paper / Scissors, Enter your single choice :")
    playerChoice = readln()

    val randomNumber = (1..3).random()

//    if(randomNumber == 1){
//        computerChoice = "rock"
//    }
//    else if(randomNumber == 2){
//        computerChoice = "Paper"
//    }
//    else if(randomNumber == 3){
//        computerChoice = "Scissors"
//    }
//    println(computerChoice)

    when (randomNumber){
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)

    val winner = when {
        playerChoice ==  computerChoice -> "Tie"
        playerChoice == "Rock"  && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    if(winner == "Tie"){
        println ("It's a Tie! ;(")
    }
    else{
        println(winner + "won!.. wamp wamp wamppp")
    }

}