package com.concessionaire.system.concessionaire.car;

public record CarDto(
        Brand brand,
        String model,
        Color color,
        Double price,
        String year) {
}
