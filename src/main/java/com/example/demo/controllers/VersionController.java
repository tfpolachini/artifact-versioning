package com.example.demo.controllers;

import com.example.demo.services.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VersionController {

  private VersionService versionService;

  @Autowired
  public VersionController(VersionService versionService) {
    this.versionService = versionService;
  }

  @GetMapping("/version")
  @ResponseBody
  public String getVersion() {
    return versionService.getVersion();
  }

}
