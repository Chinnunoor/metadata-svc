package com.example.continage.repository;

import com.example.continage.entity.Metadata;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MetadataRepository extends JpaRepository<Metadata, Long> {

    List<Metadata> findBySourceId(String sourceId);
}