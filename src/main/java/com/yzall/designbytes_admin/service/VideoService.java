package com.yzall.designbytes_admin.service;

import com.yzall.designbytes_admin.dto.VideoDTO;
import com.yzall.designbytes_admin.repository.VideoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class VideoService {
    VideoRepository videoRepository;

    @Autowired
    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @Transactional
    public VideoDTO insertVideoUrl(VideoDTO videoDTO) throws Exception {
        try {
            // TODO BUILDER
            Integer result = videoRepository.insertVideo(
                    videoDTO.getVideoTitle(),
                    videoDTO.getVideoUrl(),
                    0,
                    "admin",
                    "maker",
                    200000,
                    'N',
                    0,
                    0
            );

            if (result != 1) {
                throw new Exception("영상 저장에 실패하였습니다.");
            }
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegrityViolationException("중복되는 키값.");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

        return videoDTO;
    }

    @Transactional
    public VideoDTO insertVideoFile(VideoDTO videoDTO) throws Exception {
        try {

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return null;
    }
}
