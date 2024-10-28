package org.example.test.repository;

import org.example.test.entity.CategoryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    //Tìm Kiem theo noi dung tên
    List<CategoryEntity> findByNameContaining(String name);

    //Tìm kiếm và Phân trang
    Page<CategoryEntity> findByNameContaining(String name, Pageable pageable);
}