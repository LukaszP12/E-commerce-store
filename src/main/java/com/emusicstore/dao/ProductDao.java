package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList() {
        Product product = new Product();

        product.setProductName("Guitar1");
        product.setProductCategory("Instrument");
        product.setProductDescription("This is a fender strat guitar!");
        product.setProductPrice(1200);
        product.setProductCondition("new");
        product.setProductStatus("Active");
        product.setUnitInStock(11);
        product.setProductManufacturer("Fender");

        productList = new ArrayList<Product>();
        productList.add(product);

        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

}
