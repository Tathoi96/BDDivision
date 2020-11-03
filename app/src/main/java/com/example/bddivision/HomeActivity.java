package com.example.bddivision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnDhaka,btnChittagong,btnRajshahi,btnSylhet,btnKhulna,btnMymensingh,btnRangpur,btnBarisal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       btnDhaka=findViewById(R.id.btn_dhaka);
        btnChittagong=findViewById(R.id.btn_chittagong);
        btnRajshahi=findViewById(R.id.btn_rajshahi);
        btnSylhet=findViewById(R.id.btn_sylhet);
       btnKhulna =findViewById(R.id.btn_khulna);
       btnMymensingh=findViewById(R.id.btn_mymensingh);
       btnRangpur=findViewById(R.id.btn_rangpur);
       btnBarisal =findViewById(R.id.btn_barisal);

       btnDhaka.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(HomeActivity.this,DescriptionActivity.class);
              intent.putExtra("division","dhaka");
              startActivity(intent);
               Toast.makeText(HomeActivity.this, "Dhaka", Toast.LENGTH_SHORT).show();
           }
        });
        btnChittagong.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DescriptionActivity.class);
                intent.putExtra("division","chittagong");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Chittagong", Toast.LENGTH_SHORT).show();
            }
        });
        btnRajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,DescriptionActivity.class);
                intent.putExtra("division","rajshahi");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Rajshahi", Toast.LENGTH_SHORT).show();
           }
        });
        btnKhulna.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DescriptionActivity.class);
                intent.putExtra("division","khulna");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Khulna", Toast.LENGTH_SHORT).show();
            }
        });
        btnSylhet.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
               Intent intent=new Intent(HomeActivity.this,DescriptionActivity.class);
                intent.putExtra("division","sylhet");
               startActivity(intent);
               Toast.makeText(HomeActivity.this, "Sylhet", Toast.LENGTH_SHORT).show();
            }
        });
       btnMymensingh.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
              Intent intent=new Intent(HomeActivity.this,DescriptionActivity.class);
               intent.putExtra("division","mymensingh");
              startActivity(intent);
               Toast.makeText(HomeActivity.this, "Mymensingh", Toast.LENGTH_SHORT).show();
           }
       });

        btnRangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DescriptionActivity.class);
                intent.putExtra("division","rangpur");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Rangpur", Toast.LENGTH_SHORT).show();
            }
        });

        btnBarisal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DescriptionActivity.class);
                intent.putExtra("division","barisal");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Barisal", Toast.LENGTH_SHORT).show();
            }
        });
   }
}