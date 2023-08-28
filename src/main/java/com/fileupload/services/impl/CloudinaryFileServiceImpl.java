package com.fileupload.services.impl;

import com.cloudinary.Cloudinary;
import com.fileupload.services.CloudinaryFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
public class CloudinaryFileServiceImpl implements CloudinaryFileService {

    @Autowired
    private Cloudinary cloudinary;

    //override method for uploading file into cloudinary
    @Override
    public Map upload(MultipartFile file) {

        try {
            Map data = this.cloudinary.uploader().upload(file.getBytes(), Map.of());

            return data;

        } catch (IOException e) {

            throw new RuntimeException("File uploading fail...!");
        }
    }
}
