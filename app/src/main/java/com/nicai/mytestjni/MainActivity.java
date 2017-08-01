package com.nicai.mytestjni;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static {
        System.loadLibrary("JniTest");
    }

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mButton = (Button) findViewById(R.id.button);

        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                add();
                break;
        }
    }

    private void add() {
        HelloJNI helloJNI = new HelloJNI();
        int result = helloJNI.add(3, 5);
        Toast.makeText(this, "3+5结果为：" + result, Toast.LENGTH_SHORT).show();
    }
}
