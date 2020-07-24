/*
kotlin에서 Any형은 동적타입을 지원한다.
- 어떠한 형을 대입시켜도 처리가능한 변수형
- 최종 대입된 값으로 형이 결정된다.
- null은 엄격히 구분한다. -> null을 허용하는 변수는 ?로 정의
 */

fun main(args: Array<String>) {
    var everybody : Any

    //1. 마지막 외에 회색인 이유는?
    everybody = 1111
    everybody = "문자열 테스트"
    everybody = 221.01010
    everybody = 12.00f

    //is와 !(not) 연산자로 어떤 데이터 형인지 체크가 가능함.
    if(everybody !is String){
        if (everybody is Float){
            println("float 입니다.")
        }
    }

    //2. null은 어떠게 해야할까?
    //everybody = null

    //3. 값을 비교하기
    println(everybody == 12.00f)
    println(everybody.equals(12.00f))
}