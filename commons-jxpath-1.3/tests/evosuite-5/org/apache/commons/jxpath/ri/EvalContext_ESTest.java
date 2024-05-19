
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
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class EvalContext_ESTest extends EvalContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("rBA-;ou", "y!@0,r,lSyIeKpI2Rvl");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      initialContext0.setPosition((-659));
      // Undeclared exception!
      try { 
        initialContext0.getNodeSet();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Simultaneous operations: should not request pointer list while iterating over an EvalContext
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("rBA-;ou", "y!@0,r,lSyIeKpI2Rvl");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ((EvalContext)initialContext0).position = 2211;
      initialContext0.getContextNodeList();
      assertEquals(2211, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1024);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        parentContext0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("Empty expression context");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        ancestorContext0.hasNext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      evalContext0.reset();
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[6];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-3258));
      AncestorContext ancestorContext0 = new AncestorContext(unionContext0, true, nodeTypeTest0);
      PredicateContext predicateContext0 = new PredicateContext(ancestorContext0, (Expression) null);
      predicateContext0.setPosition((-3258));
      assertEquals(0, predicateContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      boolean boolean0 = initialContext0.setPosition(Integer.MIN_VALUE);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      boolean boolean0 = initialContext0.nextSet();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) "] ");
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      boolean boolean0 = initialContext0.nextNode();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("8JqsrKXXC%q!ABn3I/f");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, false);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(precedingOrFollowingContext0, basicNodeSet0);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, processingInstructionTest0);
      namespaceContext0.nextNode();
      assertEquals(1, namespaceContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("rBA-;ou", "y!@0,r,lSyIeKpI2Rvl");
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
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      VariablePointer variablePointer1 = (VariablePointer)rootContext0.getValue();
      assertFalse(variablePointer1.isActual());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("8JqsrKXXC%q!ABn3I/f");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, true);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(precedingOrFollowingContext0, basicNodeSet0);
      nodeSetContext0.hasNext();
      int int0 = nodeSetContext0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("8JqsrKXXC%q!ABn3I/f");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, false);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(precedingOrFollowingContext0, basicNodeSet0);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, processingInstructionTest0);
      int int0 = namespaceContext0.getDocumentOrder();
      assertTrue(nodeSetContext0.isChildOrderingRequired());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.BasicNodeSet");
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, processingInstructionTest0);
      int int0 = ancestorContext0.getDocumentOrder();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("8JqsrKXXC%q!ABn3I/f");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, false);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(precedingOrFollowingContext0, basicNodeSet0);
      nodeSetContext0.hasNext();
      int int0 = nodeSetContext0.getCurrentPosition();
      assertEquals(1, nodeSetContext0.getPosition());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(">");
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, processingInstructionTest0);
      ChildContext childContext0 = new ChildContext(attributeContext0, processingInstructionTest0, false, true);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(childContext0, processingInstructionTest0, true);
      NodePointer nodePointer0 = precedingOrFollowingContext0.getCurrentNodePointer();
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NullPointer nullPointer0 = (NullPointer)evalContext0.getCurrentNodePointer();
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NullPointer nullPointer0 = (NullPointer)evalContext0.getContextNodePointer();
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-474));
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        selfContext0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("8JqsrKXXC%q!ABn3I/f");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, true);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(precedingOrFollowingContext0, basicNodeSet0);
      nodeSetContext0.hasNext();
      // Undeclared exception!
      try { 
        nodeSetContext0.toString();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
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
  public void test23()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("x");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, processingInstructionTest0);
      // Undeclared exception!
      try { 
        descendantContext0.nextSet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("Empty expression context");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        parentContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.ParentContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
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
  public void test26()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
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
  public void test27()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeTypeTest0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("h7m");
      SelfContext selfContext0 = new SelfContext(namespaceContext0, processingInstructionTest0);
      selfContext0.getContextNodePointer();
      // Undeclared exception!
      try { 
        selfContext0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Simultaneous operations: should not request pointer list while iterating over an EvalContext
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, (Expression) null);
      // Undeclared exception!
      try { 
        predicateContext0.getSingleNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1094));
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        attributeContext0.getRootContext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
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
  public void test32()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(variablePointer0);
      // Undeclared exception!
      try { 
        initialContext0.getNodeSet();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QName qName0 = new QName("oE`KB9s'~lb7", "oE`KB9s'~lb7");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeNameTest0);
      // Undeclared exception!
      try { 
        descendantContext0.getJXPathContext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[7];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      // Undeclared exception!
      try { 
        unionContext0.getCurrentNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("8JqsrKXXC%q!ABn3I/f");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, false);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(precedingOrFollowingContext0, basicNodeSet0);
      nodeSetContext0.hasNext();
      // Undeclared exception!
      try { 
        nodeSetContext0.getCurrentNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ChildContext childContext0 = new ChildContext((EvalContext) null, (NodeTest) null, false, false);
      // Undeclared exception!
      try { 
        childContext0.getContextNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.ChildContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("8JqsrKXXC%q!ABn3I/f");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, false);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(precedingOrFollowingContext0, basicNodeSet0);
      nodeSetContext0.hasNext();
      ChildContext childContext0 = new ChildContext(nodeSetContext0, processingInstructionTest0, false, false);
      // Undeclared exception!
      try { 
        childContext0.getContextNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      RootContext rootContext0 = evalContext0.getRootContext();
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
  public void test39()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[2];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      // Undeclared exception!
      try { 
        unionContext0.getContextNodeList();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("66d*kyjaq)5vV08");
      ChildContext childContext0 = new ChildContext(nodeSetContext0, processingInstructionTest0, true, true);
      childContext0.getSingleNodePointer();
      assertEquals(1, nodeSetContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      QName qName0 = new QName("rBA-;ou", "y!@0,r,lSyIeKpI2Rvl");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[1];
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      unionContext0.getRootContext();
      RootContext rootContext0 = unionContext0.getRootContext();
      assertEquals(0, rootContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      QName qName0 = new QName("", (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      ChildContext childContext0 = new ChildContext(attributeContext0, nodeNameTest0, false, true);
      boolean boolean0 = childContext0.isChildOrderingRequired();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("8JqsrKXXC%q!ABn3I/f");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, false);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(precedingOrFollowingContext0, basicNodeSet0);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, processingInstructionTest0);
      boolean boolean0 = namespaceContext0.isChildOrderingRequired();
      assertEquals(1, nodeSetContext0.getDocumentOrder());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      int int0 = rootContext0.getDocumentOrder();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      int int0 = evalContext0.getDocumentOrder();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("8JqsrKXXC%q!ABn3I/f");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, true);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(precedingOrFollowingContext0, basicNodeSet0);
      int int0 = nodeSetContext0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      EvalContext[] evalContextArray0 = new EvalContext[2];
      evalContextArray0[0] = (EvalContext) nodeSetContext0;
      evalContextArray0[1] = (EvalContext) nodeSetContext0;
      UnionContext unionContext0 = new UnionContext(nodeSetContext0, evalContextArray0);
      basicNodeSet0.add((Pointer) null);
      unionContext0.getCurrentNodePointer();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("66d*kyjaq)5vV08");
      nodeSetContext0.getSingleNodePointer();
      ChildContext childContext0 = new ChildContext(nodeSetContext0, processingInstructionTest0, true, true);
      childContext0.getSingleNodePointer();
      childContext0.getSingleNodePointer();
      assertEquals(1, nodeSetContext0.getPosition());
      assertEquals(0, childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      jXPathContextReferenceImpl0.removeAll("G");
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("8JqsrKXXC%q!ABn3I/f");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, false);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(precedingOrFollowingContext0, basicNodeSet0);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, processingInstructionTest0);
      namespaceContext0.hasNext();
      // Undeclared exception!
      try { 
        namespaceContext0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      QName qName0 = new QName("rBA-;ou", "y!@0,r,lSyIeKpI2Rvl");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[1];
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      initialContext0.forEachRemaining(consumer0);
      evalContextArray0[0] = (EvalContext) initialContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      unionContext0.getSingleNodePointer();
      assertEquals(2, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("8JqsrKXXC%q!ABn3I/f");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, false);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(precedingOrFollowingContext0, basicNodeSet0);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, processingInstructionTest0);
      namespaceContext0.getSingleNodePointer();
      boolean boolean0 = namespaceContext0.nextSet();
      assertEquals(2, nodeSetContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("8JqsrKXXC%q!ABn3I/f");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, false);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(precedingOrFollowingContext0, basicNodeSet0);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, processingInstructionTest0);
      SelfContext selfContext0 = new SelfContext(namespaceContext0, processingInstructionTest0);
      String string0 = selfContext0.toString();
      assertEquals("Empty expression context", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      QName qName0 = new QName("rBA-;ou");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      initialContext0.getNodeSet();
      assertEquals(2, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      QName qName0 = new QName("rBA-;ou");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      initialContext0.getContextNodeList();
      assertEquals(0, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      QName qName0 = new QName("rBA-;ou", "y!@0,r,lSyIeKpI2Rvl");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[1];
      evalContextArray0[0] = (EvalContext) initialContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      unionContext0.getSingleNodePointer();
      assertEquals(2, initialContext0.getPosition());
      assertEquals(0, initialContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("8JqsrKXXC%q!ABn3I/f");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, false);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(precedingOrFollowingContext0, basicNodeSet0);
      List list0 = nodeSetContext0.getContextNodeList();
      ((EvalContext)nodeSetContext0).sortPointers(list0);
      assertEquals(0, nodeSetContext0.getPosition());
      assertEquals(1, nodeSetContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        evalContext0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      QName qName0 = new QName("rBA-;ou", "y!@0,r,lSyIeKpI2Rvl");
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
  public void test59()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("JXPath iterators cannot remove nodes");
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "JXPath iterators cannot remove nodes", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(initialContext0, nodeNameTest0);
      selfContext0.hasNext();
      boolean boolean0 = selfContext0.hasNext();
      assertEquals(1, initialContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      evalContext0.getJXPathContext();
      evalContext0.getJXPathContext();
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.BasicNodeSet");
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, processingInstructionTest0);
      ParentContext parentContext0 = new ParentContext(ancestorContext0, processingInstructionTest0);
      AttributeContext attributeContext0 = new AttributeContext(parentContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        attributeContext0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("JXPath iterators cannot remove nodes");
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "JXPath iterators cannot remove nodes", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(initialContext0, nodeNameTest0);
      int int0 = selfContext0.getCurrentPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
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
  public void test64()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("JXPath iterators cannot remove nodes");
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "JXPath iterators cannot remove nodes", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      String string0 = initialContext0.toString();
      assertEquals("Expression context [0] $JXPath iterators cannot remove nodes", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, false);
      // Undeclared exception!
      try { 
        precedingOrFollowingContext0.getNodeSet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }
}
