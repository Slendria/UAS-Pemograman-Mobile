package edu.uph.midtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class regis extends AppCompatActivity {
    Button button3;
    EditText NoTelp, Email, Nama, Uname, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);
        NoTelp = (EditText) findViewById(R.id.noTelp);
        Email = (EditText) findViewById(R.id.email);
        Nama = (EditText) findViewById(R.id.nama);
        Uname = (EditText) findViewById(R.id.uname);
        Password = (EditText) findViewById(R.id.password);


        button3 = (Button) findViewById(R.id.bttn3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (NoTelp.getText().toString().length() == 0) {
                    //notelp ga berisi
                    NoTelp.setError("No Telp dibutuhkan!");
                    Toast.makeText(getApplicationContext(), "Isi Nomor Telepon!",
                            Toast.LENGTH_SHORT).show();
                } else if (Email.getText().toString().length() == 0) {
                    //email kosong
                    Email.setError("Email diperlukan!");
                    Toast.makeText(getApplicationContext(), "Silahkan masukkan Email!",
                            Toast.LENGTH_SHORT).show();
                } else if (Nama.getText().toString().length() == 0) {
                    //nama kosong
                    Nama.setError("Isi Nama!");
                    Toast.makeText(getApplicationContext(), "Silahkan mengisi Nama!",
                            Toast.LENGTH_SHORT).show();
                } else if (Uname.getText().toString().length() == 0) {
                    //uname kosong
                    Uname.setError("Username diperlukan!");
                    Toast.makeText(getApplicationContext(), "Silahkan masukkan UserName!",
                            Toast.LENGTH_SHORT).show();
                } else if (Password.getText().toString().length() == 0) {
                    //pass kosong
                    Password.setError("Isi Password !");
                    Toast.makeText(getApplicationContext(), "Silahkan masukkan password!",
                            Toast.LENGTH_SHORT).show();
                } else {
                    openMainActivity2();
                }
            }
        });
    }

    public void openMainActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}