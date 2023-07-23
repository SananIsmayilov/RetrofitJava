package com.example.sananismayilov.myapplicationretrofit.RetrofitC;



import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ConteynerToProducts {

    @SerializedName("Products")
    @Expose
    private List<Product> products;
    @SerializedName("success")
    @Expose
    private Integer success;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

}
