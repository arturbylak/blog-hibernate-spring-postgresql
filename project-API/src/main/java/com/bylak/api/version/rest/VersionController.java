package com.bylak.api.version.rest;

import com.bylak.core.version.VersionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/API")
public class VersionController {
    private static final Logger LOG = LoggerFactory.getLogger(VersionController.class);

    private final VersionService versionService;

    @Autowired
    public VersionController(final VersionService versionService) {
        this.versionService = versionService;
    }

    @RequestMapping(value = "/version")
    public String getVersion() {
        LOG.info("Getting version");
        return versionService.getVersion();
    }
}
