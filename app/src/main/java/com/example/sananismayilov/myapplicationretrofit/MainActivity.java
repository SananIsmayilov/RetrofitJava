package com.example.sananismayilov.myapplicationretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.sananismayilov.myapplicationretrofit.RetrofitC.ConteynerToProducts;
import com.example.sananismayilov.myapplicationretrofit.RetrofitC.Product;
import com.example.sananismayilov.myapplicationretrofit.RetrofitC.RetrofitInterface;
import com.example.sananismayilov.myapplicationretrofit.RetrofitC.RetrofitUtils;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Button button;
    RetrofitInterface retrofitInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        retrofitInterface = RetrofitUtils.retrofitInterface();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retrofitInterface.getAllData().enqueue(new Callback<ConteynerToProducts>() {
                    @Override
                    public void onResponse(Call<ConteynerToProducts> call, Response<ConteynerToProducts> response) {
                        List<Product> products = response.body().getProducts();

                        for (int i =0;i<products.size();i++){
                            Log.e( "","---- "+String.valueOf(i) + " : products -----");
                        Log.e("product_name",products.get(i).getProductName() );
                        Log.e("product_model",products.get(i).getProductModel() );}
                    }

                    @Override
                    public void onFailure(Call<ConteynerToProducts> call, Throwable t) {
                        System.out.println("sout" + t.getLocalizedMessage());
                    }
                });
            }
        });
    }
}