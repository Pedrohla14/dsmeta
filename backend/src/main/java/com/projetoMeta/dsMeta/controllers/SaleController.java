package com.projetoMeta.dsMeta.controllers;

import com.projetoMeta.dsMeta.Service.SaleService;
import com.projetoMeta.dsMeta.entities.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/sales")
public class SaleController {

    @Autowired
    private SaleService service;
    @GetMapping
    public List<Sale> findSales(){
        return service.findSales();
    }
}
