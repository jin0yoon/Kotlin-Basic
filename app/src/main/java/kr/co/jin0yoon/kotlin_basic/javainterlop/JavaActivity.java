/*
java interlop
- kotlin에서 java를 사용하는 것은 너무 자연스럽다.
- java에서 kotlin을 사용하면
- 파일명(첫번째 대문자)Kt 형식으로 class가 생성된다.
- 파일 안에 정의된 일반 변수(클래스 포함)는 get/set 형식의 메소드로 사용 가능하다.
    - java에서 메소드 형식으로 변환없이 사용하려면 @JvmField 어노테이션을 사용한다.
    - java에서 스태틱 메소드를 사용하려면 @JvmStatic 어노테이션을 사용한다.
- 확장함수를 사용하면 java 소스 내용을 공유하여 부분적으로 코틀린으로 코딩할 수 있다.
 */

package kr.co.jin0yoon.kotlin_basic.javainterlop;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import kr.co.jin0yoon.kotlin_basic.R;

public class JavaActivity extends AppCompatActivity {

    String sMessage = "Hi, Java";

    //kotlin에서 사용 가능
    public void T (Context ctx, String sMessage){
        Toast.makeText(ctx, sMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
    }
}
