package com.demo.sintec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.sintec.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
