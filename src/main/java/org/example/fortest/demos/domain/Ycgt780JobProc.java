package com.example.moyu2.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ITMS#=#22020#
 * @TableName YCGT780_JOB_PROC
 */
@Data
public class Ycgt780JobProc implements Serializable {
    /**
     * 
     */
    private String jobNm;

    /**
     * 
     */
    private String jobStartTs;

    /**
     * 
     */
    private String jobCmpltTs;

    /**
     * 
     */
    private String dpndntJobNm;

    /**
     * 
     */
    private Integer inputRcdCt;

    /**
     * 
     */
    private Integer procRcdCt;

    /**
     * 
     */
    private Integer procRcdSkipCt;

    /**
     * 
     */
    private Integer procRcdRjctCt;

    /**
     * 
     */
    private String lstupdtUserIdCd;

    /**
     * 
     */
    private String lstupdtTs;

    /**
     * 
     */
    private Integer jobStatCd;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}