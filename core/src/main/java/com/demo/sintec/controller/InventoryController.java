package com.demo.sintec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.sintec.model.Inventory;
import com.demo.sintec.repository.InventoryRepository;

@RestController
@RequestMapping("/inventories")
public class InventoryController {

    private InventoryRepository inventoryRepository;

    @Autowired
    public InventoryController(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @GetMapping
    public List<Inventory> getAll(){
        return inventoryRepository.findAll();
    }
}
