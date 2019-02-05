package com.cwgx.newhorizon.rest;

import com.cwgx.newhorizon.model.StockItem;
import com.cwgx.newhorizon.repositories.StockItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class StockItemResource {
    @Autowired
    private StockItemRepository stockItemRepository;

    @RequestMapping(path = "/stock", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<StockItem> getAllUsers() {
        return stockItemRepository.findAll();
    }

    @RequestMapping(path = "/stock/{stockitem}", method = RequestMethod.GET)
    public @ResponseBody StockItem userFindByName(@PathVariable Integer stockitem) {
        return stockItemRepository.itemStockFindById(stockitem);
    }

    /*@PostMapping("/stock/post")
    StockItem newStockItem(@RequestBody StockItem newStockItem){
        return stockItemRepository.save(newStockItem);
    }
    */

    /*
    From Operational service to REST API
    @PostMapping("/item/post")
    StockItem newItem(@RequestBody StockItem newItem){
        final String uri = "http://localhost:8080/stock/post";

        RestTemplate restTemplate = new RestTemplate();
        StockItem result = restTemplate.postForObject(uri, newItem, StockItem.class);
        //return eventRepository.save(newEvent);
        return stockItemRepository.itemStockFindById(1);
    }
    */
}