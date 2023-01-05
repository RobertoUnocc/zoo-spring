package es.indra.zoo.application.mappers.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.indra.zoo.application.mappers.FelineMapper;
import es.indra.zoo.domain.dtos.FelineDto;
import es.indra.zoo.domain.entities.Feline;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public final class FelineMapperImpl implements  FelineMapper{

	@Autowired
	private ModelMapper mapper;
	
	@Override
	public FelineDto entityToDto(Feline entity) {
		// TODO Auto-generated method stub
		FelineDto dto = mapper.map(entity, FelineDto.class);
		return dto;
	}

	@Override
	public Feline dtoToEntity(FelineDto dto) {
		// TODO Auto-generated method stub
		Feline entity = mapper.map(dto, Feline.class);		
		return entity;
	}

	@Override
	public List<FelineDto> entityListToDtoList(List<Feline> entityList) {
		// TODO Auto-generated method stub
		List<FelineDto> dtoList = mapper.map(entityList, new TypeToken<List<FelineDto>>() {}.getType());
		
		return dtoList;
	}



}
