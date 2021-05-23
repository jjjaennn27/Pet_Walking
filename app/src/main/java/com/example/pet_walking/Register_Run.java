package com.example.pet_walking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Register_Run extends AppCompatActivity implements View.OnClickListener {
    EditText place;
    TextView txtmsg;
    Spinner spinner1, spinner2;
    ImageButton btn_finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.run);

        btn_finish= findViewById(R.id.btn_finish);
        btn_finish.setOnClickListener(this);
        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        place = findViewById(R.id.txtplace);
        txtmsg = findViewById(R.id.txtmsg);

        // 이름 스피너
        ArrayAdapter name = ArrayAdapter.createFromResource(this, R.array.name, android.R.layout.simple_spinner_dropdown_item);
        name.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(name);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });

        // 산책 시간 스피너
        ArrayAdapter time = ArrayAdapter.createFromResource(this, R.array.time, android.R.layout.simple_spinner_dropdown_item);
        time.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(time);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
    }

    @Override
    public void onClick(View v) {
        txtmsg.setText("오늘의 산책정보 등록 완료!");

        //산책 정보 저장
        FirebaseDatabase firebaseDatabase= FirebaseDatabase.getInstance();
        DatabaseReference rootRef= firebaseDatabase.getReference();
        String Person = spinner1.getSelectedItem().toString(); //사람
        String Time = spinner2.getSelectedItem().toString(); //시간
        String Place = place.getText().toString(); //장소

        Walk walk = new Walk(Person, Time, Place);

        DatabaseReference walkRef = rootRef.child("walk");
        walkRef.push().setValue(walk);


    }
}