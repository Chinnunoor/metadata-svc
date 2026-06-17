package com.example.continage.service;

import com.example.continage.entity.Metadata;
import com.example.continage.repository.MetadataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetadataService {

    private final MetadataRepository metadataRepository;

    public MetadataService(MetadataRepository metadataRepository) {
        this.metadataRepository = metadataRepository;
    }

    public Metadata writeMetadata(Metadata metadata) {
        return metadataRepository.save(metadata);
    }

    public List<Metadata> getMetadataBySourceId(String sourceId) {
        return metadataRepository.findBySourceId(sourceId);
    }

    public List<Metadata> getAllMetadata() {
        return metadataRepository.findAll();
    }
}