package com.cwgx.newhorizon.rest;

import com.cwgx.newhorizon.model.ItemImage;
import com.cwgx.newhorizon.repositories.ItemImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ItemImageResource {
    @Autowired
    private ItemImageRepository itemImageRepository;

    @RequestMapping(path = "/itemimage", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<ItemImage> getAllUsers() {
        // This returns a JSON or XML with the users
        return itemImageRepository.findAll();
    }

    @RequestMapping(path = "/itemimage/{ItemName}", method = RequestMethod.GET)
    public @ResponseBody ItemImage userFindByName(@PathVariable Integer itemName) {
        // This returns a JSON or XML with the users
        return itemImageRepository.itemFindById(itemName);
    }

    /*@PostMapping("/itemimage/post")
    ItemImage newitemimage(@RequestBody ItemImage newitemimage){
        return itemimageRepository.save(newitemimage);
    }
    */

    /*
    From Operational service to REST API
    @PostMapping("/item/post")
    ItemImage newItem(@RequestBody ItemImage newItem){
        final String uri = "http://localhost:8080/itemimage/post";

        RestTemplate restTemplate = new RestTemplate();
        ItemImage result = restTemplate.postForObject(uri, newItem, ItemImage.class);
        //return eventRepository.save(newEvent);
        return itemImageRepository.itemFindById(1);
    }
    */
}