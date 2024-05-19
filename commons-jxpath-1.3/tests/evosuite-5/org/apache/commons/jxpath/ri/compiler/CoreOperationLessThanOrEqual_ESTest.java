
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
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationLessThanOrEqual_ESTest extends CoreOperationLessThanOrEqual_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual((Expression) null, locationPath0);
      boolean boolean0 = coreOperationLessThanOrEqual0.evaluateCompare(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual((Expression) null, locationPath0);
      String string0 = coreOperationLessThanOrEqual0.getSymbol();
      assertEquals("<=", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationOr0, coreOperationOr0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationLessThan0, coreOperationLessThan0);
      boolean boolean0 = coreOperationLessThanOrEqual0.evaluateCompare((-183));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationOr0, coreOperationOr0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationLessThan0, coreOperationLessThan0);
      boolean boolean0 = coreOperationLessThanOrEqual0.evaluateCompare(63);
      assertFalse(boolean0);
  }
}
