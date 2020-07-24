/*
multi return (destructuring)
- 우측의 값을 좌측의 변수로 나누어 순서대로 대입하는 것
- ()안에 변수를 나열한다. (일반적으로 Data class, List, Pair Collection의 반환값)
- 순서대로 특정범위까지 가져올 수 있다.
- partion 메소드 사용법
 */

fun main(args : Array<String>) {
    //1. Extract
    // ()안에 변수를 나열한다.
    // 일반적으로 Data class, List, Pair Collection의 반환값
    // 순서대로 특정범위까지 가져올 수 있다.
    val (v1,v2,v3) = listOf("Kotlin", 32, 123.0f)
    println("${v1}, ${v2}, ${v3}")

    val (name, grade) = StudentA("name", 32)


    //2. List의 파티션 기능
    val lst = (0..10).map { StudentA("name -${it}", (it % 3) + 1) }
    println(lst)

    val (l1, l2) = lst.partition { it.grade == 2 }
    println("l1")
    l1.map { println(it) }
    println("l2")
    l2.map { println(it) }

    //3. 순위별로 가져오기
    val (n1, n2, n3) = (0..100).filter { it % 2 == 0 }.sortedByDescending { it }

    println(n1.toString() + ", " + n2.toString() + ", " + n3.toString())
}

data class StudentA (var name:String, var grade:Int)
class StudentB(){
    var name:String = ""
    var grade:Int = 0
}