/*
object keyword
- 2가지 형태로 사용된다.
- class명 앞에 사용해서 static class로 선언
- class 내부의 특정멤버들만 static (companion object)
- 이름 없는 객체 (클래스에서 상속)를 처리할 때
 */

fun main(args : Array<String>) {

    //1. 클래스 전체를 싱글톤으로 사용할 때, 마치 java의 static class
    SingleTon.showMessage("싱글톤입니다!")
    val obj = StaticTest()
    println(obj.msg)

    //2. companion object
    println(StaticTest.staticVar)
    StaticTest.staticFunc()

    //3. Android에서 자주 사용됨
    var obj2 = object : fakeClickHandler(){
        override fun onClick() {
            println("Click!!")
        }
    }
    obj2.onClick()
}

object SingleTon{
    var showMessage = {msg : String -> println(msg)}
}

class StaticTest{
    var msg : String = "일반객체로 생성하면 이 변수를 액세스 가능함"

    //companion object {} 안에서 구현해야 static 가능
    companion object{
        var staticVar = "StaticTest.staticVar"
        fun staticFunc() = println("StaticTest.staticFunc")
    }
}

abstract class fakeClickHandler{
    abstract fun onClick()
}