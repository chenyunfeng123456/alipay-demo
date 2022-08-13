package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2021000121612894";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCI9nFiEf7dUJCcBK/soyK1emI5ysFa1bK2sTLa8TQuSTCjp82gz+6c8nf9K5XBeZHCn14M+Cj7cs+irUae2aMT9MMI9d/dkiM2TZON/AalauIyHgVCZXaN0goIDsNGhc2OI1rHXZFwxtsSxe5ZzgnPczPP9TxBzAHxtao+WkvJIn4jdUlgvYD9kE/6MlytCixkmuIeaNhDN3I6oNVdbUHSbG8B/dwer2p3idMfg4p3zgg8IUBEB6jEQff2EYglbu85HVYcV1lFWFtVBYEkWwdSIJ22eGYroV2UT3p85cucO0tyGqeNRPo0poxrpxiMcxWcak8/KjVjv2t+8h1U8mIvAgMBAAECggEAeE8CigMEvaNnY6U6Y8NpWcCHR/yym/fbZF+DLI90JrRj5V4hYoFEONlETT9b7Pe88hjLpNjYJwhTG7LZte+3MHBwYg6Y9yjHhYvfcXlQ3T1mNF/qfshhu3IlHa7aGbivN4wW0cl/WHFVPshe9sPmGjQ37xScOa/ahVfuk5b9u08eQC3tOi3QveetiKO1k7RO8WmA0UvChUW+cq0OO/w30XQtGoPVJ8A5VaVesovEvOr4uL8LroO/+qEwnMruVDspKkxe8lrpugmzmfI6uJksHaTUhHN4oEtXXALYNuQZODYZIVIXCnD+K4ON1cHHi8jA/ARHizvk+ALkmgbfMxylAQKBgQDviUm1OvcaUAxfL153yGFUr9CogsAkGFhnShN9NkS9FFgEEoqblrJQw0PHsLNAZbFckH00Z1AVvxoKGeOuPebowTdh3AQPLe373IihUTocGrzE0LqB6CY56sNwSZiuM6bhIqcncvfWXAiobKUuQcLYjC1VWOupL1mASTWwc0le/QKBgQCSYFd9fFD0NyeJREa9OrU2BsoAbRIPl2kO9TJo54DMr6dr3brCiwYz7sPkDSX+U+14/qOZiLDSWfZbucMTZdpJd81v6q/x6e9dLXgWIrqVTqbuxUL00zAKlaaPbBiIuFe3wqpSAzZ5z8lSc6AGH1s6Vqdm1UuRPS+TI5zdU4ULmwKBgE/anM/mEGqdNQKmb//OtWPeGNmUfSmLVC1a7JRZeyDtn0n8RGkKG/gAoJ/5sEhPnokVQiguKOyXAL9NUjHMQSZnA2eESXYmAahtJL9irNShtTyHuSWFlvjH4s+UOWoZnhB/1Om50hWMKPa9AXQiSCqY0KQbOLT2LAgwX82rIVKhAoGAW0WJqGx5Ch7OH1Ccj2fpEJwhHyzjoyc1UidgXHtmG7u3uJHU33PS1VUffrcYJsLsg5K8LoNGRpPkAwQM+K5882yphAyh00WchMxSYfMbxvf5LU+BVanN/fuclTfBAJd50tKmY2cvc7s1/JyufsLUnsbjsUJ00UaGwMfnCzcF8dsCgYAq6BKZKpCXs/dDf9IiVUPjHWPFT2qAwNR+yxfLdkysvMnzjHSqNpXPFKIQPqFp/guy5EcrbvDRfd36TT6jzg89sHljJvbtQWPgvKubRn4mnK0dqKoMWGKHqoMz638XfiObWocHHmaLGI/OpRxlqSTOUWoKDDBaA1ICK1qnhUuigQ==";
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjkItUm4EFU5BOSHaUSO6pbDjX8gTCTH20uPCJcmCXnkrTB4qUdAdkZpZL6vFK8dVpuiMfxl2l3pogYoyXUYziGMuyQr2iBtwR2FhSA3Buhmvl+JGixAJVhsqIzL7CcGLTkgJbHqkHxkeqtBI3PHUs0JGM2otRKKQ78VSLJUliw18jMXlWv1zkngoOvho0haQyTDhETMGnA3FjjiUmYuddt0LebJikERMKJcqoZ37us4rQnwIKrAIO2etVX8r/EL2Ya7gVehs2EfiKJ6Sy/+K3Wvr98tFM7/SsNiPBvh0jH2r2pAdC2ao9ZFccL+rv+3D5vS/Rn+1/vZFahxykZUGrQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://npnubu.natappfree.cc/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://npnubu.natappfree.cc/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "UTF-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";



//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

