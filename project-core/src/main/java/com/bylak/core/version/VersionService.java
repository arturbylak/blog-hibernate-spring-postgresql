package com.bylak.core.version;

import org.springframework.stereotype.Service;

@Service
public class VersionService {
    public String getVersion() {
        return "1.1";
    }
}
