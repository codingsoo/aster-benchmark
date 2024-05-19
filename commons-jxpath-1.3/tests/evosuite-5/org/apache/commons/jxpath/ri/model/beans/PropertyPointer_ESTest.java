
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
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PropertyPointer_ESTest extends PropertyPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("aKM97{(j`T");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createChild((JXPathContext) null, qName0, 3153, (Object) "aKM97{(j`T");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      beanPropertyPointer0.bean = (Object) nullPropertyPointer0;
      boolean boolean0 = beanPropertyPointer0.isLeaf();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("POINTER: ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex(0);
      assertEquals(0, beanPropertyPointer0.getPropertyIndex());
      
      beanPropertyPointer0.setPropertyIndex(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("mo\"Rsap", "mo\"Rsap");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.setPropertyName("G+JX9Jp}_");
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(" could not create an object for path: ", " could not create an object for path: ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.setPropertyIndex(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.isCollection();
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("MK|Bh[-v8.|KV*E", "uu");
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.getPropertyNames();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.getPropertyNames();
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName(", properties = ", ", properties = ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.getPropertyName();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPropertyPointer0);
      nullPropertyPointer0.setNameAttributeValue("");
      nullPropertyPointer0.getPropertyName();
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("^j?B;< ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
      
      beanPropertyPointer0.setPropertyIndex(0);
      int int0 = beanPropertyPointer0.getPropertyIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("s", "mn5K");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      int int0 = beanPropertyPointer0.getPropertyIndex();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.getPropertyCount();
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.getLength();
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      beanPropertyPointer0.getLength();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "=");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.getImmediateValuePointer();
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.getImmediateNode();
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("Cannot create path:");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, nullPropertyPointer0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer1 = (NullPropertyPointer)beanPropertyPointer0.getBean();
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer1.getPropertyIndex());
      assertNotNull(nullPropertyPointer1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nodePointer0.setAttribute(true);
      nullPropertyPointer0.createPath(jXPathContext0);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      variablePointer0.createPath(jXPathContext0, (Object) qName0);
      nullPropertyPointer0.createPath(jXPathContext0);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("vcnY`y-x4ren{'", "Cannot create an attribute for path ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      Object object0 = new Object();
      variablePointer0.createPath((JXPathContext) null, object0);
      nullPropertyPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE, (Object) nullPropertyPointer0);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nodePointer0.setAttribute(true);
      nullPropertyPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("", "id(");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPropertyPointer0);
      int int0 = beanPropertyPointer0.compareChildNodePointers(nullPropertyPointer0, variablePointer0);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
      assertEquals((-16), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.isCollection();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.isActual();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.getPropertyName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      nullPropertyPointer0.setNameAttributeValue((String) null);
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
  public void test28()  throws Throwable  {
      QName qName0 = new QName("0N <8n(|4,qR");
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.getImmediateValuePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("", "id(");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.getImmediateNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName(", properties = ", ", properties = ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.getBean();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: , properties = :, properties = 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.getBean();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(" could not create an object for path: ", " could not create an object for path: ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.getBean();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ' could not create an object for path: : could not create an object for path: '
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo((Class) null, (Class) null);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createPath(jXPathContext0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.JXPathBasicBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(",t1", ",t1");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) ",t1");
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0, (Object) "MK|Bh[-v8.|KV*E");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ',t1:,t1'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("R{pZSo$%p(", "R{pZSo$%p(");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, nullPropertyPointer0, locale0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) class0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: /*
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = new Locale("Vf%", "", "");
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      Class<Object> class0 = Object.class;
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) class0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(",t1", ",t1");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) ",t1");
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ',t1:,t1'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      QName qName0 = new QName("Q5", "");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Q5", (Locale) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPropertyPointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild(jXPathContext0, qName0, 2148, (Object) nullPropertyPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: 'Q5'/*
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("aKM97{(j`T");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Class<Object> class0 = Object.class;
      variablePointer0.setIndex((-21));
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createChild((JXPathContext) null, qName0, (-7), (Object) "aKM97{(j`T");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'aKM97{(j`T'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("QC9>0|", "<<unknown namespace>>");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, (JXPathBeanInfo) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createChild(jXPathContext0, qName0, 56);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':org.apache.commons.jxpath.ri.model.beans.PropertyPointer'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createPath(jXPathContext0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property: $: - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      QName qName0 = new QName("uE.NGfM0|KJc<u}?b4");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.getName();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(",t1", ",t1");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.setNameAttributeValue("-+;WT+>");
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(variablePointer0);
      boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer1);
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer1.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(",t1", ",t1");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
      boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer1);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer1.getPropertyIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("QC9>0|", "<<unknown namespace>>");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(variablePointer0);
      boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer1);
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer1.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(",t1", ",t1");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      VariablePointer variablePointer1 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer1);
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(variablePointer0);
      boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer1);
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer1.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(",t1", ",t1");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      boolean boolean0 = nullPropertyPointer0.equals(qName0);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer0);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("vcnY`y-x4ren{'", "Cannot create an attribute for path ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createChild(jXPathContext0, (QName) null, Integer.MIN_VALUE);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $vcnY`y-x4ren{':Cannot create an attribute for path 
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("aKM97{(j`T");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createChild((JXPathContext) null, qName0, (-7), (Object) "aKM97{(j`T");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property: $aKM97{(j`T - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("aKM97{(j`T");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createChild((JXPathContext) null, qName0, 1, (Object) "aKM97{(j`T");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPropertyPointer0.isActual();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPropertyPointer0);
      nullPropertyPointer0.getBean();
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("aKM97{(j`T");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, basicVariables0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
      
      beanPropertyPointer0.setPropertyIndex(0);
      beanPropertyPointer0.hashCode();
      assertEquals(0, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPropertyPointer0);
      nullPropertyPointer0.hashCode();
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("aKM97{(j`T");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, basicVariables0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      int int0 = nullPropertyPointer0.compareChildNodePointers(nodePointer0, beanPropertyPointer0);
      assertEquals(55, int0);
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(",t1", ",t1");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.compareChildNodePointers(variablePointer0, variablePointer0);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }
}
