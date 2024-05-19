
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


package org.apache.commons.compress.archivers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.PipedOutputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArchiveOutputStream_ESTest extends ArchiveOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("z7He", 1);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      int int0 = arArchiveOutputStream0.getCount();
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[2];
      arArchiveOutputStream0.write(byteArray0, 1997, (int) (byte) (-80));
      int int0 = arArchiveOutputStream0.getCount();
      assertEquals((-80), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("z7He", 1);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      long long0 = arArchiveOutputStream0.getBytesWritten();
      assertEquals(60L, long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[8];
      arArchiveOutputStream0.write(byteArray0, 2262, (-3332));
      long long0 = arArchiveOutputStream0.getBytesWritten();
      assertEquals((-3332L), long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(pipedOutputStream0);
      try { 
        arArchiveOutputStream0.write(1908874353);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      arArchiveOutputStream0.write(1908874353);
      assertEquals(1, ArArchiveOutputStream.LONGFILE_BSD);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      long long0 = arArchiveOutputStream0.getBytesWritten();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      int int0 = arArchiveOutputStream0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(pipedOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("PpEgRSBa*2L,wxy", '@');
      boolean boolean0 = arArchiveOutputStream0.canWriteEntryData(arArchiveEntry0);
      assertTrue(boolean0);
  }
}
