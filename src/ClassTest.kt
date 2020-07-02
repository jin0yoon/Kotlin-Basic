/*
kotlin에서 class는 다음과 같다.
- 클래스는 class 이름{} 형태임.
- 생성자는 constructor(매개변수){} 형식을 쓰지만, class 이름(변수명: 데이터형, ..){}로 쓰이기도 한다.
- kotlin에서 기본은 상속이 금지되어 있다. 선조클래스를 open class 이름{}으로 선언해야 가능하다.
- 상속은 class 이름 : 선조클래스명(생성자인자){} 형식이다.
 */

fun main(args : Array<String>) {
    Test1().showInfo()
    Test1("PSW", 50).showInfo()

    Test2("나다").showInfo()
    Test2("PSW", 50).showInfo()

    ChildClass("Hi").sayHello()
}

class Test1{
    var sName : String = "Test1"
    var nAge : Int = 10

    //생성자
    constructor(){
        println(this.toString())
    }

    constructor(name: String, age: Int){
        sName = name
        nAge = age
    }

    fun showInfo() = println("${sName} : ${nAge}")
}

//생성자를 ()로 처리하는 클래스
//클래스에서 다른 생성자를 정의하려면
//constructor 뒤에 : this(정의한 값)을 덛붙힌다.
class Test2(name: String){
    var sName : String = "Test2"
    var nAge : Int = 10

    init {
        sName = name
    }

    constructor(name: String, age: Int):
            this(name){
        sName = name
        nAge = age
    }

    fun showInfo() = println("${sName} : ${nAge}")
}

//상속을 받으로면 open으로 정의
open class ParentClass(msg: String){
    var message = msg
    fun sayHello() = println(message)
}

class ChildClass(m : String) : ParentClass(m){
}