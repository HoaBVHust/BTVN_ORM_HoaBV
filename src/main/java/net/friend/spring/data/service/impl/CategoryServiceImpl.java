package net.friend.spring.data.service.impl;

import net.friend.spring.data.model.Category;
import net.friend.spring.data.repository.CategoryRepository;
import net.friend.spring.data.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService
{
	@Autowired
	private CategoryRepository repository;
	
	@Override
	public Category save(Category category)
	{
		return repository.save(category);
	}

	@Override
	public void updateCaregory(Long id, String name) {
		Integer idInt = Math.toIntExact(id);
		if(repository.exists(idInt)){
			Category category = repository.findOne(idInt);
			repository.delete(idInt);
			repository.save(category);
		}
	}
	
	@Override
	public List<Category> findByType(String type, int pageIndex, int pageSize)
	{
		Page<Category> page = repository.findByTypeId(type, new QPageRequest(pageIndex,
				pageSize));
		return page.getContent();
	}
}
