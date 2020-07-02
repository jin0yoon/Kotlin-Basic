import java.lang.Exception

/*
Kotlin에서 예외처리는 java와 문법은 비슷하지만 정책이 다르다.
- kotlin에서 try{} catch문은 필수가 아니라 선택이다.
- 프로그래밍 로직에서 예외처리를 권장한다.
- null체크는 무척 까다롭다.
- !!는 null일때 종료한다.
- ?는 null일때 뒤에 부분을 실행하지 않는다.
 */

fun main(args : Array<String>) {
    //java와 달리 try catch가 필수가 아니다.
    var divNumber = 0
    try {
        707 / divNumber
    }catch (e : Exception){
        println(e)
    }finally {
        println("Last")
    }

    //Kotlin Style (예외처리는 소스코드에서 로직으로 ! 아니면 종료)
//    var zerodivided = 707 / divNumber
//    println(zerodivided)

    //null checking은 까다로움
    var addNumber : Int? = null

    //에러
//    var sum = addNumber + 100

    //처리방법 1
    if (addNumber != null){
        var sum = addNumber + 100
    }

    //처리방법 2
//    var sum = addNumber!! + 100

    //처리방법 3
    var sum = addNumber?.let {
        it + 100
    }

}