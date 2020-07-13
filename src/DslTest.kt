import java.util.Random

/*
DSL(Domain-specific language)
- 특정 어플리케이션이나 Software에서 사용할 목적으로 만든 간이언어.
- kotlin에서는 확장함수를 사용하여 구현 가능함.
 */

fun main(args : Array<String>) {
    //1. 반복되고 제한된 환경을 위한 간이언어
    //2. 확장함수를 이용함.

    //일반적인 방법
    val p0 = Player()
    p0.name = "Player 0"
    p0.status = Status()
    p0!!.status!!.job = "Wizard"
    p0!!.status!!.level = 20
    println(p0)

    //data class로 정
    //제일 간단함
    val p1 = Player("Player 1", Status("Archer", 23))
    println(p1)

    //DSL이 편리할 수도 있다.
    val p2 = MakePlayer {
        name = "Player 2 - " + Random().nextInt(200).toString()
        status{
            job = "Paladin"
            level = Random().nextInt(70)
        }
    }

    println(p2)
}

fun MakePlayer(block:Player.() -> Unit): Player = Player().apply(block)
//fun MakePlayer(block:Player.() -> Unit): Player{
//  return Player().apply(block)
//}

fun Player.status(block: Status.() -> Unit){
    status = Status().apply(block)
}


//data class
data class Player(var name:String? = null,
                  var status:Status? = null)
data class Status(var job:String? = null,
                  var level:Int? = null)