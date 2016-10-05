package com.example.proxytool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



import proxytool.OnClick;
import proxytool.ViewById;
import proxytool.api.ProxyTool;

public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.btnOne)
    Button btnOne;
    @ViewById(R.id.btnTwo)
    Button btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProxyTool.bind(this);
    }

    @OnClick({R.id.btnOne,R.id.btnTwo})
    public void myClick(View view){
        btnOne.setText("111111");
        btnTwo.setText("222222");
    }
}
