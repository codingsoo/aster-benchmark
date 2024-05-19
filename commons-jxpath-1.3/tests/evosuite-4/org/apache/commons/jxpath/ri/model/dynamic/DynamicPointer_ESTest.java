
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
      QName qName0 = new QName("", "=k<'f");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.CANADA_FRENCH;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, mapDynamicPropertyHandler0, locale0);
      dynamicPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPointer dynamicPointer0 = new DynamicPointer((NodePointer) null, (QName) null, (Object) null, mapDynamicPropertyHandler0);
      QName qName0 = dynamicPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("^swwNmOVFg8r", ",(");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.CHINA;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, mapDynamicPropertyHandler0, locale0);
      Object object0 = dynamicPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("C_.Wj*", "C_.Wj*");
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = new Locale("+", "", "");
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, object0, mapDynamicPropertyHandler0, locale0);
      NodeIterator nodeIterator0 = dynamicPointer0.createNodeIterator("?*W!", true, (NodePointer) null);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("", (String) null);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = new Locale("DQtY%u:!N]C-7a]}}1", "", "");
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, mapDynamicPropertyHandler0, locale0);
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
  public void test05()  throws Throwable  {
      QName qName0 = new QName("Zg.");
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.ENGLISH;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, object0, mapDynamicPropertyHandler0, locale0);
      DynamicPointer dynamicPointer1 = new DynamicPointer((QName) null, object0, mapDynamicPropertyHandler0, locale0);
      // Undeclared exception!
      try { 
        dynamicPointer1.equals(dynamicPointer0);
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
      QName qName0 = new QName(")V9_mgeJnGW?H>S");
      Locale locale0 = Locale.CHINESE;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, ")V9_mgeJnGW?H>S", (DynamicPropertyHandler) null, locale0);
      Object object0 = new Object();
      DynamicPointer dynamicPointer1 = new DynamicPointer(dynamicPointer0, qName0, object0, (DynamicPropertyHandler) null);
      PropertyPointer propertyPointer0 = dynamicPointer1.getPropertyPointer();
      // Undeclared exception!
      try { 
        dynamicPointer0.createNodeIterator("ih", false, propertyPointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPointer dynamicPointer0 = new DynamicPointer((NodePointer) null, (QName) null, (Object) null, mapDynamicPropertyHandler0);
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
  public void test08()  throws Throwable  {
      QName qName0 = new QName(",zr:cE=@Bl.h=_|C_", ",zr:cE=@Bl.h=_|C_");
      Locale locale0 = new Locale(",zr:cE=@Bl.h=_|C_", ",zr:cE=@Bl.h=_|C_");
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, ",zr:cE=@Bl.h=_|C_", (DynamicPropertyHandler) null, locale0);
      PropertyPointer propertyPointer0 = dynamicPointer0.getPropertyPointer();
      DynamicPointer dynamicPointer1 = new DynamicPointer(propertyPointer0, qName0, propertyPointer0, (DynamicPropertyHandler) null);
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
  public void test09()  throws Throwable  {
      QName qName0 = new QName("", "=k<'f");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.CANADA_FRENCH;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, mapDynamicPropertyHandler0, locale0);
      PropertyPointer propertyPointer0 = dynamicPointer0.getPropertyPointer();
      DynamicPointer dynamicPointer1 = new DynamicPointer(propertyPointer0, qName0, locale0, mapDynamicPropertyHandler0);
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
      QName qName0 = new QName("I");
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.ENGLISH;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, object0, mapDynamicPropertyHandler0, locale0);
      DynamicPointer dynamicPointer1 = new DynamicPointer(qName0, object0, mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.equals(dynamicPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.GERMANY;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, mapDynamicPropertyHandler0, locale0);
      DynamicPointer dynamicPointer1 = new DynamicPointer(dynamicPointer0, qName0, locale0, mapDynamicPropertyHandler0);
      boolean boolean0 = dynamicPointer1.equals(dynamicPointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("Zg.");
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.ENGLISH;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, object0, mapDynamicPropertyHandler0, locale0);
      DynamicPointer dynamicPointer1 = new DynamicPointer((QName) null, object0, mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.equals(dynamicPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("Zg.");
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.ENGLISH;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, object0, mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.equals(dynamicPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "", mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.equals(qName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "", mapDynamicPropertyHandler0, locale0);
      String string0 = dynamicPointer0.asPath();
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPointer dynamicPointer0 = new DynamicPointer(variablePointer0, (QName) null, jXPathContext0, mapDynamicPropertyHandler0);
      boolean boolean0 = dynamicPointer0.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "", mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("(X)w&quP>P/KLp#&PiW", ",(");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.CHINA;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "", mapDynamicPropertyHandler0, locale0);
      int int0 = dynamicPointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "", mapDynamicPropertyHandler0, locale0);
      NodeIterator nodeIterator0 = dynamicPointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "", mapDynamicPropertyHandler0, locale0);
      Object object0 = dynamicPointer0.getBaseValue();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "", mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.isDynamicPropertyDeclarationSupported();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.TAIWAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "", mapDynamicPropertyHandler0, locale0);
      QName qName1 = dynamicPointer0.getName();
      assertNull(qName1.getPrefix());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.GERMANY;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("^swwNmOVFg8r", ",(");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.CHINA;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, mapDynamicPropertyHandler0, locale0);
      PropertyPointer propertyPointer0 = dynamicPointer0.getPropertyPointer();
      // Undeclared exception!
      try { 
        dynamicPointer0.createNodeIterator(",(", true, propertyPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Object object0 = new Object();
      DynamicPointer dynamicPointer0 = new DynamicPointer(variablePointer0, qName0, object0, (DynamicPropertyHandler) null);
      // Undeclared exception!
      try { 
        dynamicPointer0.createNodeIterator("<<unknown namespace>>", true, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }
}
