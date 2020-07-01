/*
Kotlin에서 Collections는 열거형 데이터를 관리하는데 필수적인 클래스 집합이다.
그래서 책 한권의 방대한 내용이 존재한다.
여기서는 프로그래밍에 필요한 필수내용만 다루기로 한다.
- 읽기전용 List -> listOf. 항목의 데이터형을 혼합해도 됨.
- 수정가능 List -> mutableListOf. 제너릭(<>)으로 데이터형을 반드시 선언. 각종 메소드(add, remove,...)
- Map은 hashMapPf(키 to 값, ...) 형식
 */

fun main(args : Array<String>) {
    //읽기전용 - list. 데이터형을 마구 섞어도 된다.
    val lst = listOf(1, "A", 12.00f, false, true)
    for (i in 0 .. lst.size-1){
        println(lst.get(i).toString())
    }

    println(">")

    //수정가능 - List. 데이터형을 미리 정해야 하는 듯.
    var lstEditable = mutableListOf<String>()

    //add 메소드로 추가
    lstEditable.add("A")
    lstEditable.add("B")
    lstEditable.add("C")
    lstEditable.add("D")

    for (s in lstEditable){
        println(s)
    }

    println(">")

    //remove 메소드로 삭제
    lstEditable.removeAt(0)
    for (s in lstEditable){
        println(s)
    }

    println(">")

    //Map: java보다 불편한 듯.
    var  m = hashMapOf("A" to 1, "B" to 2)
    println(m["A"])
}