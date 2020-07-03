package com.kclm.owep.mapper;

import com.kclm.owep.entity.PollTemplate;
import com.kclm.owep.entity.PollTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PollTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_poll_template
     *
     * @mbg.generated
     */
    long countByExample(PollTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_poll_template
     *
     * @mbg.generated
     */
    int deleteByExample(PollTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_poll_template
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_poll_template
     *
     * @mbg.generated
     */
    int insert(PollTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_poll_template
     *
     * @mbg.generated
     */
    int insertSelective(PollTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_poll_template
     *
     * @mbg.generated
     */
    List<PollTemplate> selectByExample(PollTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_poll_template
     *
     * @mbg.generated
     */
    PollTemplate selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_poll_template
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PollTemplate record, @Param("example") PollTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_poll_template
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PollTemplate record, @Param("example") PollTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_poll_template
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PollTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_poll_template
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PollTemplate record);
}