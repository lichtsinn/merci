/*
 * Copyright 2018 Medallia, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.medallia.merci.core.configs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.List;

/**
 * SimpleConfig.
 */
public class SimpleConfig {

    private final String name;
    private final List<String> hosts;

    public SimpleConfig() {
        this.name = "default constructor";
        this.hosts = Arrays.asList("default-constructor-1001");
    }

    @JsonCreator
    public SimpleConfig(@JsonProperty(value = "name", required = true) String name,
                        @JsonProperty(value = "hosts") List<String> hosts) {
        this.name = name;
        this.hosts = hosts;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("hosts")
    public List<String> getHosts() {
        return hosts;
    }
}