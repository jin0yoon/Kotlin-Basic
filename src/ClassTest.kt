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