package es.indra.zoo.application.services;

import java.util.List;
import java.util.UUID;

import es.indra.zoo.domain.dtos.FelineDto;

public interface FelineService {
	FelineDto create(FelineDto dto);
	List<FelineDto> read();
	FelineDto update(FelineDto dto);
	Boolean delete(UUID id);
}
