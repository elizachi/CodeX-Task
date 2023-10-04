package com.example.codex.domain.dto;

import com.example.codex.domain.entities.AuthorEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoteDto {

    private Long noteId;

    private String title;

    private AuthorDto authorEntity;

}
