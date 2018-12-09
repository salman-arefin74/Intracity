package project.com.intracity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Student_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home);
    }
    public void classroom1(View view){
        Intent intent = new Intent(this, Classroom_1.class);
        startActivity(intent);
    }
    public void classroom2(View view){
        Intent intent = new Intent(this, Classroom_2.class);
        startActivity(intent);
    }
    public void classroom3(View view){
        Intent intent = new Intent(this, Classroom_3.class);
        startActivity(intent);
    }
    public void classroom4(View view){
        Intent intent = new Intent(this, Classroom_4.class);
        startActivity(intent);
    }
    public void classroom5(View view){
        Intent intent = new Intent(this, Classroom_5.class);
        startActivity(intent);
    }
}
