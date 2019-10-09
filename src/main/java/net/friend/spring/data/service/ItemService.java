package net.friend.spring.data.service;

import net.friend.spring.data.model.Item;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public interface ItemService
{
	@Transactional
	Item save(Item item);
	
	@Transactional
	List<Item> findByCategory(String category, int pageIndex, int pageSize);
}
