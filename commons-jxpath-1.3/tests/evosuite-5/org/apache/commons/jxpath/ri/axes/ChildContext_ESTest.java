
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
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
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
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ChildContext_ESTest extends ChildContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.ROOT;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(evalContext0, nodeNameTest0, false, false);
      childContext0.setPosition((-1516));
      childContext0.getCurrentNodePointer();
      assertEquals((-1516), childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.ROOT;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(evalContext0, nodeNameTest0, false, false);
      childContext0.reset();
      assertEquals(0, childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Locale locale0 = Locale.CHINA;
      QName qName0 = new QName("1YvUlQl`;", "Wg");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, locale0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, jXPathContext0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ChildContext childContext0 = new ChildContext(evalContext0, (NodeTest) null, false, true);
      boolean boolean0 = childContext0.setPosition(1);
      assertEquals(1, childContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Locale locale0 = Locale.CHINA;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(jXPathContext0, (Object) locale0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ChildContext childContext0 = new ChildContext(initialContext0, (NodeTest) null, false, true);
      boolean boolean0 = childContext0.nextNode();
      assertEquals(1, childContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, false, nodeNameTest0);
      ChildContext childContext0 = new ChildContext(descendantContext0, nodeNameTest0, false, false);
      // Undeclared exception!
      try { 
        childContext0.setPosition(Integer.MIN_VALUE);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(4);
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, true, nodeTypeTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeTypeTest0);
      EvalContext[] evalContextArray0 = new EvalContext[2];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(selfContext0, evalContextArray0);
      ChildContext childContext0 = new ChildContext(unionContext0, nodeTypeTest0, false, false);
      // Undeclared exception!
      try { 
        childContext0.setPosition(1079);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(4955);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      ChildContext childContext0 = new ChildContext(selfContext0, nodeTypeTest0, true, true);
      // Undeclared exception!
      try { 
        childContext0.setPosition((-1535));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(nodeSetContext0, nodeNameTest0, false, false);
      childContext0.hasNext();
      // Undeclared exception!
      try { 
        childContext0.setPosition(33);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      QName qName0 = new QName("No write method");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("No write method");
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, true, processingInstructionTest0);
      ChildContext childContext0 = new ChildContext(descendantContext0, processingInstructionTest0, true, true);
      // Undeclared exception!
      try { 
        childContext0.nextNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: No write method
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.ROOT;
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, nodeNameTest0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer1);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = evalContext0;
      evalContextArray0[1] = evalContext0;
      evalContextArray0[2] = evalContext0;
      evalContextArray0[3] = evalContext0;
      evalContextArray0[4] = evalContext0;
      evalContextArray0[5] = evalContext0;
      evalContextArray0[6] = evalContext0;
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      evalContextArray0[7] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(evalContext0, evalContextArray0);
      ChildContext childContext0 = new ChildContext(unionContext0, nodeNameTest0, true, true);
      // Undeclared exception!
      try { 
        childContext0.nextNode();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("M9uPG2)tMg1Mi");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, true, false);
      // Undeclared exception!
      try { 
        childContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.ChildContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(1);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("", (String) null);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      ChildContext childContext0 = new ChildContext(rootContext0, (NodeTest) null, false, true);
      // Undeclared exception!
      try { 
        childContext0.nextNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':null'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      Locale locale0 = Locale.GERMAN;
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      ChildContext childContext0 = new ChildContext(rootContext0, nodeNameTest0, true, true);
      // Undeclared exception!
      try { 
        childContext0.getSingleNodePointer();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, processingInstructionTest0);
      ChildContext childContext0 = new ChildContext(namespaceContext0, processingInstructionTest0, true, true);
      childContext0.setPosition((-1));
      childContext0.nextNode();
      // Undeclared exception!
      try { 
        childContext0.getSingleNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      QName qName0 = new QName("", "Aclv!(:Db5^tq#J[n22");
      Integer integer0 = new Integer(1);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, integer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, nodeNameTest0);
      ChildContext childContext0 = new ChildContext(descendantContext0, nodeNameTest0, false, false);
      // Undeclared exception!
      try { 
        childContext0.getCurrentNodePointer();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :Aclv!(:Db5^tq#J[n22
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("}");
      Locale locale0 = Locale.ROOT;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "}");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, qName0, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      Expression[] expressionArray0 = new Expression[7];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, extensionFunction0);
      ChildContext childContext0 = new ChildContext(predicateContext0, nodeNameTest0, false, false);
      // Undeclared exception!
      try { 
        childContext0.getCurrentNodePointer();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ChildContext childContext0 = new ChildContext(initialContext0, (NodeTest) null, true, true);
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
  public void test17()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      nodeSetContext0.getContextNodePointer();
      ChildContext childContext0 = new ChildContext(nodeSetContext0, (NodeTest) null, true, false);
      // Undeclared exception!
      try { 
        childContext0.getCurrentNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("3y", "3y");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, false, nodeNameTest0);
      ParentContext parentContext0 = new ParentContext(descendantContext0, nodeNameTest0);
      ChildContext childContext0 = new ChildContext(parentContext0, nodeNameTest0, false, false);
      childContext0.setPosition((-1664));
      childContext0.getSingleNodePointer();
      assertEquals((-1664), childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.ROOT;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(evalContext0, nodeNameTest0, false, false);
      childContext0.nextNode();
      assertEquals(1, childContext0.getPosition());
      
      childContext0.setPosition(0);
      assertEquals(0, childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, processingInstructionTest0);
      ChildContext childContext0 = new ChildContext(namespaceContext0, processingInstructionTest0, true, true);
      childContext0.nextNode();
      childContext0.getCurrentNodePointer();
      assertEquals(1, childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) fileSystemHandling0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.TreeCompiler");
      Locale locale0 = Locale.ENGLISH;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, jXPathContextReferenceImpl0, locale0);
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer(beanPointer0, qName0, (Object) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(rootContext0, nodeNameTest0, true, false);
      // Undeclared exception!
      try { 
        childContext0.getCurrentNodePointer();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.NullPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ChildContext childContext0 = new ChildContext(initialContext0, (NodeTest) null, false, true);
      childContext0.getCurrentNodePointer();
      childContext0.nextNode();
      assertEquals(2, childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Integer integer0 = new Integer(2179);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("ZfNTV");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      ChildContext childContext0 = new ChildContext(initialContext0, nodeNameTest0, false, true);
      childContext0.getSingleNodePointer();
      assertEquals(2, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer integer0 = new Integer(2179);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.CildContext", "org.apache.commons.jxpath.ri.axes.CildContext");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.axes.CildContext");
      ChildContext childContext0 = new ChildContext(initialContext0, nodeNameTest0, false, false);
      childContext0.getSingleNodePointer();
      assertEquals(1, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Locale locale0 = Locale.CHINA;
      QName qName0 = new QName("1YvUlQl`;", "Wg");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, locale0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, jXPathContext0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ChildContext childContext0 = new ChildContext(evalContext0, (NodeTest) null, false, true);
      childContext0.getSingleNodePointer();
      assertEquals(1, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Locale locale0 = Locale.CHINA;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(jXPathContext0, (Object) locale0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ChildContext childContext0 = new ChildContext(initialContext0, (NodeTest) null, false, true);
      childContext0.getCurrentNodePointer();
      assertEquals(1, childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("lr4S7)|@|}T=", "lr4S7)|@|}T=");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "lr4S7)|@|}T=");
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      AncestorContext ancestorContext0 = new AncestorContext(parentContext0, true, nodeNameTest0);
      ChildContext childContext0 = new ChildContext(ancestorContext0, nodeNameTest0, true, true);
      childContext0.getCurrentNodePointer();
      childContext0.getSingleNodePointer();
      assertEquals(1, childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      ChildContext childContext0 = new ChildContext(unionContext0, processingInstructionTest0, false, false);
      childContext0.getSingleNodePointer();
      // Undeclared exception!
      try { 
        childContext0.nextNode();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
