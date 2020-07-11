/*
closure
- closure는 함수형 프로그래밍에서 매우 중요한 개념이다.
- 클로저는 자바스크립트 사용자들에게 친숙한 방법이다.
- 외부함수의 변수를 내부함수에서 그대로 기억하고 사용할 수 있다.
- 오래된 언어인 파스칼의 내부함수 사용법과 유사하다.
- 마치 객체지향에서 사용하는 객체처럼 함수를 사용할 수 있다.
 */

fun main(args : Array<String>) {
    var fn = Closure1(10)
    println(fn(10))
    println(fn(10))
    println(fn(10))

    var decByOne = Closure2({num -> num-1})
    println(decByOne())
    println(decByOne())

    fun Add(num: Int) = num + 10
    var addByTen = Closure2(::Add)
    println(addByTen())
    println(addByTen())
}

//자바스크립트에서 볼 수 있는 간단한 클로져
//객체지향처럼 함수 내의 변수들을 계속 유지할 수 있다.
fun Closure1(num:Int) : (Int) -> Int{
    var sum:Int = num
    return fun (num2:Int) : Int{
        sum = sum + num2
        return sum
    }
}

//람다로 함수를 받음
fun Closure2(pFunc:(Int) -> Int) : () -> Int{
    var result:Int = 0
    return {
        result = pFunc(result)
        result
    }
}