package ru.lavrent.weblab4api.modules.hits;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hits")
public class Hit {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "created_at", nullable = false)
  private Date createdAt;

  @Column(name = "x", nullable = false)
  private float x;

  @Column(name = "y", nullable = false)
  private float y;

  @Column(name = "r", nullable = false)
  private float r;

  @Column(name = "is_hit", nullable = false)
  private boolean isHit;

  // getters & setters

  public Date getCreatedAt() {
    return createdAt;
  }

  public boolean getIsHit() {
    return isHit;
  }

  public Long getId() {
    return id;
  }

  public float getR() {
    return r;
  }

  public float getX() {
    return x;
  }

  public float getY() {
    return y;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public void setIsHit(boolean isHit) {
    this.isHit = isHit;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setR(float r) {
    this.r = r;
  }

  public void setX(float x) {
    this.x = x;
  }

  public void setY(float y) {
    this.y = y;
  }

}
