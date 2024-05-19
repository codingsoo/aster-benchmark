
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
import java.util.Set;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NullPropertyPointer_ESTest extends NullPropertyPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = new Locale("0'");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.propertyIndex = (-1222);
      nullPropertyPointer0.setNameAttributeValue("<<unknown namespace>>");
      // Undeclared exception!
      try { 
        nullPropertyPointer0.setValue(qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property ''[@name='<<unknown namespace>>'], path does not match a changeable location
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("zOz<tX@o^rq'N#~F!p", "zOz<tX@o^rq'N#~F!p");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.getValuePointer();
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("zOz<tX@o^rq'N#~F!p", "zOz<tX@o^rq'N#~F!p");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) basicVariables0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.createPath((JXPathContext) null, (Object) nullPropertyPointer0);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("China");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.createPath(jXPathContext0);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale_FilteringMode0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("China");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE, (Object) "");
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("zOz<tX@o^rq'N#~F!p", "zOz<tX@o^rq'N#~F!p");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) basicVariables0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "[@name='");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName((String) null, "<<unknown namespace>>");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.setPropertyName((String) null);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.getName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("/j:c@}5=NcE=3D");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      NullPointer nullPointer0 = new NullPointer((Locale) null, "*");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0, object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $/j:c@}5=NcE=3D
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("U\"6Moq", "U\"6Moq");
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0, (Object) qName0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = new Locale("", "", ", atomic");
      NullPointer nullPointer0 = new NullPointer(locale0, ", atomic");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(propertyPointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath((JXPathContext) null, (Object) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "K1P2f`");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: id(K1P2f`)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("China");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild(jXPathContext0, qName0, (-1402), (Object) "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Index is less than 1: $China
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = new Locale("0'");
      Set<Character> set0 = locale0.getExtensionKeys();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.createPath(jXPathContext0, (Object) set0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild(jXPathContext0, qName0, (-1402), (Object) "[]");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      NullPointer nullPointer0 = new NullPointer(locale0, "Cannot create the root object: ");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      QName qName0 = new QName("", "");
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild(jXPathContext0, qName0, 659, (Object) qName0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: id(Cannot create the root object: )
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      QName qName0 = new QName("']");
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE, (Object) qName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("zOz<tX@o^rq'N#~F!p", "zOz<tX@o^rq'N#~F!p");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) basicVariables0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild((JXPathContext) null, qName0, 890);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn org.apache.commons.jxpath.BasicVariables into a collection of size 891
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "*");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild((JXPathContext) null, qName0, (-1));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: id(*)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("u(C.*%E");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      nullPropertyPointer0.setNameAttributeValue("<<unknown namespace>>");
      // Undeclared exception!
      try { 
        nullPropertyPointer0.asPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(locale0, "gIS");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      nullPropertyPointer0.setNameAttributeValue("<<unknown namespace>>");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(nullPropertyPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create a relative context for a non-existent node: id(gIS)[@name='<<unknown namespace>>']
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = new Locale("0'");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      String string0 = nullPropertyPointer0.asPath();
      assertEquals("''/*", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("lsftUGa");
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, variables0, locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: /*
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("_gc4Mx");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "_gc4Mx");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '_gc4Mx'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      String string0 = nullPropertyPointer0.getPropertyName();
      assertEquals("*", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("java.util.concurrent.atomic.AtomicBoolean", "java.util.concurrent.atomic.AtomicBoolean");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "java.util.concurrent.atomic.AtomicBoolean");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, nullPointer0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.getImmediateValuePointer();
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "t");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      boolean boolean0 = nullPropertyPointer0.isCollection();
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("H=HzJu");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "H=HzJu", locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPropertyPointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property: 'H=HzJu'/* - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("zOz<tX@o^rq'N#~F!p", "zOz<tX@o^rq'N#~F!p");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath((JXPathContext) null, (Object) nullPropertyPointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'zOz<tX@o^rq'N#~F!p:zOz<tX@o^rq'N#~F!p'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("H=HzJu");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "H=HzJu", locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild(jXPathContext0, qName0, 0, (Object) qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: 'H=HzJu'/*
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName("a^hOgGYHVbb8");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "a^hOgGYHVbb8", locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.setAttribute(true);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPropertyPointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild(jXPathContext0, qName0, 16384, (Object) nullPropertyPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an attribute for path 'a^hOgGYHVbb8'/@*, operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QName qName0 = new QName("");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(propertyPointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.setValue(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property /*, the target object is null
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.setValue((Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property /*, the target object is null
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QName qName0 = new QName("-I@H", "-I@H");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      boolean boolean0 = nullPropertyPointer0.isActualProperty();
      assertFalse(boolean0);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName("D=#aka)", "D=#aka)");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(nullPointer0, qName0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      int int0 = nullPropertyPointer0.getPropertyCount();
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = new Locale("0'");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      int int0 = nullPropertyPointer0.getLength();
      assertEquals(0, int0);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(" (", " (");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, " (");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, nullPointer0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.setPropertyIndex(Integer.MIN_VALUE);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = new Locale("0'");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      boolean boolean0 = nullPropertyPointer0.isActual();
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = new NullPointer(locale0, "xmlns:");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("&hICR<|3AsKj06|0", "(C|");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '&hICR<|3AsKj06|0:(C|'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      QName qName0 = new QName("H=HzJu");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "H=HzJu", locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      nullPropertyPointer0.getBaseValue();
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = new Locale("0'");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.getImmediateNode();
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(locale0, "9}MlFov%^*rq,");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      String[] stringArray0 = nullPropertyPointer0.getPropertyNames();
      assertEquals(0, stringArray0.length);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(locale0, "9}MlFov%^*rq,");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      boolean boolean0 = nullPropertyPointer0.isLeaf();
      assertTrue(boolean0);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("'`|/PI", "# 6>^N*;EOI)");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild((JXPathContext) null, qName0, 2569, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''`|/PI:# 6>^N*;EOI)'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(locale0, "9}MlFov%^*rq,");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      boolean boolean0 = nullPropertyPointer0.isContainer();
      assertTrue(boolean0);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
  }
}
