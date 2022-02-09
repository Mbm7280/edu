package com.junode.edu.course.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

////@Data
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class VideoPlayDto implements Serializable {
    private String fileId;
    private String playAuth;

    public VideoPlayDto() {
    }

    public VideoPlayDto(String fileId, String playAuth) {
        this.fileId = fileId;
        this.playAuth = playAuth;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getPlayAuth() {
        return playAuth;
    }

    public void setPlayAuth(String playAuth) {
        this.playAuth = playAuth;
    }
}