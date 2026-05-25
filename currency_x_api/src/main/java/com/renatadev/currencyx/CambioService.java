package com.renatadev.currencyx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CambioService {

    @Value("${api.exchangerate.key}")
    private String apiKey;

    public ExchangeRateResponse buscarTaxas() {
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/EUR";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, ExchangeRateResponse.class);
    }
}
