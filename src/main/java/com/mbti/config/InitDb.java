package com.mbti.config;

import com.mbti.core.domain.mbti.entity.BloodType;
import com.mbti.core.domain.mbti.entity.Mbti;
import com.mbti.core.domain.mbti.entity.PersonalityType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
public class InitDb {

    private final InitService initService;

    @PostConstruct  //한번만 실행하게 Test
    public void init() {
        initService.dbInsertMbti();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {
        private final EntityManager em;

        public void dbInsertMbti() {

            for(PersonalityType manPersonality : PersonalityType.values()){
                for(BloodType menBlood : BloodType.values()){
                    for(PersonalityType womanPersonality : PersonalityType.values()){
                        for(BloodType womenBlood : BloodType.values()){
                            Mbti mbti = new Mbti(manPersonality, womanPersonality,menBlood, womenBlood);
                            em.persist(mbti);
                        }
                    }
                }
            }

        }
    }
}
