package com.example.demo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class VersionService {

  @Value("${info.app.version:unknown}")
  String version;

  public String getVersion() {
    return this.version;
  }

}
