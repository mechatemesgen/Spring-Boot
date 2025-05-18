package com.example.assignment.controller;

import com.example.assignment.model.Board;
import com.example.assignment.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/boards")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping
    public String listBoards(Model model) {
        model.addAttribute("boards", boardService.findAll());
        return "board_list";
    }

    @GetMapping("/new")
    public String newBoardForm(Model model) {
        model.addAttribute("board", new Board());
        return "board_form";
    }

    @PostMapping
    public String createBoard(@ModelAttribute Board board) {
        boardService.save(board);
        return "redirect:/boards";
    }
}
