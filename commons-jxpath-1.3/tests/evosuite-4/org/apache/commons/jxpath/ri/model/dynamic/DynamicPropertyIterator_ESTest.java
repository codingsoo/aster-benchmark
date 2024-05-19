
/*
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */


package org.apache.commons.jxpath.ri.model.dynamic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DynamicPropertyIterator_ESTest extends DynamicPropertyIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = new Locale("piK");
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      DynamicPropertyIterator dynamicPropertyIterator0 = null;
      try {
        dynamicPropertyIterator0 = new DynamicPropertyIterator(nullPointer0, "e|$;q", true, nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QName qName0 = new QName(">Eu?=&dlg");
      Class<Object> class0 = Object.class;
      Class<Integer> class1 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, (Object) null, jXPathBasicBeanInfo0);
      DynamicPropertyIterator dynamicPropertyIterator0 = new DynamicPropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      assertEquals(0, dynamicPropertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DynamicPropertyIterator dynamicPropertyIterator0 = null;
      try {
        dynamicPropertyIterator0 = new DynamicPropertyIterator((PropertyOwnerPointer) null, "", false, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }
}
