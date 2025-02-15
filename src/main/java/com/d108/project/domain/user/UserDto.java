package com.d108.project.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class UserDto {
    private Long userId;
    private String username;
    private String password;
}
