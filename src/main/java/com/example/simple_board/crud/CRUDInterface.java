package com.example.simple_board.crud;

import com.example.simple_board.common.Api;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Pageable;

public interface CRUDInterface<DTO> {

    DTO create(DTO dto);

    Optional<DTO> read(Long id);

    DTO update(DTO dto);

    void delete(Long id);

    Api<List<DTO>> list(Pageable pageable);
}
