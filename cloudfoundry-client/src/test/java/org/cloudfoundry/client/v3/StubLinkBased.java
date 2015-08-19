/*
 * Copyright 2013-2015 the original author or authors.
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

package org.cloudfoundry.client.v3;

import java.util.Collections;
import java.util.Map;

public final class StubLinkBased implements LinkBased {

    private final Map<String, Link> links;

    public StubLinkBased(String rel, Link link) {
        this.links = Collections.singletonMap(rel, link);
    }

    @Override
    public Link getLink(String rel) {
        return this.links.get(rel);
    }

    @Override
    public Map<String, Link> getLinks() {
        return this.links;
    }

}