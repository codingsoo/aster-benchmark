
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


package org.apache.commons.jxpath.ri;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
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
public class EvalContext_ESTest extends EvalContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      unionContext0.setPosition((-1294));
      boolean boolean0 = unionContext0.hasNext();
      assertEquals((-1292), unionContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("node");
      ParentContext parentContext0 = new ParentContext((EvalContext) null, processingInstructionTest0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr((Expression[]) null);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationOr0, coreOperationOr0);
      PredicateContext predicateContext0 = new PredicateContext(parentContext0, coreOperationLessThanOrEqual0);
      // Undeclared exception!
      try { 
        predicateContext0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, true);
      // Undeclared exception!
      try { 
        precedingOrFollowingContext0.hasNext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("|^CsW5?5Z{zZx`%drk");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, processingInstructionTest0);
      selfContext0.reset();
      assertEquals(0, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("g,S&y\"4");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, false);
      NamespaceContext namespaceContext0 = new NamespaceContext(precedingOrFollowingContext0, nodeNameTest0);
      namespaceContext0.setPosition((-1));
      assertEquals(0, namespaceContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(variablePointer0);
      boolean boolean0 = initialContext0.setPosition(Integer.MIN_VALUE);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      boolean boolean0 = initialContext0.nextSet();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("JXPath iterators cannot remove nodes");
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, processingInstructionTest0);
      ChildContext childContext0 = new ChildContext(descendantContext0, processingInstructionTest0, true, true);
      childContext0.nextSet();
      assertEquals(2, evalContext0.getPosition());
      assertEquals(0, descendantContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("!wxi3");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      boolean boolean0 = initialContext0.nextNode();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("!wxi3");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      initialContext0.next();
      initialContext0.getContextNodeList();
      assertEquals(1, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("!wxi3");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      boolean boolean0 = initialContext0.hasNext();
      assertEquals(1, initialContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Object object0 = evalContext0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      unionContext0.getSingleNodePointer();
      assertEquals(1, unionContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NullPointer nullPointer0 = (NullPointer)initialContext0.getSingleNodePointer();
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      QName qName0 = new QName(" [~uK]l~(8", " [~uK]l~(8");
      NodePointer nodePointer0 = jXPathContextReferenceImpl0.getVariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext evalContext0 = rootContext0.getVariableContext(qName0);
      evalContext0.nextNode();
      int int0 = evalContext0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      int int0 = nodeSetContext0.getCurrentPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("JXPath iterators cannot remove nodes");
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, true, processingInstructionTest0);
      ChildContext childContext0 = new ChildContext(descendantContext0, processingInstructionTest0, true, true);
      childContext0.getCurrentNodePointer();
      int int0 = childContext0.getCurrentPosition();
      assertEquals(1, childContext0.getPosition());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      unionContext0.setPosition((-1294));
      int int0 = unionContext0.getCurrentPosition();
      assertEquals((-1294), unionContext0.getPosition());
      assertEquals((-1294), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1900);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(evalContext0, nodeTypeTest0, true);
      QName qName0 = new QName("UNKNOWN()", "UNKNOWN()");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "UNKNOWN()");
      AttributeContext attributeContext0 = new AttributeContext(precedingOrFollowingContext0, nodeNameTest0);
      NodePointer nodePointer0 = attributeContext0.getCurrentNodePointer();
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      QName qName0 = new QName("$3c,ua8mNsyi1", "y");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      EvalContext evalContext0 = rootContext0.getConstantContext(variablePointer0);
      NodePointer nodePointer0 = evalContext0.getCurrentNodePointer();
      assertNotSame(variablePointer0, nodePointer0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("!wxi3");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      RootContext rootContext0 = initialContext0.getRootContext();
      BeanPointer beanPointer0 = (BeanPointer)rootContext0.getContextNodePointer();
      assertNull(beanPointer0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate((Expression) null);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationNegate0);
      // Undeclared exception!
      try { 
        predicateContext0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      unionContext0.setPosition((-1294));
      // Undeclared exception!
      try { 
        unionContext0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("JXPath iterators cannot remove nodes");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      // Undeclared exception!
      try { 
        rootContext0.setPosition((-12));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      UnionContext unionContext0 = new UnionContext(rootContext0, (EvalContext[]) null);
      // Undeclared exception!
      try { 
        unionContext0.setPosition(777);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      // Undeclared exception!
      try { 
        rootContext0.nextSet();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2654);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(parentContext0, nodeTypeTest0);
      ChildContext childContext0 = new ChildContext(namespaceContext0, nodeTypeTest0, false, false);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(childContext0, nodeTypeTest0, false);
      // Undeclared exception!
      try { 
        precedingOrFollowingContext0.nextSet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      // Undeclared exception!
      try { 
        rootContext0.nextNode();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("&");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "&");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        descendantContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.DescendantContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      // Undeclared exception!
      try { 
        rootContext0.next();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("JXPath iterators cannot remove nodes");
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, processingInstructionTest0);
      ChildContext childContext0 = new ChildContext(descendantContext0, processingInstructionTest0, true, true);
      RootContext rootContext0 = childContext0.getRootContext();
      // Undeclared exception!
      try { 
        rootContext0.hasNext();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext(rootContext0, true, nodeNameTest0);
      ParentContext parentContext0 = new ParentContext(ancestorContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        parentContext0.getValue();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        parentContext0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      // Undeclared exception!
      try { 
        rootContext0.getSingleNodePointer();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, processingInstructionTest0);
      // Undeclared exception!
      try { 
        parentContext0.getSingleNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("]28N_dq", "]28N_dq");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        ancestorContext0.getRootContext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      // Undeclared exception!
      try { 
        rootContext0.getNodeSet();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2204));
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      AttributeContext attributeContext0 = new AttributeContext(selfContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        attributeContext0.getNodeSet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1));
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        parentContext0.getJXPathContext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      // Undeclared exception!
      try { 
        rootContext0.getCurrentPosition();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      QName qName0 = new QName("!wxi3");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, nodeNameTest0);
      // Undeclared exception!
      descendantContext0.getCurrentNodePointer();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      QName qName0 = new QName("/@", "/@");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "/@");
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, false, false);
      // Undeclared exception!
      try { 
        childContext0.getCurrentNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.ChildContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      unionContext0.setPosition(1);
      // Undeclared exception!
      try { 
        unionContext0.getCurrentNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      unionContext0.setPosition((-1294));
      // Undeclared exception!
      try { 
        unionContext0.getCurrentNodePointer();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      QName qName0 = new QName("&apos;", "rZ}mS*0Qh%");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        descendantContext0.getContextNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.DescendantContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      QName qName0 = new QName("Empty expression context", "Empty expression context");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, variablePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      // Undeclared exception!
      try { 
        rootContext0.getContextNodeList();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("|^CsW5?5Z{zZx`%drk");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, processingInstructionTest0);
      // Undeclared exception!
      try { 
        selfContext0.getContextNodeList();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[9];
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(initialContext0, nodeNameTest0, true);
      evalContextArray0[0] = (EvalContext) precedingOrFollowingContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        unionContext0.setPosition(Integer.MIN_VALUE);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("JXPath iterators cannot remove nodes");
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, true, processingInstructionTest0);
      ChildContext childContext0 = new ChildContext(descendantContext0, processingInstructionTest0, true, true);
      childContext0.getRootContext();
      RootContext rootContext0 = childContext0.getRootContext();
      assertFalse(rootContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2204));
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      AttributeContext attributeContext0 = new AttributeContext(selfContext0, nodeTypeTest0);
      attributeContext0.nextNode();
      // Undeclared exception!
      try { 
        attributeContext0.getNodeSet();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Simultaneous operations: should not request pointer list while iterating over an EvalContext
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeTypeTest0);
      boolean boolean0 = namespaceContext0.isChildOrderingRequired();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2204));
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeTypeTest0, false, false);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(childContext0, nodeTypeTest0, false);
      boolean boolean0 = precedingOrFollowingContext0.isChildOrderingRequired();
      assertTrue(boolean0);
      assertFalse(childContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      DescendantContext descendantContext0 = new DescendantContext(selfContext0, true, nodeNameTest0);
      Constant constant0 = new Constant((Number) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      PredicateContext predicateContext0 = new PredicateContext(descendantContext0, coreOperationNotEqual0);
      int int0 = predicateContext0.getDocumentOrder();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      QName qName0 = new QName("!wxi3");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      RootContext rootContext0 = initialContext0.getRootContext();
      int int0 = rootContext0.getDocumentOrder();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("&%v");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.axes.ParentContext");
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, nodeNameTest0);
      int int0 = namespaceContext0.getDocumentOrder();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("|^CsW5?5Z{zZx`%drk");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, processingInstructionTest0);
      int int0 = selfContext0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("N(K", "Bft!EI;q *z5gzRh89J");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      AncestorContext ancestorContext0 = new AncestorContext(evalContext0, true, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(ancestorContext0, nodeNameTest0);
      selfContext0.getContextNodePointer();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("JXPath iterators cannot remove nodes");
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, processingInstructionTest0);
      ChildContext childContext0 = new ChildContext(descendantContext0, processingInstructionTest0, true, true);
      evalContext0.getJXPathContext();
      RootContext rootContext0 = childContext0.getRootContext();
      assertFalse(rootContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      QName qName0 = new QName("!wxi3");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      initialContext0.getNodeSet();
      initialContext0.getCurrentNodePointer();
      assertEquals(2, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, (NodeTest) null);
      namespaceContext0.nextNode();
      // Undeclared exception!
      try { 
        namespaceContext0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Simultaneous operations: should not request pointer list while iterating over an EvalContext
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      evalContext0.getContextNodeList();
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      unionContext0.hasNext();
      // Undeclared exception!
      try { 
        unionContext0.getContextNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("N(K", "Bft!EI;q *z5gzRh89J");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      AncestorContext ancestorContext0 = new AncestorContext(evalContext0, true, nodeNameTest0);
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext(ancestorContext0, evalContextArray0);
      unionContext0.setPosition(122);
      assertEquals(122, unionContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      QName qName0 = new QName("&%v");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.axes.ParentContext");
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeNameTest0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ((EvalContext)ancestorContext0).sortPointers(linkedList0);
      assertFalse(linkedList0.contains("&%v"));
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[9];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(unionContext0, coreOperationOr0);
      AttributeContext attributeContext0 = new AttributeContext(predicateContext0, (NodeTest) null);
      DescendantContext descendantContext0 = new DescendantContext(attributeContext0, false, (NodeTest) null);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(descendantContext0, basicNodeSet0);
      boolean boolean0 = nodeSetContext0.hasNext();
      assertEquals(1, nodeSetContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      QName qName0 = new QName("!wxi3");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, nodeNameTest0);
      // Undeclared exception!
      descendantContext0.next();
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      Integer integer0 = new Integer(29);
      Constant constant0 = new Constant(integer0);
      PredicateContext predicateContext0 = new PredicateContext(nodeSetContext0, constant0);
      QName qName0 = new QName("Index is less than 1: ");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext(predicateContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        parentContext0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      QName qName0 = new QName("!wxi3");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      initialContext0.forEachRemaining(consumer0);
      // Undeclared exception!
      try { 
        initialContext0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("JXPath iterators cannot remove nodes");
      AttributeContext attributeContext0 = new AttributeContext(evalContext0, processingInstructionTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(attributeContext0, processingInstructionTest0);
      Consumer<VariablePointer> consumer0 = (Consumer<VariablePointer>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      namespaceContext0.hasNext();
      namespaceContext0.forEachRemaining(consumer0);
      assertEquals(2, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("Index is less than 1: ");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext(nodeSetContext0, true, nodeNameTest0);
      ancestorContext0.getValue();
      assertEquals(0, ancestorContext0.getPosition());
      assertEquals(1, nodeSetContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      QName qName0 = new QName("!wxi3");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      RootContext rootContext0 = initialContext0.getRootContext();
      assertNotNull(rootContext0);
      
      String string0 = rootContext0.toString();
      assertEquals("Expression context [0] /:/", string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, (NodeTest) null);
      namespaceContext0.nextNode();
      namespaceContext0.getContextNodeList();
      assertEquals(1, namespaceContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        evalContext0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JXPath iterators cannot remove nodes
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, (NodeTest) null);
      String string0 = namespaceContext0.toString();
      assertEquals("Empty expression context", string0);
      assertEquals(0, namespaceContext0.getPosition());
  }
}
