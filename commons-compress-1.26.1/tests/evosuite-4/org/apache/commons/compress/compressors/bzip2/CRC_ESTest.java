
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


package org.apache.commons.compress.compressors.bzip2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.compressors.bzip2.CRC;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CRC_ESTest extends CRC_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CRC cRC0 = new CRC();
      cRC0.update(0, (-1));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CRC cRC0 = new CRC();
      cRC0.update((-1));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CRC cRC0 = new CRC();
      cRC0.reset();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CRC cRC0 = new CRC();
      cRC0.update(0, 805);
      int int0 = cRC0.getValue();
      assertEquals(1902419600, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CRC cRC0 = new CRC();
      cRC0.update(0);
      int int0 = cRC0.getValue();
      assertEquals((-1309196213), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CRC cRC0 = new CRC();
      // Undeclared exception!
      cRC0.update(0, 701822548);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CRC cRC0 = new CRC();
      // Undeclared exception!
      try { 
        cRC0.update(567, 567);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -312
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.CRC", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CRC cRC0 = new CRC();
      // Undeclared exception!
      try { 
        cRC0.update(761);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -506
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.CRC", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CRC cRC0 = new CRC();
      cRC0.update(0);
      cRC0.update(190);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CRC cRC0 = new CRC();
      int int0 = cRC0.getValue();
      assertEquals(0, int0);
  }
}
