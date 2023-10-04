package com.example.codex.services.impl;

import com.example.codex.domain.entities.NoteEntity;
import com.example.codex.repositories.NoteRepository;
import com.example.codex.services.NoteService;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImpl implements NoteService {

    private NoteRepository noteRepository;

    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public NoteEntity createNote(Long noteId, NoteEntity noteEntity) {
        noteEntity.setNoteId(noteId);
        return noteRepository.save(noteEntity);
    }
}
