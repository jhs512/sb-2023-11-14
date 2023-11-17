package com.ll.sb20231114.domain.article.article.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Member {
    private Long id;
    private String username;
    private String password;

    public Member(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
