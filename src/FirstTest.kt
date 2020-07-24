/*
kotlin을 시작하기 전에 알아야할 지식
- 1. 종결자를 선언하지 않아도 된다.
- 2. 형을 선언하지 않았다면 변수를 대입시 형이 결정된다.
- 3. 변수는 읽기전용과 읽기쓰기 상태로 선언된다.
- 4. null은 엄격히 구분한다. -> null을 허용하는 변수는 ?로 정의
- 5. kt 파일은 내부적으로 Class로 재구성한다.
- 6. scope는 java와 유사하다.
 */

//psvm을 치면 자동으로 main함수를 생성해줌
fun main(args: Array<String>) {

    //1. 종결자를 선언하지 않아도 된다.
//    System.out.println() //뒤에 ;(종결자)가 없어도 에러가 발생하지 않음
    println("종결자(;) 없어도 된다.")

    //2. 형을 선언하지 않아도 변수를 넣는 순간 형이 정의된다.
    var name = 22

    //3. 변수는 읽기전용과 읽기쓰기 상태로 선언된다.
    println("var는 읽기쓰기, val는 읽기모드")

    //4. null은 엄격히 구분한다. -> null을 허용하는 변수는 ?로 정의
//    var name2 : String = null -> Null can not be a value of a non-null type String 이라는 오류 발생함
    var name2 : String? = null //이렇게 해줘야 오류가 발생하지 않음


}