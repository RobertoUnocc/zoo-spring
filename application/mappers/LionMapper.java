package es.indra.zoo.application.mappers;

import java.util.List;

import es.indra.zoo.domain.dtos.LionDto;
import es.indra.zoo.domain.entities.Lion;

public interface LionMapper {
	LionDto entityToDto(Lion entity);
	Lion dtoToEntity(LionDto dto);
	
	List<LionDto> entityListToDtoList(List<Lion> entityList);	
}
