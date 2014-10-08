package com.poc.cxf.soap;

import java.util.UUID;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.poc.cxf.soap.model.Product;

/**
 * ProductService implementation for REST services
 */
@WebService
public interface ProductService {

    @WebMethod(operationName = "readProduct")
    Product readProduct(UUID productId);
}
