
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
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NamespaceContext_ESTest extends NamespaceContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[4];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      NamespaceContext namespaceContext0 = new NamespaceContext(unionContext0, nodeNameTest0);
      boolean boolean0 = namespaceContext0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(ancestorContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        namespaceContext0.setPosition(1024);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.NamespaceContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("Cannot find an element by key - no KeyManager has been specified");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(nodeNameTest0);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = (EvalContext) initialContext0;
      evalContextArray0[1] = (EvalContext) initialContext0;
      evalContextArray0[2] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext(unionContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        namespaceContext0.nextNode();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[4];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      NamespaceContext namespaceContext0 = new NamespaceContext(unionContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        namespaceContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.NamespaceContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("^jzsc'b,");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "^jzsc'b,");
      Locale locale0 = Locale.JAPANESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NamespaceContext namespaceContext0 = new NamespaceContext(rootContext0, nodeNameTest0);
      boolean boolean0 = namespaceContext0.nextNode();
      assertEquals(1, namespaceContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(9);
      NamespaceContext namespaceContext0 = new NamespaceContext(rootContext0, nodeTypeTest0);
      boolean boolean0 = namespaceContext0.nextNode();
      assertEquals(1, namespaceContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("^jzsc'b,");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "^jzsc'b,");
      Locale locale0 = Locale.JAPANESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NamespaceContext namespaceContext0 = new NamespaceContext(rootContext0, nodeNameTest0);
      namespaceContext0.reset();
      assertEquals(0, namespaceContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("1", "1");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "1");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      boolean boolean0 = namespaceContext0.nextNode();
      assertEquals(1, namespaceContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2128);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeTypeTest0);
      namespaceContext0.setPosition(2128);
      boolean boolean0 = namespaceContext0.nextNode();
      assertEquals(2, namespaceContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("1", "1");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "1");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      boolean boolean0 = namespaceContext0.setPosition(Integer.MIN_VALUE);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("1", "1");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "1");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      NodePointer nodePointer0 = namespaceContext0.getCurrentNodePointer();
      assertNull(nodePointer0);
  }
}
