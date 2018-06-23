package com.example.administrator.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("data_return", "Hello FirstActivity");
                //专门为上一活动返回处理结果，包含2个参数，第一个一般是RESULT_OK,第二个参数则是把带数据的intent传递回去
                setResult(RESULT_OK,intent);
                finish();
            }
        });
//        Intent intent = getIntent();
//        String date = intent.getStringExtra("extra_date");
//        Log.d("SecondActivity",date);
    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent();
        intent.putExtra("data_return","Hello FirstActivity");
        setResult(RESULT_OK,intent);
        finish();
    }
}
