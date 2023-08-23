package com.pips.service.impl;

import com.pips.pojo.Tag;
import com.pips.service.TagService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Override
    public List<Tag> findAllTag() {
        return null;
    }

    @Override
    public Tag findTagById(String id) {
        return null;
    }

    @Override
    public void addTag(Tag tag) {

    }

    @Override
    public void deleteTagById(String id) {

    }

    @Override
    public void alterTag(Tag tag) {

    }
}
