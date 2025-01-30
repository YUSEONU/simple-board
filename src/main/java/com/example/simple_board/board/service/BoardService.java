package com.example.simple_board.board.service;

import com.example.simple_board.board.db.BoardEntity;
import com.example.simple_board.board.db.BoardRepository;
import com.example.simple_board.board.model.BoardRequest;
import com.example.simple_board.board.model.BoradDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;
    private final BoardConverter boardConverter;

    public BoradDto create(
            BoardRequest boardRequest
    ) {
            var entity = BoardEntity.builder()
                .boardName(boardRequest.getBoardName())
                .status("REGISTERED")
                .build()
                ;

            var saveEntity = boardRepository.save(entity);
            return boardConverter.toDto(saveEntity);
    }

    public BoradDto view(Long id) {
        var entity = boardRepository.findById(id).get();
        return boardConverter.toDto(entity);
    }
}
