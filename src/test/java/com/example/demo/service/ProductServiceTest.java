package com.example.demo.service;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    public ProductServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetProductById() {
        Product mockProduct = new Product(1L, "Test Product", 100.0);
        when(productRepository.findById(2L)).thenReturn(Optional.of(mockProduct));

        Optional<Product> product = productService.getProductById(1L);
        assertTrue(product.isPresent());
        assertEquals("Test Product", product.get().getName());
    }
}
