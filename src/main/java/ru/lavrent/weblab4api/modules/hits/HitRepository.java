package ru.lavrent.weblab4api.modules.hits;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HitRepository extends JpaRepository<Hit, Long> {
  // You can define custom query methods here if needed
}
