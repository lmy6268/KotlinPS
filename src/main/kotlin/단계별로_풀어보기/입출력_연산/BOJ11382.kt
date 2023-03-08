package 단계별로_풀어보기.입출력_연산

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

//꼬마 정민
//https://www.acmicpc.net/problem/11382
fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val a = StringTokenizer(bf.readLine())
    var sum:Long = 0
    val list = a.iterator().forEach {
        sum+=it.toString().toLong()
    }
    println(sum)

}