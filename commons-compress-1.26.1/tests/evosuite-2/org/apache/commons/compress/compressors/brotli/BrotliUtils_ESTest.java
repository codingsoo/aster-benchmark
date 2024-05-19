
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


package org.apache.commons.compress.compressors.brotli;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.compressors.brotli.BrotliUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BrotliUtils_ESTest extends BrotliUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BrotliUtils.setCacheBrotliAvailablity(true);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = BrotliUtils.isBrotliCompressionAvailable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BrotliUtils.setCacheBrotliAvailablity(false);
      boolean boolean0 = BrotliUtils.isBrotliCompressionAvailable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BrotliUtils.setCacheBrotliAvailablity(false);
      BrotliUtils.setCacheBrotliAvailablity(true);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BrotliUtils.getCachedBrotliAvailability();
  }
}
