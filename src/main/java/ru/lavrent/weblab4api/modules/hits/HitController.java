package ru.lavrent.weblab4api.modules.hits;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import ru.lavrent.weblab4api.modules.hits.dto.HitCreateRequest;

@RestController
@RequestMapping("/hits")
public class HitController {
	private final HitService hitService;

	public HitController(HitService hitsService) {
		this.hitService = hitsService;
	}

	@GetMapping({ "/", "" })
	public List<Hit> findAll() {
		System.out.println("getting all hits");
		return hitService.getAllHits();
	}

	@PostMapping({ "/", "" })
	public ResponseEntity<Hit> createHit(@Valid @RequestBody HitCreateRequest hitRequest) {
		Hit hit = hitService.createHit(hitRequest.getX(), hitRequest.getY(), hitRequest.getR());
		return ResponseEntity.ok(hit);
	}

	@DeleteMapping({ "/", "" })
	public void deleteAll() {
		hitService.deleteAll();
	}
}
