package ru.lavrent.weblab4api.modules.common.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSourceProperties {
  private String url;
  private String username;
  private String password;

  public String getPassword() {
    return password;
  }

  public String getUrl() {
    return url;
  }

  public String getUsername() {
    return username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
