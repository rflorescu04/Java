package com.example.trainingp2;

import com.example.trainingp2.entities.Product;
import com.example.trainingp2.repositories.ProductRepository;
import com.example.trainingp2.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;

@SpringBootTest
class TrainingP2ApplicationTests {

    @MockBean
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    @Test
    void testGetProductsByPrice() {
        List<Product> products= new ArrayList<>();
        Product p1= new Product();
        p1.setPrice(10);

        Product p2= new Product();
        p2.setPrice(13);

        products.add(p1);
        products.add(p2);

        given(productRepository.findAll()).willReturn(products);

        List<Product> result= productService.getProductsByPrice(11);

        for (Product p:result) {
            assertTrue(p.getPrice()>11);
        }
    }

}
