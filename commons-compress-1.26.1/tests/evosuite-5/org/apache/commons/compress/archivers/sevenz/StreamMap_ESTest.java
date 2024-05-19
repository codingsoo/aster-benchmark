
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


package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.sevenz.StreamMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class StreamMap_ESTest extends StreamMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[9];
      long[] longArray0 = new long[8];
      int[] intArray1 = new int[6];
      StreamMap streamMap0 = new StreamMap(intArray0, longArray0, intArray0, intArray1);
      String string0 = streamMap0.toString();
      assertEquals("StreamMap with indices of 9 folders, offsets of 8 packed streams, first files of 9 folders and folder indices for 6 files", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[2];
      long[] longArray0 = new long[2];
      int[] intArray1 = new int[3];
      StreamMap streamMap0 = new StreamMap(intArray0, longArray0, intArray1, intArray1);
      String string0 = streamMap0.toString();
      assertEquals("StreamMap with indices of 2 folders, offsets of 2 packed streams, first files of 3 folders and folder indices for 3 files", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[8];
      StreamMap streamMap0 = new StreamMap(intArray0, (long[]) null, intArray0, intArray0);
      // Undeclared exception!
      try { 
        streamMap0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.StreamMap", e);
      }
  }
}
