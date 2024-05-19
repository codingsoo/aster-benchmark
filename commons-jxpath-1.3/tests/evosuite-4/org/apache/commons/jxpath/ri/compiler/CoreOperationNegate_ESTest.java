
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
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationNegate_ESTest extends CoreOperationNegate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreFunction0);
      // Undeclared exception!
      try { 
        coreOperationNegate0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: position(null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QName qName0 = new QName("QG) O''A,");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(variableReference0, variableReference0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationMod0);
      // Undeclared exception!
      try { 
        coreOperationNegate0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.VariableReference", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationUnion0);
      coreOperationNegate0.args = expressionArray0;
      // Undeclared exception!
      try { 
        coreOperationNegate0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationNegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationNotEqual0, coreOperationNotEqual0);
      expressionArray0[1] = (Expression) coreOperationGreaterThan0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionArray0[0], coreFunction0);
      expressionArray0[2] = (Expression) coreOperationMod0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationOr0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreOperationNegate0.computeValue(parentContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer(34);
      Constant constant0 = new Constant(integer0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      Object object0 = coreOperationNegate0.computeValue((EvalContext) null);
      assertEquals((-34.0), object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Integer integer0 = new Integer(34);
      Constant constant0 = new Constant(integer0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      int int0 = coreOperationNegate0.getPrecedence();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationOr0);
      boolean boolean0 = coreOperationNegate0.isSymmetric();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationOr0);
      String string0 = coreOperationNegate0.getSymbol();
      assertEquals("-", string0);
  }
}
