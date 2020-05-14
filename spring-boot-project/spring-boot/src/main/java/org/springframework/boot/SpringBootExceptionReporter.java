/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot;

import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.support.SpringFactoriesLoader;

/**
 * 用于支持自定义报告应用启动异常的回调接口。
 * {@link SpringBootExceptionReporter reports}是通过 {@link SpringFactoriesLoader}加载的，
 * 并且必须使用单个{@link ConfigurableApplicationContext}参数声明一个公共构造函数。
 * <p>
 * Callback interface used to support custom reporting of {@link SpringApplication}
 * startup errors. {@link SpringBootExceptionReporter reporters} are loaded via the
 * {@link SpringFactoriesLoader} and must declare a public constructor with a single
 * {@link ConfigurableApplicationContext} parameter.
 *
 * @author Phillip Webb
 * @since 2.0.0
 * @see ApplicationContextAware
 */
@FunctionalInterface
public interface SpringBootExceptionReporter {

	/**
	 * 向用户报告启动失败
	 * Report a startup failure to the user.
	 * @param failure the source failure
	 * @return {@code true} if the failure was reported or {@code false} if default
	 * reporting should occur.
	 */
	boolean reportException(Throwable failure);

}
