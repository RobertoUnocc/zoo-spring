package es.indra.zoo.application.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.indra.zoo.application.mappers.LionMapper;
import es.indra.zoo.application.services.LionService;
import es.indra.zoo.domain.dtos.LionDto;
import es.indra.zoo.domain.entities.Lion;
import es.indra.zoo.domain.repositories.LionRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public final class LionServiceImpl implements LionService {

	@Autowired
    private LionMapper lionMapper;
	
	@Autowired
    private LionRepository lionRepository;
	
	@Override
	public LionDto create(LionDto input) {
		// TODO Auto-generated method stub
		Lion entity = lionMapper.dtoToEntity(input);
		entity = lionRepository.save(entity);
		
		LionDto dto = lionMapper.entityToDto(entity);
		return dto;
	}

	@Override
	public List<LionDto> read() {
		// TODO Auto-generated method stub
		List<Lion> entityList = (List<Lion>) lionRepository.findAll();
		
		List<LionDto> dtoList= lionMapper.entityListToDtoList(entityList);
		
		return dtoList;
	}

	@Override
	public LionDto update(LionDto input) {
		// TODO Auto-generated method stub
		Lion entity = lionRepository.findById(input.getId()).get();
		entity.setName(input.getName());
		entity.setAge(input.getAge());
		
		lionRepository.save(entity);
		
		LionDto dto = lionMapper.entityToDto(entity);
		
		return dto;		
	}

	@Override
	public Boolean delete(UUID id) {
		// TODO Auto-generated method stub
		lionRepository.deleteById(id);
		
		return true;
	}
}
