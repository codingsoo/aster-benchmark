
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
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationSubtract_ESTest extends CoreOperationSubtract_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Byte byte0 = new Byte((byte)116);
      Constant constant0 = new Constant(byte0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
      // Undeclared exception!
      try { 
        coreOperationSubtract0.iteratePointers((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Expression", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract");
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationLessThan0, constant0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationLessThan0, coreOperationNotEqual0);
      Object object0 = coreOperationSubtract0.computeValue((EvalContext) null);
      assertEquals(1.0, object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QName qName0 = new QName("Unknown namespace prefix: ");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(variableReference0, variableReference0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationDivide0, variableReference0);
      Integer integer0 = new Integer(58);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer((QName) null, coreOperationSubtract0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        coreOperationSubtract0.computeValue(rootContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: Unknown namespace prefix: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(nameAttributeTest0, nameAttributeTest0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      SelfContext selfContext0 = new SelfContext(unionContext0, processingInstructionTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(selfContext0, processingInstructionTest0);
      PredicateContext predicateContext0 = new PredicateContext(namespaceContext0, coreOperationLessThanOrEqual0);
      // Undeclared exception!
      try { 
        coreOperationSubtract0.computeValue(predicateContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[0];
      coreOperationSubtract0.args = expressionArray0;
      // Undeclared exception!
      try { 
        coreOperationSubtract0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      Constant constant0 = new Constant("");
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationMod0, coreOperationMod0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationUnion0, expressionArray0[0]);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreFunction0);
      // Undeclared exception!
      try { 
        coreOperationSubtract0.computeValue(predicateContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(1413, (Expression[]) null);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, coreFunction0);
      int int0 = coreOperationSubtract0.getPrecedence();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(1413, (Expression[]) null);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, coreFunction0);
      String string0 = coreOperationSubtract0.getSymbol();
      assertEquals("-", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(1413, (Expression[]) null);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, coreFunction0);
      boolean boolean0 = coreOperationSubtract0.isSymmetric();
      assertFalse(boolean0);
  }
}
