package es.indra.zoo.application.mappers;

import java.util.List;

import es.indra.zoo.domain.dtos.FelineDto;
import es.indra.zoo.domain.entities.Feline;

public interface FelineMapper {
	FelineDto entityToDto(Feline entity);
	Feline dtoToEntity(FelineDto dto);
	
	List<FelineDto> entityListToDtoList(List<Feline> entityList);	
}
