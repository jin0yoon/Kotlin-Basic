/*
properties
- kotlin에서는 properties를 사용할 수 있다.
- properties는 자바에서 사용하는 것과 유사하다. 변수를 좀 더 강력(로직을 가미)하게 관리할 수 있다.
- get(), set() 함수로 읽고 쓰기를 관리한다.
- 자기자신을 가리키는 예약어는 field이다.
 */

fun main(args: Array<String>) {
    //1. 변수를 가져오거나 대입할 때, 함수처럼 프로그래밍이 가능한 것
    passwd = "123456787657572313"
    println(passwd)
}

var passwd:String = ""
    get() {
        if (field.length > 5){
            field = "길이를 초과했음"
        }
        return field
    }
    set(s:String) {
        println("\"${s}\"을 저장함")
        field = s
    }