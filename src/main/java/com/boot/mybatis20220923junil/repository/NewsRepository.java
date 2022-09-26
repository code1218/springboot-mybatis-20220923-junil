package com.boot.mybatis20220923junil.repository;

import com.boot.mybatis20220923junil.domain.News;
import com.boot.mybatis20220923junil.dto.NewsWriteReqDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewsRepository {
    public int save(News news);
    public News getNews(int news_id);
}
