package project.com.intracity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Teacher_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_home);
    }
    public void Class(View view){
        Intent intent = new Intent(this, Classroom_1.class);
        startActivity(intent);
    }
    public void addMarks(View view){
        Intent intent = new Intent(this, Marks.class);
        startActivity(intent);
    }
    public void courseMat(View view){
        Intent intent = new Intent(this, Course_material.class);
        startActivity(intent);
    }
}
