
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


package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.tar.TarArchiveSparseZeroInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TarArchiveSparseZeroInputStream_ESTest extends TarArchiveSparseZeroInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TarArchiveSparseZeroInputStream tarArchiveSparseZeroInputStream0 = new TarArchiveSparseZeroInputStream();
      long long0 = tarArchiveSparseZeroInputStream0.skip(311L);
      assertEquals(311L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TarArchiveSparseZeroInputStream tarArchiveSparseZeroInputStream0 = new TarArchiveSparseZeroInputStream();
      long long0 = tarArchiveSparseZeroInputStream0.skip((-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TarArchiveSparseZeroInputStream tarArchiveSparseZeroInputStream0 = new TarArchiveSparseZeroInputStream();
      int int0 = tarArchiveSparseZeroInputStream0.read();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TarArchiveSparseZeroInputStream tarArchiveSparseZeroInputStream0 = new TarArchiveSparseZeroInputStream();
      long long0 = tarArchiveSparseZeroInputStream0.skip(0);
      assertEquals(0L, long0);
  }
}
