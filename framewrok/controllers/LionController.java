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

import es.indra.zoo.application.services.LionService;
import es.indra.zoo.domain.dtos.LionDto;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("lion")
@RequiredArgsConstructor
public class LionController {

	@Autowired
    private LionService lionService;
	
    @PostMapping("create")
    public ResponseEntity<LionDto> create(@RequestBody LionDto input) {
        return ResponseEntity.ok(lionService.create(input));
    }
    
    @GetMapping("read")
    public ResponseEntity<List<LionDto>> read() {
        return ResponseEntity.ok(lionService.read());
    }
    
    @PutMapping("update")
    public ResponseEntity<LionDto> update(@RequestBody LionDto input) {
        return ResponseEntity.ok(lionService.update(input));
    }
    
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(lionService.delete(id));
    }
}
