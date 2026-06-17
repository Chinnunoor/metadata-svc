package com.example.continage.controller;

import com.example.continage.entity.Metadata;
import com.example.continage.service.MetadataService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metadata")
public class MetadataController {

    private final MetadataService metadataService;

    public MetadataController(MetadataService metadataService) {
        this.metadataService = metadataService;
    }

    @PostMapping("/write")
    public Metadata writeMetadata(@RequestBody Metadata metadata) {
        return metadataService.writeMetadata(metadata);
    }

    @GetMapping("/{sourceId}")
    public List<Metadata> getMetadataBySourceId(@PathVariable String sourceId) {
        return metadataService.getMetadataBySourceId(sourceId);
    }

    @GetMapping
    public List<Metadata> getAllMetadata() {
        return metadataService.getAllMetadata();
    }
}