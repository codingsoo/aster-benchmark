
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
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationGreaterThan_ESTest extends CoreOperationGreaterThan_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QName qName0 = new QName("Cannot compare pointers that do not belong to the same tree: '", "Cannot compare pointers that do not belong to the same tree: '");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(variableReference0, variableReference0);
      boolean boolean0 = coreOperationGreaterThan0.evaluateCompare(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CoreOperationOr coreOperationOr0 = new CoreOperationOr((Expression[]) null);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationOr0, coreOperationOr0);
      boolean boolean0 = coreOperationGreaterThan0.evaluateCompare(22);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CoreOperationOr coreOperationOr0 = new CoreOperationOr((Expression[]) null);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationOr0, coreOperationOr0);
      boolean boolean0 = coreOperationGreaterThan0.evaluateCompare((-74));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CoreOperationOr coreOperationOr0 = new CoreOperationOr((Expression[]) null);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationOr0, coreOperationOr0);
      String string0 = coreOperationGreaterThan0.getSymbol();
      assertEquals(">", string0);
  }
}
