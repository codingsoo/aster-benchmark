
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
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
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
      CoreOperationOr coreOperationOr0 = new CoreOperationOr((Expression[]) null);
      Expression[] expressionArray0 = coreOperationOr0.getArguments();
      assertNull(expressionArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      Expression[] expressionArray1 = coreOperationUnion0.getArguments();
      assertSame(expressionArray0, expressionArray1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Operation", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(3200, (Expression[]) null);
      QName qName0 = new QName("unknownFunction3200()()", "unknownFunction3200()()");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(extensionFunction0, coreFunction0);
      boolean boolean0 = coreOperationDivide0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(3200, (Expression[]) null);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreFunction0);
      boolean boolean0 = coreOperationNegate0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(32, (Expression[]) null);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertFalse(boolean0);
  }
}
