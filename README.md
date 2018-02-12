Maven 配置文件中添加镜像库:
	
	<mirror>
      <id>nexus-aliyun</id>
      <mirrorOf>central</mirrorOf>
      <name>Nexus aliyun</name>
      <url>http://maven.aliyun.com/nexus/content/groups/public</url>
	</mirror>
	
1.swagger 整合管理API接口 http://localhost:8080/swagger-ui.html 访问

2.jwt代替传统的session 初始化用户 user/123  admin/123

3.集成shiro做用户的鉴权

4.h5前端采用metronic4的UI,静态文件委托在七牛云上
