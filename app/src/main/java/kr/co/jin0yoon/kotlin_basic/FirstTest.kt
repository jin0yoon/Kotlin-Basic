package kr.co.jin0yoon.kotlin_basic

class FirstTest ( p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        println("Hi")
    }
}