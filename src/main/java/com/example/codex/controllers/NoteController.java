package com.example.codex.controllers;

import com.example.codex.domain.dto.NoteDto;
import com.example.codex.domain.entities.NoteEntity;
import com.example.codex.mappers.Mapper;
import com.example.codex.services.NoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {

    private Mapper<NoteEntity, NoteDto> noteMapper;

    private NoteService noteService;

    public NoteController(Mapper<NoteEntity, NoteDto> noteMapper, NoteService noteService) {
        this.noteMapper = noteMapper;
        this.noteService = noteService;
    }

    @PutMapping("/notes/{note_id}")
    public ResponseEntity<NoteDto> createNote(@PathVariable("note_id") Long noteId,
                                                 @RequestBody NoteDto noteDto) {
        NoteEntity noteEntity = noteMapper.mapFrom(noteDto);
        NoteEntity savedNoteEntity = noteService.createNote(noteId, noteEntity);

        NoteDto savedNoteDto = noteMapper.mapTo(savedNoteEntity);
        return new ResponseEntity<>(savedNoteDto, HttpStatus.CREATED);
    }
}
