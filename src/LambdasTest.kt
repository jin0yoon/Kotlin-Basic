/*
lambdas
- 함수형 프로그래밍의 필수요소 람다식
- 식별자 없이 실행 가능한 함수 표현식. 가독성을 위해 코드를 줄이는 것.
- 요즘 언어의 유행. 특히 자바에서는 필요한 요소였음 (공포의 anonymous object). java8부터 지원.
- 함수형 프로그래밍에서는 자주 사용됨.
- 일반적인 형식은
    { 변수정의 -> 함수구현 }
- 함수형 변수 선언
    var 이름 = { 볌수정의 -> 함수구현 }
- 함수형 변수 형 선언. C/C++ 함수포인터와 유사함.
    이름 : (변수정의) -> 리턴형
 */

fun main(args : Array<String>) {
    //1. 람다식으로 정의한 함수형 변수
    var pfunc = { a:Int, b:Int -> a+b }
    println(pfunc(10, 30))

    //2. 고차함수에 람다식을 넘기기
    fn1(pfunc)
    fn2{n, n2 -> n+n2}

    //3. 고차함수에 람다식과 값을 같이 넘기기
    fn3({ n, n2 -> n+n2}, 100,210)

    //4. 함수의 주소값을 직접 대입시키는 방법
    fn4 (::Add)

    //5. 람다식의 간소화
    //함수원형의 표인터를 대입시키는 편법
    var funParameter = {a:Int -> Add(a)}
    fn4(funParameter)

    //위의 코딩을 점점 더 단순화
    fn4 ({ a:Int -> Add(a) })
    fn4 {a:Int -> Add(a)}
    fn4 {a -> Add(a)}

}

fun fn1(func : (Int, Int) -> Int){
    func(10, 10).let { 결과값 -> println("결과값은 $결과값 입니다.") }
}

fun fn2(func: (Int, Int) -> Int){
    println(func(10,10))
}

fun fn3(func: (Int, Int) -> Int, a:Int, b:Int){
    println(func(a,b))
}

fun fn4(func: (Int) -> Int){
    println(func(1))
}

fun Add(i:Int) : Int {return i+100}