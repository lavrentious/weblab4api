package ru.lavrent.weblab4api.modules.hits;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HitService {
  private final HitRepository hitRepository;

  public HitService(HitRepository hitRepository) {
    this.hitRepository = hitRepository;
  }

  private boolean calculateHit(float x, float y, float r) {
    boolean square = (x >= 0 && y <= 0) && (x <= r && y >= -r);
    boolean circle = (x >= 0 && y >= 0) && (x * x + y * y <= r / 2 * r / 2);
    boolean triangle = (x <= 0 && y <= 0) && (x >= -y - r);

    return square || circle || triangle;
  }

  public Hit createHit(float x, float y, float r) {
    Hit hit = new Hit();
    hit.setX(x);
    hit.setY(y);
    hit.setR(r);
    hit.setCreatedAt(new Date());
    hit.setIsHit(calculateHit(x, y, r));
    System.out.println("saving hit: " + hit);
    return hitRepository.save(hit);
  }

  public List<Hit> getAllHits() {
    return hitRepository.findAll();
  }

  public Hit getHitById(Long id) {
    return hitRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Hit not found with id: " + id));
  }

  public void deleteHit(Long id) {
    hitRepository.deleteById(id);
  }

  public void deleteAll() {
    hitRepository.deleteAll();
  }
}
