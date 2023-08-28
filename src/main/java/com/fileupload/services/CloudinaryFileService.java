package com.fileupload.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Service
public interface CloudinaryFileService {

    //method for uploading file
    public Map upload(MultipartFile file);
}
