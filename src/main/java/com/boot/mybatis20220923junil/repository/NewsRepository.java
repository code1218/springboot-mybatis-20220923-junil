package com.boot.mybatis20220923junil.repository;

import com.boot.mybatis20220923junil.domain.News;
import com.boot.mybatis20220923junil.domain.NewsFile;
import com.boot.mybatis20220923junil.dto.NewsWriteReqDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NewsRepository {
    public int save(News news);
    public int saveFiles(List<NewsFile> newsFileList);
    public News getNews(int news_id);
}
