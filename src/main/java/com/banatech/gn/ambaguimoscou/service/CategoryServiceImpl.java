package com.banatech.gn.ambaguimoscou.service;

import com.banatech.gn.ambaguimoscou.domain.Category;
import com.banatech.gn.ambaguimoscou.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

public class CategoryServiceImpl implements CategoryService{
    private CategoryRepository categoryRepository;
    public  CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }
    @Override
    public Category saveCategory(Category category) {
         category=categoryRepository.save(category);
        return category;
    }

    @Override
    public Optional<Category> listCategory() {
        List<Category> listsCategory=categoryRepository.findAll();
        return Optional.empty();
    }

    @Override
    public Category findCategory(Category category) {
        return null;
    }

    @Override
    public Category updateCategory(Category category) {
        return null;
    }

    @Override
    public void removeCategory(Category category) {

    }
}
