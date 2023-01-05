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

import es.indra.zoo.application.services.FelineService;
import es.indra.zoo.domain.dtos.FelineDto;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("feline")
@RequiredArgsConstructor
public class FelineController {

	@Autowired
    private FelineService felineService;
	
    @PostMapping("create")
    public ResponseEntity<FelineDto> create(@RequestBody FelineDto input) {
        return ResponseEntity.ok(felineService.create(input));
    }
    
    @GetMapping("read")
    public ResponseEntity<List<FelineDto>> read() {
        return ResponseEntity.ok(felineService.read());
    }
    
    @PutMapping("update")
    public ResponseEntity<FelineDto> update(@RequestBody FelineDto input) {
        return ResponseEntity.ok(felineService.update(input));
    }
    
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(felineService.delete(id));
    }
}
