
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
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
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
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SelfContext_ESTest extends SelfContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "Uud&@(|FbLi_Y)nDST");
      QName qName0 = new QName("Uud&@(|FbLi_Y)nDST");
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, jXPathContextReferenceImpl0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      boolean boolean0 = selfContext0.nextNode();
      assertEquals(1, selfContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      SelfContext selfContext0 = new SelfContext(initialContext0, (NodeTest) null);
      NullPointer nullPointer0 = (NullPointer)selfContext0.getSingleNodePointer();
      assertFalse(nullPointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("*x[&4W.#x*", "*x[&4W.#x*");
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext evalContext0 = rootContext0.getVariableContext(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(evalContext0, nodeNameTest0);
      selfContext0.getCurrentNodePointer();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("new", "new");
      Locale locale0 = Locale.GERMAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, locale0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(locale0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1321);
      SelfContext selfContext0 = new SelfContext(initialContext0, nodeTypeTest0);
      selfContext0.getNodeSet();
      selfContext0.getCurrentNodePointer();
      selfContext0.getCurrentNodePointer();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, processingInstructionTest0);
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
  public void test05()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.JXPathNotFoundException");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, processingInstructionTest0);
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
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      QName qName0 = new QName("G\"sPM\"h5oB_AQ{$:@c");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "z\u0007FHC+[bp");
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
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

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("uv/");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, processingInstructionTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, processingInstructionTest0);
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
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer(0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("-)-wA", "-)-wA");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, integer0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, nodeTypeTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        selfContext0.getCurrentNodePointer();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: -)-wA:-)-wA
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(224);
      AncestorContext ancestorContext0 = new AncestorContext(rootContext0, true, nodeTypeTest0);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = (EvalContext) ancestorContext0;
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      UnionContext unionContext0 = new UnionContext(ancestorContext0, evalContextArray0);
      SelfContext selfContext0 = new SelfContext(unionContext0, processingInstructionTest0);
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
  public void test10()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.SelfContext", "org.apache.commons.jxpath.ri.axes.SelfContext");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        selfContext0.getCurrentNodePointer();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'org.apache.commons.jxpath.ri.axes.SelfContext:org.apache.commons.jxpath.ri.axes.SelfContext'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "");
      QName qName0 = new QName("4$%n{?Lh7K,M4&v");
      Locale locale0 = Locale.ITALIAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, jXPathContextReferenceImpl0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "4$%n{?Lh7K,M4&v");
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      boolean boolean0 = selfContext0.setPosition(1);
      assertEquals(1, selfContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("dMYkPtPmd,-?{*G!*Bi", (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "u+ktx");
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(parentContext0, nodeNameTest0);
      boolean boolean0 = selfContext0.setPosition(1);
      assertEquals(1, selfContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      SelfContext selfContext0 = new SelfContext(initialContext0, (NodeTest) null);
      boolean boolean0 = selfContext0.setPosition(1);
      assertEquals(1, selfContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer(0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("-)-wA", "-)-wA");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "-)-wA");
      Locale locale0 = Locale.US;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer(beanPointer0, qName0, (Object) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      selfContext0.getCurrentNodePointer();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, integer0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeTypeTest0);
      selfContext0.getCurrentNodePointer();
      boolean boolean0 = selfContext0.setPosition(1);
      assertEquals(1, selfContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[1];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      SelfContext selfContext0 = new SelfContext(unionContext0, nodeNameTest0);
      boolean boolean0 = selfContext0.setPosition((-1142));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[1];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeSet nodeSet0 = unionContext0.getNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, nodeSet0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, nodeNameTest0);
      selfContext0.getCurrentNodePointer();
      selfContext0.reset();
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
  public void test18()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[1];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      SelfContext selfContext0 = new SelfContext(unionContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        selfContext0.getCurrentNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Integer integer0 = new Integer(0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("-)-wA");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext(initialContext0, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(parentContext0, nodeNameTest0);
      selfContext0.nextNode();
      selfContext0.getCurrentNodePointer();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer(0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("-)-wA");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext(initialContext0, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(parentContext0, nodeNameTest0);
      Pointer pointer0 = selfContext0.getSingleNodePointer();
      assertNull(pointer0);
  }
}
