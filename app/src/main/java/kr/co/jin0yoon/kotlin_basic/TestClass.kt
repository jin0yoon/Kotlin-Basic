package kr.co.jin0yoon.kotlin_basic

//TestClass는 우리가 안드로이드 화면에서 인텔리제이에서 만든 예제들을 println했던 것을 똑같이 화면에서 보여주기 위해서 만든 클래스
//인텔리제이에서 만든 예제들을 TestClass를 상속받아서 doTest라는 메소드에서 구현할 것임

open class TestClass(pFunc : (Any) -> Unit){

    // TestClass를 상속받았거나 그 안의 innerClass에서
    // println을 대처하기 위한 static 메소드
    companion object {
        var println : (Any) -> Unit = {}
    }

    init {
        println = pFunc
    }

    // 3. 예제의 테스트 코드를 실행할 메소드
    open fun doTest() {}
}