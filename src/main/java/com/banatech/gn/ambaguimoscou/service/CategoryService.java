package com.banatech.gn.ambaguimoscou.service;

import com.banatech.gn.ambaguimoscou.model.CategoryDTO;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    public List<CategoryDTO> getAllCategoryList();
    public void save(CategoryDTO categoryDTO);
    public CategoryDTO findById(Integer id);
    public CategoryDTO update(Integer id);
    public void delete(CategoryDTO categoryDTO);
}
