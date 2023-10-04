package com.example.codex.repositories;

import com.example.codex.domain.entities.NoteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<NoteEntity, Long> {
// TODO заменить здесь <Note, Long> на другое, соответсвующее видео
}