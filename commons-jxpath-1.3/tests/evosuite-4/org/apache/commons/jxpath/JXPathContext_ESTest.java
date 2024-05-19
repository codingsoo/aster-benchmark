
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
import java.util.Locale;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.ClassFunctions;
import org.apache.commons.jxpath.Functions;
import org.apache.commons.jxpath.IdentityManager;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.KeyManager;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathContext_ESTest extends JXPathContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      BasicVariables basicVariables0 = new BasicVariables();
      jXPathContext0.setVariables(basicVariables0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.removeAll("b");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      jXPathContext0.setNamespaceContextPointer((Pointer) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Object object0 = jXPathContext0.selectSingleNode("\"self::\"");
      assertFalse(jXPathContext0.isLenient());
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.iteratePointers("org.apache.commons.jxpath.JXPathContext");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) decimalFormatSymbols0);
      jXPathContext0.iterate("qw");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Class<Object> class0 = Object.class;
      jXPathContext0.getValue("\"attribute::\"", class0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      jXPathContext0.setLenient(true);
      Object object0 = jXPathContext0.getValue("aBSgU");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.getValue("'. Invalid symbol '");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.getPrefix("");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      jXPathContext0.registerNamespace("` Xfm0m!^X2,JYFpO", " - no such property");
      jXPathContext0.getPrefix(" - no such property");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.getPointer("*");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      assertNotNull(jXPathContext2);
      assertFalse(jXPathContext2.isLenient());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "org.apache.commons.jxpath.JXPathContext");
      jXPathContext0.getNamespaceURI("org.apache.commons.jxpath.JXPathContext");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.registerNamespace("org.apache.commons.jxpath.JXPathException", "org.apache.commons.jxpath.JXPathException");
      jXPathContext0.getNamespaceURI("org.apache.commons.jxpath.JXPathException");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getNamespaceContextPointer();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      jXPathContext0.getContextPointer();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Object object0 = jXPathContext0.getContextBean();
      assertNotNull(object0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "org.apache.commons.jxpath.JXPathContext");
      // Undeclared exception!
      try { 
        jXPathContext0.setValue("org.apache.commons.jxpath.JXPathContext", (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath org.apache.commons.jxpath.JXPathContext; Cannot set property 'org.apache.commons.jxpath.JXPathContext'/org.apache.commons.jxpath.JXPathContext, path does not match a changeable location
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.setValue("Cannot setValue of an object that is not some other object's property", (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'Cannot setValue of an object that is not some other object\\'s property'. Syntax error after: 'C'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.setValue((String) null, "Cannot find an element by ID - no IdentityManager has been specified");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      jXPathContext0.selectSingleNode("(J1xeC6");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.selectSingleNode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.selectNodes("#X~");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '#X~'. Invalid symbol '#' at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.selectNodes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "org.apache.commons.jxpath.JXPathContext");
      // Undeclared exception!
      try { 
        jXPathContext0.removePath("org.apache.commons.jxpath.JXPathContext");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath org.apache.commons.jxpath.JXPathContext; No pointer for xpath: org.apache.commons.jxpath.JXPathContext
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath("0'Fj-j*V/nc/S5[");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '0\\'Fj-j*V/nc/S5['. Invalid symbol '[' - expression incomplete
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.removeAll("\"processing-instruction\"");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove all for xpath \"processing-instruction\"; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.removeAll("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
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
  public void test31()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.iteratePointers((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
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
  public void test33()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.iterate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Class<DecimalFormatSymbols> class0 = DecimalFormatSymbols.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("/i[F90[Fxh", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '/i[F90[Fxh'. Syntax error after: '/i[F90[F'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Class<DecimalFormatSymbols> class0 = DecimalFormatSymbols.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue((String) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      Class<DecimalFormatSymbols> class0 = DecimalFormatSymbols.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("\"child::\"", class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("mbWn#");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'mbWn#'. Invalid symbol '#' - expression incomplete
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.getValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      QName qName0 = new QName("a5|P[", "B8LRA;!zfNiA'");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: a5|P[:B8LRA;!zfNiA'
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
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
  public void test41()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("g<FZE2G+(G!C,'%Nvw");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'g<FZE2G+(G!C,'%Nvw'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        jXPathContext0.getPointer("");
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
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointer((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue("U", decimalFormatSymbols0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath U; Cannot set property: /U - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue("t5Z!PLz.5`VkmPKCP", "P!jA\"7_qkkIu(Rbr1");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 't5Z!PLz.5`VkmPKCP'. Invalid symbol 'P' after: 't5Z!'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath("\"namespace-uri\"");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath \"namespace-uri\"; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath("a2ku'Lh~!/");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'a2ku\\'Lh~!/'. Invalid symbol '/' - expression incomplete
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        JXPathContext.compile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      boolean boolean0 = jXPathContext0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      QName qName0 = new QName("E5", "E5");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, qName0);
      JXPathContext jXPathContext1 = jXPathContext0.getRelativeContext(nodePointer0);
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "org.apache.commons.jxpath.JXPathContext");
      // Undeclared exception!
      try { 
        jXPathContext0.getNodeSetByKey("org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.JXPathContext");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "YE{Il]#ep#AWKRL =");
      Class<String> class0 = String.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "YE{Il]#ep#AWKRL =");
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) classFunctions0);
      // Undeclared exception!
      try { 
        jXPathContext1.getPointerByKey("", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) " _cuxo#1,");
      jXPathContext0.getKeyManager();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointerByID("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by ID - no IdentityManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) " _cuxo#1,");
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) " _cuxo#1,");
      jXPathContext1.getIdentityManager();
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      jXPathContext0.getIdentityManager();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      jXPathContext0.selectNodes("' and '");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.selectNodes("org.apache.commons.jxpath.JXPathContext");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JXPathContext.compile("Bl.>Boms0");
      // Undeclared exception!
      try { 
        JXPathContext.compile("jw[");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'jw['. Syntax error - expression incomplete
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) " _cuxo#1,");
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) " _cuxo#1,");
      boolean boolean0 = jXPathContext1.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.selectSingleNode("org.apache.commons.jxpath.JXPathContextFactory");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No pointer for xpath: org.apache.commons.jxpath.JXPathContextFactory
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.setLenient(true);
      Class<DecimalFormatSymbols> class0 = DecimalFormatSymbols.class;
      Object object1 = jXPathContext0.getValue("org.apache.commons.jxpath.JXPathInvalidSyntaxException", class0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      DecimalFormatSymbols decimalFormatSymbols0 = jXPathContext1.getDecimalFormatSymbols("[Y_Fnh>.WLGty");
      assertNull(decimalFormatSymbols0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.getDecimalFormatSymbols("j&Qrq-=v'H*9Ev");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      Locale locale0 = Locale.UK;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      jXPathContext0.setDecimalFormatSymbols("", decimalFormatSymbols0);
      DecimalFormatSymbols decimalFormatSymbols1 = jXPathContext0.getDecimalFormatSymbols("");
      assertNotNull(decimalFormatSymbols1);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      Locale locale0 = Locale.UK;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      jXPathContext0.setDecimalFormatSymbols("", decimalFormatSymbols0);
      jXPathContext0.setDecimalFormatSymbols(" - no such property", decimalFormatSymbols0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      jXPathContext1.getFactory();
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.getFactory();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "YE{Il]#ep#AWKRL =");
      Class<String> class0 = String.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "YE{Il]#ep#AWKRL =");
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) classFunctions0);
      Functions functions0 = jXPathContext1.getFunctions();
      assertNull(functions0);
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "YE{Il]#ep#AWKRL =");
      Class<String> class0 = String.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "YE{Il]#ep#AWKRL =");
      jXPathContext0.functions = (Functions) classFunctions0;
      jXPathContext0.getFunctions();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      jXPathContext0.getVariables();
      Variables variables0 = jXPathContext0.getVariables();
      assertNotNull(variables0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.getContextBean();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      jXPathContext0.setFactory((AbstractFactory) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "YE{Il]#ep#AWKRL =");
      jXPathContext0.setIdentityManager((IdentityManager) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      jXPathContext0.setLenient(true);
      Object object0 = jXPathContext0.selectSingleNode("bRG");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "YE{Il]#ep#AWKRL =");
      Locale locale0 = jXPathContext0.getLocale();
      assertNotNull(locale0);
      
      jXPathContext0.setLocale(locale0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Functions functions0 = jXPathContext0.getFunctions();
      assertNotNull(functions0);
      
      jXPathContext0.setFunctions(functions0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) "!=");
      jXPathContext1.getKeyManager();
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.setKeyManager((KeyManager) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getParentContext();
      assertFalse(jXPathContext0.isLenient());
  }
}
