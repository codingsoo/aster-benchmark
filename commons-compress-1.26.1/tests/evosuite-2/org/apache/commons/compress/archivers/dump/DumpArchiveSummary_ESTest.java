
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


package org.apache.commons.compress.archivers.dump;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.dump.DumpArchiveSummary;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DumpArchiveSummary_ESTest extends DumpArchiveSummary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[23];
      byteArray0[8] = (byte)31;
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      DumpArchiveSummary dumpArchiveSummary0 = null;
      try {
        dumpArchiveSummary0 = new DumpArchiveSummary(byteArray0, zipEncoding0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[23];
      byteArray0[5] = (byte)112;
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      DumpArchiveSummary dumpArchiveSummary0 = null;
      try {
        dumpArchiveSummary0 = new DumpArchiveSummary(byteArray0, zipEncoding0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      DumpArchiveSummary dumpArchiveSummary0 = null;
      try {
        dumpArchiveSummary0 = new DumpArchiveSummary((byte[]) null, zipEncoding0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }
}
