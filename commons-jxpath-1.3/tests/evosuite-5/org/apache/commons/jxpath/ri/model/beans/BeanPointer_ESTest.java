
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
import java.util.LinkedList;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BeanPointer_ESTest extends BeanPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      beanPointer0.setIndex((-685));
      BeanPointer beanPointer1 = new BeanPointer((QName) null, beanPointer0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, object0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, (QName) null, jXPathContext0, jXPathBasicBeanInfo0);
      QName qName0 = beanPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<BeanPointer> class0 = BeanPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.ENGLISH;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      Object object0 = beanPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.TAIWAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      // Undeclared exception!
      try { 
        beanPointer0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.PRC;
      BeanPointer beanPointer0 = new BeanPointer(qName0, locale0, (JXPathBeanInfo) null, locale0);
      QName qName1 = new QName((String) null, (String) null);
      BeanPointer beanPointer1 = new BeanPointer(qName1, locale0, (JXPathBeanInfo) null, locale0);
      // Undeclared exception!
      try { 
        beanPointer0.equals(beanPointer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("d4YRcL562ijS].[5~Y", (String) null);
      Locale locale0 = Locale.PRC;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, (JXPathBeanInfo) null, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      Object object0 = new Object();
      BeanPointer beanPointer1 = new BeanPointer(propertyPointer0, qName0, object0, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPointer1.asPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.ITALY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "", jXPathBasicBeanInfo0, locale0);
      // Undeclared exception!
      try { 
        beanPointer0.createChild((JXPathContext) null, qName0, (-525));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path ''/[-524], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.GERMANY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      QName qName1 = beanPointer0.getName();
      assertEquals("", qName1.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.BeanPointer");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.forLanguageTag("org.apache.commons.jxpath.ri.model.beans.BeanPointer");
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      Object object1 = beanPointer0.getBaseValue();
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("'");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, object0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, nodePointer0, (JXPathBeanInfo) null, (Locale) null);
      String string0 = beanPointer0.asPath();
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      String string0 = beanPointer0.asPath();
      assertEquals("null()", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.PRC;
      BeanPointer beanPointer0 = new BeanPointer(qName0, locale0, (JXPathBeanInfo) null, locale0);
      BeanPointer beanPointer1 = new BeanPointer(qName0, locale0, (JXPathBeanInfo) null, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      beanPointer0.setIndex(4251);
      BeanPointer beanPointer1 = new BeanPointer((QName) null, beanPointer0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("'");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      QName qName1 = new QName("'", "<<unknown namespace>>");
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName1, object0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, nodePointer0, (JXPathBeanInfo) null, (Locale) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer1 = new BeanPointer(qName1, (Object) null, jXPathBasicBeanInfo0, (Locale) null);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer((QName) null, beanPointer0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathContextFactory");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.JAPANESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "org.apache.commons.jxpath.JXPathContextFactory", jXPathBasicBeanInfo0, locale0);
      LinkedList<Locale> linkedList0 = new LinkedList<Locale>();
      BeanPointer beanPointer1 = new BeanPointer(qName0, linkedList0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.PRC;
      BeanPointer beanPointer0 = new BeanPointer(qName0, locale0, (JXPathBeanInfo) null, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      Object object0 = new Object();
      BeanPointer beanPointer1 = new BeanPointer(propertyPointer0, qName0, object0, (JXPathBeanInfo) null);
      boolean boolean0 = beanPointer1.equals(beanPointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathContextFactory");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, "BeanInfo [class = java.lang.Object, dynamic, properties = ]", jXPathBasicBeanInfo0, locale0);
      LinkedList<Locale> linkedList0 = new LinkedList<Locale>();
      BeanPointer beanPointer1 = new BeanPointer(qName0, linkedList0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.PRC;
      BeanPointer beanPointer0 = new BeanPointer(qName0, locale0, (JXPathBeanInfo) null, locale0);
      boolean boolean0 = beanPointer0.equals(qName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathContextFactory");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.JAPANESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "org.apache.commons.jxpath.JXPathContextFactory", jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathContextFactory");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "org.apache.commons.jxpath.JXPathContextFactory", jXPathBasicBeanInfo0, locale0);
      Object object0 = new Object();
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, object0, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<BeanPointer> class0 = BeanPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.ENGLISH;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      beanPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathContextFactory");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "org.apache.commons.jxpath.JXPathContextFactory", jXPathBasicBeanInfo0, locale0);
      Object object0 = new Object();
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, object0, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer1.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("d4YRcL562ijS].[5~Y", (String) null);
      Locale locale0 = Locale.PRC;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, (JXPathBeanInfo) null, locale0);
      boolean boolean0 = beanPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathContextFactory");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "org.apache.commons.jxpath.JXPathContextFactory", jXPathBasicBeanInfo0, locale0);
      int int0 = beanPointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathContextFactory");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "org.apache.commons.jxpath.JXPathContextFactory", jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.isCollection();
      assertFalse(boolean0);
  }
}
