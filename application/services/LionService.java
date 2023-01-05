package es.indra.zoo.application.services;

import java.util.List;
import java.util.UUID;

import es.indra.zoo.domain.dtos.LionDto;

public interface LionService {
	LionDto create(LionDto dto);
	List<LionDto> read();
	LionDto update(LionDto dto);
	Boolean delete(UUID id);
}
