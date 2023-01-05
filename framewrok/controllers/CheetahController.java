package es.indra.zoo.framewrok.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.indra.zoo.application.services.CheetahService;
import es.indra.zoo.domain.dtos.CheetahDto;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("cheetah")
@RequiredArgsConstructor
public class CheetahController {
	
	@Autowired
	private CheetahService cheetahService;
	
	@PostMapping("create")
	public ResponseEntity<CheetahDto> create(@RequestBody CheetahDto input){
		return ResponseEntity.ok(cheetahService.create(input));
	}
	
	@GetMapping("read")
	public ResponseEntity<List<CheetahDto>> read(){
		return ResponseEntity.ok(cheetahService.read());
	}
	
	@PutMapping("update")
    public ResponseEntity<CheetahDto> update(@RequestBody CheetahDto input) {
        return ResponseEntity.ok(cheetahService.update(input));
    }
	
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(cheetahService.delete(id));
    }

}
