/*
 * Copyright (c) 2013-2015 Josef Hardi <josef.hardi@gmail.com>
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
package com.obidea.semantika.datatype.primitive;

import javax.xml.bind.DatatypeConverter;

import com.obidea.semantika.datatype.AbstractXmlType;
import com.obidea.semantika.datatype.DataType;
import com.obidea.semantika.datatype.DataTypeConstants;
import com.obidea.semantika.datatype.IDatatype;
import com.obidea.semantika.datatype.exception.InvalidLexicalFormException;

/**
 * Singleton implementation of <code>xsd:boolean</code> datatype.
 */
public class XsdBoolean extends AbstractXmlType<Boolean>
{
   private static final XsdBoolean mInstance;

   static {
      mInstance = new XsdBoolean();
   }
   
   /**
    * Private constructor forces use of {@link #getInstance()}
    */
   private XsdBoolean()
   {
      super(DataType.BOOLEAN);
   }

   public static XsdBoolean getInstance()
   {
      return mInstance;
   }

   @Override
   public IDatatype<?> getPrimitiveDatatype()
   {
      return this;
   }

   @Override
   public Boolean getValue(String lexicalForm)
   {
      try {
         return DatatypeConverter.parseBoolean(lexicalForm);
      }
      catch (NumberFormatException e) {
         throw new InvalidLexicalFormException(getName(), lexicalForm);
      }
   }

   @Override
   public boolean isPrimitive()
   {
      return true;
   }

   @Override
   public int getType()
   {
      return DataTypeConstants.BOOLEAN;
   }

   @Override
   public String toString()
   {
      return "xsd:boolean"; //$NON-NLS-1$
   }
}
