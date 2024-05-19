
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


package org.apache.commons.compress.compressors.snappy;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.compressors.snappy.FramedSnappyDialect;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FramedSnappyDialect_ESTest extends FramedSnappyDialect_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FramedSnappyDialect[] framedSnappyDialectArray0 = FramedSnappyDialect.values();
      assertEquals(2, framedSnappyDialectArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FramedSnappyDialect framedSnappyDialect0 = FramedSnappyDialect.valueOf("STANDARD");
      assertEquals(FramedSnappyDialect.STANDARD, framedSnappyDialect0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FramedSnappyDialect framedSnappyDialect0 = FramedSnappyDialect.STANDARD;
      boolean boolean0 = framedSnappyDialect0.usesChecksumWithCompressedChunks();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FramedSnappyDialect framedSnappyDialect0 = FramedSnappyDialect.STANDARD;
      boolean boolean0 = framedSnappyDialect0.hasStreamIdentifier();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FramedSnappyDialect framedSnappyDialect0 = FramedSnappyDialect.IWORK_ARCHIVE;
      boolean boolean0 = framedSnappyDialect0.usesChecksumWithCompressedChunks();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FramedSnappyDialect framedSnappyDialect0 = FramedSnappyDialect.IWORK_ARCHIVE;
      boolean boolean0 = framedSnappyDialect0.hasStreamIdentifier();
      assertFalse(boolean0);
  }
}
