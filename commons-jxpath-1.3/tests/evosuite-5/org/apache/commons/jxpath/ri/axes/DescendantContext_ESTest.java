
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
import java.util.List;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DescendantContext_ESTest extends DescendantContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      QName qName0 = new QName("wy&<P6],PNYQ5eF3|4%");
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, nodeTypeTest0);
      boolean boolean0 = descendantContext0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1860);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, nodeTypeTest0);
      QName qName0 = new QName("", "local-name");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(namespaceContext0, true, nodeNameTest0);
      descendantContext0.reset();
      assertEquals(0, descendantContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeTypeTest0);
      // Undeclared exception!
      try { 
        descendantContext0.setPosition(2782);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.DescendantContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, false, processingInstructionTest0);
      descendantContext0.getContextNodeList();
      // Undeclared exception!
      try { 
        descendantContext0.setPosition(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("BO%6@_UWg\".*jvsS3");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, nodeNameTest0);
      // Undeclared exception!
      try { 
        descendantContext0.nextNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: BO%6@_UWg\".*jvsS3
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeNameTest0);
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
  public void test06()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1860);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, nodeTypeTest0);
      QName qName0 = new QName("", "local-name");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      namespaceContext0.nextSet();
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, true, nodeNameTest0);
      // Undeclared exception!
      try { 
        descendantContext0.nextNode();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      QName qName0 = new QName("");
      Locale locale0 = new Locale("");
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      EvalContext evalContext0 = rootContext0.getVariableContext(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, true, nodeNameTest0);
      // Undeclared exception!
      try { 
        descendantContext0.getCurrentNodePointer();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, (NodeTest) null);
      // Undeclared exception!
      try { 
        descendantContext0.getCurrentNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.DescendantContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, false, processingInstructionTest0);
      descendantContext0.getContextNodeList();
      // Undeclared exception!
      try { 
        descendantContext0.getCurrentNodePointer();
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
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, jXPathContext0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1392);
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, true, nodeTypeTest0);
      // Undeclared exception!
      descendantContext0.nextNode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      AncestorContext ancestorContext0 = new AncestorContext(initialContext0, true, (NodeTest) null);
      DescendantContext descendantContext0 = new DescendantContext(ancestorContext0, false, (NodeTest) null);
      descendantContext0.getContextNodeList();
      boolean boolean0 = descendantContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1860);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, nodeTypeTest0);
      QName qName0 = new QName("", "local-name");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(namespaceContext0, true, nodeNameTest0);
      descendantContext0.nextNode();
      List list0 = descendantContext0.getContextNodeList();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, false, nodeNameTest0);
      boolean boolean0 = descendantContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, jXPathContext0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1392);
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, true, nodeTypeTest0);
      // Undeclared exception!
      descendantContext0.getCurrentNodePointer();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1860);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, nodeTypeTest0);
      QName qName0 = new QName("", "local-name");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(namespaceContext0, true, nodeNameTest0);
      descendantContext0.nextNode();
      descendantContext0.nextSet();
      boolean boolean0 = descendantContext0.setPosition(5);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1860);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, nodeTypeTest0);
      QName qName0 = new QName("", "local-name");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(namespaceContext0, true, nodeNameTest0);
      boolean boolean0 = descendantContext0.setPosition((-1017));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("&'G_tJ=P!kC", "&'G_tJ=P!kC");
      Locale locale0 = Locale.KOREA;
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, true, nodeNameTest0);
      descendantContext0.getCurrentNodePointer();
      assertEquals(1, descendantContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1860);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, nodeTypeTest0);
      QName qName0 = new QName("", "local-name");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(namespaceContext0, true, nodeNameTest0);
      NodePointer nodePointer0 = descendantContext0.getCurrentNodePointer();
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1860);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, nodeTypeTest0);
      QName qName0 = new QName("", "local-name");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(namespaceContext0, true, nodeNameTest0);
      boolean boolean0 = descendantContext0.isChildOrderingRequired();
      assertTrue(boolean0);
  }
}
