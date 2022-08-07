package com.mbti.core.domain.mbti.repository;


import com.mbti.core.domain.mbti.entity.BloodType;
import com.mbti.core.domain.mbti.entity.Mbti;
import com.mbti.core.domain.mbti.entity.PersonalityType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MbtiCoreRepository {

    private final EntityManager em;

    public List<Mbti> findByMbti(PersonalityType menPersonalityType, PersonalityType womenPersonalityType) {
        List<Mbti> result = em.createQuery("select m from Mbti m where m.menPersonalityType = :menPersonalityType and  " +
                "m.womenPersonalityType = :womenPersonalityType", Mbti.class)
                .setParameter("menPersonalityType", menPersonalityType)
                .setParameter("womenPersonalityType", womenPersonalityType)
                .getResultList();
        return result;
    }
}
