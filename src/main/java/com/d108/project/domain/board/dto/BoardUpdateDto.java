package com.d108.project.domain.board.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BoardUpdateDto {
    private String title;
    private String description;
}
