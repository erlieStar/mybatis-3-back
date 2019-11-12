/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.plugin;

import java.util.Properties;

/**
 * @author Clinton Begin
 */
public interface Interceptor {

  /** 执行拦截逻辑的方法,Invocation只是将动态代理中获取到的一些参数封装成一个对象 */
  Object intercept(Invocation invocation) throws Throwable;

  /**
   * target是被拦截的对象，它的作用是给被拦截对象生成一个代理对象，并返回它。
   * 为了方便，可以直接使用Mybatis中org.apache.ibatis.plugin.Plugin类的wrap方法（是静态方法）生成代理对象
   */
  Object plugin(Object target);

  /** 根据配置初始化Interceptor对象 */
  void setProperties(Properties properties);

}
