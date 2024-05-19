
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


package org.apache.commons.jxpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.BasicVariables;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BasicVariables_ESTest extends BasicVariables_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      basicVariables0.declareVariable("97#$+b", "97#$+b");
      boolean boolean0 = basicVariables0.isDeclaredVariable("97#$+b");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      basicVariables0.declareVariable("K%\"bM]@.lJ;s>", "K%\"bM]@.lJ;s>");
      Object object0 = basicVariables0.getVariable("K%\"bM]@.lJ;s>");
      assertEquals("K%\"bM]@.lJ;s>", object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      // Undeclared exception!
      try { 
        basicVariables0.getVariable("{}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '{}'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      String string0 = basicVariables0.toString();
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      basicVariables0.undeclareVariable("{}");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      boolean boolean0 = basicVariables0.isDeclaredVariable("{}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      basicVariables0.declareVariable((String) null, (Object) null);
      Object object0 = basicVariables0.getVariable((String) null);
      assertNull(object0);
  }
}
