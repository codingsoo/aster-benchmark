
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
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PrecedingOrFollowingContext_ESTest extends PrecedingOrFollowingContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      QName qName0 = new QName("*+9v</LAr_", "*+9v</LAr_");
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationAnd0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "LR.&fkQaC");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(predicateContext0, nodeNameTest0, true);
      boolean boolean0 = precedingOrFollowingContext0.setPosition(0);
      assertEquals((-1), precedingOrFollowingContext0.getDocumentOrder());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("rCXG,ZSmP89+te`W!L", "E=g7T,M");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, true);
      precedingOrFollowingContext0.reset();
      assertEquals((-1), precedingOrFollowingContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(rootContext0, nodeNameTest0, false);
      int int0 = precedingOrFollowingContext0.getDocumentOrder();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("h01|^Z{T0|){}C", "h01|^Z{T0|){}C");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "*F,7RKt\"LCrdwl");
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      EvalContext[] evalContextArray0 = new EvalContext[1];
      UnionContext unionContext0 = new UnionContext(parentContext0, evalContextArray0);
      NodeSet nodeSet0 = unionContext0.getNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(parentContext0, nodeSet0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(nodeSetContext0, nodeNameTest0, false);
      precedingOrFollowingContext0.getValue();
      // Undeclared exception!
      try { 
        precedingOrFollowingContext0.setPosition(748);
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
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, (NodeTest) null);
      ParentContext parentContext0 = new ParentContext(attributeContext0, (NodeTest) null);
      NamespaceContext namespaceContext0 = new NamespaceContext(parentContext0, (NodeTest) null);
      EvalContext[] evalContextArray0 = new EvalContext[5];
      Locale locale0 = Locale.UK;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, locale0, (Pointer) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(namespaceContext0, evalContextArray0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(unionContext0, (NodeTest) null, true);
      // Undeclared exception!
      try { 
        precedingOrFollowingContext0.nextNode();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      nodeSetContext0.getCurrentNodePointer();
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(nodeSetContext0, nodeNameTest0, false);
      // Undeclared exception!
      try { 
        precedingOrFollowingContext0.nextNode();
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
      QName qName0 = new QName("M8YbC-*L'Z*YNA1");
      Object object0 = new Object();
      Locale locale0 = new Locale("M8YbC-*L'Z*YNA1", "M8YbC-*L'Z*YNA1");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(evalContext0, nodeNameTest0, true);
      precedingOrFollowingContext0.getValue();
      precedingOrFollowingContext0.nextNode();
      assertEquals((-1), precedingOrFollowingContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "<<unknown namespace>>");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(evalContext0, nodeNameTest0, true);
      precedingOrFollowingContext0.setPosition(4);
      // Undeclared exception!
      try { 
        precedingOrFollowingContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "<<unknown namespace>>");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(evalContext0, nodeNameTest0, true);
      boolean boolean0 = precedingOrFollowingContext0.setPosition(4);
      boolean boolean1 = precedingOrFollowingContext0.setPosition(Integer.MIN_VALUE);
      assertFalse(boolean1 == boolean0);
      
      boolean boolean2 = precedingOrFollowingContext0.setPosition(4);
      assertEquals((-1), precedingOrFollowingContext0.getDocumentOrder());
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "<<unknown namespace>>");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(evalContext0, nodeNameTest0, true);
      precedingOrFollowingContext0.setPosition(4);
      // Undeclared exception!
      try { 
        precedingOrFollowingContext0.setPosition(4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "<<unknown namespace>>");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(evalContext0, nodeNameTest0, true);
      int int0 = precedingOrFollowingContext0.getDocumentOrder();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "<<unknown namespace>>");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(evalContext0, nodeNameTest0, true);
      precedingOrFollowingContext0.getCurrentNodePointer();
      assertEquals((-1), precedingOrFollowingContext0.getDocumentOrder());
  }
}
