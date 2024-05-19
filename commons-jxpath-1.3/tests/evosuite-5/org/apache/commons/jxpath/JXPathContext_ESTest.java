
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


package org.apache.commons.jxpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.CompiledExpression;
import org.apache.commons.jxpath.Functions;
import org.apache.commons.jxpath.IdentityManager;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.KeyManager;
import org.apache.commons.jxpath.PackageFunctions;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathContext_ESTest extends JXPathContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      PackageFunctions packageFunctions0 = new PackageFunctions("", "");
      jXPathContext0.setFunctions(packageFunctions0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      jXPathContext2.setValue("", (Object) null);
      assertSame(jXPathContext2, jXPathContext0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      jXPathContext2.parentContext = jXPathContext1;
      jXPathContext2.parentContext.setNamespaceContextPointer(variablePointer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      jXPathContext2.removePath("jzP2[|DgrFa");
      assertSame(jXPathContext2, jXPathContext0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.removeAll("qr");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.registerNamespace("", "j`stgr9{y8/7F(qjXcG");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("B2.g$!vnmw=ie");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "B2.g$!vnmw=ie", locale0);
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn(nodePointer0).when(jXPathContext0).getPointer(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      Object object0 = jXPathContext2.selectSingleNode("");
      assertEquals("B2.g$!vnmw=ie", object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.selectNodes("B");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Iterator) null).when(jXPathContext0).iteratePointers(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      Iterator iterator0 = jXPathContext2.iteratePointers("");
      assertNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.iteratePointers("B");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Iterator) null).when(jXPathContext0).iterate(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      Iterator iterator0 = jXPathContext2.iterate("");
      assertNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.iterate("/text()");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      boolean boolean0 = jXPathContext0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Object) null).when(jXPathContext0).getValue(anyString() , any(java.lang.Class.class));
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      Class<Object> class0 = Object.class;
      Object object0 = jXPathContext2.getValue("`Jr5b u:71l2>=)63", class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Object) null).when(jXPathContext0).getValue(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      Object object0 = jXPathContext2.getValue(";Qf$NZ:");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "\"false\"");
      jXPathContext0.getValue("\"false\"");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((JXPathContext) null).when(jXPathContext0).getRelativeContext(any(org.apache.commons.jxpath.Pointer.class));
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      JXPathContext jXPathContext3 = jXPathContext2.getRelativeContext(variablePointer0);
      assertNull(jXPathContext3);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getPrefix("' and '");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Pointer) null).when(jXPathContext0).getPointer(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      Pointer pointer0 = jXPathContext2.getPointer("");
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.getPointer("kc1:b_A");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) decimalFormatSymbols0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      assertFalse(jXPathContext2.isLenient());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.getNamespaceURI("Q");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getNamespaceContextPointer();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Pointer) null).when(jXPathContext0).getContextPointer();
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      Pointer pointer0 = jXPathContext2.getContextPointer();
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getContextPointer();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Object object0 = jXPathContext0.getContextBean();
      assertNotNull(object0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Pointer) null).when(jXPathContext0).createPathAndSetValue(anyString() , any());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      Pointer pointer0 = jXPathContext2.createPathAndSetValue("j6(ik<k~EMRl", (Object) null);
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Pointer) null).when(jXPathContext0).createPath(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      Pointer pointer0 = jXPathContext2.createPath("jzP2[|DgrFa");
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("B2.g$!vnmw=ie");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "B2.g$!vnmw=ie", locale0);
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn(nodePointer0).when(jXPathContext0).createPath(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      BeanPointer beanPointer0 = (BeanPointer)jXPathContext2.createPath("");
      assertFalse(beanPointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.setValue("kc1:b_A", (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath kc1:b_A; Cannot set value for xpath: kc1:b_A
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.setValue("La+<]qQ0P2", (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'La+<]qQ0P2'. Syntax error after: 'La+'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        jXPathContext0.setValue((String) null, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.selectSingleNode("Jsm");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No pointer for xpath: Jsm
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn(variablePointer0).when(jXPathContext0).getPointer(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      // Undeclared exception!
      try { 
        jXPathContext2.selectSingleNode("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.selectSingleNode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.selectNodes("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Iterator) null).when(jXPathContext0).iteratePointers(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      // Undeclared exception!
      try { 
        jXPathContext2.selectNodes("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.selectNodes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.removeAll("ICkIcz|-kItZS]|T]XE");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'ICkIcz|-kItZS]|T]XE'. Syntax error after: 'ICkIcz|'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.removeAll((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.iteratePointers("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.iterate("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.iterate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("`-NIN", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '`-NIN'. Invalid symbol '`' at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Class<DecimalFormatSymbols> class0 = DecimalFormatSymbols.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue((String) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "(wy");
      // Undeclared exception!
      jXPathContext0.getValue("(wy");
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.getValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "\"false\"");
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext((Pointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", ")CymZ*g6r1WG");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':)CymZ*g6r1WG'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointer("XNd]vvW!Fo 0aB>eJ0");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'XNd]vvW!Fo 0aB>eJ0'. Syntax error after: 'X'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointer((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue("org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.JXPathContext");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath org.apache.commons.jxpath.JXPathContext; Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      jXPathContext0.createPathAndSetValue("(r3$B_[*w*", "(r3$B_[*w*");
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue("", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue((String) null, "EL{q`bL;");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath("3o|Sfj27>.6");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '3o|Sfj27>.6'. Syntax error after: '3'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      // Undeclared exception!
      JXPathContext.compile("(wy");
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      // Undeclared exception!
      try { 
        JXPathContext.compile("Cannot find an element by key - no KeyManager has been specified");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'Cannot find an element by key - no KeyManager has been specified'. Syntax error after: 'C'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      // Undeclared exception!
      try { 
        JXPathContext.compile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getKeyManager();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getIdentityManager();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getDecimalFormatSymbols("<<unknown namespace>>");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath("Z");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath Z; Factory is not set on the JXPathContext - cannot create path: /Z
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Locale locale0 = Locale.US;
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      jXPathContext1.setLocale(locale0);
      assertEquals("en_US", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/jxpath.properties");
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      // Undeclared exception!
      try { 
        jXPathContext1.getNodeSetByKey("3,[", evoSuiteFile0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointerByKey("", "org.apache.commons.jxpath.JXPathContext");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      KeyManager keyManager0 = jXPathContext1.getKeyManager();
      assertNull(keyManager0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointerByID((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by ID - no IdentityManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      IdentityManager identityManager0 = jXPathContext1.getIdentityManager();
      assertNull(identityManager0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      List list0 = jXPathContext0.selectNodes("false()");
      assertFalse(jXPathContext0.isLenient());
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Pointer) null).when(jXPathContext0).getPointer(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      Object object0 = jXPathContext2.selectSingleNode("");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn(variablePointer0).when(jXPathContext0).getPointer(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      // Undeclared exception!
      try { 
        jXPathContext2.selectSingleNode("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      CompiledExpression compiledExpression0 = JXPathContext.compile("China");
      CompiledExpression compiledExpression1 = JXPathContext.compile("China");
      assertNotSame(compiledExpression1, compiledExpression0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      QName qName0 = new QName("09x3{:h)s0y.:&Y", ",jR@bE;w");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, decimalFormatSymbols0, locale0);
      JXPathContext jXPathContext1 = jXPathContext0.getRelativeContext(nodePointer0);
      // Undeclared exception!
      try { 
        jXPathContext1.getValue("org.apache.commons.jxpath.JXPathInvalidAccessException");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: org.apache.commons.jxpath.JXPathInvalidAccessException
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath("org.apache.commons.jxpath.ri.Parser");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath org.apache.commons.jxpath.ri.Parser; No pointer for xpath: org.apache.commons.jxpath.ri.Parser
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      DecimalFormatSymbols decimalFormatSymbols0 = jXPathContext1.getDecimalFormatSymbols("<<unknown namespace>>");
      assertNull(decimalFormatSymbols0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      jXPathContext1.setDecimalFormatSymbols("e%arBXG7Qc#", decimalFormatSymbols0);
      DecimalFormatSymbols decimalFormatSymbols1 = jXPathContext1.getDecimalFormatSymbols("<<unknown namespace>>");
      assertNull(decimalFormatSymbols1);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      Locale locale0 = Locale.JAPANESE;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      jXPathContext0.setDecimalFormatSymbols("2", decimalFormatSymbols0);
      jXPathContext0.setDecimalFormatSymbols("", decimalFormatSymbols0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Locale locale1 = jXPathContext0.getLocale();
      assertFalse(jXPathContext0.isLenient());
      assertNotNull(locale1);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      AbstractFactory abstractFactory0 = jXPathContext1.getFactory();
      assertNull(abstractFactory0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Functions functions0 = jXPathContext0.getFunctions();
      jXPathContext0.functions = functions0;
      Functions functions1 = jXPathContext0.getFunctions();
      assertNotNull(functions1);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      Functions functions0 = jXPathContext1.getFunctions();
      assertNull(functions0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      assertFalse(jXPathContext0.isLenient());
      assertNotNull(variables0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.getContextBean();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.setFactory((AbstractFactory) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      // Undeclared exception!
      try { 
        jXPathContext2.registerNamespace("w!!%Hgm", "<<unknown namespace>>");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Namespace registration is not implemented by class org.apache.commons.jxpath.JXPathContext$MockitoMock$779518495
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      // Undeclared exception!
      try { 
        jXPathContext2.getNamespaceURI("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Namespace registration is not implemented by class org.apache.commons.jxpath.JXPathContext$MockitoMock$779518495
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      jXPathContext1.setIdentityManager((IdentityManager) null);
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.setLenient(false);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      BasicVariables basicVariables0 = new BasicVariables();
      jXPathContext0.setVariables(basicVariables0);
      Variables variables0 = jXPathContext0.getVariables();
      assertSame(variables0, basicVariables0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      // Undeclared exception!
      try { 
        jXPathContext2.getPrefix("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Namespace registration is not implemented by class org.apache.commons.jxpath.JXPathContext$MockitoMock$779518495
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      QName qName0 = new QName("p");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      // Undeclared exception!
      try { 
        jXPathContext2.setNamespaceContextPointer(variablePointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Namespace registration is not implemented by class org.apache.commons.jxpath.JXPathContext$MockitoMock$779518495
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      jXPathContext0.setKeyManager((KeyManager) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      // Undeclared exception!
      try { 
        jXPathContext2.getNamespaceContextPointer();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Namespace registration is not implemented by class org.apache.commons.jxpath.JXPathContext$MockitoMock$779518495
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getParentContext();
      assertFalse(jXPathContext0.isLenient());
  }
}
