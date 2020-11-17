package com.example.demo.service.impl;

import com.example.demo.domain.EapSourceEntity;
import com.example.demo.repository.EapSourceRepository;
import com.example.demo.service.EapSourceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class EapSourceServiceImpl implements EapSourceService {

    private final EapSourceRepository eapSourceRepository;

    @Override
    public EapSourceEntity createEapSource(String type, String name) {
        log.debug("About to persist");
        return eapSourceRepository.save(new EapSourceEntity(type, name));
    }
}
