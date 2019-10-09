package net.friend.spring.data.service;

import net.friend.spring.data.model.Category;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public interface CategoryService
{
	@Transactional
	Category save(Category category);

	@Transactional
	void updateCaregory(Long id,String name);
	
	@Transactional
	List<Category> findByType(String type, int pageIndex, int pageSize);
}
