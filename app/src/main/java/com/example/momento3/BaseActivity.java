package com.example.momento3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class BaseActivity extends AppCompatActivity {

    public static boolean moreShirts = true;
    public static boolean lessShirts = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    protected void createToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    protected void updateShirts(boolean type, int quantity) {
        SharedPreferences sharPref = getSharedPreferences("prefFitStore", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharPref.edit();
        int value = sharPref.getInt("shirtsQuantity", 0);
        if (!type) {
            if ((value - quantity) < 0) {
                createToast(getApplicationContext(), "No hay sufiecientes camisas en stock");
            } else {
                editor.putInt("shirtsQuantity", value - quantity);
                editor.apply();
            }
        } else {
            editor.putInt("shirtsQuantity", value + quantity);
            editor.apply();
        }
    }

    protected void fullUpdateShirts(int quantity) {
        SharedPreferences sharPref = getSharedPreferences("prefFitStore", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharPref.edit();

        editor.putInt("shirtsQuantity", quantity);
        editor.apply();
    }

    protected int getShirts() {
        SharedPreferences sharPref = getSharedPreferences("prefFitStore", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharPref.edit();
        return sharPref.getInt("shirtsQuantity", 0);
    }

    protected void updateShoes(boolean type, int quantity) {
        SharedPreferences sharPref = getSharedPreferences("prefFitStore", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharPref.edit();
        int value = sharPref.getInt("shoesQuantity", 0);
        if (!type) {
            if ((value - quantity) < 0) {
                createToast(getApplicationContext(), "No hay sufiecientes zapatos en stock");
            } else {
                editor.putInt("shoesQuantity", value - quantity);
                editor.apply();
            }
        } else {
            editor.putInt("shoesQuantity", value + quantity);
            editor.apply();
        }
    }

    protected void fullUpdateShoes(int quantity) {
        SharedPreferences sharPref = getSharedPreferences("prefFitStore", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharPref.edit();
        editor.putInt("shoesQuantity", quantity);
        editor.apply();
    }

    protected int getShoes() {
        SharedPreferences sharPref = getSharedPreferences("prefFitStore", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharPref.edit();
        return sharPref.getInt("shoesQuantity", 0);
    }

    protected void updatePants(boolean type, int quantity) {
        SharedPreferences sharPref = getSharedPreferences("prefFitStore", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharPref.edit();
        int value = sharPref.getInt("pantsQuantity", 0);
        if (!type) {
            if ((value - quantity) < 0) {
                createToast(getApplicationContext(), "No hay sufiecientes pantalones en stock");
            } else {
                editor.putInt("pantsQuantity", value - quantity);
                editor.apply();
            }
        } else {
            editor.putInt("pantsQuantity", value + quantity);
            editor.apply();
        }
    }

    protected void fullUpdatePants(int quantity) {
        SharedPreferences sharPref = getSharedPreferences("prefFitStore", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharPref.edit();
        editor.putInt("pantsQuantity", quantity);
        editor.apply();
    }

    protected int getPants() {
        SharedPreferences sharPref = getSharedPreferences("prefFitStore", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharPref.edit();
        return sharPref.getInt("pantsQuantity", 0);
    }

    protected void toHome() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    protected void toShop() {
        Intent intent = new Intent(getApplicationContext(), shopActivity.class);
        startActivity(intent);
    }

    protected void toStock() {
        Intent intent = new Intent(getApplicationContext(), stockActivity.class);
        startActivity(intent);
    }
}