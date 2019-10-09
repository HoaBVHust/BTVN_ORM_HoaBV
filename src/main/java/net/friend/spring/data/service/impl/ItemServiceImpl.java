package net.friend.spring.data.service.impl;

import net.friend.spring.data.model.Item;
import net.friend.spring.data.repository.ItemRepository;
import net.friend.spring.data.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService
{
	@Autowired
	private ItemRepository repository;
	
	@Override
	public Item save(Item item)
	{
		return repository.save(item);
	}
	
	@Override
	public List<Item> findByCategory(String category, int pageIndex, int pageSize)
	{
		Page<Item> page = repository.findByCategory(category,
				new QPageRequest(pageIndex, pageSize));
		return page.getContent();
	}
}
