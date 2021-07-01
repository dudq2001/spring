package com.example.doquangdu_csw.controller;

import com.example.doquangdu_csw.entity.ProductEntity;
import com.example.doquangdu_csw.model.BaseResponse;
import com.example.doquangdu_csw.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class HomeController {

    @Autowired
    ProductService productService;


    @GetMapping
    public ResponseEntity getProduct(){

        BaseResponse res = new BaseResponse();
        res.data = productService.getAll();
        return ResponseEntity.ok(res);
    }
    @PostMapping
    public  BaseResponse createProduct(@RequestBody ProductEntity p){
        BaseResponse res = new BaseResponse();
        res.data = productService.createProduct((ProductEntity) p);
        return res;
    }
    @PutMapping("/{id}")
    public BaseResponse updateProduct(@RequestBody ProductEntity p){
              BaseResponse res = new BaseResponse();
              res.data = productService.updateProduct( p );
              return res;

    }


}
