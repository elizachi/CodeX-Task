package com.example.codex.services;

import com.example.codex.domain.entities.NoteEntity;

public interface NoteService {
    NoteEntity createNote(Long noteId, NoteEntity noteEntity);
}
