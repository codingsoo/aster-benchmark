
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


package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationNegate_ESTest extends CoreOperationNegate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAnd0, coreOperationAnd0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationEqual0);
      EvalContext[] evalContextArray0 = new EvalContext[5];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      Object object0 = coreOperationNegate0.computeValue(unionContext0);
      assertEquals(-0.0, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QName qName0 = new QName("5\"t^3MG!U(^u_Bs2");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(variableReference0);
      String string0 = coreOperationNegate0.getSymbol();
      assertEquals("-", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAnd0, coreOperationAnd0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationEqual0);
      int int0 = coreOperationNegate0.getPrecedence();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(14, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreFunction0);
      // Undeclared exception!
      try { 
        coreOperationNegate0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: substring(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      QName qName0 = new QName("-", "-");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(extensionFunction0, extensionFunction0);
      expressionArray0[0] = (Expression) coreOperationSubtract0;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(5);
      Constant constant0 = new Constant("-");
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationOr0, constant0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationMultiply0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      ParentContext parentContext0 = new ParentContext(attributeContext0, nodeTypeTest0);
      AncestorContext ancestorContext0 = new AncestorContext(parentContext0, false, nodeTypeTest0);
      PredicateContext predicateContext0 = new PredicateContext(ancestorContext0, coreOperationOr0);
      SelfContext selfContext0 = new SelfContext(predicateContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreOperationNegate0.computeValue(selfContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate((Expression) null);
      // Undeclared exception!
      try { 
        coreOperationNegate0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationNegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationOr0);
      coreOperationNegate0.args = expressionArray0;
      QName qName0 = new QName("7%)lU3McEA+qi|k[:", "7%)lU3McEA+qi|k[:");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationNegate0.computeValue(namespaceContext0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationNegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Constant constant0 = new Constant("I&uk+ee");
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationMod0);
      // Undeclared exception!
      try { 
        coreOperationNegate0.computeValue((EvalContext) null);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      QName qName0 = new QName("5\"t^3MG!U(^u_Bs2");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(variableReference0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreOperationNegate0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "5\"t^3MG!U(^u_Bs2", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        coreOperationNegate0.computeValue(rootContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 5\"t^3MG!U(^u_Bs2
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[15];
      CoreFunction coreFunction0 = new CoreFunction((-4), expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreFunction0, coreFunction0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationMod0);
      boolean boolean0 = coreOperationNegate0.isSymmetric();
      assertFalse(boolean0);
  }
}
