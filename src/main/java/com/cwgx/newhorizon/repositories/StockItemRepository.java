package com.cwgx.newhorizon.repositories;

import com.cwgx.newhorizon.model.StockItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StockItemRepository extends CrudRepository<StockItem, Integer> {
    @Query(value = "SELECT * FROM stock_item WHERE id = ?1", nativeQuery = true)
    StockItem itemStockFindById(Integer id);
}