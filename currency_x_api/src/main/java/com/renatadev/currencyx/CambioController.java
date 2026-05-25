package com.renatadev.currencyx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cambio")
@CrossOrigin(origins = "http://localhost:4200")
public class CambioController {

    @Autowired
    private CambioService service;

    @GetMapping
    public ExchangeRateResponse getCambio() {
        return service.buscarTaxas();
    }
}