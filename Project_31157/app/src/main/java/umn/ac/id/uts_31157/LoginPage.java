package umn.ac.id.uts_31157;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class LoginPage extends AppCompatActivity {
    private EditText username,password;
    private String user = "uasmobile";
    private String pass = "uasmobilegenap";
    private Button submitLogin;
    private TextView warning;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        init();
        setOnClick();
    }
    private void init(){
        username = findViewById(R.id.userid);
        password = findViewById(R.id.pass);
        submitLogin = findViewById(R.id.submit_login);
        warning = findViewById(R.id.warning);
    }
    private void setOnClick(){
        submitLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempUser = username.getText().toString(), tempPass = password.getText().toString();

                if(tempUser.equals(user) && tempPass.equals(pass)){
                    Intent SongList = new Intent(LoginPage.this, ListSong.class);
                    startActivity(SongList);
                }else{
                    warning.setText("Incorrect username or password");
                }
            }
        });
    }

}


