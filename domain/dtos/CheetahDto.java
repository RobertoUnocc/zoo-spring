package es.indra.zoo.domain.dtos;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CheetahDto {
	
	@JsonProperty("id")
	private UUID id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("age")
	private Integer age;

}
