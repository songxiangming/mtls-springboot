package com.plumstep.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class StandardController {


    @ApiOperation(value = "healthcheck")
    @RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
    static ResponseEntity<?> healthCheck() {
        return ResponseEntity.ok("server is health");
    }
}
