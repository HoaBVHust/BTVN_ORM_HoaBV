package net.friend.spring.data.service;

import net.friend.spring.data.model.Type;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface TypeService
{
	@Transactional
	Type save(Type type);
	
	Type find(int id);
}
