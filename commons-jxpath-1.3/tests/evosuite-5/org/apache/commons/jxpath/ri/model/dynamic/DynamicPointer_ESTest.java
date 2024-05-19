
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
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.JXPathContext;
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
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPointer dynamicPointer0 = new DynamicPointer((NodePointer) null, (QName) null, object0, mapDynamicPropertyHandler0);
      QName qName0 = dynamicPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("R6n=_gIs>_J,7P`", "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, mapDynamicPropertyHandler0, locale0);
      Object object0 = dynamicPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("R6n=_gIs>_J,7P`", "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, mapDynamicPropertyHandler0, locale0);
      NodeIterator nodeIterator0 = dynamicPointer0.createNodeIterator("org.apache.commons.jxpath.ri.compiler.NodeTest", false, (NodePointer) null);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("Zv1kY", (String) null);
      Object object0 = new Object();
      Locale locale0 = Locale.ROOT;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, object0, (DynamicPropertyHandler) null, locale0);
      // Undeclared exception!
      try { 
        dynamicPointer0.hashCode();
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
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("p4");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DynamicPointer dynamicPointer0 = new DynamicPointer(variablePointer0, qName0, qName0, (DynamicPropertyHandler) null);
      // Undeclared exception!
      try { 
        dynamicPointer0.createNodeIterator("$p4", false, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("a?Cm/)7.\fHjAM", "a?Cm/)7.\fHjAM");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.KOREA;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "a?Cm/)7.\fHjAM", mapDynamicPropertyHandler0, locale0);
      DynamicPointer dynamicPointer1 = new DynamicPointer(dynamicPointer0, qName0, qName0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPointer0.createNodeIterator("", true, dynamicPointer1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.ROOT;
      DynamicPointer dynamicPointer0 = new DynamicPointer((QName) null, object0, mapDynamicPropertyHandler0, locale0);
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
  public void test07()  throws Throwable  {
      QName qName0 = new QName((String) null, "j3[3s4nk+");
      Locale locale0 = new Locale("\"comment\"", "");
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "j3[3s4nk+", (DynamicPropertyHandler) null, locale0);
      PropertyPointer propertyPointer0 = dynamicPointer0.getPropertyPointer();
      Object object0 = new Object();
      DynamicPointer dynamicPointer1 = new DynamicPointer(propertyPointer0, qName0, object0, (DynamicPropertyHandler) null);
      // Undeclared exception!
      try { 
        dynamicPointer1.asPath();
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
      QName qName0 = new QName("R6n=_gIs>_J,7P`", "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, mapDynamicPropertyHandler0, locale0);
      String string0 = dynamicPointer0.asPath();
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("WY`W>Q XG", "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = new Locale("9h]]mw");
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "WY`W>Q XG", mapDynamicPropertyHandler0, locale0);
      DynamicPointer dynamicPointer1 = new DynamicPointer(qName0, "WY`W>Q XG", mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.equals(dynamicPointer1);
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("node");
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPointer dynamicPointer0 = new DynamicPointer((NodePointer) null, qName0, object0, mapDynamicPropertyHandler0);
      Locale locale0 = Locale.PRC;
      QName qName1 = new QName("");
      DynamicPointer dynamicPointer1 = new DynamicPointer(qName1, object0, mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.equals(dynamicPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.CANADA_FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, object0, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPointer dynamicPointer0 = new DynamicPointer(nodePointer0, (QName) null, locale0, mapDynamicPropertyHandler0);
      DynamicPointer dynamicPointer1 = new DynamicPointer(nodePointer0, (QName) null, locale0, mapDynamicPropertyHandler0);
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
  public void test12()  throws Throwable  {
      QName qName0 = new QName("node");
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPointer dynamicPointer0 = new DynamicPointer((NodePointer) null, qName0, object0, mapDynamicPropertyHandler0);
      boolean boolean0 = dynamicPointer0.equals(dynamicPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("R6n=_gIs>_J,7P`", "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("Not a collection: ", "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = new Locale("", "");
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, mapDynamicPropertyHandler0, locale0);
      PropertyPointer propertyPointer0 = dynamicPointer0.getPropertyPointer();
      DynamicPointer dynamicPointer1 = new DynamicPointer(propertyPointer0, qName0, mapDynamicPropertyHandler0, mapDynamicPropertyHandler0);
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
  public void test15()  throws Throwable  {
      QName qName0 = new QName("", "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "", mapDynamicPropertyHandler0, (Locale) null);
      boolean boolean0 = dynamicPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.CANADA_FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, object0, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPointer dynamicPointer0 = new DynamicPointer(nodePointer0, (QName) null, locale0, mapDynamicPropertyHandler0);
      boolean boolean0 = dynamicPointer0.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("R6n=_gIs>_J,7P`", "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("node");
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPointer dynamicPointer0 = new DynamicPointer((NodePointer) null, qName0, object0, mapDynamicPropertyHandler0);
      dynamicPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("node");
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPointer dynamicPointer0 = new DynamicPointer((NodePointer) null, qName0, object0, mapDynamicPropertyHandler0);
      int int0 = dynamicPointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("node");
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPointer dynamicPointer0 = new DynamicPointer((NodePointer) null, qName0, object0, mapDynamicPropertyHandler0);
      NodeIterator nodeIterator0 = dynamicPointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("R6n=_gIs>_J,7P`", "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.isDynamicPropertyDeclarationSupported();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("R6n=_gIs>_J,7P`", "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, mapDynamicPropertyHandler0, locale0);
      DynamicPointer dynamicPointer1 = new DynamicPointer((NodePointer) null, qName0, dynamicPointer0, mapDynamicPropertyHandler0);
      Object object0 = dynamicPointer1.getBaseValue();
      assertNotSame(dynamicPointer1, object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("R6n=_gIs>_J,7P`", "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, mapDynamicPropertyHandler0, locale0);
      QName qName1 = dynamicPointer0.getName();
      assertSame(qName1, qName0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("R6n=_gIs>_J,7P`", "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("/");
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Locale locale0 = jXPathContext0.getLocale();
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, object0, (DynamicPropertyHandler) null, locale0);
      PropertyPointer propertyPointer0 = dynamicPointer0.getPropertyPointer();
      // Undeclared exception!
      try { 
        dynamicPointer0.createNodeIterator("<<unknown namespace>>", false, propertyPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", e);
      }
  }
}
