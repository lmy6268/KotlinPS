package 단계별로_풀어보기.입출력_연산

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    println(Integer.parseInt(token.nextToken()) - Integer.parseInt(token.nextToken()))
}