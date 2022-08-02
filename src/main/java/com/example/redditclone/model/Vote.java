package com.example.redditclone.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

public class Vote {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long voteId;
    private VoteType voteType;
    @NotNull
    @ManyToOne(fetch=LAZY)
    @JoinColumn(name="postId", referencedColumnName="postId")
    private Post post;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name="userId", referencedColumnName = "userId")
    private User user;
}
