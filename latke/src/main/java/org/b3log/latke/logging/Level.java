/*
 * Copyright (c) 2009-2017, b3log.org & hacpai.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.b3log.latke.logging;

/**
 * Logging level.
 *
 * <ul>
 * <li>ERROR</li>
 * <li>WARN</li>
 * <li>INFO</li>
 * <li>DEBUG</li>
 * <li>TRACE</li>
 * </ul>
 *
 * In addition there is a level OFF that can be used to turn off logging, and a level ALL that can be used to enable
 * logging of all messages.
 *
 * @author <a href="http://88250.b3log.org">Liang Ding</a>
 * @version 1.0.0.1, Oct 24, 2013
 * @see Logger
 */
public enum Level {

    /**
     * ERROR.
     */
    ERROR,
    /**
     * WARN.
     */
    WARN,
    /**
     * INFO.
     */
    INFO,
    /**
     * DEBUG.
     */
    DEBUG,
    /**
     * TRACE.
     */
    TRACE,
}
