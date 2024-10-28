package org.example.test.service;

import org.example.test.entity.CategoryEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    <S extends CategoryEntity> S save(S entity);

    List<CategoryEntity> findAll();

    Page<CategoryEntity> findAll(Pageable pageable);

    List<CategoryEntity> findAll(Sort sort);

    List<CategoryEntity> findAllById(Iterable<Long> ids);

    Optional<CategoryEntity> findById(Long id);

    <S extends CategoryEntity> Optional<S> findOne(Example<S> example);

    long count();

    void deleteById(Long id);

    void delete(CategoryEntity entity);

    void deleteAll();

    List<CategoryEntity> findByNameContaining(String name);

    Page<CategoryEntity> findByNameContaining(String name, Pageable pageable);
}
