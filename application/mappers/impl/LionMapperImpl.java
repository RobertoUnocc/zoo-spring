package es.indra.zoo.application.mappers.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.indra.zoo.application.mappers.LionMapper;
import es.indra.zoo.domain.dtos.LionDto;
import es.indra.zoo.domain.entities.Lion;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public final class LionMapperImpl implements  LionMapper{

	@Autowired
	private ModelMapper mapper;
	
	@Override
	public LionDto entityToDto(Lion entity) {
		// TODO Auto-generated method stub
		LionDto dto = mapper.map(entity, LionDto.class);
		//LionDto dto = new LionDto(entity.getId(), entity.getName(), entity.getAge());
		return dto;
	}

	@Override
	public Lion dtoToEntity(LionDto dto) {
		// TODO Auto-generated method stub
		Lion entity = mapper.map(dto, Lion.class);
		//Lion entity = new Lion(dto.getId(), dto.getName(), dto.getAge());
		
		return entity;
	}

	@Override
	public List<LionDto> entityListToDtoList(List<Lion> entityList) {
		// TODO Auto-generated method stub
		List<LionDto> dtoList = mapper.map(entityList, new TypeToken<List<LionDto>>() {}.getType());
		
		return dtoList;
	}

}
