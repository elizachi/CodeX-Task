package com.example.codex.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "notes")
public class NoteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "note_id_seq")
    private Long noteId;

    private String title;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private AuthorEntity authorEntity;
}
