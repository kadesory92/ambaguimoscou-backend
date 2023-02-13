package com.banatech.gn.ambaguimoscou.service;

import com.banatech.gn.ambaguimoscou.domain.Post;
import com.banatech.gn.ambaguimoscou.model.PostDTO;

import java.util.List;

public interface PostService {
    public List<PostDTO> getAllPostsList();
    public void save(PostDTO postDTO);
    public PostDTO findById(Integer id);
    public PostDTO update(Integer id);
    public void delete(PostDTO postDTO);
}
