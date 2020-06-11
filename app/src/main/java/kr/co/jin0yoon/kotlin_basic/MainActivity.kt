package kr.co.jin0yoon.kotlin_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

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
