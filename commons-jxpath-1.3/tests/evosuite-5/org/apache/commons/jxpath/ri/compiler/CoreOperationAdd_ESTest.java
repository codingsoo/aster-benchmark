
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
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationAdd_ESTest extends CoreOperationAdd_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationAdd", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      boolean boolean0 = coreOperationAdd0.isSymmetric();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      String string0 = coreOperationAdd0.getSymbol();
      assertEquals("+", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      int int0 = coreOperationAdd0.getPrecedence();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("B^g;T1{7@Jj");
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationSubtract0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      Expression[] expressionArray1 = new Expression[0];
      coreOperationSubtract0.args = expressionArray1;
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeValue((EvalContext) null);
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
      Expression[] expressionArray0 = new Expression[7];
      Constant constant0 = new Constant(3);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(nameAttributeTest0, nameAttributeTest0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationMod0);
      expressionArray0[0] = (Expression) coreOperationNegate0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeValue((EvalContext) null);
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
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("B^-T1{7-@J");
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationSubtract0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      Object object0 = coreOperationAdd0.computeValue((EvalContext) null);
      assertEquals(Double.NaN, object0);
  }
}
