/*
다형성을 구현하는 법
Kotlin에서 오버로딩과 오버라이딩은 다음과 같다.
- 선조 클래스에서 메소드와 필드를 open으로 정의한다.
- 상속받은 클래스에서 override로 정의한다.
- 오버로딩은 자바와 같다. 같은 이름의 다른 파라메터를 받는 메소드를 정의하면 된다.
 */

fun main(args : Array<String>) {
    var obj1 = baseClass()
    obj1.f1()
    var obj2 = childClass()
    obj2.f1()
    obj2.f2()
    obj2.f2("문자열 파라메터")
    obj2.f2("문자열 파라메터, 100")
}

//간단한 클래스
open class baseClass{
    //상속받은 클래스에서 override 하려면 부모클래스에서 open으로 정의
    open var name = "base"
    open fun f1() = println(this.toString())

    //외부사용금지 .찍고 메소드 사용 못함
    private fun onlyMyFunc() = println("클래스 내부에서만 사용")

    constructor(){
        onlyMyFunc()
    }
}

class childClass : baseClass(){
    override var name = ""
    override fun f1() = println(this.toString() + "재정의 함.")

    fun f2() = println("f2")
    //overloding
    fun f2(s: String) = println("f2:$s ")
    fun f2(s: String, num: Int) = println("f2 : $s, $num")
}