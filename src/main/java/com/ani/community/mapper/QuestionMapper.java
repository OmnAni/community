package com.ani.community.mapper;

import com.ani.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface QuestionMapper {

    @Insert("INSERT INTO question(title,description,gmt_create,gmt_modified,creator,tag) VALUES(#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    public void create(Question question);

    @Select("SELECT * FROM question")
    List<Question> list();
}
