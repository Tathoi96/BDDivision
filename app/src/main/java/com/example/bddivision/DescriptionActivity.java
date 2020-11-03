package com.example.bddivision;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    ImageView imgDivision;
   TextView txtName,txtDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        imgDivision=findViewById(R.id.img_division);
       txtName=findViewById(R.id.txt_name);
       txtDescription=findViewById(R.id.txt_description);

        String getDivision=getIntent().getExtras().getString("division");

        if(getDivision.equals("dhaka"))
       {
            imgDivision.setImageResource(R.drawable.dhaka);
           txtName.setText("Dhaka");
            txtDescription.setText(R.string.division1);
        }

   else if(getDivision.equals("chittagong"))
        {
           imgDivision.setImageResource(R.drawable.ctg);
           txtName.setText("Chittagong");
            txtDescription.setText(R.string.division2);
       }
       else if(getDivision.equals("rajshahi"))
        {
            imgDivision.setImageResource(R.drawable.rajshahi);
            txtName.setText("Rajshahi");
            txtDescription.setText(R.string.division3);
       }
     else  if(getDivision.equals("sylhet"))
       {
            imgDivision.setImageResource(R.drawable.sylhet);
            txtName.setText("Sylhet");
            txtDescription.setText(R.string.division4);
        }
            else  if(getDivision.equals("khulna"))
        {
           imgDivision.setImageResource(R.drawable.khulna);
           txtName.setText("Khulna");
            txtDescription.setText(R.string.division5);
        }
        else  if(getDivision.equals("mymensingh"))
        {
            imgDivision.setImageResource(R.drawable.mymensingh);
            txtName.setText("Mymensingh");
            txtDescription.setText(R.string.division6);
      }

        else  if(getDivision.equals("rangpur"))
        {
            imgDivision.setImageResource(R.drawable.rangpur);
            txtName.setText("Rangpur");
            txtDescription.setText(R.string.division7);
        }
        else  if(getDivision.equals("barisal"))
        {
            imgDivision.setImageResource(R.drawable.barisal);
            txtName.setText("Barisal");
            txtDescription.setText(R.string.division8);
        }






    }
}