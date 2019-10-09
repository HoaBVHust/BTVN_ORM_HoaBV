package net.friend.spring.data.repository;

import net.friend.spring.data.model.Type;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TypeRepository extends PagingAndSortingRepository<Type, Integer>
{
	Type findTypeById(int id);
}
