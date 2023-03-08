package 단계별로_풀어보기.조건문

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(bf.readLine())
    val a = token.nextToken().toInt()
    val b= token.nextToken().toInt()
    if (a>b)
        println('>')
    else if (a==b) println("==")
    else println('<')
}