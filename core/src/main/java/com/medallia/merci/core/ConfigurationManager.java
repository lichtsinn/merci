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
package com.medallia.merci.core;

import java.util.Map;

/**
 * Interface for updating configuration store.
 *
 * @param <T> type of configuration to be stored
 */
public interface ConfigurationManager<T> {
    /**
     * Stores configurations.
     *
     * @param configurations map of configurations to be stored
     */
    void updateConfigurations(Map<String, Configuration<T>> configurations);
}
