package es.indra.zoo.application.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.indra.zoo.application.mappers.FelineMapper;
import es.indra.zoo.application.services.FelineService;
import es.indra.zoo.domain.dtos.FelineDto;
import es.indra.zoo.domain.entities.Feline;
import es.indra.zoo.domain.repositories.FelineRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public final class FelineServiceImpl implements FelineService {

	@Autowired
    private FelineMapper felineMapper;
	
	@Autowired
    private FelineRepository felineRepository;
	
	@Override
	public FelineDto create(FelineDto input) {
		// TODO Auto-generated method stub
		Feline entity = felineMapper.dtoToEntity(input);
		entity = felineRepository.save(entity);
		
		FelineDto dto = felineMapper.entityToDto(entity);
		return dto;
	}

	@Override
	public List<FelineDto> read() {
		// TODO Auto-generated method stub
		List<Feline> entityList = (List<Feline>) felineRepository.findAll();
		
		List<FelineDto> dtoList= felineMapper.entityListToDtoList(entityList);
		
		return dtoList;
	}

	@Override
	public FelineDto update(FelineDto input) {
		// TODO Auto-generated method stub
		Feline entity = felineRepository.findById(input.getId()).get();
		entity.setName(input.getName());
		entity.setAge(input.getAge());
		
		felineRepository.save(entity);
		
		FelineDto dto = felineMapper.entityToDto(entity);
		
		return dto;		
	}

	@Override
	public Boolean delete(UUID id) {
		// TODO Auto-generated method stub
		felineRepository.deleteById(id);
		
		return true;
	}
}
