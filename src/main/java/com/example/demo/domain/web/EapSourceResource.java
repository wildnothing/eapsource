package com.example.demo.domain.web;

import com.example.demo.domain.EapSourceEntity;
import lombok.Data;

@Data
public class EapSourceResource {

    private final String type;
    private final String name;

    public EapSourceResource(EapSourceEntity entity) {
        this.type = entity.getType();
        this.name = entity.getName();
    }
}
