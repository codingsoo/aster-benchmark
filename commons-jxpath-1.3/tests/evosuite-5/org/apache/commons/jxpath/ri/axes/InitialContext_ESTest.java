
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
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class InitialContext_ESTest extends InitialContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      boolean boolean0 = evalContext0.nextSet();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Y~ 3_8S|a7ZFfkZcO");
      basicVariables0.declareVariable("Y~ 3_8S|a7ZFfkZcO", qName0);
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, variablePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      EvalContext evalContext0 = rootContext0.getConstantContext(variablePointer0);
      evalContext0.hasNext();
      evalContext0.nextSet();
      assertEquals(1, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("4m->rs", "org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, "org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = new InitialContext(rootContext0);
      initialContext0.nextNode();
      assertEquals(1, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Y~ 3_8S|a7ZFfkZcO");
      basicVariables0.declareVariable("Y~ 3_8S|a7ZFfkZcO", qName0);
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, variablePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      VariablePointer variablePointer1 = new VariablePointer(qName0);
      EvalContext evalContext0 = rootContext0.getConstantContext(variablePointer1);
      boolean boolean0 = evalContext0.nextNode();
      assertEquals(1, evalContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName((String) null, "");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext evalContext0 = rootContext0.getAbsoluteRootContext();
      Object object0 = evalContext0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[9];
      evalContextArray0[0] = (EvalContext) initialContext0;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-994));
      AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeTypeTest0);
      evalContextArray0[1] = (EvalContext) attributeContext0;
      evalContextArray0[2] = (EvalContext) initialContext0;
      evalContextArray0[3] = (EvalContext) initialContext0;
      evalContextArray0[4] = (EvalContext) initialContext0;
      evalContextArray0[5] = (EvalContext) initialContext0;
      evalContextArray0[6] = (EvalContext) initialContext0;
      evalContextArray0[7] = (EvalContext) initialContext0;
      evalContextArray0[8] = (EvalContext) initialContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      InitialContext initialContext1 = new InitialContext(unionContext0);
      BeanPointer beanPointer0 = (BeanPointer)initialContext1.getCurrentNodePointer();
      assertEquals(2, initialContext0.getPosition());
      assertEquals(0, beanPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn(namespaceResolver0).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = new InitialContext(rootContext0);
      NodePointer nodePointer0 = initialContext0.getCurrentNodePointer();
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Y~ 3_8S|a7ZFfkZcO");
      basicVariables0.declareVariable("Y~ 3_8S|a7ZFfkZcO", qName0);
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, variablePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      VariablePointer variablePointer1 = new VariablePointer(qName0);
      EvalContext evalContext0 = rootContext0.getConstantContext(variablePointer1);
      // Undeclared exception!
      try { 
        evalContext0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: Y~ 3_8S|a7ZFfkZcO
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("vH+T4U4");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      EvalContext[] evalContextArray0 = new EvalContext[5];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      InitialContext initialContext1 = null;
      try {
        initialContext1 = new InitialContext(unionContext0);
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
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("A)}L!(^xh5$_u{");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, processingInstructionTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(descendantContext0, (NodeTest) null, true);
      EvalContext[] evalContextArray0 = new EvalContext[3];
      UnionContext unionContext0 = new UnionContext(precedingOrFollowingContext0, evalContextArray0);
      InitialContext initialContext0 = null;
      try {
        initialContext0 = new InitialContext(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-469));
      ChildContext childContext0 = new ChildContext(nodeSetContext0, nodeTypeTest0, false, false);
      childContext0.hasNext();
      InitialContext initialContext0 = null;
      try {
        initialContext0 = new InitialContext(childContext0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[9];
      evalContextArray0[0] = (EvalContext) initialContext0;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-994));
      AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeTypeTest0);
      evalContextArray0[1] = (EvalContext) attributeContext0;
      evalContextArray0[2] = (EvalContext) initialContext0;
      evalContextArray0[3] = (EvalContext) initialContext0;
      evalContextArray0[4] = (EvalContext) initialContext0;
      evalContextArray0[5] = (EvalContext) initialContext0;
      evalContextArray0[6] = (EvalContext) initialContext0;
      evalContextArray0[7] = (EvalContext) initialContext0;
      evalContextArray0[8] = (EvalContext) initialContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      unionContext0.setPosition((-994));
      InitialContext initialContext1 = null;
      try {
        initialContext1 = new InitialContext(unionContext0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[9];
      evalContextArray0[0] = (EvalContext) initialContext0;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-994));
      AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeTypeTest0);
      evalContextArray0[1] = (EvalContext) attributeContext0;
      evalContextArray0[2] = (EvalContext) initialContext0;
      evalContextArray0[3] = (EvalContext) initialContext0;
      evalContextArray0[4] = (EvalContext) initialContext0;
      evalContextArray0[5] = (EvalContext) initialContext0;
      evalContextArray0[6] = (EvalContext) initialContext0;
      evalContextArray0[7] = (EvalContext) initialContext0;
      evalContextArray0[8] = (EvalContext) initialContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      InitialContext initialContext1 = new InitialContext(unionContext0);
      boolean boolean0 = initialContext1.setPosition(1);
      assertEquals(2, initialContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("4m->rs", "4m->rs");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, "org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = new InitialContext(rootContext0);
      initialContext0.setPosition(1);
      assertEquals(1, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("4m->rs", "org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, "org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = new InitialContext(rootContext0);
      initialContext0.setPosition(795);
      assertEquals(795, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[9];
      evalContextArray0[0] = (EvalContext) initialContext0;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-994));
      AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeTypeTest0);
      evalContextArray0[1] = (EvalContext) attributeContext0;
      evalContextArray0[2] = (EvalContext) initialContext0;
      evalContextArray0[3] = (EvalContext) initialContext0;
      evalContextArray0[4] = (EvalContext) initialContext0;
      evalContextArray0[5] = (EvalContext) initialContext0;
      evalContextArray0[6] = (EvalContext) initialContext0;
      evalContextArray0[7] = (EvalContext) initialContext0;
      evalContextArray0[8] = (EvalContext) initialContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      InitialContext initialContext1 = new InitialContext(unionContext0);
      boolean boolean0 = initialContext1.setPosition((-994));
      assertEquals(2, initialContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      boolean boolean0 = initialContext0.setPosition(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, initialContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      BeanPointer beanPointer0 = (BeanPointer)initialContext0.getSingleNodePointer();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Y~ 3_8S|a7ZFfkZcO");
      basicVariables0.declareVariable("Y~ 3_8S|a7ZFfkZcO", qName0);
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, variablePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      EvalContext evalContext0 = rootContext0.getConstantContext(variablePointer0);
      QName qName1 = (QName)evalContext0.getValue();
      assertNull(qName1.getPrefix());
  }
}
