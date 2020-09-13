package com.hlbrc.movingcompany.enums;

public interface IMyEnums {
	/**
     * 状态
     */
	/**已删除*/
    public final static String DELETE = "0";
    /**正常*/
    public final static String NORMAL = "1";
    /**
     * 用户状态
     */
	/**在线*/
    public final static String USER_ON_lINE = "1";
    /**离线*/
    public final static String USER_OFF_LINE = "2";
    /**正常*/
    public final static String USER_NORMAL = "3";
    /**限制登录*/
    public final static String USER_LIMIT_LOGIN = "4";
    
    /**
     * 订单状态
     */
    /**取消*/
    public final static String ORDER_CANCEL = "0";
    /**未支付*/
    public final static String ORDER_NON_PAYMENT = "1";
    /**已支付*/
    public final static String ORDER_PAID = "2";
    /**未发货*/
    public final static String ORDER_NOT_SHIPPED = "3";
    /**已发货*/
    public final static String ORDER_SHIPPED = "4";
    /**退货*/
    public final static String ORDER_REFUND = "5";
    /**完成*/
    public final static String ORDER_FINISHED = "6";
    /**
     * 提示信息
     */
    /**成功*/
    public final static String SUCCEED = "ok";
    /**失败*/
    public final static String FAIL = "no";
    /**电话号不存在*/
    public final static String TEL_NOT_EXISTS = "no_0";
    /**电话号码已存在*/
    public final static String TEL_ALREADY_EXISTS = "no_1";
    /**电话号码已改变*/
    public final static String TEL_BEEN_CHANGED = "no_2";
    /**邮箱地址已存在*/
    public final static String EMAIL_ALREADY_EXISTS = "no_3";
    /**邮箱地址已改变*/
    public final static String EMAIL_BEEN_CHANGED = "no_4";
    /**角色名称已存在*/
    public final static String ROSE_NAME_ALREADY_EXISTS = "no_5";
    /**权限分类名称已存在*/
    public final static String AUTHORITY_TYPE_NAME_ALREADY_EXISTS = "no_6";
    /**权限名称已存在*/
    public final static String AUTHORITY_NAME_ALREADY_EXISTS = "no_7";
    /**权限规则已存在*/
    public final static String AUTHORITY_ALREADY_EXISTS = "no_8";
}
