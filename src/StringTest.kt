/*
kotlin에서 문자를 다루는 방법은 매우 유연하다.
- 더하기(+) 연산자를 사용하여 붙이기
- """ """를 이용한 줄넘김 문자처리
- 변수 or변수를 이용한 문자열 내의 변수값 치환
- ${코딩} 이용한 문자열 내의 결과값 치환
 */
fun main(args : Array<String>) {
    var sName = "박모씨"

    //1. 문자열을 추가하는 것은 +연산자로 가능함 -> Java와 동일
    println(sName + " - The Gamer")
}