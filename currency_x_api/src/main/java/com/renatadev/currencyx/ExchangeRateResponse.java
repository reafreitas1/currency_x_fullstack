package com.renatadev.currencyx;
import java.util.Map;

public record ExchangeRateResponse(
        String result,
        String base_code,
        Map<String, Double> conversion_rates
) {}
