package com.example.simple_board.board.service;

import com.example.simple_board.board.db.BoardEntity;
import com.example.simple_board.board.model.BoradDto;
import com.example.simple_board.post.service.PostConverter;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardConverter {

    private final PostConverter postConverter;

    public BoradDto toDto(BoardEntity boardEntity) {

        var postList = boardEntity.getPostList()
                .stream()
                .map(postConverter::toDto)
                .collect(Collectors.toList());

        return BoradDto.builder()
                .id(boardEntity.getId())
                .boardName(boardEntity.getBoardName())
                .status(boardEntity.getStatus())
                .postList(postList)
                .build()
                ;
    }
}
