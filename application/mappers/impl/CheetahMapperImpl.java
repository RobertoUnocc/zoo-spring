package es.indra.zoo.application.mappers.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.indra.zoo.application.mappers.CheetahMapper;
import es.indra.zoo.domain.dtos.CheetahDto;
import es.indra.zoo.domain.entities.Cheetah;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public final class CheetahMapperImpl implements CheetahMapper{

	@Autowired
	private ModelMapper mapper;
	
	@Override
	public CheetahDto entityToDto(Cheetah entity) {
		//TODO Auto-generated method stub
		CheetahDto dto = mapper.map(entity, CheetahDto.class);
		
		return dto;
	}	
	
	@Override
	public Cheetah dtoToEntity(CheetahDto dto) {
		// TODO Auto-generated method stub
		Cheetah entity = mapper.map(dto, Cheetah.class);
		
		return entity;
	}
	
	@Override
	public List<CheetahDto> entityListToDtoList(List<Cheetah> entityList) {
		// TODO Auto-generated method stub
		List<CheetahDto> dtoList = mapper.map(entityList, new TypeToken<List<CheetahDto>>() {}.getType());
		
		return dtoList;
	}
}
