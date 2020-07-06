/*
data class 구현하는 법
- 상속불가, data 처리하기 위해 특화된 클래스
- ()안에 필드들을 정의할 수 있다. {}안에서도 멤버필드나 메소드를 정의할 수도 있다.
- data 클래스도 멀티리턴처럼 보일 수 있다. (Destructuring Declarations)
- 가장 유용한 것은 copy() 함수이다. 사용하다보면 정말 편하다.
 */

fun main(args : Array<String>) {
    //1. 일반 클래스로 데이터값을 할당해보기
    var a = A()
    a.power = 3
    a.name = "snake"

    println(a)


    //2. data class 사용해보기
    var d0 = DataA("AAA", 3)
    var d  = DataA(nLevel = 3)

    println(d0)
    println(d)


    //3. data class에서 body 적용해보기
    var d3 = DataA(nLevel = 11)
    d3.job = "archer"

    println(d3)


    //4. data class에서 copy 메소드
    var d4 = d3.copy(name = "동작구 디아블로")

    println(d4)


    //5. data class에서 destruction
    var (name) = d4
    println(name)

    var (name2, power) = d4
    println("$name2 $power")
}

class A {
    var name  : String = ""
    var power : Int    = 0
}

data class DataA (var name : String = "이름 없음", var nLevel: Int){
    var job : String = ""
    operator fun plus (d : DataA){this.nLevel + d.nLevel}
}