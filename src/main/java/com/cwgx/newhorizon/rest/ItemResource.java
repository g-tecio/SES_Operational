package com.cwgx.newhorizon.rest;

import com.cwgx.newhorizon.model.Item;
import com.cwgx.newhorizon.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ItemResource {
    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping(path = "/item", method = RequestMethod.GET)
    public @ResponseBody Iterable<Item> getAllUsers() {
        // This returns a JSON or XML with the users
        return itemRepository.findAll();
    }
    @RequestMapping(path = "/item/{itemName}", method = RequestMethod.GET)
    public @ResponseBody Item userFindByName(@PathVariable String itemName) {
        // This returns a JSON or XML with the users
        return itemRepository.itemFindByName(itemName);
    }

    /*@PostMapping("/item/post")
    Item newCategory(@RequestBody Item newCategory){
        return itemRepository.save(newCategory);
    }*/


    @PostMapping("/item/post")
    Item newItem(@RequestBody Item newItem){
        final String uri = "http://localhost:8080/item/post";

        RestTemplate restTemplate = new RestTemplate();
        Item result = restTemplate.postForObject(uri, newItem, Item.class);
        //return eventRepository.save(newEvent);
        return itemRepository.findItemById(1);
    }

}