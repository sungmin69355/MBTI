package com.mbti.core.domain.mbti.service;

import com.mbti.core.domain.mbti.repository.MbtiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MbtiService {
    private final MbtiRepository mbtiRepository;

}
