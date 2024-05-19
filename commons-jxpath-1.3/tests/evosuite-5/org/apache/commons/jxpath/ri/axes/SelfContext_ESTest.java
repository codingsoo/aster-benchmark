
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
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SelfContext_ESTest extends SelfContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("UWdd");
      Locale locale0 = Locale.JAPAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "UWdd", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "UWdd");
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      boolean boolean0 = selfContext0.nextNode();
      assertEquals(1, selfContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, processingInstructionTest0);
      Pointer pointer0 = selfContext0.getSingleNodePointer();
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.SelfContext");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(initialContext0, nodeNameTest0);
      BeanPointer beanPointer0 = (BeanPointer)selfContext0.getSingleNodePointer();
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(3878);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, integer0, (Pointer) null);
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, "K0\"kN}CzTV&=");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      selfContext0.getCurrentNodePointer();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      QName qName0 = new QName("elSVMl-okQ%pc", "<<unknown namespace>>");
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      SelfContext selfContext0 = new SelfContext(initialContext0, (NodeTest) null);
      selfContext0.getCurrentNodePointer();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      QName qName0 = new QName("");
      Integer integer0 = new Integer(1);
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, integer0, (Locale) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-3108));
      SelfContext selfContext0 = new SelfContext(evalContext0, nodeTypeTest0);
      selfContext0.nextSet();
      selfContext0.getCurrentNodePointer();
      selfContext0.getCurrentNodePointer();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.VariablePointer$1", "");
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, basicNodeSet0, locale0);
      basicNodeSet0.add((Pointer) nodePointer0);
      QName qName1 = new QName("org.apache.commons.jxpath.ri.model.VariablePointer$1");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName1, "org.apache.commons.jxpath.ri.model.VariablePointer$1");
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, true, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeNameTest0);
      // Undeclared exception!
      selfContext0.setPosition(1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(0);
      QName qName0 = new QName("~V");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, integer0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, integer0, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      SelfContext selfContext0 = new SelfContext(unionContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        selfContext0.setPosition(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        selfContext0.setPosition(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.VariablePointer$1");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.model.VariablePointer$1");
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, false, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeNameTest0);
      selfContext0.nextSet();
      // Undeclared exception!
      try { 
        selfContext0.setPosition(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "org.apache.commons.jxpath.ri.model.VariablePointer$1");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      basicNodeSet0.add((Pointer) variablePointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.model.VariablePointer$1");
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, true, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        selfContext0.setPosition(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':org.apache.commons.jxpath.ri.model.VariablePointer$1'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.VariablePointer$1");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.model.VariablePointer$1");
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, true, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeNameTest0);
      nodeSetContext0.setPosition((-1));
      // Undeclared exception!
      try { 
        selfContext0.setPosition(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("namespace-uri", (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Index is less than 1: ");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        selfContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.VariablePointer$1");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.model.VariablePointer$1");
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, false, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeNameTest0);
      selfContext0.hasNext();
      // Undeclared exception!
      try { 
        selfContext0.nextNode();
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
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "::");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, true);
      DescendantContext descendantContext0 = new DescendantContext(precedingOrFollowingContext0, true, nodeNameTest0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1));
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        selfContext0.getSingleNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer((-1900));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("u\"/zA7z1TQ7o0j:n2");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, false, (NodeTest) null);
      SelfContext selfContext0 = new SelfContext(descendantContext0, (NodeTest) null);
      // Undeclared exception!
      try { 
        selfContext0.getCurrentNodePointer();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: u\"/zA7z1TQ7o0j:n2
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("z<~t~jr&AI");
      Locale locale0 = Locale.US;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, nodeNameTest0, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext[] evalContextArray0 = new EvalContext[9];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      SelfContext selfContext0 = new SelfContext(unionContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        selfContext0.getCurrentNodePointer();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1254);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        selfContext0.getCurrentNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      nodeSetContext0.nextNode();
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        selfContext0.getCurrentNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.VariablePointer$1");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.model.VariablePointer$1");
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, false, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeNameTest0);
      nodeSetContext0.setPosition((-1));
      // Undeclared exception!
      try { 
        selfContext0.getCurrentNodePointer();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer((-1890));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      SelfContext selfContext0 = new SelfContext(initialContext0, (NodeTest) null);
      boolean boolean0 = selfContext0.setPosition(1);
      assertEquals(1, selfContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer(0);
      QName qName0 = new QName("~V");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, integer0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, integer0, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      boolean boolean0 = selfContext0.setPosition(1);
      assertEquals(1, selfContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-3108));
      SelfContext selfContext0 = new SelfContext(initialContext0, nodeTypeTest0);
      boolean boolean0 = selfContext0.setPosition(1);
      assertEquals(1, selfContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.VariablePointer$1");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.model.VariablePointer$1");
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, false, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeNameTest0);
      boolean boolean0 = selfContext0.setPosition(1);
      assertEquals(1, selfContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.VariablePointer$1");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.model.VariablePointer$1");
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, false, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeNameTest0);
      boolean boolean0 = selfContext0.setPosition(0);
      assertEquals(0, nodeSetContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.VariablePointer$1");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.model.VariablePointer$1");
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, false, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeNameTest0);
      selfContext0.getCurrentNodePointer();
      boolean boolean0 = selfContext0.setPosition(1);
      assertEquals(1, selfContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.VariablePointer$1");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.model.VariablePointer$1");
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, false, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeNameTest0);
      selfContext0.reset();
      assertEquals(1, selfContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.VariablePointer$1");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.model.VariablePointer$1");
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, false, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeNameTest0);
      boolean boolean0 = selfContext0.nextNode();
      assertEquals(1, nodeSetContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.CANADA_FRENCH;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        selfContext0.getSingleNodePointer();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }
}
