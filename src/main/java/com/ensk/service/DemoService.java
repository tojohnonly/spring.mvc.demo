package com.ensk.service;

import com.ensk.entity.Product;
import com.ensk.exception.BusinessException;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public Product getProduct() {
        return new Product(1, "Nissan GT-R R36", "car", 136.66);
    }

    public Product getProductByType(String type) {
        if ("phone".equals(type)) {
            return new Product(2, "iPhone 11 Pro Max", "phone", 66.67);
        } else if ("car".equals(type)) {
            return new Product(1, "Nissan GT-R R36", "car", 136.66);
        } else {
            throw new BusinessException("Unknown Type");
        }
    }
}
