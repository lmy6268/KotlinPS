package 단계별로_풀어보기.입출력_연산

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

//사칙연산
//https://www.acmicpc.net/problem/10869
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)

}