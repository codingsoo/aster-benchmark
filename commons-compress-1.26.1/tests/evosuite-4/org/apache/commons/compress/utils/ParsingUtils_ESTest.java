
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


package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.commons.compress.utils.ParsingUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ParsingUtils_ESTest extends ParsingUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      long long0 = ParsingUtils.parseLongValue("8", 10);
      assertEquals(8L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      long long0 = ParsingUtils.parseLongValue("0");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      long long0 = ParsingUtils.parseLongValue("5");
      assertEquals(5L, long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = ParsingUtils.parseIntValue("0");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = ParsingUtils.parseIntValue("4");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      try { 
        ParsingUtils.parseIntValue("", (-1318));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unable to parse int from string value: 
         //
         verifyException("org.apache.commons.compress.utils.ParsingUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int int0 = ParsingUtils.parseIntValue("5", 10);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      try { 
        ParsingUtils.parseLongValue("kfNqSqY.h9bC?0?H!K ", 3256);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unable to parse long from string value: kfNqSqY.h9bC?0?H!K 
         //
         verifyException("org.apache.commons.compress.utils.ParsingUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      try { 
        ParsingUtils.parseIntValue("3^4bJn3LrU");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unable to parse int from string value: 3^4bJn3LrU
         //
         verifyException("org.apache.commons.compress.utils.ParsingUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      try { 
        ParsingUtils.parseLongValue("+");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unable to parse long from string value: +
         //
         verifyException("org.apache.commons.compress.utils.ParsingUtils", e);
      }
  }
}
