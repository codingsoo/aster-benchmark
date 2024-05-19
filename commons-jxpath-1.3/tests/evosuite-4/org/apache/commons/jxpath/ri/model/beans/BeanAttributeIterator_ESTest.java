
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


package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BeanAttributeIterator_ESTest extends BeanAttributeIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.PRC;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      NullPointer nullPointer0 = new NullPointer(beanPointer0, qName0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      assertEquals(0, beanAttributeIterator0.getPosition());
      
      beanAttributeIterator0.setPosition(1);
      int int0 = beanAttributeIterator0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.PRC;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      NullPointer nullPointer0 = new NullPointer(beanPointer0, qName0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.setPosition((-1));
      int int0 = beanAttributeIterator0.getPosition();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("^cJkoah6^s");
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, (JXPathBeanInfo) null, (Locale) null);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      // Undeclared exception!
      try { 
        beanAttributeIterator0.setPosition(1052);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("*+@Olzved", "y V#G[f");
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, object0, (JXPathBeanInfo) null);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      // Undeclared exception!
      try { 
        beanAttributeIterator0.getNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("xml", "*");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      boolean boolean0 = beanAttributeIterator0.setPosition(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, beanAttributeIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("xml", "*");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      assertEquals(0, beanAttributeIterator0.getPosition());
      
      beanAttributeIterator0.setPosition(1);
      beanAttributeIterator0.getNodePointer();
      assertEquals(1, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("xml", "*");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      NodePointer nodePointer0 = beanAttributeIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.UK;
      QName qName0 = new QName("xml", "lang");
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      assertEquals(0, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      BeanAttributeIterator beanAttributeIterator0 = null;
      try {
        beanAttributeIterator0 = new BeanAttributeIterator((PropertyOwnerPointer) null, qName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      QName qName0 = new QName("xml", "inVg");
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      assertEquals(0, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(locale0, "$eax4}Z%6");
      QName qName0 = new QName("*");
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      int int0 = beanAttributeIterator0.getPosition();
      assertEquals(0, int0);
  }
}
