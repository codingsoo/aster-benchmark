
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
import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BeanPropertyPointer_ESTest extends BeanPropertyPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex(1602);
      boolean boolean0 = beanPropertyPointer0.isLeaf();
      assertEquals(1602, beanPropertyPointer0.getPropertyIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("", "w601d)=^;')cFR");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setIndex(64);
      beanPropertyPointer0.remove();
      assertEquals(64, beanPropertyPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex(1602);
      beanPropertyPointer0.setPropertyName(">");
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("hewa9^Dg\"#@G\"R", "hewa9^Dg\"#@G\"R");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      String string0 = beanPropertyPointer0.getPropertyName();
      assertEquals("*", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      PropertyDescriptor[] propertyDescriptorArray0 = beanPropertyPointer0.getPropertyDescriptors();
      assertEquals(15, propertyDescriptorArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      PropertyDescriptor[] propertyDescriptorArray0 = beanPropertyPointer0.getPropertyDescriptors();
      assertEquals(0, propertyDescriptorArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      int int0 = beanPropertyPointer0.getPropertyCount();
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.setValue(beanPropertyPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property: /* - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName((String) null, "*");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, basicVariables0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.setValue(basicVariables0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
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
  public void test11()  throws Throwable  {
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.isActualProperty();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("Factory is not set on the JXPathContext - cannot create path: ", "Factory is not set on the JXPathContext - cannot create path: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.getPropertyNames();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
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
  public void test14()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(":");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.getPropertyDescriptors();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("ce|zmGf.DHl\".?FEz2.", "ce|zmGf.DHl\".?FEz2.");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.getPropertyCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName(";&a,lnGfmI]DIp");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.propertyIndex = 1;
      // Undeclared exception!
      try { 
        beanPropertyPointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: ;&a,lnGfmI]DIp
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
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
  public void test19()  throws Throwable  {
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex(0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.getBaseValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot access property: org.apache.commons.jxpath.ri.QName.bound; java.lang.ClassCastException@58876381
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      QName qName0 = new QName((String) null, (String) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createChild(jXPathContext0, qName0, (-1223), (Object) jXPathBasicBeanInfo0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property: /* - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPropertyPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setIndex(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      Object object0 = beanPropertyPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, object0, locale0);
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("{f,(");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex(0);
      beanPropertyPointer0.setIndex(0);
      assertEquals(0, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex((-899));
      // Undeclared exception!
      try { 
        beanPropertyPointer0.remove();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property: /* - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("{f,(");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyName("<<unknown namespace>>");
      Object object0 = beanPropertyPointer0.getNode();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setIndex((-3897));
      beanPropertyPointer0.setIndex(0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.remove();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property: /* - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setIndex((-3897));
      beanPropertyPointer0.remove();
      assertEquals((-3897), beanPropertyPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
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
  public void test32()  throws Throwable  {
      QName qName0 = new QName(" - no such property");
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, " - no such property", locale0);
      Class<String> class0 = String.class;
      Class<IndexedPropertyDescriptor> class1 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex(1);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) beanPropertyPointer0);
      beanPropertyPointer0.createPath(jXPathContext0);
      assertEquals(1, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QName qName0 = new QName(" - no such property");
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, " - no such property", locale0);
      Class<String> class0 = String.class;
      Class<IndexedPropertyDescriptor> class1 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex(1);
      Object object0 = beanPropertyPointer0.getBaseValue();
      // Undeclared exception!
      try { 
        beanPropertyPointer0.setValue(object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot modify property: java.lang.String.empty; No write method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      int int0 = beanPropertyPointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex(0);
      boolean boolean0 = beanPropertyPointer0.isCollection();
      assertEquals(0, beanPropertyPointer0.getPropertyIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex(0);
      boolean boolean0 = beanPropertyPointer0.isActualProperty();
      assertEquals(0, beanPropertyPointer0.getPropertyIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      QName qName0 = new QName("", "w601d)=^;')cFR");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPropertyPointer0.isActualProperty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setIndex((-3897));
      beanPropertyPointer0.getImmediateNode();
      assertEquals((-3897), beanPropertyPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      beanPropertyPointer0.isLeaf();
      boolean boolean0 = beanPropertyPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      QName qName0 = new QName("", "w601d)=^;')cFR");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setIndex(64);
      beanPropertyPointer0.setPropertyIndex(2425);
      assertEquals(2425, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      QName qName0 = new QName(" - no such property");
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, " - no such property", locale0);
      Class<String> class0 = String.class;
      Class<IndexedPropertyDescriptor> class1 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex(1);
      beanPropertyPointer0.getBaseValue();
      beanPropertyPointer0.getNode();
      assertEquals(1, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      Class<IndexedPropertyDescriptor> class0 = IndexedPropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      String[] stringArray0 = beanPropertyPointer0.getPropertyNames();
      assertEquals(15, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      QName qName0 = new QName("", "w601d)=^;')cFR");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.getPropertyNames();
      String[] stringArray0 = beanPropertyPointer0.getPropertyNames();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      QName qName0 = new QName("", "w601d)=^;')cFR");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      int int0 = beanPropertyPointer0.getPropertyCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      QName qName0 = new QName("", "w601d)=^;')cFR");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPropertyPointer0.isContainer();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.getBaseValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }
}
