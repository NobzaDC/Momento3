package com.example.momento3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class stockActivity extends BaseActivity {

    private EditText etShirt, etPants, etShoes;
    private Button btnShirt, btnPants, btnShoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);
        init();
    }

    private void init() {
        etShirt = (EditText) findViewById(R.id.et_quantity_shirt);
        etPants = (EditText)findViewById(R.id.et_quantity_pants);
        etShoes = (EditText)findViewById(R.id.et_quantity_shoes);

        etShirt.setText(""+getShirts());
        etPants.setText(""+getPants());
        etShoes.setText(""+getShoes());

        btnShirt = (Button)findViewById(R.id.btn_add_shirt);
        btnPants = (Button)findViewById(R.id.btn_add_pants);
        btnShoes = (Button)findViewById(R.id.btn_add_shoes);

        btnShirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(etShirt.getText().toString())>0){
                    fullUpdateShirts(Integer.parseInt(etShirt.getText().toString()));
                    createToast(getBaseContext(), "Datos actualizados safistactoriamente");
                }else {
                    Toast.makeText(stockActivity.this, "debe llenar correctamente los datos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnPants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(etPants.getText().toString())>0){
                    fullUpdatePants(Integer.parseInt(etPants.getText().toString()));
                    createToast(getBaseContext(), "Datos actualizados safistactoriamente");
                }else {
                    Toast.makeText(stockActivity.this, "debe llenar correctamente los datos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnShoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(etShoes.getText().toString())>0){
                    fullUpdateShoes(Integer.parseInt(etShoes.getText().toString()));
                    createToast(getBaseContext(), "Datos actualizados safistactoriamente");
                }else {
                    Toast.makeText(stockActivity.this, "debe llenar correctamente los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}