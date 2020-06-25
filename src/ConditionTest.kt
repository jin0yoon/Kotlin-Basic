/*
Kotlin에서 제어문은 매우 유연한 기능을 제공한다.
- if문은 java와 유사하다. 단지 Any 타입이 쓰이며 in, is 등과 함께 사용되어 더 유연하게 사용된다.
- 반복문은 for문은 for(변수 in 배열 or 범위){} 형식으로 사용된다.
- 반복문은 while문은 while(조건){} 형식으로 사용된다.
- case문은 Any 타입과 사용되어 상당히 유연하다. when(변수){조건 -> 실행; ..} 형식으로 쓰인다.
- if, case문의 결과를 바로 변수로 대입시킬 수 있다.
 */

fun main(args : Array<String>) {
    ifTest(17.0f)
    loopTest(8)
    caseTest(3)

    //비교의 결과를 대입
    var a = "ABCDE"
    val result = when (a){
        is String -> {true}
        else -> {false}
    }
    println(result)

    //리턴되는 형이 달라도 처리가능하다.
    println(if ("AAA".length > 3) true else "짧아요")
}

fun ifTest(a : Any?){
    //==를 이용한 값 비교
    if (a == "Test"){
        println(a)
    }
    //is를 이용한 형 비교
    else if (a is Float){
        println("Float")
    }
    //in을 이용한 범위 비교
    else if (a in (0..9)){
        println("0-10까지 숫자: $a ")
    }
    else if (a == null){
        println("null!")
    }
}

fun loopTest(count : Int){
    //반복문 for: in과 (시작..끝)으로 반복 가능
    for (i in (0..count)){
        println("i -> " + i)
    }

    //반복문 while: while(조건){}
    var i : Int = 0;
    while (i < count){
        i++;
        println("$i 입니다.")
    }
}

fun caseTest(o : Any?){
    when(o){
        "Test"      -> {println("문자:" + o)}
        is Float    -> {println("Float:" + o)}
        in (0..9)   -> {println("0-10까지 숫자: $o")}
        else        -> {println("???")}
    }
}

