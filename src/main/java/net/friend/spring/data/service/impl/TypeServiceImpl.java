package net.friend.spring.data.service.impl;

import net.friend.spring.data.model.Type;
import net.friend.spring.data.repository.TypeRepository;
import net.friend.spring.data.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TypeServiceImpl implements TypeService
{
	@Autowired
	private TypeRepository repository;
	
	@Override
	public Type save(Type type)
	{
		return repository.save(type);
	}
	
	@Override
	public Type find(int id)
	{
		return repository.findTypeById(id);
	}
}
