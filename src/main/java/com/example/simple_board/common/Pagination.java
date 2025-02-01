package com.example.simple_board.common;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pagination {

    private Integer page;

    private Integer size;

    private Integer currentElements; //현재 요소

    private Integer totalPage; //전체 페이지

    private Long totalElements; //전체 요소

}
