package com.example.continage.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "metadata")
public class Metadata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sourceId;
    private String serverName;
    private String buildUser;
    private LocalDateTime buildTime;
    private String commitHash;
    private String buildId;

    public Metadata() {
    }

    public Long getId() {
        return id;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getBuildUser() {
        return buildUser;
    }

    public void setBuildUser(String buildUser) {
        this.buildUser = buildUser;
    }

    public LocalDateTime getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(LocalDateTime buildTime) {
        this.buildTime = buildTime;
    }

    public String getCommitHash() {
        return commitHash;
    }

    public void setCommitHash(String commitHash) {
        this.commitHash = commitHash;
    }

    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }
}