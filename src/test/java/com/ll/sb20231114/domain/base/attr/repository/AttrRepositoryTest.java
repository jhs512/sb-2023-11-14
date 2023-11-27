package com.ll.sb20231114.domain.base.attr.repository;

import com.ll.sb20231114.domain.base.attr.entity.Attr;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
public class AttrRepositoryTest {
    @Autowired
    private AttrRepository arrtRepository;

    @DisplayName("attr 저장")
    @Test
    @Rollback(false)
    void t1() {
        Attr attr = Attr.builder()
                .createDate(LocalDateTime.now())
                .name("age")
                .build();
        arrtRepository.save(attr);
        assertThat(attr.getId()).isGreaterThan(0L);
    }

    @DisplayName("attr 저장, 한번 더")
    @Test
    void t2() {
        Attr attr = Attr.builder()
                .createDate(LocalDateTime.now())
                .name("age")
                .build();
        arrtRepository.save(attr);
        assertThat(attr.getId()).isGreaterThan(0L);
    }

    @DisplayName("select count(*) from attr")
    @Test
    void t3() {
        assertThat(arrtRepository.count()).isEqualTo(0);
    }
}
