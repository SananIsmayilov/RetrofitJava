package com.example.sananismayilov.myapplicationretrofit.RetrofitC;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    @GET("SaleProject/ProductSaleProject/getAllData.php")
    Call<ConteynerToProducts> getAllData();
}
