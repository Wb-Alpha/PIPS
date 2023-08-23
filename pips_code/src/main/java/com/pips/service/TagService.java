package com.pips.service;

import com.pips.pojo.Tag;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TagService {
    public List<Tag> findAllTag();

    public Tag findTagById(String id);

    public void addTag(Tag tag);

    public void deleteTagById(String id);

    public void alterTag(Tag tag);
}
