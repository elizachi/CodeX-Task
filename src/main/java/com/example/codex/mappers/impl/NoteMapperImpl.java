package com.example.codex.mappers.impl;

import com.example.codex.domain.dto.NoteDto;
import com.example.codex.domain.entities.NoteEntity;
import com.example.codex.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class NoteMapperImpl implements Mapper<NoteEntity, NoteDto> {

    private ModelMapper modelMapper;

    public NoteMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public NoteDto mapTo(NoteEntity noteEntity) {
        return modelMapper.map(noteEntity, NoteDto.class);
    }

    @Override
    public NoteEntity mapFrom(NoteDto noteDto) {
        return modelMapper.map(noteDto, NoteEntity.class);
    }
}
