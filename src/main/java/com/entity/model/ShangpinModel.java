package com.entity.model;

import com.entity.ShangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 二手商品
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShangpinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer xueshengId;


    /**
     * 二手商品名称
     */
    private String shangpinName;


    /**
     * 二手商品编号
     */
    private String shangpinUuidNumber;


    /**
     * 二手商品照片
     */
    private String shangpinPhoto;


    /**
     * 交易位置
     */
    private String shangpinAddress;


    /**
     * 商品类型
     */
    private Integer shangpinTypes;


    /**
     * 二手数量
     */
    private Integer shangpinKucunNumber;


    /**
     * 现价
     */
    private Double shangpinNewMoney;


    /**
     * 二手商品热度
     */
    private Integer shangpinClicknum;


    /**
     * 二手商品介绍
     */
    private String shangpinContent;


    /**
     * 逻辑删除
     */
    private Integer shangpinDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：二手商品名称
	 */
    public String getShangpinName() {
        return shangpinName;
    }


    /**
	 * 设置：二手商品名称
	 */
    public void setShangpinName(String shangpinName) {
        this.shangpinName = shangpinName;
    }
    /**
	 * 获取：二手商品编号
	 */
    public String getShangpinUuidNumber() {
        return shangpinUuidNumber;
    }


    /**
	 * 设置：二手商品编号
	 */
    public void setShangpinUuidNumber(String shangpinUuidNumber) {
        this.shangpinUuidNumber = shangpinUuidNumber;
    }
    /**
	 * 获取：二手商品照片
	 */
    public String getShangpinPhoto() {
        return shangpinPhoto;
    }


    /**
	 * 设置：二手商品照片
	 */
    public void setShangpinPhoto(String shangpinPhoto) {
        this.shangpinPhoto = shangpinPhoto;
    }
    /**
	 * 获取：交易位置
	 */
    public String getShangpinAddress() {
        return shangpinAddress;
    }


    /**
	 * 设置：交易位置
	 */
    public void setShangpinAddress(String shangpinAddress) {
        this.shangpinAddress = shangpinAddress;
    }
    /**
	 * 获取：商品类型
	 */
    public Integer getShangpinTypes() {
        return shangpinTypes;
    }


    /**
	 * 设置：商品类型
	 */
    public void setShangpinTypes(Integer shangpinTypes) {
        this.shangpinTypes = shangpinTypes;
    }
    /**
	 * 获取：二手数量
	 */
    public Integer getShangpinKucunNumber() {
        return shangpinKucunNumber;
    }


    /**
	 * 设置：二手数量
	 */
    public void setShangpinKucunNumber(Integer shangpinKucunNumber) {
        this.shangpinKucunNumber = shangpinKucunNumber;
    }
    /**
	 * 获取：现价
	 */
    public Double getShangpinNewMoney() {
        return shangpinNewMoney;
    }


    /**
	 * 设置：现价
	 */
    public void setShangpinNewMoney(Double shangpinNewMoney) {
        this.shangpinNewMoney = shangpinNewMoney;
    }
    /**
	 * 获取：二手商品热度
	 */
    public Integer getShangpinClicknum() {
        return shangpinClicknum;
    }


    /**
	 * 设置：二手商品热度
	 */
    public void setShangpinClicknum(Integer shangpinClicknum) {
        this.shangpinClicknum = shangpinClicknum;
    }
    /**
	 * 获取：二手商品介绍
	 */
    public String getShangpinContent() {
        return shangpinContent;
    }


    /**
	 * 设置：二手商品介绍
	 */
    public void setShangpinContent(String shangpinContent) {
        this.shangpinContent = shangpinContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getShangpinDelete() {
        return shangpinDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setShangpinDelete(Integer shangpinDelete) {
        this.shangpinDelete = shangpinDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
