package org.silentiger.constant;

/**
 * 用于授权的常量
 *
 * @Author silentiger@yyh
 * @Date 2023-12-20 21:33:06
 */

public class AuthConstant {
    /**
     * JWT认证信息请求头字段名称
     */
    public static final String JWT_HEADER = "ACCESS-TOKEN";
    /**
     * header中clientid:密钥 加密字段
     */
    public static final String AUTHORIZATION = "Authorization";

    /**
     * access_token存储在redis中的key前缀，key为access:jwt
     */
    public static final String REDIS_KEY_ACCESS_TOKEN = "access:";
}
