
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
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NodeSetContext_ESTest extends NodeSetContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      boolean boolean0 = unionContext0.nextSet();
      boolean boolean1 = unionContext0.nextSet();
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[2];
      evalContextArray0[0] = (EvalContext) initialContext0;
      evalContextArray0[1] = (EvalContext) initialContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      boolean boolean0 = unionContext0.nextNode();
      assertEquals(1, unionContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      unionContext0.nextNode();
      assertEquals(1, unionContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, (NodeSet) null);
      NodeSet nodeSet0 = nodeSetContext0.getNodeSet();
      assertNull(nodeSet0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1155));
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      EvalContext[] evalContextArray0 = new EvalContext[9];
      UnionContext unionContext0 = new UnionContext(selfContext0, evalContextArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(unionContext0, basicNodeSet0);
      nodeSetContext0.getCurrentNodePointer();
      assertEquals(1, nodeSetContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      ParentContext parentContext0 = new ParentContext(rootContext0, (NodeTest) null);
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, true, (NodeTest) null);
      EvalContext[] evalContextArray0 = new EvalContext[9];
      evalContextArray0[0] = (EvalContext) parentContext0;
      UnionContext unionContext0 = new UnionContext(descendantContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        unionContext0.setPosition((-1969));
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
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.model.VariablePointer$1");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, processingInstructionTest0);
      EvalContext[] evalContextArray0 = new EvalContext[3];
      UnionContext unionContext0 = new UnionContext(namespaceContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        unionContext0.setPosition(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "java.util.concurrent.atomic.AtomicLong");
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, nodeNameTest0);
      AttributeContext attributeContext0 = new AttributeContext(selfContext0, nodeNameTest0);
      ChildContext childContext0 = new ChildContext(attributeContext0, nodeNameTest0, true, false);
      EvalContext[] evalContextArray0 = new EvalContext[6];
      evalContextArray0[0] = (EvalContext) childContext0;
      evalContextArray0[1] = (EvalContext) attributeContext0;
      UnionContext unionContext0 = new UnionContext(childContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        unionContext0.setPosition(1657);
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
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        unionContext0.nextNode();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, (NodeSet) null);
      // Undeclared exception!
      try { 
        nodeSetContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.NodeSetContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("7oJ'.2[");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      EvalContext[] evalContextArray0 = new EvalContext[1];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        unionContext0.getCurrentNodePointer();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      unionContext0.setPosition((-668));
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
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[2];
      evalContextArray0[0] = (EvalContext) initialContext0;
      evalContextArray0[1] = (EvalContext) initialContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      boolean boolean0 = unionContext0.setPosition(1);
      assertEquals(1, unionContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      boolean boolean0 = nodeSetContext0.setPosition(1);
      assertEquals(1, nodeSetContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[1];
      evalContextArray0[0] = (EvalContext) initialContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      unionContext0.getCurrentNodePointer();
      assertEquals(1, unionContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeSet nodeSet0 = nodeSetContext0.getNodeSet();
      assertSame(nodeSet0, basicNodeSet0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
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
}
