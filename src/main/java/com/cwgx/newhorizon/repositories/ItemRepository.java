package com.cwgx.newhorizon.repositories;

import com.cwgx.newhorizon.model.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
    @Query(value = "SELECT * FROM item WHERE name = ?1", nativeQuery = true)
    Item itemFindByName(String name);

    @Query(value = "SELECT * FROM item WHERE id_Item = ?1", nativeQuery = true)
    Item findItemById(Integer id_Item);

    @Query(value = "SELECT * FROM item", nativeQuery = true)
    Item getEverything();
}
