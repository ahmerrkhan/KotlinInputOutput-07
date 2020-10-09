import java.util.Scanner  //importing library for int, float double inputs from users

//Standard Input and Outputs

fun main(args : Array<String>){
    println("Enter your name : ")
    val name = readLine()     //readLine() uses for String input
    println("Your name is : "+name)
    println("Your name is $name")

    println("Enter Your Age : ")
    var read = Scanner(System.`in`)
    val age = read.nextInt()       //Rather then String input you can use import java.util.Scanner
    println("Your age is : $age")
    println("Your age is : "+age)
}