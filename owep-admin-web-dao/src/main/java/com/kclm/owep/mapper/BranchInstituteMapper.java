package com.kclm.owep.mapper;

import com.kclm.owep.entity.BranchInstitute;
import com.kclm.owep.entity.BranchInstituteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BranchInstituteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_branch_institute
     *
     * @mbg.generated
     */
    long countByExample(BranchInstituteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_branch_institute
     *
     * @mbg.generated
     */
    int deleteByExample(BranchInstituteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_branch_institute
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_branch_institute
     *
     * @mbg.generated
     */
    int insert(BranchInstitute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_branch_institute
     *
     * @mbg.generated
     */
    int insertSelective(BranchInstitute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_branch_institute
     *
     * @mbg.generated
     */
    List<BranchInstitute> selectByExample(BranchInstituteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_branch_institute
     *
     * @mbg.generated
     */
    BranchInstitute selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_branch_institute
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") BranchInstitute record, @Param("example") BranchInstituteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_branch_institute
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") BranchInstitute record, @Param("example") BranchInstituteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_branch_institute
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(BranchInstitute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_branch_institute
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BranchInstitute record);
}