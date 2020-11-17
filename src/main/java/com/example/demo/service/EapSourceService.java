package com.example.demo.service;

import com.example.demo.domain.EapSourceEntity;

public interface EapSourceService {

    EapSourceEntity createEapSource(String type, String name);
}
