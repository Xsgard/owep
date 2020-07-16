/******************
 *版权所有 CopyRight(c) 快程乐码信息科技有限公司所有，未经授权。不得复制转发
 *
 */
package com.kclm.owep.dto;

import java.time.LocalDateTime;

/********
 *@Author WangSP
 *@Version v1.0
 *@Create 2020/7/13 0013 15:03
 *@Description  资源类型数据传输层
 */
public class ResourceTypeDTO implements java.io.Serializable{

    /**
     * 资源ID
     */
    private Integer id;

    /**
     * 资源类型（名称）
     */
    private String typeName;

    /**
     * 资源描述
     */
    private String typeDesc;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ResourceTypeDTO{");
        sb.append("id=").append(id);
        sb.append(", typeName='").append(typeName).append('\'');
        sb.append(", typeDesc='").append(typeDesc).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}