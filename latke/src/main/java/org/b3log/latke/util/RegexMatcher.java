/*
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, B3log Team
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
package org.b3log.latke.util;


import org.weborganic.furi.URIPattern;
import org.weborganic.furi.URIResolveResult;
import org.weborganic.furi.URIResolver;


public final class RegexMatcher {

    public static URIResolveResult match(final String pattern, final String requestPath) {

        URIResolver uriResolver = new URIResolver(requestPath);
        URIPattern uriPattern = new URIPattern(pattern);
        URIResolveResult resolveResult = uriResolver.resolve(uriPattern);

        return resolveResult;
    }

    /**
     * Private constructor.
     */
    private RegexMatcher() {}
}
