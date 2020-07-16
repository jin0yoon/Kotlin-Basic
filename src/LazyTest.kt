import java.util.*

/*
late, lazy 초기화
- [lateinit]
- lateinit 예약어는 클래스에서 초기화없이 [변수:형] 만으로 선언가능하다.
- var만 사용가능. 변수형이 nullable이 아니더라도 컴파일 가능
- primitive형은 불가능함
- [lazy]
- 코드 어디선가 사용할 때, 1회 초기화 실행된다. (안드로이드에서 위젯 초기화시 유리)
- val로 선언
- primitive형도 가능함.
- 초기화 실행 시, 일련의 코딩도 가능하다.
 */

fun main(args : Array<String>) {
    //늦은 초기화의 필요성 (메모리 효율, 에러 방지 차원)
    //lateinit과 lazy
    var l : LateInitTest = LateInitTest()
    l.Test()

    var l2 : LazyInitTest = LazyInitTest()
    l2.Test()
}

//kotlin에서는 java와 달리 멤버필드를 반드시 초기화 해야한다.
//아니면 abstract나 lateinit으로 선언해주어야 한다.

//1. var만 사용가능.
//2. 늦은 초기화이므로 초기화전에 사용불가
//3. primitive형은 불가능함

class LateInitTest{
    var normalValue:Int = 3
    var initTest:Int

    //"선언 = 초기화"를 안해도 됨.
    lateinit var late:String

    init {
        initTest = 0
    }

    fun Test(){
        this.late = "lateinit 초기화"
        println(this.late)
    }
}

//1. val로 선언
//2. 사용하는 시점에서 초기화가 1회 발생
//3. prinitive형도 가능

class LazyInitTest{
    val lazy1:String by lazy {
        "lazyinit 초기화"
    }

    val lazy2:Int by lazy {
        println("1번만 실행")
        //값
        Random().nextInt(100)
    }

    fun Test(){
        println(lazy1)
        println(lazy2)
        println(lazy2)
    }
}