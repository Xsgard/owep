package com.kclm.owep.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ExamQues implements Serializable {
    /*
     * 主键id
     * */
    private Integer id;

    /*
     * 版本号
     * */
    private Integer version =1;

    /*
     * 创建时间
     * */
    private LocalDateTime createTime=LocalDateTime.now();

    /*
     * 最后一次访问的时间
     * */
    private LocalDateTime lastAccessTime;

    /*
     * 是否逻辑删除，1表示未删除，0表示已删除
     * */
    private Integer isDelete;

    /*
    * bank_id （fk）
    * */
    private ExamBank examBank;

    /*
    * 试题类型
    * */
    private String typeName;

    /*
    * 困难难度
    * */
    private String hardLevel;

    /*
    * 来源
    * */
    private String lable;

    /*
    * 试题状态，0为禁用，1为正常
    * */
    private Integer status;

    /*
    * 试题题干
    * */
    private String quesContent;

    /*
    * 答案解析
    * */
    private String analyze;

    /*
    * 引用次数
    * */
    private Integer useCount;
}
