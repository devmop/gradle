/*
 * Copyright 2013 the original author or authors.
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
package org.gradle.api.internal.artifacts.ivyservice.ivyresolve.parser;

import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.id.ModuleRevisionId;
import org.apache.ivy.plugins.matcher.PatternMatcher;

import java.text.ParseException;

// TODO:Remove the ivy crap from here
public interface DescriptorParseContext {

    String substitute(String value);

    PatternMatcher getMatcher(String matcherName);

    String getDefaultStatus();

    // TODO:DAZ Wrap exception
    ModuleDescriptor getModuleDescriptor(ModuleRevisionId mRevId) throws ParseException;

    boolean artifactExists(Artifact artifact);

    ModuleRevisionId getCurrentRevisionId();
}