package com.poc.cxf.soap.service.impl;

import java.util.UUID;

import javax.jws.WebService;

import com.poc.cxf.soap.ProductService;
import com.poc.cxf.soap.model.Product;

/**
 * Implementation for {@link com.poc.cxf.soap.ProductService}
 */
@WebService(endpointInterface = "com.poc.cxf.soap.ProductService", serviceName = "productService")
public class ProductServiceImpl implements ProductService {

    /**
     * {@inheritDoc}
     */
    @Override
    public Product readProduct(UUID productId) {
        return new Product("Product1", "product1 description");
    }
}
