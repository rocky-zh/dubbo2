/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.common.logger.log4j2;

import com.alibaba.dubbo.common.logger.Logger;

/**
 * @author zhuxiaolei.github.io 2017年5月17日 下午6:27:33
 */
public class Log4j2Logger implements Logger {
	private final org.slf4j.Logger logger;

	public Log4j2Logger(org.slf4j.Logger logger) {
		this.logger = logger;
	}

	public void trace(String msg) {
		logger.trace(msg);
	}

	public void trace(Throwable e) {
		logger.trace(e == null ? null : e.getMessage());
	}

	public void trace(String msg, Throwable e) {
		logger.trace(msg, e);
	}

	public void debug(String msg) {
		logger.debug(msg);
	}

	public void debug(Throwable e) {
		logger.debug(e == null ? null : e.getMessage());
	}

	public void debug(String msg, Throwable e) {
		logger.debug(msg, e);
	}

	public void info(String msg) {
		logger.info(msg);
	}

	public void info(Throwable e) {
		logger.info(e == null ? null : e.getMessage());
	}

	public void info(String msg, Throwable e) {
		logger.info(msg, e);
	}

	public void warn(String msg) {
		logger.warn(msg);
	}

	public void warn(Throwable e) {
		logger.warn(e == null ? null : e.getMessage());
	}

	public void warn(String msg, Throwable e) {
		logger.warn(msg, e);
	}

	public void error(String msg) {
		logger.error(msg);
	}

	public void error(Throwable e) {
		logger.error(e == null ? null : e.getMessage());
	}

	public void error(String msg, Throwable e) {
		logger.error(msg, e);
	}

	public boolean isTraceEnabled() {
		return logger.isTraceEnabled();
	}

	public boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}

	public boolean isInfoEnabled() {
		return logger.isInfoEnabled();
	}

	public boolean isWarnEnabled() {
		return logger.isWarnEnabled();
	}

	public boolean isErrorEnabled() {
		return logger.isErrorEnabled();
	}
}