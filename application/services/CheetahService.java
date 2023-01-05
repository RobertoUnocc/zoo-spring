package es.indra.zoo.application.services;

import java.util.List;
import java.util.UUID;

import es.indra.zoo.domain.dtos.CheetahDto;

public interface CheetahService {
	CheetahDto create(CheetahDto dto);
	List<CheetahDto> read();
	CheetahDto update(CheetahDto dto);
	Boolean delete(UUID id);

}
