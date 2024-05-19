
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
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.CollectionChildNodeIterator;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DescendantContext_ESTest extends DescendantContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("<<unknown namespace>>");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan");
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, nodeNameTest0, true, collectionPointer0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, collectionChildNodeIterator0, collectionPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, nodeNameTest0);
      boolean boolean0 = descendantContext0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        descendantContext0.setPosition(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = new Locale("");
      QName qName0 = new QName("descendant-or-self");
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, locale0, nullPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      EvalContext evalContext0 = rootContext0.getVariableContext(qName0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, true, processingInstructionTest0);
      // Undeclared exception!
      try { 
        descendantContext0.nextNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: descendant-or-self
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2123));
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeTypeTest0);
      // Undeclared exception!
      try { 
        descendantContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = new Locale("");
      QName qName0 = new QName("7mEoW)7Qw");
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, locale0, nullPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      EvalContext evalContext0 = rootContext0.getVariableContext(qName0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, true, processingInstructionTest0);
      // Undeclared exception!
      try { 
        descendantContext0.getCurrentNodePointer();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 7mEoW)7Qw
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeNameTest0);
      // Undeclared exception!
      try { 
        descendantContext0.getCurrentNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      nodeSetContext0.getContextNodePointer();
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, true, (NodeTest) null);
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
  public void test07()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, jXPathContextReferenceImpl0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, collectionPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-884));
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, nodeTypeTest0);
      // Undeclared exception!
      descendantContext0.nextNode();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("d", "d");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, nodeNameTest0);
      boolean boolean0 = descendantContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeNameTest0);
      DescendantContext descendantContext0 = new DescendantContext(ancestorContext0, false, nodeNameTest0);
      boolean boolean0 = descendantContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.US;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, beanPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Empty expression context");
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, true, nodeNameTest0);
      boolean boolean0 = descendantContext0.setPosition(82);
      assertEquals(1, descendantContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeTypeTest0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest1 = new NodeTypeTest(1);
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, false, nodeTypeTest1);
      descendantContext0.getCurrentNodePointer();
      assertEquals(1, descendantContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeTypeTest0);
      Locale locale0 = Locale.FRENCH;
      CollectionPointer collectionPointer0 = new CollectionPointer(jXPathContext0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, nodeTypeTest0, collectionPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, nodeTypeTest0);
      // Undeclared exception!
      descendantContext0.getCurrentNodePointer();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeTypeTest0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, false, nodeTypeTest0);
      BeanPointer beanPointer0 = (BeanPointer)descendantContext0.getCurrentNodePointer();
      assertNull(beanPointer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("d", "d");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, nodeNameTest0);
      BeanPointer beanPointer0 = (BeanPointer)descendantContext0.getContextNodePointer();
      assertNull(beanPointer0);
      
      descendantContext0.nextNode();
      assertEquals(0, descendantContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("d", "d");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, nodeNameTest0);
      boolean boolean0 = descendantContext0.setPosition((-1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.US;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, beanPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Empty expression context");
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, true, nodeNameTest0);
      descendantContext0.getCurrentNodePointer();
      assertEquals(1, descendantContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("<<unknown namespace>>");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan");
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, nodeNameTest0, true, collectionPointer0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, collectionChildNodeIterator0, collectionPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, nodeNameTest0);
      descendantContext0.getCurrentNodePointer();
      descendantContext0.reset();
      boolean boolean0 = descendantContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.US;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, beanPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Empty expression context");
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, true, nodeNameTest0);
      descendantContext0.nextNode();
      descendantContext0.getCurrentNodePointer();
      assertEquals(1, descendantContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("<<unknown namespace>>");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan");
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, nodeNameTest0, true, collectionPointer0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, collectionChildNodeIterator0, collectionPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, nodeNameTest0);
      boolean boolean0 = descendantContext0.isChildOrderingRequired();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-632));
      DescendantContext descendantContext0 = new DescendantContext(unionContext0, false, nodeTypeTest0);
      descendantContext0.getNodeSet();
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
}
