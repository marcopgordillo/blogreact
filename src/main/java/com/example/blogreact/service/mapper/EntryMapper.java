package com.example.blogreact.service.mapper;

import com.example.blogreact.domain.*;
import com.example.blogreact.service.dto.EntryDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Entry and its DTO EntryDTO.
 */
@Mapper(componentModel = "spring", uses = {TagMapper.class, BlogMapper.class, CategoryMapper.class})
public interface EntryMapper extends EntityMapper<EntryDTO, Entry> {

    @Mapping(source = "blog.id", target = "blogId")
    @Mapping(source = "blog.title", target = "blogTitle")
    @Mapping(source = "category.id", target = "categoryId")
    @Mapping(source = "category.name", target = "categoryName")
    EntryDTO toDto(Entry entry);

    @Mapping(source = "blogId", target = "blog")
    @Mapping(source = "categoryId", target = "category")
    Entry toEntity(EntryDTO entryDTO);

    default Entry fromId(Long id) {
        if (id == null) {
            return null;
        }
        Entry entry = new Entry();
        entry.setId(id);
        return entry;
    }
}
