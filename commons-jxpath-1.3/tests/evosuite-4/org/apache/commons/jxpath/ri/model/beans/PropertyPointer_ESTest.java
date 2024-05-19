
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
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PropertyPointer_ESTest extends PropertyPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      nullPropertyPointer0.setIndex(44);
      nullPropertyPointer0.hashCode();
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex(1779);
      beanPropertyPointer0.hashCode();
      assertEquals(1779, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createChild(jXPathContext0, qName0, 1, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $*
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex(1779);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      QName qName0 = nullPropertyPointer0.getName();
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createChild(jXPathContext0, qName0, (-1), (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property: /* - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("tz,6`*1c+FH3KTB.(?A", "tz,6`*1c+FH3KTB.(?A");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.setPropertyName("=#\u0001Hg/8{");
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      nullPropertyPointer0.setIndex(1088);
      nullPropertyPointer0.isCollection();
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("h>57hPo");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.isCollection();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("usKF", "");
      Locale locale0 = Locale.FRANCE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "usKF", locale0);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.getPropertyNames();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("'", "^T>#Q?dljz>1\"8nIID");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.getPropertyNames();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      nullPropertyPointer0.getPropertyName();
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("FIx", "FIx");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      int int0 = nullPropertyPointer0.getPropertyIndex();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.getPropertyCount();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      beanPropertyPointer0.getPropertyCount();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      nullPropertyPointer0.getLength();
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("=ncJ~ywW@B#");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.getLength();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      beanPropertyPointer0.getImmediateValuePointer();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.getImmediateNode();
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      nullPropertyPointer0.getBean();
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("x &rb)s%+J", "x &rb)s%+J");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, "x &rb)s%+J");
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      Object object0 = beanPropertyPointer0.getBean();
      assertNotNull(object0);
      
      boolean boolean0 = beanPropertyPointer0.isLeaf();
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("8HPu", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.compareChildNodePointers(variablePointer0, variablePointer0);
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("6tF(J)f|h54YpYFGC*:", "6tF(J)f|h54YpYFGC*:");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(beanPropertyPointer0, qName0, beanPropertyPointer0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      int int0 = nullPropertyPointer0.compareChildNodePointers(beanPropertyPointer0, variablePointer0);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
      assertEquals((-12), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.isLeaf();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("=<", "=<");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, (JXPathBeanInfo) null);
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
  public void test23()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("|2SE;zg~", "|2SE;zg~");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setValue((Object) null);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
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
  public void test24()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("<3s[ErI@bj:0gf8}", "Factory ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.getName();
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
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("^eZx", "^eZx");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, (JXPathBeanInfo) null);
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
  public void test26()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
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
  public void test27()  throws Throwable  {
      QName qName0 = new QName("DL2o;*g3l8M", "DL2o;*g3l8M");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.getBean();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: DL2o;*g3l8M:DL2o;*g3l8M
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(":eEUZ3HlpDDlmp6fR");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.getBean();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':eEUZ3HlpDDlmp6fR'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, (Locale) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0, (Object) jXPathContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath(jXPathContext0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      NodeIterator nodeIterator0 = beanPropertyPointer0.attributeIterator(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeIterator0);
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
      QName qName0 = new QName("6tF(J)f|V54pYFG*", "6tF(J)f|V54pYFG*");
      Locale locale0 = Locale.TAIWAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
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
  public void test33()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("FIx", "FIx");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'FIx:FIx'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("C]", "C]");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("<<unknown namespace>>");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE, (Object) qName0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '<<unknown namespace>>'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("OK=[ERo", "WjH-&^<WKK*(]m[Elc");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild(jXPathContext0, qName0, 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory did not assign a collection to variable 'OK=[ERo:WjH-&^<WKK*(]m[Elc' for path: $OK=[ERo:WjH-&^<WKK*(]m[Elc
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = new QName("<<unknown namespace>>", "");
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createChild((JXPathContext) null, qName0, 95);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        nullPropertyPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      beanPropertyPointer0.setIndex((byte)64);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createPath(jXPathContext0, (Object) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $null
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
      assertTrue(nullPropertyPointer1.equals((Object)nullPropertyPointer0));
      
      nullPropertyPointer1.setIndex(44);
      boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer1);
      assertFalse(nullPropertyPointer1.equals((Object)nullPropertyPointer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
      assertTrue(nullPropertyPointer1.equals((Object)nullPropertyPointer0));
      
      nullPropertyPointer1.setIndex(44);
      boolean boolean0 = nullPropertyPointer1.equals(nullPropertyPointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      nullPropertyPointer0.setNameAttributeValue("Collection element does not exist: ");
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
      boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer1);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer1.getPropertyIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer0);
      boolean boolean0 = beanPropertyPointer0.equals(nullPropertyPointer1);
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer1.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
      boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer1);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer1.getPropertyIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      boolean boolean0 = nullPropertyPointer0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer0);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      QName qName0 = new QName("6tF(J)f|h54YpYFGC*:", "6tF(J)f|h54YpYFGC*:");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(beanPropertyPointer0, qName0, beanPropertyPointer0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      boolean boolean0 = nullPropertyPointer0.equals(beanPropertyPointer0);
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createChild(jXPathContext0, (QName) null, 1650, (Object) basicVariables0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $null
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createPath(jXPathContext0, (Object) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property: $null - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      QName qName0 = new QName("6tF(J)f|h54YpYFGC*:", "6tF(J)f|h54YpYFGC*:");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(variablePointer0, jXPathBasicBeanInfo0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $6tF(J)f|h54YpYFGC*::6tF(J)f|h54YpYFGC*:
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      QName qName0 = new QName("Factory ", "Factory ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPropertyPointer0.isActual();
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, beanPropertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      // Undeclared exception!
      try { 
        nullPropertyPointer0.getBean();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex(1779);
      int int0 = beanPropertyPointer0.getPropertyIndex();
      assertEquals(1779, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPropertyPointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }
}
