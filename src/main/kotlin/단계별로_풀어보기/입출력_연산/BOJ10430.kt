package 단계별로_풀어보기.입출력_연산

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(bf.readLine())
    val (a,b,c) = token.toList().map {
        it.toString().toInt()
    }
    println("${(a+b)%c}\n${((a%c)+(b%c))%c}\n${(a*b)%c}\n${((a%c)*(b%c))%c}")


}