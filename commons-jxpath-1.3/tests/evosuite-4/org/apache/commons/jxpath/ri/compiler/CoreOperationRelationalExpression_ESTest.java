
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
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationRelationalExpression_ESTest extends CoreOperationRelationalExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[7];
      expressionArray0[0] = (Expression) coreOperationMultiply0;
      coreOperationMultiply0.args = expressionArray0;
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationMultiply0, coreOperationMultiply0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThanOrEqual0, coreOperationMultiply0);
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("<=");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThanOrEqual0, coreOperationMultiply0.args, stepArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      EvalContext evalContext0 = expressionPath0.createContextForStep(namespaceContext0, 1, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationGreaterThanOrEqual0.computeValue(evalContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Float float0 = new Float((-1806.4F));
      Constant constant0 = new Constant(float0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual((Expression) null, constant0);
      // Undeclared exception!
      try { 
        coreOperationGreaterThanOrEqual0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationOr0, coreOperationOr0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationMultiply0, coreOperationOr0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationOr0, coreOperationGreaterThanOrEqual0);
      coreOperationGreaterThanOrEqual0.args = expressionArray0;
      // Undeclared exception!
      try { 
        coreOperationLessThan0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Constant constant0 = new Constant("iTeB3O_~y6>an9*");
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationMultiply0, constant0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationMod0, coreOperationMultiply0);
      // Undeclared exception!
      try { 
        coreOperationGreaterThan0.computeValue((EvalContext) null);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Constant constant0 = new Constant("=");
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationLessThanOrEqual0, constant0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThan0, constant0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      Expression[] expressionArray0 = new Expression[6];
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      coreOperationGreaterThan0.args = expressionArray0;
      Object object0 = coreOperationGreaterThan0.computeValue((EvalContext) null);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Constant constant0 = new Constant(0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, coreOperationGreaterThan0);
      Object object0 = coreOperationLessThanOrEqual0.computeValue((EvalContext) null);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Constant constant0 = new Constant("=");
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      QName qName0 = new QName("&&cfVKF4Rz");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(attributeContext0, nodeNameTest0);
      Object object0 = coreOperationLessThanOrEqual0.computeValue(namespaceContext0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Constant constant0 = new Constant(0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, coreOperationGreaterThan0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationGreaterThan0, coreOperationLessThanOrEqual0);
      Object object0 = coreOperationGreaterThanOrEqual0.computeValue((EvalContext) null);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Constant constant0 = new Constant("=");
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationLessThanOrEqual0, constant0);
      Object object0 = coreOperationLessThan0.compute((EvalContext) null);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Constant constant0 = new Constant("=");
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationLessThanOrEqual0, constant0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThan0, constant0);
      boolean boolean0 = coreOperationGreaterThanOrEqual0.isSymmetric();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant constant0 = new Constant("=");
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      int int0 = coreOperationLessThanOrEqual0.getPrecedence();
      assertEquals(3, int0);
  }
}
