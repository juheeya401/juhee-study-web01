package com.study.juhee.stringboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass   // 이 클래스를 상속할 경우, 필드명이 이 클래스의 필드명과 같은 컬럼명으로 생성된다.
@EntityListeners(AuditingEntityListener.class)      // Auditing 기능을 포함시킴
public abstract class BaseTimeEntity {

    @CreatedDate    //  Entity가 신규저장될 때 시간 자동저장
    private LocalDateTime createdDate;

    @LastModifiedDate   // 조회한 Entity의 값을 변경할 때 시간이 자동 저장됨.
    private LocalDateTime modifiedDate;
}
