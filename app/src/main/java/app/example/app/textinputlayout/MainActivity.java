package app.example.app.textinputlayout;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextInputLayout nameLayout, passwordLayout;
    TextInputEditText nameInput, passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameLayout = (TextInputLayout) findViewById(R.id.user_layout);
        passwordLayout = (TextInputLayout) findViewById(R.id.password_layout);
        nameInput = (TextInputEditText) findViewById(R.id.username);
        passwordInput = (TextInputEditText) findViewById(R.id.password);
        passwordLayout.setPasswordVisibilityToggleEnabled(true);
    }

    public void getLogin(View v){
        if(nameInput.getText().toString().isEmpty()){
            nameLayout.setError("Please enter the username");
        }if(passwordInput.getText().toString().isEmpty()){
            passwordLayout.setError("Please enter the password");
        }if(passwordInput.getText().toString().length() < 6){
            passwordLayout.setError("Password length should be more than 6");
        }else{
            nameLayout.setError(null);
            passwordLayout.setError(null);
        }
    }
}
