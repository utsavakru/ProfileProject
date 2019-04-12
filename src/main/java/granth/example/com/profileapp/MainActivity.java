package granth.example.com.profileapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText txtemail,txtpasswd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtemail=(EditText)findViewById(R.id.txtemail);
        txtpasswd=(EditText)findViewById(R.id.txtpassword);
        Button btnlogin=(Button)findViewById(R.id.btnlogin);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtemail.getText().toString().equals("rp@gmail.com")||txtpasswd.equals("123456")) {
                    Intent int1 = new Intent(MainActivity.this,PersonActivity.class);
                    startActivity(int1);
                }
                
                }

        });

    }
}
