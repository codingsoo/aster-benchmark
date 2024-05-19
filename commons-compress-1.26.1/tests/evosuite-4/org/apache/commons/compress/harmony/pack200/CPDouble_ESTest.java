
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


package org.apache.commons.compress.harmony.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.harmony.pack200.CPDouble;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPDouble_ESTest extends CPDouble_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CPDouble cPDouble0 = new CPDouble(0.0);
      double double0 = cPDouble0.getDouble();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CPDouble cPDouble0 = new CPDouble(217.42844561316);
      double double0 = cPDouble0.getDouble();
      assertEquals(217.42844561316, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CPDouble cPDouble0 = new CPDouble(0.0);
      CPDouble cPDouble1 = new CPDouble((-3010));
      int int0 = cPDouble0.compareTo(cPDouble1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CPDouble cPDouble0 = new CPDouble(217.42844561316);
      CPDouble cPDouble1 = new CPDouble(2239);
      int int0 = cPDouble0.compareTo(cPDouble1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CPDouble cPDouble0 = new CPDouble(225.0838271);
      // Undeclared exception!
      try { 
        cPDouble0.compareTo((CPDouble) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPDouble", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CPDouble cPDouble0 = new CPDouble((-755.2701119662228));
      double double0 = cPDouble0.getDouble();
      assertEquals((-755.2701119662228), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CPDouble cPDouble0 = new CPDouble((-755.2701119662228));
      int int0 = cPDouble0.compareTo(cPDouble0);
      assertEquals(0, int0);
      assertEquals((-755.2701119662228), cPDouble0.getDouble(), 0.01);
  }
}
