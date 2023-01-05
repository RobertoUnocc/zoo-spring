package es.indra.zoo.application.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.indra.zoo.application.mappers.CheetahMapper;
import es.indra.zoo.application.services.CheetahService;
import es.indra.zoo.domain.dtos.CheetahDto;
import es.indra.zoo.domain.entities.Cheetah;
import es.indra.zoo.domain.repositories.CheetahRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CheetahServiceImpl implements CheetahService{
	
	@Autowired
    private CheetahMapper cheetahMapper;
	
	@Autowired
    private CheetahRepository cheetahRepository;
	
	@Override
	public CheetahDto create(CheetahDto input) {
		// TODO Auto-generated method stub
		Cheetah entity = cheetahMapper.dtoToEntity(input);
		entity = cheetahRepository.save(entity);
		
		CheetahDto dto = cheetahMapper.entityToDto(entity);
		return dto;
	}
	
	@Override
	public List<CheetahDto> read() {
		// TODO Auto-generated method stub
		List<Cheetah> entityList = (List<Cheetah>) cheetahRepository.findAll();
		
		List<CheetahDto> dtoList= cheetahMapper.entityListToDtoList(entityList);
		
		return dtoList;
	}
	
	@Override
	public CheetahDto update(CheetahDto input) {
		// TODO Auto-generated method stub
		Cheetah entity = cheetahRepository.findById(input.getId()).get();
		entity.setName(input.getName());
		entity.setAge(input.getAge());
		
		cheetahRepository.save(entity);
		
		CheetahDto dto = cheetahMapper.entityToDto(entity);
		
		return dto;	
	}
	
	@Override
	public Boolean delete(UUID id) {
		// TODO Auto-generated method stub
		cheetahRepository.deleteById(id);
		
		return true;
	}	
}
