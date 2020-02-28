package com.freshworks.service;

import com.freshworks.domain.MicroServiceName;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

public class MicroServiceNameService {

    private static final String template = "Hello, %s!";

}
