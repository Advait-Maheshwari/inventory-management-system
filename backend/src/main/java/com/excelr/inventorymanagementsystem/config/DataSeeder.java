package com.excelr.inventorymanagementsystem.config;

import com.excelr.inventorymanagementsystem.model.Item;
import com.excelr.inventorymanagementsystem.repository.ItemRepository;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSeeder {
  @Bean
  CommandLineRunner seed(ItemRepository repo) {
    return args -> {
      if (repo.count() == 0) {
        List.of(new Item("Laptop Units", "Admin", "Active"), new Item("Barcode Scanners", "Manager", "Review"), new Item("Packing Boxes", "Team", "Planned")).forEach(repo::save);
      }
    };
  }
}
