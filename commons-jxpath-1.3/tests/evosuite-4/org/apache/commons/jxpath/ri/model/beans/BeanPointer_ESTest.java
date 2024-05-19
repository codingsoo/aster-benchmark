
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
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      QName qName0 = beanPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("E o:{n)2&}#R{hWaiO[");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      Object object0 = new Object();
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, object0, jXPathBasicBeanInfo0);
      Object object1 = beanPointer1.getBaseValue();
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Object object0 = new Object();
      Locale locale0 = new Locale("org.apache.commons.jxpath.ri.model.beans.NullPointer", "org.apache.commons.jxpath.ri.model.beans.NullPointer");
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, (JXPathBeanInfo) null, locale0);
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
  public void test03()  throws Throwable  {
      QName qName0 = new QName("vOh'nF-O =:iGq*oY", "}BgMM,9F~<*");
      Locale locale0 = Locale.GERMAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "}BgMM,9F~<*", (JXPathBeanInfo) null, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      BeanPointer beanPointer1 = new BeanPointer(propertyPointer0, qName0, "vOh'nF-O =:iGq*oY", (JXPathBeanInfo) null);
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
  public void test04()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      QName qName0 = new QName("<<unknown namespace>>");
      BeanPointer beanPointer1 = new BeanPointer(qName0, beanPointer0, jXPathBasicBeanInfo0, locale0);
      String string0 = beanPointer1.asPath();
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("b*f| $Xhnd", "b*f| $Xhnd");
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "b*f| $Xhnd", jXPathBasicBeanInfo0, locale0);
      String string0 = beanPointer0.asPath();
      assertEquals("'b*f| $Xhnd'", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      String string0 = beanPointer0.asPath();
      assertEquals("null()", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      BeanPointer beanPointer0 = new BeanPointer((QName) null, object0, (JXPathBeanInfo) null, (Locale) null);
      BeanPointer beanPointer1 = new BeanPointer((QName) null, linkedList0, (JXPathBeanInfo) null, (Locale) null);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("b*f| $Xhnd", "b*f| $Xhnd");
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "b*f| $Xhnd", jXPathBasicBeanInfo0, locale0);
      Object object0 = new Object();
      BeanPointer beanPointer1 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      beanPointer0.setIndex(93);
      BeanPointer beanPointer1 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer1.equals(beanPointer0);
      assertFalse(beanPointer0.equals((Object)beanPointer1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      beanPointer0.setIndex(93);
      BeanPointer beanPointer1 = new BeanPointer((QName) null, beanPointer0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      QName qName0 = new QName("<<unknown namespace>>");
      BeanPointer beanPointer1 = new BeanPointer(qName0, beanPointer0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer1.equals(beanPointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      QName qName0 = new QName("<<unknown namespace>>");
      BeanPointer beanPointer1 = new BeanPointer(qName0, beanPointer0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("J;B_Q(1df3C`UZahe");
      Object object0 = new Object();
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, qName0, qName0, (JXPathBeanInfo) null);
      Object object1 = beanPointer0.clone();
      boolean boolean0 = beanPointer0.equals(object1);
      assertFalse(object1.equals((Object)nodePointer0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("E o:{n)2&}#R{hWaiO[");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      Object object0 = new Object();
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, object0, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, variablePointer0, jXPathBasicBeanInfo0);
      Object object0 = new Object();
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, object0, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, variablePointer0, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer0.equals(beanPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      beanPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("b*f| $Xhnd", "b*f| $Xhnd");
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "b*f| $Xhnd", jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, variablePointer0, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer0.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("E o:{n)2&}#R{hWaiO[");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("E o:{n)2&}#R{hWaiO[");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      int int0 = beanPointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("E o:{n)2&}#R{hWaiO[");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      Object object0 = beanPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("E o:{n)2&}#R{hWaiO[");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      QName qName1 = beanPointer0.getName();
      assertEquals("E o:{n)2&}#R{hWaiO[", qName1.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, variablePointer0, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer0.isCollection();
      assertFalse(boolean0);
  }
}
