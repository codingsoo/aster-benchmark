
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
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AttributeContext_ESTest extends AttributeContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      boolean boolean0 = attributeContext0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd((Expression[]) null);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, coreOperationAdd0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "");
      AttributeContext attributeContext0 = new AttributeContext(predicateContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        attributeContext0.nextNode();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      nodeSetContext0.toString();
      QName qName0 = new QName("Empty expression context");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AttributeContext attributeContext0 = new AttributeContext(nodeSetContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        attributeContext0.nextNode();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeNameTest0);
      boolean boolean0 = attributeContext0.nextNode();
      assertEquals(1, attributeContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("child", "child");
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, jXPathContextReferenceImpl0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeNameTest0);
      boolean boolean0 = attributeContext0.nextNode();
      assertEquals(1, attributeContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        attributeContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.AttributeContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      boolean boolean0 = attributeContext0.nextNode();
      assertEquals(1, attributeContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      attributeContext0.setPosition(2081);
      boolean boolean0 = attributeContext0.nextNode();
      assertEquals(2, attributeContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      attributeContext0.reset();
      assertFalse(attributeContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, processingInstructionTest0);
      boolean boolean0 = attributeContext0.nextNode();
      assertEquals(1, attributeContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeTypeTest0);
      QName qName0 = new QName("");
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      AttributeContext attributeContext0 = new AttributeContext(rootContext0, nodeTypeTest0);
      attributeContext0.setPosition(1103);
      attributeContext0.getCurrentNodePointer();
      assertEquals(3, attributeContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "o_");
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        attributeContext0.setPosition(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.AttributeContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, processingInstructionTest0);
      boolean boolean0 = attributeContext0.setPosition((-840));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("Empty expression context");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AttributeContext attributeContext0 = new AttributeContext(nodeSetContext0, nodeNameTest0);
      NodePointer nodePointer0 = attributeContext0.getCurrentNodePointer();
      assertNull(nodePointer0);
  }
}
