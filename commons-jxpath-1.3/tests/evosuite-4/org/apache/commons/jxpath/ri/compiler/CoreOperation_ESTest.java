
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
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperation_ESTest extends CoreOperation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Constant constant0 = new Constant("`RQ5");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationDivide0);
      Object object0 = coreOperationNegate0.computeValue((EvalContext) null);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Constant constant0 = new Constant(2);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationGreaterThan0, constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationGreaterThan0, coreOperationNotEqual0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("2");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, false);
      NamespaceContext namespaceContext0 = new NamespaceContext(precedingOrFollowingContext0, processingInstructionTest0);
      PredicateContext predicateContext0 = new PredicateContext(namespaceContext0, coreOperationGreaterThan0);
      EvalContext[] evalContextArray0 = new EvalContext[3];
      UnionContext unionContext0 = new UnionContext(predicateContext0, evalContextArray0);
      Object object0 = coreOperationLessThanOrEqual0.compute(unionContext0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      String string0 = coreOperationOr0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QName qName0 = new QName("Could not allocate a NodePointer for object of ", "Could not allocate a NodePointer for object of ");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(variableReference0, variableReference0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationDivide0, variableReference0);
      String string0 = nameAttributeTest0.getSymbol();
      assertEquals("=", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[1];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeValue(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationAdd", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual((Expression) null, (Expression) null);
      // Undeclared exception!
      try { 
        coreOperationGreaterThanOrEqual0.compute((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationOr0;
      // Undeclared exception!
      try { 
        coreOperationOr0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationUnion0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationOr0;
      CoreFunction coreFunction0 = new CoreFunction(154, expressionArray0);
      expressionArray0[2] = (Expression) coreFunction0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationAdd0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(expressionArray0[1]);
      // Undeclared exception!
      try { 
        coreOperationNegate0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationMultiply0, coreOperationMultiply0);
      String string0 = coreOperationDivide0.toString();
      assertNotNull(string0);
  }
}
