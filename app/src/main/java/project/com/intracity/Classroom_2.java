package project.com.intracity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Classroom_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classroom_2);
    }
    public void finalMarks(View view){
        Intent intent = new Intent(this, Final_marks.class);
        startActivity(intent);
    }
}
