package kr.co.jin0yoon.kotlin_basic.step1

import kr.co.jin0yoon.kotlin_basic.TestClass

class FirstTest ( p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        //1. 종결자를 선언하지 않아도 된다.
//    System.out.println() //뒤에 ;(종결자)가 없어도 에러가 발생하지 않음
        println("종결자(;) 없어도 된다.")

        //2. 형을 선언하지 않아도 변수를 넣는 순간 형이 정의된다.
        var name = 22
        //java의 경우
//    String name = "박모씨";

        //3. 변수는 읽기전용과 읽기쓰기 상태로 선언된다.
        println("var는 읽기쓰기, val는 읽기모드")

        //4. null은 엄격히 구분한다. -> null을 허용하는 변수는 ?로 정의
//    var name2 : String = null -> Null can not be a value of a non-null type String 이라는 오류 발생함
        var name2 : String? = null //이렇게 해줘야 오류가 발생하지 않음

        //5. 모든 것은 먼저 선언되어 있어야 이해할 수 있다. (코드가 위에서 아래 순서로 읽히므로)
//    println(message)
        val message = "위에서는 액세스 불가함"

        //어떻게 변수를 이해했을까?
        println(hiMessage)
    }

    val hiMessage:String = "Hi"
}