package com.cwgx.newhorizon.repositories;

import com.cwgx.newhorizon.model.ItemImage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ItemImageRepository extends CrudRepository<ItemImage, Integer> {
    @Query(value = "SELECT * FROM item_image WHERE id_item_image = ?1", nativeQuery = true)
    ItemImage itemFindById(Integer id);
}