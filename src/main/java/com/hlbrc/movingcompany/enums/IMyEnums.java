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
	 * 地址状态
	 */
	/**非默认地址*/
	public final static int ADDRESS_NOT_DEFAULT = 0;
	/**默认地址*/
	public final static int ADDRESS_DEFAULT = 1;
	/**该地址已删除*/
	public final static int ADDRESS_DEL = 2;
	
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
    /**管理员名称重复*/
    public final static String ADMINISTRATOR_NAME_ALREADY_EXISTS = "no_9";
    /**用户未登录*/
    public final static String USER_NOT_LOGIN = "no_10";
    /**邮箱地址不存在*/
    public final static String EMAIL_NOT_ALREADY_EXISTS = "no_11";
    
    /**
               * 验证码状态
     */
    /**验证码正常*/
    public final static String CODE_NORMAL = "NORMAL";
    /**验证码失效*/
    public final static String CODE_LOSE_EFFICAAY = "LOSE_EFFICAAY";
    /**验证码错误*/
    public final static String CODE_ERROR = "ERROR";
}
