# springboot-jwt
SpringBoot集成JWT实现token验证

### 博客地址：https://www.jianshu.com/p/e88d3f8151db


https://github.com/JinBinPeng/springboot-jwt
这个项目学习了真实环境下app调用接口登录得到token的情景，然后调用其他接口会根据token拦截。
相对newbee-mall-master和springboot-seckill-master更适合用在webapi。

该项目在Java1.8运行良好，在Java11也可以运行，但是一旦用springboot自带的Java17运行就不行了，Run窗口提示
OpenJDK 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.
java.lang.IllegalStateException: Cannot load configuration class: com.pjb.springbootjjwt.SpringbootJwtApplication
解决方法：
https://blog.csdn.net/weixin_43933728/article/details/126271014 
在绿三角运行按钮左边有个"SpringbootJwtApplication"的下拉列表，选择"Edit Configurations"然后在"Build And Run"将
Java17切换成Java11即可。