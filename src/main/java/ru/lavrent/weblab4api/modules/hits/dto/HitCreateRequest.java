package ru.lavrent.weblab4api.modules.hits.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class HitCreateRequest {
  @NotNull
  @Min(-4)
  @Max(4)
  private Float x;

  @NotNull
  @Min(-4)
  @Max(4)
  private Float y;

  @NotNull
  @Positive
  @Min(0)
  @Max(4)
  private Float r;

  // getters and setters
  public Float getX() {
    return x;
  }

  public void setX(Float x) {
    this.x = x;
  }

  public Float getY() {
    return y;
  }

  public void setY(Float y) {
    this.y = y;
  }

  public Float getR() {
    return r;
  }

  public void setR(Float r) {
    this.r = r;
  }
}
