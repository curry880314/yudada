package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 评分结果
 * @TableName scoring_result
 */
@TableName(value ="scoring_result")
public class ScoringResult implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 结果名称，如物流师
     */
    private String resultName;

    /**
     * 结果描述
     */
    private String resultDesc;

    /**
     * 结果图片
     */
    private String resultPicture;

    /**
     * 结果属性集合 JSON，如 [I,S,T,J]
     */
    private String resultProp;

    /**
     * 结果得分范围，如 80，表示 80及以上的分数命中此结果
     */
    private Integer resultScoreRange;

    /**
     * 应用 id
     */
    private Long appId;

    /**
     * 创建用户 id
     */
    private Long userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 结果名称，如物流师
     */
    public String getResultName() {
        return resultName;
    }

    /**
     * 结果名称，如物流师
     */
    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    /**
     * 结果描述
     */
    public String getResultDesc() {
        return resultDesc;
    }

    /**
     * 结果描述
     */
    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    /**
     * 结果图片
     */
    public String getResultPicture() {
        return resultPicture;
    }

    /**
     * 结果图片
     */
    public void setResultPicture(String resultPicture) {
        this.resultPicture = resultPicture;
    }

    /**
     * 结果属性集合 JSON，如 [I,S,T,J]
     */
    public String getResultProp() {
        return resultProp;
    }

    /**
     * 结果属性集合 JSON，如 [I,S,T,J]
     */
    public void setResultProp(String resultProp) {
        this.resultProp = resultProp;
    }

    /**
     * 结果得分范围，如 80，表示 80及以上的分数命中此结果
     */
    public Integer getResultScoreRange() {
        return resultScoreRange;
    }

    /**
     * 结果得分范围，如 80，表示 80及以上的分数命中此结果
     */
    public void setResultScoreRange(Integer resultScoreRange) {
        this.resultScoreRange = resultScoreRange;
    }

    /**
     * 应用 id
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * 应用 id
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * 创建用户 id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 创建用户 id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 是否删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ScoringResult other = (ScoringResult) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getResultName() == null ? other.getResultName() == null : this.getResultName().equals(other.getResultName()))
            && (this.getResultDesc() == null ? other.getResultDesc() == null : this.getResultDesc().equals(other.getResultDesc()))
            && (this.getResultPicture() == null ? other.getResultPicture() == null : this.getResultPicture().equals(other.getResultPicture()))
            && (this.getResultProp() == null ? other.getResultProp() == null : this.getResultProp().equals(other.getResultProp()))
            && (this.getResultScoreRange() == null ? other.getResultScoreRange() == null : this.getResultScoreRange().equals(other.getResultScoreRange()))
            && (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getResultName() == null) ? 0 : getResultName().hashCode());
        result = prime * result + ((getResultDesc() == null) ? 0 : getResultDesc().hashCode());
        result = prime * result + ((getResultPicture() == null) ? 0 : getResultPicture().hashCode());
        result = prime * result + ((getResultProp() == null) ? 0 : getResultProp().hashCode());
        result = prime * result + ((getResultScoreRange() == null) ? 0 : getResultScoreRange().hashCode());
        result = prime * result + ((getAppId() == null) ? 0 : getAppId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", resultName=").append(resultName);
        sb.append(", resultDesc=").append(resultDesc);
        sb.append(", resultPicture=").append(resultPicture);
        sb.append(", resultProp=").append(resultProp);
        sb.append(", resultScoreRange=").append(resultScoreRange);
        sb.append(", appId=").append(appId);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}