package com.example.yenan.test0409;


import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int size = 30;

    private EditText id;
    private EditText name;
    private EditText email;
    private Button send;
    private TextView printout;
    private int text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findviews();
    }

    private void findviews() {
        id = findViewById(R.id.editText2);
        name = findViewById(R.id.editText3);
        email = findViewById(R.id.editText4);
        send = findViewById(R.id.button);
        printout = findViewById(R.id.textView);
    }

    public void printresult(View v){
        String i = id.getText().toString();
        String n = name.getText().toString();
        String e = email.getText().toString();
        /*printout.setTextSize(size);
        printout.setText(i + n + e);*/
        //Toast.makeText(this, "學號: " + i + "\n " + n + "您好" + "\n 您的E-mail是: " + e,Toast.LENGTH_LONG).show();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("學號: " + i + "\n " +  n + "您好"  + "\n 您的E-mail是: " + e);
        builder.setTitle("Print");
        builder.setPositiveButton( "OK", null);
        builder.setNeutralButton("Nothing", null);
        builder.setNegativeButton("Cancel",  null);
        builder.show();

    }
    public void printresult2(View v){
        String i = id.getText().toString();
        String n = name.getText().toString();
        String e = email.getText().toString();
        /*printout.setTextSize(size);
        printout.setText(i + n + e);*/
        Toast.makeText(this, "學號: " + i + "\n " + n + "您好" + "\n 您的E-mail是: " + e,Toast.LENGTH_LONG).show();
       /* AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("學號: " + i + "\n " +  n + "您好"  + "\n 您的E-mail是: " + e);
        builder.setTitle("Print");
        builder.setPositiveButton( "OK", null);
        builder.setNeutralButton("Nothing", null);
        builder.setNegativeButton("Cancel",  null);
        builder.show();*/

    }
}

