/*
Kotlin에서 레이블은 매우 중요하다.
함수형 언어이기에 리턴되는 곳을 명확히 해야 할 필요가 있기 때문이다.
- return 반환값 : 값만 있으면 호출된 함수로 이동
- return@레이블 반환값 ... : 해당 레이블로 값을 가지고 복귀한다.
- break, continue : break는 반복문을 종료하고 나간다. continue는 다음 라인을 무시하고 반복문의 처음으로 간다.
- break@레이블, continue@레이블 : break는 반복문을 종료하고 지정한 레이블로 나간다. continue는 다음라인을 무시하고 지정한 레이블로 이동한다.
 */

fun main(args : Array<String>) {
    ExitLoop()
    println(lambdaReturn())

    //함수형 스타일의 활용
    (0..10).forEach{if (it > 3) return@forEach else println(it)}
}

//@레이블 지정 후, break@레이블로 나감
//대부분의 언어에서 지원하는 goto문과 유사함.
fun ExitLoop(){
    HereToExit@ for (i in 0..2){
        for (j in 0..10){
            if (j == 5) break@HereToExit
            println("i->$i, j->$j")
        }
        println("j loop end")
    }
    println("i loop end")
}

//이름없는 함수(람다식)의 리턴
var lambdaReturn = Exit@{
    if (true){
        return@Exit 3
    }
    1000
}
