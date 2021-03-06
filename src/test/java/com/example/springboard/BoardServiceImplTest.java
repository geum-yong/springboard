package com.example.springboard;

import com.example.springboard.board.service.BoardService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardServiceImplTest {
    @Autowired
    BoardService boardService;

    @Test
    public void boardService_null_check() {
        assertThat(boardService).isNotNull();
    }
}
