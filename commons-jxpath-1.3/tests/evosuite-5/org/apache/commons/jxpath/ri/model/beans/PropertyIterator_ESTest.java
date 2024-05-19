
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
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyIterator;
import org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PropertyIterator_ESTest extends PropertyIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(qName0, beanPropertyPointer0, jXPathBasicBeanInfo0, (Locale) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "PropertyIerator startWith parameter is not a child of the supplied parent", true, (NodePointer) null);
      propertyIterator0.setPosition((-2469));
      int int0 = propertyIterator0.getPosition();
      assertEquals((-2469), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("0z", "");
      BeanPointer beanPointer0 = new BeanPointer(qName0, "", (JXPathBeanInfo) null, (Locale) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "nameAttributeValue", true, nullPropertyPointer0);
      // Undeclared exception!
      try { 
        propertyIterator0.setPosition(722);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator((PropertyOwnerPointer) null, "RIj~8m({[0wm:e", false, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      QName qName0 = new QName("<<unknown namespace>>");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(nullPointer0, qName0, nullPropertyPointer0);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "", false, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.BeanPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, (QName) null, (Object) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, (QName) null, nodePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.prepareForIndividualProperty("<86{1uOQ?X!tA..");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("0z", "0z");
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Locale locale0 = jXPathContext0.getLocale();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "0z", jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "0z", false, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("actual");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("0z", "0z");
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Locale locale0 = jXPathContext0.getLocale();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "0z", jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "0z", false, nullPropertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(18);
      assertEquals(18, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, (QName) null, (Object) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, (QName) null, nodePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.setPosition(59);
      assertEquals(59, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, (QName) null, (Object) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, (QName) null, nodePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      NodePointer nodePointer1 = propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
      assertNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, (QName) null, (Object) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, (QName) null, nodePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(0);
      assertFalse(boolean0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("0z", "");
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Locale locale0 = jXPathContext0.getLocale();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "", jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "nameAttributeValue", true, nullPropertyPointer0);
      assertEquals(0, propertyIterator0.getPosition());
      
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("length");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      // Undeclared exception!
      try { 
        jXPathContext0.removeAll("length");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove all for xpath length; Cannot modify property: org.apache.commons.jxpath.ri.model.VariablePointer.length; No write method
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("");
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, object0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "", true, (NodePointer) null);
      propertyIterator0.getNodePointer();
      NodePointer nodePointer1 = propertyIterator0.getNodePointer();
      assertNull(nodePointer1);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, (QName) null, (Object) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, (QName) null, nodePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      NodePointer nodePointer1 = propertyIterator0.getNodePointer();
      assertNull(nodePointer1);
      
      int int0 = propertyIterator0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("0z", "");
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Locale locale0 = jXPathContext0.getLocale();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "", jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "nameAttributeValue", true, nullPropertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, ".:F");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, ".:F", true, nullPropertyPointer0);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      propertyIterator0.getNodePointer();
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName(">J|?VaHYL>^");
      Locale locale0 = Locale.FRANCE;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, (QName) null, (Object) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, (QName) null, nodePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, (QName) null, (Object) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, (QName) null, nodePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      propertyIterator0.getPropertyPointer();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, (QName) null, (Object) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, (QName) null, nodePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("0z", "");
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Locale locale0 = jXPathContext0.getLocale();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "", jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "nameAttributeValue", true, nullPropertyPointer0);
      propertyIterator0.setPosition(722);
      boolean boolean0 = propertyIterator0.setPosition(86);
      assertEquals(86, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }
}
