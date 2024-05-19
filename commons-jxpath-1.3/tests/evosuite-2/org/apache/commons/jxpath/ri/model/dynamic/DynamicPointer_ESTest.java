
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
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.MapDynamicPropertyHandler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DynamicPointer_ESTest extends DynamicPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("$");
      DynamicPointer dynamicPointer0 = new DynamicPointer((NodePointer) null, qName0, (Object) null, (DynamicPropertyHandler) null);
      dynamicPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("l");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPointer dynamicPointer0 = new DynamicPointer(variablePointer0, qName0, "l", mapDynamicPropertyHandler0);
      QName qName1 = dynamicPointer0.getName();
      assertSame(qName1, qName0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("", "");
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = new Locale("}Uqh[qlw/s.'fU", "", "");
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, object0, mapDynamicPropertyHandler0, locale0);
      Object object1 = dynamicPointer0.getBaseValue();
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("");
      DynamicPointer dynamicPointer0 = new DynamicPointer((NodePointer) null, qName0, (Object) null, (DynamicPropertyHandler) null);
      NodeIterator nodeIterator0 = dynamicPointer0.createNodeIterator("", false, (NodePointer) null);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("", "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.CHINESE;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, mapDynamicPropertyHandler0, locale0);
      NodeIterator nodeIterator0 = dynamicPointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.CHINESE;
      DynamicPointer dynamicPointer0 = new DynamicPointer((QName) null, (Object) null, mapDynamicPropertyHandler0, locale0);
      // Undeclared exception!
      try { 
        dynamicPointer0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("", "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.CHINESE;
      DynamicPointer dynamicPointer0 = new DynamicPointer((QName) null, qName0, (DynamicPropertyHandler) null, locale0);
      DynamicPointer dynamicPointer1 = new DynamicPointer(dynamicPointer0, qName0, qName0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPointer0.equals(dynamicPointer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "", (DynamicPropertyHandler) null, locale0);
      PropertyPointer propertyPointer0 = dynamicPointer0.getPropertyPointer();
      // Undeclared exception!
      try { 
        dynamicPointer0.createNodeIterator("&apos;", true, propertyPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("", "");
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = new Locale("}Uqh[qlw/s.'fU", "", "");
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, object0, mapDynamicPropertyHandler0, locale0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(dynamicPointer0, qName0, object0);
      // Undeclared exception!
      try { 
        dynamicPointer0.createNodeIterator("]0Nn", false, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.BeanPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("}jZVNsrSytj1j8\"dF");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.GERMANY;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, mapDynamicPropertyHandler0, locale0);
      PropertyPointer propertyPointer0 = dynamicPointer0.getPropertyPointer();
      Object object0 = new Object();
      DynamicPointer dynamicPointer1 = new DynamicPointer(propertyPointer0, qName0, object0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPointer1.asPath();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "", (DynamicPropertyHandler) null, locale0);
      String string0 = dynamicPointer0.asPath();
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.CHINA;
      DynamicPointer dynamicPointer0 = new DynamicPointer((QName) null, (Object) null, mapDynamicPropertyHandler0, locale0);
      QName qName0 = dynamicPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("");
      DynamicPointer dynamicPointer0 = new DynamicPointer((NodePointer) null, qName0, (Object) null, (DynamicPropertyHandler) null);
      Object object0 = dynamicPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("0");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.KOREAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, mapDynamicPropertyHandler0, locale0);
      DynamicPointer dynamicPointer1 = new DynamicPointer(dynamicPointer0, (QName) null, qName0, mapDynamicPropertyHandler0);
      boolean boolean0 = dynamicPointer0.equals(dynamicPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("", "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.CHINESE;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, mapDynamicPropertyHandler0, locale0);
      DynamicPointer dynamicPointer1 = new DynamicPointer(dynamicPointer0, qName0, qName0, mapDynamicPropertyHandler0);
      boolean boolean0 = dynamicPointer0.equals(dynamicPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("k#");
      Locale locale0 = Locale.forLanguageTag("* !8m~MRLc(Ww=D");
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "k#", (DynamicPropertyHandler) null, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      DynamicPointer dynamicPointer1 = new DynamicPointer(variablePointer0, qName0, "* !8m~MRLc(Ww=D", (DynamicPropertyHandler) null);
      boolean boolean0 = dynamicPointer0.equals(dynamicPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("k#");
      Locale locale0 = Locale.forLanguageTag("/");
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "k#", (DynamicPropertyHandler) null, locale0);
      boolean boolean0 = dynamicPointer0.equals(dynamicPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("k#");
      Locale locale0 = Locale.forLanguageTag("/");
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "k#", (DynamicPropertyHandler) null, locale0);
      boolean boolean0 = dynamicPointer0.equals("/");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("Q");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.KOREA;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("k#");
      Locale locale0 = Locale.forLanguageTag("/");
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "k#", (DynamicPropertyHandler) null, locale0);
      boolean boolean0 = dynamicPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("k#");
      Locale locale0 = Locale.forLanguageTag("/");
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "k#", (DynamicPropertyHandler) null, locale0);
      int int0 = dynamicPointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.GERMANY;
      DynamicPointer dynamicPointer0 = new DynamicPointer((QName) null, (Object) null, mapDynamicPropertyHandler0, locale0);
      // Undeclared exception!
      try { 
        dynamicPointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DynamicPointer dynamicPointer0 = new DynamicPointer((QName) null, (Object) null, mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("k#");
      Locale locale0 = Locale.forLanguageTag("* !8m~MRLc(Ww=D");
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "k#", (DynamicPropertyHandler) null, locale0);
      boolean boolean0 = dynamicPointer0.isDynamicPropertyDeclarationSupported();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("$");
      DynamicPointer dynamicPointer0 = new DynamicPointer((NodePointer) null, qName0, (Object) null, (DynamicPropertyHandler) null);
      boolean boolean0 = dynamicPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("?T1M?f m>)wSCY-", "?T1M?f m>)wSCY-");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, mapDynamicPropertyHandler0, (Locale) null);
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, mapDynamicPropertyHandler0, (Locale) null);
      // Undeclared exception!
      try { 
        dynamicPointer0.createNodeIterator("bTQ0Qz[b|^", true, nodePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }
}