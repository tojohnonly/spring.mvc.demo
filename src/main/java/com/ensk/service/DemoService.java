package com.ensk.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String getProduct() {
        return "iPhone 11 Pro Max";
    }

    public String getProductByType(String type) {
        if ("phone".equals(type)) {
            return "iPhone 11 Pro Max";
        } else if ("car".equals(type)) {
            return "Nissan GT-R R36";
        } else {
            return "unknown type";
        }
    }

}
