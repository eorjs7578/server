package com.d108.project.domain.forum.reply.domain;

import com.d108.project.domain.common.BaseTimeEntity;
import com.d108.project.domain.forum.board.domain.Board;
import com.d108.project.domain.forum.post.domain.Post;
import com.d108.project.domain.member.domain.Member;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "replies")
public class Reply extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    private String content;
}