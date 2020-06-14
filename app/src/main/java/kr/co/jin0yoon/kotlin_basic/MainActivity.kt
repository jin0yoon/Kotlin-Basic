package kr.co.jin0yoon.kotlin_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/*
kotlin을 시작하기 전에 알아야할 지식
- 종결자를 선언하지 않아도 된다.
- 형을 선언하지 않았다면 변수를 대입시 형이 결정된다.
- 변수는 읽기전용과 읽기쓰기 상태로 선언된다.
- null은 엄격히 구분한다. -> null을 허용하는 변수는 ?로 정의
- kt 파일은 내부적으로 Class로 재구성한다.
 */


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //예제들을 이곳에서 실행시킨다.
        doTest(FirstTest(::WriteLn))
        //::은 메소드의 주소를 가져오라는 것
    }

    private fun doTest(o : TestClass){
        o.doTest()
    }

    fun WriteLn(any: Any){
        txtMessage.text = "${txtMessage.text}${any.toString()}\n"
        //kotlin에서는 findviewid를 지정해주지 않아도 알아서 만들어줌
    }
}
