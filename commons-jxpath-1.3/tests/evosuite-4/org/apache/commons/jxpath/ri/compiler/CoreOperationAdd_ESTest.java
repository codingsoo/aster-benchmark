
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
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationAdd_ESTest extends CoreOperationAdd_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant((String) null);
      expressionArray0[0] = (Expression) constant0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationAnd0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      EvalContext evalContext0 = null;
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeValue(evalContext0);
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
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      Object object0 = coreOperationAdd0.computeValue((EvalContext) null);
      assertEquals(0.0, object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      expressionArray0[1] = (Expression) coreFunction0;
      expressionArray0[2] = (Expression) coreFunction0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreFunction0, coreFunction0);
      expressionArray0[3] = (Expression) coreOperationMod0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      EvalContext[] evalContextArray0 = new EvalContext[4];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeValue(unionContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      String string0 = coreOperationAdd0.getSymbol();
      assertEquals("+", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      boolean boolean0 = coreOperationAdd0.isSymmetric();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      int int0 = coreOperationAdd0.getPrecedence();
      assertEquals(4, int0);
  }
}
