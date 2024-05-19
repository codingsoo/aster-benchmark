
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
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ParentContext_ESTest extends ParentContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(273);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("");
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext(rootContext0, nodeNameTest0);
      parentContext0.reset();
      assertTrue(parentContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.ParentContext");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, false, processingInstructionTest0);
      ParentContext parentContext0 = new ParentContext(descendantContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        parentContext0.nextNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: org.apache.commons.jxpath.ri.axes.ParentContext
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.FRANCE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan((Expression) null, (Expression) null);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationUnion0, coreOperationGreaterThan0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, coreOperationEqual0);
      ParentContext parentContext0 = new ParentContext(predicateContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        parentContext0.nextNode();
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
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        parentContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.ParentContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "org.apache.commons.jxpath.PackageFunctions");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(namespaceContext0, nodeNameTest0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(selfContext0, basicNodeSet0);
      ParentContext parentContext0 = new ParentContext(nodeSetContext0, nodeNameTest0);
      parentContext0.getNodeSet();
      // Undeclared exception!
      try { 
        parentContext0.nextNode();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(912);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("d@");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, jXPathContextReferenceImpl0, locale0);
      BeanPointer beanPointer1 = (BeanPointer)NodePointer.newChildNodePointer(beanPointer0, qName0, "d@");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer1);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      ParentContext parentContext0 = new ParentContext(rootContext0, processingInstructionTest0);
      boolean boolean0 = parentContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer(893);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("3DX@Oo-?GE");
      Locale locale0 = Locale.FRENCH;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, jXPathContextReferenceImpl0, locale0);
      BeanPointer beanPointer1 = (BeanPointer)NodePointer.newChildNodePointer(beanPointer0, qName0, "3DX@Oo-?GE");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer1);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext(rootContext0, nodeNameTest0);
      parentContext0.nextNode();
      parentContext0.getCurrentNodePointer();
      assertEquals(1, parentContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(893);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("3DX@Oo-?GE");
      Locale locale0 = Locale.FRENCH;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, jXPathContextReferenceImpl0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext(rootContext0, nodeNameTest0);
      boolean boolean0 = parentContext0.nextNode();
      boolean boolean1 = parentContext0.nextNode();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      boolean boolean0 = parentContext0.setPosition(1);
      assertEquals(1, parentContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "org.apache.commons.jxpath.PackageFunctions");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(namespaceContext0, nodeNameTest0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(selfContext0, basicNodeSet0);
      ParentContext parentContext0 = new ParentContext(nodeSetContext0, nodeNameTest0);
      boolean boolean0 = parentContext0.setPosition(0);
      assertEquals(0, parentContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(912);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("d@");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, jXPathContextReferenceImpl0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      ParentContext parentContext0 = new ParentContext(rootContext0, processingInstructionTest0);
      int int0 = parentContext0.getDocumentOrder();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(18);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, (Object) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, true, nodeNameTest0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      ParentContext parentContext0 = new ParentContext(descendantContext0, nodeTypeTest0);
      parentContext0.getContextNodeList();
      assertEquals(1, descendantContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(893);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("3DX@Oo-?GE");
      Locale locale0 = Locale.FRENCH;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, jXPathContextReferenceImpl0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext(rootContext0, nodeNameTest0);
      BeanPointer beanPointer1 = (BeanPointer)parentContext0.getCurrentNodePointer();
      assertNull(beanPointer1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = new Integer(18);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, (Object) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, true, nodeNameTest0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      ParentContext parentContext0 = new ParentContext(descendantContext0, nodeTypeTest0);
      int int0 = parentContext0.getCurrentPosition();
      assertEquals(1, int0);
  }
}
