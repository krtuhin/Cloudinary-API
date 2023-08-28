package com.fileupload.controllers;

import com.fileupload.services.impl.CloudinaryFileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
public class CloudinaryFileUploadController {

    @Autowired
    private CloudinaryFileServiceImpl cloudinaryFileService;

    //handler for uploading file into server
    @PostMapping("/upload-file")
    public ResponseEntity<?> fileUpload(@RequestParam("file") MultipartFile file) {

        Map result = this.cloudinaryFileService.upload(file);

        return ResponseEntity.ok(result);
    }
}
