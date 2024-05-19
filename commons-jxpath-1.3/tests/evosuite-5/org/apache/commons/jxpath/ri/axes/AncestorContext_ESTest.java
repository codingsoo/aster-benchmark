
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
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AncestorContext_ESTest extends AncestorContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("6L+IU{", "6L+IU{");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      boolean boolean0 = ancestorContext0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      variablePointer0.setAttribute(true);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext(rootContext0, false, nodeNameTest0);
      ancestorContext0.nextNode();
      ancestorContext0.getCurrentNodePointer();
      assertEquals(1, ancestorContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      AncestorContext ancestorContext0 = new AncestorContext(initialContext0, true, (NodeTest) null);
      ancestorContext0.nextNode();
      ancestorContext0.getCurrentNodePointer();
      assertEquals(1, ancestorContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(185, (Expression[]) null);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreFunction0);
      QName qName0 = new QName("K#V|Y@rYdtQ:aS%co7", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = new NamespaceContext(predicateContext0, nodeNameTest0);
      AncestorContext ancestorContext0 = new AncestorContext(namespaceContext0, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        ancestorContext0.setPosition(1242);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.AncestorContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      AncestorContext ancestorContext0 = new AncestorContext(initialContext0, true, (NodeTest) null);
      ancestorContext0.setPosition(2114);
      // Undeclared exception!
      try { 
        ancestorContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.AncestorContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(nodeSetContext0, nodeNameTest0, true, true);
      childContext0.getValue();
      AncestorContext ancestorContext0 = new AncestorContext(childContext0, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        ancestorContext0.nextNode();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      AncestorContext ancestorContext0 = new AncestorContext(initialContext0, true, (NodeTest) null);
      ancestorContext0.nextNode();
      boolean boolean0 = ancestorContext0.nextNode();
      assertEquals(1, ancestorContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      AncestorContext ancestorContext0 = new AncestorContext(rootContext0, true, nodeNameTest0);
      boolean boolean0 = ancestorContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("ancestor-or-self::", "ancestor-or-self::");
      Object object0 = new Object();
      Locale locale0 = Locale.FRENCH;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext(rootContext0, true, nodeNameTest0);
      boolean boolean0 = ancestorContext0.setPosition((-2031));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("ancestor-or-self::", "ancestor-or-self::");
      Object object0 = new Object();
      Locale locale0 = Locale.FRENCH;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext(rootContext0, true, nodeNameTest0);
      int int0 = ancestorContext0.getDocumentOrder();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      AncestorContext ancestorContext0 = new AncestorContext(initialContext0, true, (NodeTest) null);
      ancestorContext0.reset();
      assertTrue(ancestorContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      AncestorContext ancestorContext0 = new AncestorContext(initialContext0, true, (NodeTest) null);
      NullPointer nullPointer0 = (NullPointer)ancestorContext0.getCurrentNodePointer();
      assertNull(nullPointer0);
  }
}
