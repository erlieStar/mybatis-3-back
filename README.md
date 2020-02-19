# MyBatis 源码解析

本源码解析教程基于mybatis3.
## 在本地debug源码的步骤

1. 从github下载mybatis源码https://github.com/mybatis/mybatis-3
2. 把mybatis源码pom文件中\<optional\>true\</optional\>，全部改为false
3. 在工程目录下执行mvn clean install -DskipTests=true，将当前工程安装到本地仓库
4. 其他工程依赖安装到本地的mybatis源码版本，同时打开2个模块，一个是mybatis源码，一个是要调试的代码，这样debug的时候就会跳进mybatis源码工程

## 系列章节