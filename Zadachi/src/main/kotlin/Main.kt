import kotlin.math.log

fun main() {
    //Zadanie 1
    println("Задание №1")
    println("")
    val stroka: String = "AAADSSSRRTTHAAAA "
    val symbol = stroka[0]
    var counter = 1
    var i = 0
    println("Введите символы: $stroka")
    for (c in stroka){
        if (stroka[i] == ' ') break
        while(stroka[i] == stroka[i+1]){
            counter += 1
            i += 1
        }
        if (counter == 1)
            print("${stroka[i]}")
        else
        print("${stroka[i]}$counter")
        counter = 1
        i += 1
    }
    println("")
    //Zadanie 2
    println("Задание №2")
    println("")
    var stroka2: CharArray
    stroka2 = "AASADDSS".toCharArray()
    i = 0
    var x = 0
    var counter2 = 1
    stroka2.sort()
    println(stroka2)
    stroka2.concatToString()
    stroka2 += ' '
    for (c in stroka2){
        if (stroka2[i] == ' ') break
        while(stroka2[i] == stroka2[i+1]){
            counter2 += 1
            i += 1
        }
            println("${stroka2[i]} - $counter2")
        counter2 = 1
        i += 1
    }
    println("")
    //Zadanie3
    println("Задание №3")
    println("")
    var n = 0
    print("Напишите ваше число для перевода: ")
        n = readln().toInt()
    val binary: String = Integer.toBinaryString(n)

    println(binary)
    println("")
    //Zadanie4
    println("Задание №4")
    println("")
    var num1 = 0.0
    var num2 = 0.0
    print("Введите первое число: ")
    num1 = readln().toDouble()
    print("Введите второе число: ")
    num2 = readln().toDouble()
    print("Введите символ операции (+,-,*,/): ")
    val char = readln()
    if (char == "+"){
        val sum = num1 + num2
        print("$num1 + $num2 = $sum")
    } else
    if (char == "-"){
        val min = num1 - num2
        print("$num1 - $num2 = $min")
    } else
    if (char == "*"){
        val pr = num1 * num2
        print("$num1 * $num2 = $pr")
    } else
    if (char == "/"){
        val del = num1 / num2
        print("$num1 / $num2 = $del")
    } else {
        println("Неправильно введены данные!")
    }
    println("")
    println("")
    //Zadanie №5
    println("Задание №5")
    println("")
    var n1 = 0.0
    var x1 = 0.0
    println("Введите конечное число: ")
    n1 = readln().toDouble()
    println("Введите основание степени: ")
    x1 =  readln().toDouble()
    if(log(n1,x1).toInt().toDouble()== log(n1,x1))
        print(log(n1,x1))
    else
        print("Показатель есть, но его нет")
    println("")
    println("")
    //Zadanie 6
    println("Задание №6")
    println("")
    print("Введите первую цифру: ")
    var c1 = readln().toInt()
    print("Введите вторую цифру: ")
    var c2 = readln().toInt()
    if((c1*10+c2)%2 !=0)
        println(c1*10+c2)
    else
    if((c2*10+c1)%2 !=0)
        println(c2*10+c1)
    else
        println("Создать нечетное число невозможно из $c1 и $c2")
}