package com.banatech.gn.ambaguimoscou.service;

import com.banatech.gn.ambaguimoscou.domain.Category;

import java.util.Optional;

public interface CategoryService {
    Category saveCategory(Category category);
    Optional<Category> listCategory();
    Category findCategory(Category category);
    Category updateCategory(Category category);
    void removeCategory(Category category);
}
