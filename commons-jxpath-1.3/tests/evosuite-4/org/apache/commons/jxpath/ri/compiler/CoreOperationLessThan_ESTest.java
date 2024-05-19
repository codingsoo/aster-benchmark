
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
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationLessThan_ESTest extends CoreOperationLessThan_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationAdd0, coreOperationAdd0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationOr0, expressionArray0[8]);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationGreaterThan0, coreOperationMultiply0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationEqual0, coreOperationMultiply0);
      boolean boolean0 = coreOperationLessThan0.evaluateCompare(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion((Expression[]) null);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationUnion0, coreOperationUnion0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationGreaterThanOrEqual0, coreOperationGreaterThanOrEqual0);
      String string0 = coreOperationLessThan0.getSymbol();
      assertEquals("<", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Short short0 = new Short((short)23);
      Constant constant0 = new Constant(short0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      boolean boolean0 = coreOperationLessThan0.evaluateCompare((-485));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Short short0 = new Short((short)23);
      Constant constant0 = new Constant(short0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      boolean boolean0 = coreOperationLessThan0.evaluateCompare((short)23);
      assertFalse(boolean0);
  }
}
