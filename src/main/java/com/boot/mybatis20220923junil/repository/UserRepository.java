package com.boot.mybatis20220923junil.repository;

import com.boot.mybatis20220923junil.domain.News;
import com.boot.mybatis20220923junil.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {

    public int save(User user);
}
