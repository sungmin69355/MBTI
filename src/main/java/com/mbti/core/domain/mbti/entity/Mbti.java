package com.mbti.core.domain.mbti.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) //protected로 new 생성 불가하게
public class Mbti {
    @Id
    @GeneratedValue @Column(name = "mbti_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private PersonalityType menPersonalityType;

    @Enumerated(EnumType.STRING)
    private PersonalityType womenPersonalityType;

    @Enumerated(EnumType.STRING)
    private BloodType menBloodType;

    @Enumerated(EnumType.STRING)
    private BloodType womenBloodType;

    private Long compatibilityScore;

    public Mbti(PersonalityType menPersonalityType, PersonalityType womenPersonalityType, BloodType menBloodType, BloodType womenBloodType) {
        this.menPersonalityType = menPersonalityType;
        this.womenPersonalityType = womenPersonalityType;
        this.menBloodType = menBloodType;
        this.womenBloodType = womenBloodType;
    }

    //==생성 메서드==//
    private Mbti createMbti(PersonalityType menPersonalityType, PersonalityType womenPersonalityType, BloodType menBloodType, BloodType womenBloodType ){
        Mbti mbti = new Mbti(menPersonalityType, womenPersonalityType, menBloodType, womenBloodType);
        return mbti;
    }
}
