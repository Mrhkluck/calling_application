package mrhk.net.calling_app;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et_phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_phone = (EditText)findViewById(R.id.et_phone);

    }


    public void Connect(View view) {
        String number = "1234567890";
        Intent intent = new Intent(Intent.ACTION_DIAL); //dial 0r Action_
        intent.setData(Uri.parse("tel:" + number));
        startActivity(intent);
    }

    public void callnow(View view) {
        String number = et_phone.getText().toString().trim();
        if (number.isEmpty()){
            et_phone.setError("empty");
            et_phone.requestFocus();

        }else
        {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel"+number));
            startActivity(intent);
        }
    }
}