package com.caipiao.app.dao.mapper;

import com.caipiao.app.dao.TabUserBasicInfomation;
import com.caipiao.app.dao.TabUserBasicInfomationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TabUserBasicInfomationMapper {
    int countByExample(TabUserBasicInfomationExample example);

    int deleteByExample(TabUserBasicInfomationExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(TabUserBasicInfomation record);

    int insertSelective(TabUserBasicInfomation record);

    List<TabUserBasicInfomation> selectByExampleWithBLOBs(TabUserBasicInfomationExample example);

    List<TabUserBasicInfomation> selectByExample(TabUserBasicInfomationExample example);

    TabUserBasicInfomation selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") TabUserBasicInfomation record, @Param("example") TabUserBasicInfomationExample example);

    int updateByExampleWithBLOBs(@Param("record") TabUserBasicInfomation record, @Param("example") TabUserBasicInfomationExample example);

    int updateByExample(@Param("record") TabUserBasicInfomation record, @Param("example") TabUserBasicInfomationExample example);

    int updateByPrimaryKeySelective(TabUserBasicInfomation record);

    int updateByPrimaryKeyWithBLOBs(TabUserBasicInfomation record);

    int updateByPrimaryKey(TabUserBasicInfomation record);
}