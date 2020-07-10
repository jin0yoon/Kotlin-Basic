/*
주요 확장함수
- 함수형 프로그래밍을 지원하는 중요 확장함수들
- .let() 다음, 결과를 {}안에 넘긴다. ->를 사용할 경우 변수명 지정이 가능하다.
- .apply() 다음, 객체를 (생성과 동시) 결과를 {}안에 넘긴다. 파스칼의 whit문과 유사. {}안에서 코딩한 객체의 결과를 넘긴다.
- .run()는 {}안의 실행 결과값을 최종값으로 넘긴다.
 */

fun main(args : Array<String>) {
    //1. let()
    f1().let { value -> println(value) }
    f1().let { println(it) }

    1232.let { it + 1 }.let { it * 3 }.let { println(it) }
    var add = {a:Int, b:Int -> a+b}
    add(1, 2).let { println(it) }

    var bug : () -> Any? = {null}
    bug()?.let { println(it) }

    //2. apply()
    

    //3. run()

    //실행결과를 리턴

    //4. also()
}

fun f1() = 10