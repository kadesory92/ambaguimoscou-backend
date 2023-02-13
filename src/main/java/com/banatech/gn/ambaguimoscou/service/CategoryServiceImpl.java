package com.banatech.gn.ambaguimoscou.service;

import com.banatech.gn.ambaguimoscou.domain.Category;
import com.banatech.gn.ambaguimoscou.model.CategoryDTO;
import com.banatech.gn.ambaguimoscou.model.ModelMappersDTO;
import com.banatech.gn.ambaguimoscou.repository.CategoryRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class CategoryServiceImpl implements CategoryService{
    private CategoryRepository categoryRepository;
    private ModelMappersDTO dtoModelMapper;
    @Override
    public List<CategoryDTO> getAllCategoryList() {
        List<Category> categories = categoryRepository.findAll();
        List<CategoryDTO> categoryDTOS = categories.stream()
                .map(category -> dtoModelMapper.categoryToCategoryDTO(category))
                .collect(Collectors.toList());
        return categoryDTOS;
    }

    @Override
    public void save(CategoryDTO categoryDTO) {

    }

    @Override
    public CategoryDTO findById(Integer id) {
        return null;
    }

    @Override
    public CategoryDTO update(Integer id) {
        return null;
    }

    @Override
    public void delete(CategoryDTO categoryDTO) {

    }
}
