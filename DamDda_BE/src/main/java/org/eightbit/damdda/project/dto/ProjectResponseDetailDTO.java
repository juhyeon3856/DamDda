package org.eightbit.damdda.project.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProjectResponseDetailDTO {
    private Long id;
    private String title;       // 프로젝트 명
    private String description;     // 프로젝트 설명
    private String descriptionDetail;     // 프로젝트 상세설명
    private Long fundsReceive;  //받은 후원금
    private Long targetFunding; // 목표액
    private String nickName;    //프로젝트 진행자 닉네임
    private LocalDateTime startDate;    // 프로젝트 시작일
    private LocalDateTime endDate;  //프로젝트 마감일
    private Long supporterCnt;  //후원자수
    private Long likeCnt;   //좋아요 한 사람 수
    private String category;    // 카테고리
    private String thumbnailUrl; // 이미지-사진5장이랑 설명이미지 같이 들어있을듯
    private List<String> productImages; // 이미지-사진5장이랑 설명이미지 같이 들어있을듯
    private List<String> descriptionImages; // 이미지-사진5장이랑 설명이미지 같이 들어있을듯
    private List<String> tags;  //태그-아마도 tags.getName()으로 하시면 될듯
    private boolean Liked;  // 좋아요 했는지 여부(T/F)

}
