package com.mapper;

import com.model.CallAt;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface CallAtMapper {
    @Insert({
        "insert into call_at (cid, user_id, ",
        "blog_id, date)",
        "values (#{cid,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{blogId,jdbcType=INTEGER}, #{date,jdbcType=TIMESTAMP})"
    })
    int insert(CallAt record);

    @Select({
        "select",
        "cid, user_id, blog_id, date",
        "from call_at"
    })
    @Results({
        @Result(column="cid", property="cid", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="blog_id", property="blogId", jdbcType=JdbcType.INTEGER),
        @Result(column="date", property="date", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CallAt> selectAll();
}