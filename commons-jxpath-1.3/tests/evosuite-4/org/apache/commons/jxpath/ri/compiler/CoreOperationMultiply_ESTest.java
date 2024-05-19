
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
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationMultiply_ESTest extends CoreOperationMultiply_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Integer integer0 = new Integer((-1));
      Constant constant0 = new Constant(integer0);
      expressionArray0[0] = (Expression) constant0;
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationDivide0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      expressionArray0[2] = (Expression) coreOperationNegate0;
      QName qName0 = new QName("=oLkjGL'", "=oLkjGL'");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[3] = (Expression) extensionFunction0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAdd0, expressionArray0[0]);
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationEqual0, expressionArray0, stepArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(expressionPath0, coreOperationEqual0);
      // Undeclared exception!
      coreOperationMultiply0.computeValue((EvalContext) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreFunction0, expressionArray0[0]);
      // Undeclared exception!
      try { 
        coreOperationMultiply0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: last(null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QName qName0 = new QName("-ECwSwqe1y7");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(variableReference0, variableReference0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationEqual0, variableReference0);
      // Undeclared exception!
      try { 
        coreOperationMultiply0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.VariableReference", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Double double0 = Expression.NOT_A_NUMBER;
      Constant constant0 = new Constant(double0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) constant0;
      coreOperationMultiply0.args = expressionArray0;
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationMultiply0);
      // Undeclared exception!
      try { 
        coreOperationMultiply0.computeValue(predicateContext0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant("");
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationEqual0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationNegate0, coreOperationEqual0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationSubtract0, constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationMod0, expressionArray0[1]);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationLessThanOrEqual0, expressionArray0[0]);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-3603));
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeTypeTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreOperationMultiply0.computeValue(selfContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Double double0 = Expression.NOT_A_NUMBER;
      Constant constant0 = new Constant(double0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      int int0 = coreOperationMultiply0.getPrecedence();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Double double0 = Expression.NOT_A_NUMBER;
      Constant constant0 = new Constant(double0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      boolean boolean0 = coreOperationMultiply0.isSymmetric();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Double double0 = Expression.NOT_A_NUMBER;
      Constant constant0 = new Constant(double0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      String string0 = coreOperationMultiply0.getSymbol();
      assertEquals("*", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Double double0 = Expression.NOT_A_NUMBER;
      Constant constant0 = new Constant(double0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationMultiply0);
      Object object0 = coreOperationMultiply0.computeValue(predicateContext0);
      assertTrue(object0.equals((Object)double0));
  }
}
