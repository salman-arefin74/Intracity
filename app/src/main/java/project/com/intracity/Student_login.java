package project.com.intracity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Student_login extends AppCompatActivity {

    private Button login, register;
    private EditText editText2, editText4;
    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);
    }
    //public void studentHome(View view){
    //  Intent intent = new Intent(this, Student_home.class);
    //startActivity(intent);
    //}
    //public void Register(View view){
    //  Intent intent = new Intent(this, Register.class);
    // startActivity(intent);
    //}
    public void onButtonClick(View v){
        if(v.getId() == R.id.LoginButton){
            EditText a = (EditText)findViewById(R.id.LoginId);
            String strid = a.getText().toString();
            EditText b = (EditText)findViewById(R.id.LoginPw);
            String strpw = b.getText().toString();


            String password = helper.searchPass(strid);

            if(strpw.equals(password)){
                Intent i = new Intent(Student_login.this, Student_home.class);
                i.putExtra("Roll", strid);
                startActivity(i);
            }
            else{
                Toast temp = Toast.makeText(Student_login.this, "Wrong login info", Toast.LENGTH_SHORT);
                temp.show();
            }

        }
    }

    //final EditText LgnId = (EditText)findViewById(R.id.LoginId);
    //final EditText LgnPw = (EditText)findViewById(R.id.LoginPw);

    //final Button LoginButton = (Button)findViewById(R.id.LoginButton);


}
