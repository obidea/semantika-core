/*
 * Copyright (c) 2013-2015 Obidea Technology
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.obidea.semantika.expression.base;

import java.net.URI;

/**
 * Represent the constant URI reference symbol.
 * 
 * @author Josef Hardi <josef.hardi@gmail.com>
 * @deprecated since 1.8. Use {@link IIriReference} instead.
 */
@Deprecated
public interface IUriReference extends IConstant
{
   /**
    * Returns the URI object from this constant.
    * 
    * @return the URI object.
    */
   public URI toUri();
}