package com.example.sananismayilov.myapplicationretrofit.RetrofitC;

public class RetrofitUtils {
   public static String BASE_URL = "https://senan2.000webhostapp.com/";

   public static RetrofitInterface retrofitInterface (){
       return RetrofitClient.getRetrofit(BASE_URL).create(RetrofitInterface.class);

   }

}
