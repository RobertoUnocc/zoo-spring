package es.indra.zoo.application.mappers;

import java.util.List;

import es.indra.zoo.domain.dtos.CheetahDto;
import es.indra.zoo.domain.entities.Cheetah;

public interface CheetahMapper {
	CheetahDto entityToDto(Cheetah entity);
	Cheetah dtoToEntity(CheetahDto dto);
	
	List<CheetahDto> entityListToDtoList(List<Cheetah> entityList);
}
