package com.tcpex.demo;

import org.apache.tomcat.jni.Thread;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;

@org.springframework.stereotype.Controller
public class Controller {

    @ResponseBody
    @GetMapping("/")
    public ResponseEntity<String> hi() {

        return new ResponseEntity<>("Hi, listening on port 3200 success.", HttpStatus.OK);
    }
}
