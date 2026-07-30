package com.excelr.inventorymanagementsystem.repository;

import com.excelr.inventorymanagementsystem.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {}
