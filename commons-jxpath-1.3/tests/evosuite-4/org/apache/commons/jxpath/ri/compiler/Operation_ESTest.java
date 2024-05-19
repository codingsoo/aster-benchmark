
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
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Operation_ESTest extends Operation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Expression[] expressionArray1 = coreOperationAnd0.getArguments();
      assertSame(expressionArray1, expressionArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      Expression[] expressionArray1 = coreFunction0.getArguments();
      assertEquals(0, expressionArray1.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("gPn4QY!9>WNTBfT_", "gPn4QY!9>WNTBfT_");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      boolean boolean0 = coreOperationUnion0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Long long0 = new Long(0L);
      Constant constant0 = new Constant(long0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      boolean boolean0 = coreOperationMultiply0.isContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(7, (Expression[]) null);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, (Expression) null);
      // Undeclared exception!
      try { 
        coreOperationMultiply0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Operation", e);
      }
  }
}
