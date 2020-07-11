/*
확장함수
- 확장함수는 이미 정의된 클래스에 멤버함수를 정의하는 것이다.
- 확장함수를 실행함과 동시에 객체정보를 공유할 수 있다.
- 확장함수에서 객체의 멤버들은 val(읽기전용)로 설정된다.
- 확장함수에 파라메터로 함수를 넘기면 객체설정 및 이벤트 핸들러를 구현하기 편해진다.
 */

fun main(args : Array<String>) {

    //1. 이미 정의된 클래스에 확장함수
    fun String?.myFunction(s:String, n:Int) : String?{
        var sTooManyTalk = "$this : added \n"
        (1..n).forEach{sTooManyTalk += "${s}\n"}

        return sTooManyTalk
    }

    println("hi".myFunction("Hi", 10))

    //2. 파라메터로 확장함수 -> 객체에서 실행

    //   (apply와의 차이점은?)

    //3. 객체멤버 접근해보기(val?)

    //4. Android에서 흔하게 보게 될 코드(Interface와 함께)

}





