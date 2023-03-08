package 단계별로_풀어보기.입출력_연산

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val a = bf.readLine()
    val b  = bf.readLine()

    for(i:Int in a.length-1 downTo 0){
        println(a.toInt()*b[i].toString().toInt())
    }
    println(a.toInt()*b.toInt())
}