package com.example.springboard.board.service;

import com.example.springboard.board.dto.BoardDto;

import java.util.List;

public interface BoardService {
    List<BoardDto> selectBoardList() throws Exception;
}