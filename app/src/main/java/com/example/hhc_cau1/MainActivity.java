package com.example.hhc_cau1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button btn;
    Button btnThoat;
    CheckBox cb;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        btn=(Button)findViewById(R.id.btn);
        btnThoat=(Button)findViewById(R.id.btnThoat);
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


        final AlertDialog.Builder mydialog = new AlertDialog.Builder(this);
        mydialog.setTitle("Thông Báo");
        mydialog.setIcon(R.drawable.c);
        mydialog.setMessage("Bạn có muốn thoát không");

        mydialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        mydialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog= mydialog.create();
                alertDialog.show();
            }
        });

    }
}
