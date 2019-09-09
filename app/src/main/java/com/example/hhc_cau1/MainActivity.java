package com.example.hhc_cau1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button btn;
    CheckBox cb;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        btn=(Button)findViewById(R.id.btn);
        cb=(CheckBox)findViewById(R.id.cb);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "";
                if(cb.isChecked()==true)
                {
                    s="Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu";
                }
                else
                {
                    s="Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu";
                }
                toast=Toast.makeText(MainActivity.this, s,   Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}
