/*
interface, abstract, static 구현하는 방법
- interface는 interface 이름 {}으로 정의한다. 오버라이드하기 위해 open이나 기타 지시자로 정의할 필요가 없다.
- abstract class는 구현상속할 메소드도 abstract로 정의해야 한다. 그리고 상속에서는 override로 정의한다.
- static을 사용하려면 클래스 내에 companion object {}를 만들고 그 안에 메소드나 멤버필드를 정의한다.
 */

fun main(args : Array<String>) {

    //구현하고 설정하는 곳
    var WhatYouWant = 1
    var inter : InterTest = if (WhatYouWant == 1) InterImp2() else InterImp()

    //넘겨진 값을 신경안쓰고 사용하는 곳
    interfaceTest(inter)

    //추상화
    var obj2 = TestAbstractImp()
    obj2.TestFunc()
    obj2.abstractFunc()

    //static
    println(TestAbstractImp.staticVar)
    TestAbstractImp.staticFunc()

}

fun interfaceTest(pInter : InterTest){
    pInter.TestFunc()
}

interface InterTest{
    fun TestFunc()
}

class InterImp : InterTest{
    override fun TestFunc() = println("InterImp InterTest")
}

class InterImp2 : InterTest{
    override fun TestFunc() = println("InterImp InterTest2")
}

abstract class TestAbstract{
    fun TestFunc() = println("abstract TestFunc")
    abstract fun abstractFunc()
}

class TestAbstractImp : TestAbstract(){
    override fun abstractFunc() = println("TestAbstractImp avstracFunc")

    //companion object {} 안에서 구현해야 static 가능
    companion object{
        var staticVar = "companion staticVar"
        fun staticFunc() = println("companion staticFunc")
    }
}