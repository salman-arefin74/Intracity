package project.com.intracity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Register extends AppCompatActivity {
    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void onRegClick(View v){
        if(v.getId() == R.id.RegButton){
            EditText username = (EditText)findViewById(R.id.RegId);
            EditText passw = (EditText)findViewById(R.id.RegPw);
            EditText passmw = (EditText)findViewById(R.id.RegmPw);
            String userstr = username.getText().toString();
            String passstr = passw.getText().toString();
            String passstr2 = passmw.getText().toString();

            if(!passstr.equals(passstr2)){
                Toast pass = Toast.makeText(Register.this, "Passwords don't match", Toast.LENGTH_SHORT);
                pass.show();
            }
            else{
                Contact c = new Contact();
                c.set_id(userstr);
                c.set_pass(passstr);
                helper.insertContact(c);
                Intent j = new Intent(Register.this, Student_login.class);
                startActivity(j);
            }
        }

    }

    //final EditText RegId = (EditText)findViewById(R.id.RegId);
    //final EditText RegPw = (EditText)findViewById(R.id.RegPw);

    //final Button RegBtn = (Button)findViewById(R.id.RegBtn);



}
