
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


package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class InitialContext_ESTest extends InitialContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(jXPathContextReferenceImpl0).getLocale();
      doReturn((NamespaceResolver) null, (NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("Oh?vaq~*W+EW`}olf[S");
      Locale locale0 = Locale.CHINA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Oh?vaq~*W+EW`}olf[S", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, rootContext0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      evalContext0.nextSet();
      boolean boolean0 = evalContext0.nextSet();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(jXPathContextReferenceImpl0).getLocale();
      doReturn((NamespaceResolver) null, (NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("Oh?vaq~*W+EW`}olf[S");
      Locale locale0 = Locale.CHINA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Oh?vaq~*W+EW`}olf[S", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, rootContext0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      evalContext0.nextNode();
      boolean boolean0 = evalContext0.nextNode();
      assertEquals(2, evalContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      InitialContext initialContext0 = new InitialContext(rootContext0);
      Object object0 = initialContext0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(jXPathContextReferenceImpl0).getLocale();
      doReturn((NamespaceResolver) null, (NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("Oh?vaq~*W+EW`}olf[S");
      Locale locale0 = Locale.CHINA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Oh?vaq~*W+EW`}olf[S", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, rootContext0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      Object object0 = evalContext0.getValue();
      assertEquals("Oh?vaq~*W+EW`}olf[S", object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName((String) null, "eBp\"2SRNmn");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, (Object) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = new InitialContext(rootContext0);
      NullPointer nullPointer1 = (NullPointer)initialContext0.getCurrentNodePointer();
      assertEquals(Integer.MIN_VALUE, nullPointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("OI+T<<gf.M}!qu");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = new InitialContext(rootContext0);
      NodePointer nodePointer0 = initialContext0.getCurrentNodePointer();
      assertTrue(nodePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      QName qName0 = new QName("");
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[7];
      evalContextArray0[0] = evalContext0;
      DescendantContext descendantContext0 = new DescendantContext(evalContextArray0[0], true, (NodeTest) null);
      evalContextArray0[1] = (EvalContext) descendantContext0;
      evalContextArray0[2] = evalContext0;
      evalContextArray0[3] = evalContext0;
      evalContextArray0[4] = evalContext0;
      evalContextArray0[5] = evalContext0;
      evalContextArray0[6] = evalContext0;
      UnionContext unionContext0 = new UnionContext(evalContext0, evalContextArray0);
      InitialContext initialContext0 = new InitialContext(unionContext0);
      NodePointer nodePointer1 = initialContext0.getCurrentNodePointer();
      assertEquals(2, evalContext0.getPosition());
      assertEquals(0, nodePointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("OI+T<<gf.M}!qu");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = new InitialContext(rootContext0);
      // Undeclared exception!
      try { 
        initialContext0.setPosition(1392);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("Oh?vaq~*W+EW`}olf[S");
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = new InitialContext(rootContext0);
      // Undeclared exception!
      try { 
        initialContext0.setPosition(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Oh?vaq~*W+EW`}olf[S'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.InitialContext", "org.apache.commons.jxpath.ri.axes.InitialContext");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = new InitialContext(rootContext0);
      // Undeclared exception!
      try { 
        initialContext0.getValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'org.apache.commons.jxpath.ri.axes.InitialContext:org.apache.commons.jxpath.ri.axes.InitialContext'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, jXPathContext0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, true, processingInstructionTest0);
      InitialContext initialContext0 = new InitialContext(descendantContext0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("Oh?vaq~*W+EW`}olf[S");
      Locale locale0 = Locale.CHINA;
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      Constant constant0 = new Constant("M");
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, constant0);
      InitialContext initialContext0 = null;
      try {
        initialContext0 = new InitialContext(predicateContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InitialContext initialContext0 = null;
      try {
        initialContext0 = new InitialContext((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("Exception trying to remove all for xpath ");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, true);
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext(precedingOrFollowingContext0, evalContextArray0);
      DescendantContext descendantContext0 = new DescendantContext(unionContext0, true, processingInstructionTest0);
      unionContext0.getContextNodePointer();
      InitialContext initialContext0 = null;
      try {
        initialContext0 = new InitialContext(descendantContext0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[7];
      evalContextArray0[0] = (EvalContext) initialContext0;
      DescendantContext descendantContext0 = new DescendantContext(evalContextArray0[0], true, (NodeTest) null);
      evalContextArray0[1] = (EvalContext) descendantContext0;
      evalContextArray0[2] = (EvalContext) initialContext0;
      evalContextArray0[3] = (EvalContext) initialContext0;
      evalContextArray0[4] = (EvalContext) initialContext0;
      evalContextArray0[5] = (EvalContext) initialContext0;
      evalContextArray0[6] = (EvalContext) initialContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      unionContext0.setPosition((-1438));
      InitialContext initialContext1 = null;
      try {
        initialContext1 = new InitialContext(unionContext0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      QName qName0 = new QName("");
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[7];
      evalContextArray0[0] = evalContext0;
      DescendantContext descendantContext0 = new DescendantContext(evalContextArray0[0], true, (NodeTest) null);
      evalContextArray0[1] = (EvalContext) descendantContext0;
      evalContextArray0[2] = evalContext0;
      evalContextArray0[3] = evalContext0;
      evalContextArray0[4] = evalContext0;
      evalContextArray0[5] = evalContext0;
      evalContextArray0[6] = evalContext0;
      UnionContext unionContext0 = new UnionContext(evalContext0, evalContextArray0);
      InitialContext initialContext0 = new InitialContext(unionContext0);
      boolean boolean0 = initialContext0.setPosition(1);
      assertEquals(1, initialContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      QName qName0 = new QName("");
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      evalContext0.setPosition(1);
      assertEquals(1, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      Locale locale0 = Locale.lookup(linkedList0, linkedList1);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(jXPathContextReferenceImpl0).getLocale();
      doReturn((NamespaceResolver) null, (NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("Oh?vaq~*W+EW`}olf[S");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Oh?vaq~*W+EW`}olf[S", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, rootContext0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      evalContext0.setPosition(1392);
      assertEquals(1392, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      QName qName0 = new QName("");
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[7];
      evalContextArray0[0] = evalContext0;
      DescendantContext descendantContext0 = new DescendantContext(evalContextArray0[0], true, (NodeTest) null);
      evalContextArray0[1] = (EvalContext) descendantContext0;
      evalContextArray0[2] = evalContext0;
      evalContextArray0[3] = evalContext0;
      evalContextArray0[4] = evalContext0;
      evalContextArray0[5] = evalContext0;
      evalContextArray0[6] = evalContext0;
      UnionContext unionContext0 = new UnionContext(evalContext0, evalContextArray0);
      InitialContext initialContext0 = new InitialContext(unionContext0);
      boolean boolean0 = initialContext0.setPosition(Integer.MIN_VALUE);
      assertEquals(2, evalContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      Locale locale0 = Locale.lookup(linkedList0, linkedList1);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(jXPathContextReferenceImpl0).getLocale();
      doReturn((NamespaceResolver) null, (NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("Oh?vaq~*W+EW`}olf[S");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Oh?vaq~*W+EW`}olf[S", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, rootContext0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      boolean boolean0 = evalContext0.setPosition(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, evalContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      Locale locale0 = Locale.lookup(linkedList0, linkedList1);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(jXPathContextReferenceImpl0).getLocale();
      doReturn((NamespaceResolver) null, (NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("Oh?vaq~*W+EW`}olf[S");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Oh?vaq~*W+EW`}olf[S", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, rootContext0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      BeanPointer beanPointer0 = (BeanPointer)evalContext0.getSingleNodePointer();
      assertNull(beanPointer0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("e8tn!{)iRO%N=:(", "e8tn!{)iRO%N=:(");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      EvalContext evalContext0 = rootContext0.getVariableContext(qName0);
      // Undeclared exception!
      try { 
        evalContext0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: e8tn!{)iRO%N=:(:e8tn!{)iRO%N=:(
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }
}
