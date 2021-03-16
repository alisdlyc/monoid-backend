# monoid-backend

什么是Monoid？Monoid是一个图书管理检索系统，通过对北京邮电大学图书信息的爬取和存储，提供查询功能给，在此基础上完成一些事情。

### 项目搭建

- 安装MySQL

- - https://dev.mysql.com/downloads/windows/installer/

- 安装配置Maven

- - http://maven.apache.org/download.cgi

+ 配置shell代理

  ```bash
  # 在windows终端中使用代理（临时）
  set http_proxy=http://127.0.0.1:10808
  set https_proxy=http://127.0.0.1:10808
  
  # 配置git使用代理
  git config --global http.proxy 127.0.0.1:1080
  ```

+ `git clone https://github.com/alisdlyc/monoid-backend.git`

### 文件目录

```java
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─alisdlyc
│  │  │          └─monoid
│  │  │              ├─config					// 配置MyBatis数据源
│  │  │              ├─constants			// 配置Mapper文件路径
│  │  │              ├─controller			// SpringBoot Controller文件
│  │  │              ├─dal						// MongoDB 数据访问层dal
│  │  │              ├─entity 				// 数据实体
│  │  │              ├─mapper					// MongoDB Mapper 文件
│  │  │              ├─repository 		// 待定
│  │  │              └─web					  // Controller 测试
│  │  └─resources
│  │      └─mybatis								// MyBatis *.Mapper.xml 文件地址
```

`需修改MongoDB和MySQL数据库的地址`

### 启动项目

启动MonoidApplication类
