package com.example.momento3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class shopActivity extends BaseActivity {

    private EditText etShirt, etPants, etShoes;
    private Button btnShirt, btnPants, btnShoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        etShirt = (EditText) findViewById(R.id.et_quantity_shirt_shop);
        etPants = (EditText)findViewById(R.id.et_quantity_pants_shop);
        etShoes = (EditText)findViewById(R.id.et_quantity_shoes_shop);

        btnShirt = (Button)findViewById(R.id.btn_add_shirt_shop);
        btnPants = (Button)findViewById(R.id.btn_add_pants_shop);
        btnShoes = (Button)findViewById(R.id.btn_add_shoes_shop);

        btnShirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int value = getShirts();
                    if (value<=0){
                        createToast(getBaseContext(), "No hay camisas en stock");
                    }else {
                        String number = etShirt.getText().toString();
                        updateShirts(lessShirts, Integer.parseInt(number));
                        createToast(getBaseContext(), "Compra realizada satisfactoriamente");
                        etShirt.setText("");
                    }
                }catch (Exception e){
                    createToast(getBaseContext(), "Debe llenar correctamente los campos");
                }
            }
        });

        btnPants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int value = getPants();
                    if (value<=0){
                        createToast(getBaseContext(), "No hay camisas en stock");
                    }else {
                        String number = etPants.getText().toString();
                        updatePants(lessShirts, Integer.parseInt(number));
                        createToast(getBaseContext(), "Compra realizada satisfactoriamente");
                        etPants.setText("");
                    }
                }catch (Exception e){
                    createToast(getBaseContext(), "Debe llenar correctamente los campos");
                }
            }
        });

        btnShoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int value = getShoes();
                    if (value<=0){
                        createToast(getBaseContext(), "No hay camisas en stock");
                    }else {
                        String number = etShoes.getText().toString();
                        updateShoes(lessShirts, Integer.parseInt(number));
                        createToast(getBaseContext(), "Compra realizada satisfactoriamente");
                        etShoes.setText("");
                    }
                }catch (Exception e){
                    createToast(getBaseContext(), "Debe llenar correctamente los campos");
                }
            }
        });
    }
}