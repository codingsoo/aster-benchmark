
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
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NamespaceContext_ESTest extends NamespaceContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2990));
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, nodeTypeTest0);
      ParentContext parentContext0 = new ParentContext(selfContext0, nodeTypeTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(parentContext0, nodeTypeTest0);
      boolean boolean0 = namespaceContext0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "Uro,JzMI+d(");
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      Expression[] expressionArray0 = new Expression[3];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(extensionFunction0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(expressionArray0[0], coreOperationNegate0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationOr0, coreOperationOr0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationGreaterThan0, coreOperationEqual0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, coreOperationMod0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "JXPath: found java.home property ");
      NamespaceContext namespaceContext0 = new NamespaceContext(predicateContext0, nodeNameTest0);
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
  public void test02()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[8];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = new NamespaceContext(unionContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        namespaceContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2990));
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, nodeTypeTest0);
      ParentContext parentContext0 = new ParentContext(selfContext0, nodeTypeTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(parentContext0, nodeTypeTest0);
      boolean boolean0 = namespaceContext0.nextNode();
      assertEquals(1, namespaceContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, nodeNameTest0);
      namespaceContext0.nextNode();
      boolean boolean0 = namespaceContext0.nextNode();
      assertEquals(2, namespaceContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("_Z(Ta ", "id(");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      namespaceContext0.reset();
      assertEquals(0, namespaceContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("jw!^F[=ASUS,0w", "jw!^F[=ASUS,0w");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "kPN");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      boolean boolean0 = namespaceContext0.nextNode();
      assertEquals(1, namespaceContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("+");
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, true, true);
      QName qName0 = new QName("+", "+");
      VariableReference variableReference0 = new VariableReference(qName0);
      PredicateContext predicateContext0 = new PredicateContext(childContext0, variableReference0);
      NamespaceContext namespaceContext0 = new NamespaceContext(predicateContext0, processingInstructionTest0);
      namespaceContext0.setPosition(5473);
      boolean boolean0 = namespaceContext0.setPosition(5473);
      assertEquals(2, namespaceContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[6];
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, (String) null);
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext(unionContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        namespaceContext0.setPosition(19);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.NamespaceContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("&C_{Czd$2(E,.hu");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "&C_{Czd$2(E,.hu");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, nodeNameTest0);
      boolean boolean0 = namespaceContext0.setPosition(Integer.MIN_VALUE);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.JXPathCompiledExpression", "org.apache.commons.jxpath.ri.JXPathCompiledExpression");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      NodePointer nodePointer0 = namespaceContext0.getCurrentNodePointer();
      assertNull(nodePointer0);
  }
}
