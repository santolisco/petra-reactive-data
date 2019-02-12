package com.bat.petra.data.repository;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    ProductRepository myProductRep;

    public String getProductId(String Prod) {
        return myProductRep.getProductId(Prod);
    }
}
