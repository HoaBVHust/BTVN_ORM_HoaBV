package net.friend.spring.data.repository;

import net.friend.spring.data.model.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ItemRepository extends PagingAndSortingRepository<Item, Integer>
{
	@Query("SELECT obj FROM Category c, Item obj WHERE c.id = " +
			"obj.categoryId AND c.name  = :category")
    Page<Item> findByCategory(String category, Pageable pageable);
	
}
