package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article;
    private String content;

    private LocalDateTime createdAt;
    private String cratedBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
