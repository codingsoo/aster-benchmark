
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
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArchiveOutputStream_ESTest extends ArchiveOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField", false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      arArchiveOutputStream0.write(0);
      int int0 = arArchiveOutputStream0.getCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockFile mockFile0 = new MockFile("G])AU!v9ge7AX");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      arArchiveOutputStream0.write(byteArray0, (int) (byte)15, (int) (byte)15);
      long long0 = arArchiveOutputStream0.getBytesWritten();
      assertEquals(15L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.archivers.ArchiveOutputStream", "org.apache.commons.compress.archivers.ArchiveOutputStream");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      arArchiveOutputStream0.write(byteArray0, 45, (-2550));
      long long0 = arArchiveOutputStream0.getBytesWritten();
      assertEquals((-2550L), long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(2259);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField", false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      arArchiveOutputStream0.close();
      try { 
        arArchiveOutputStream0.write(0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("G])AU!v9ge7AX");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[4];
      arArchiveOutputStream0.write(byteArray0, 0, (-1));
      assertEquals(1, ArArchiveOutputStream.LONGFILE_BSD);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("G])AU!v9ge7AX");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      long long0 = arArchiveOutputStream0.getBytesWritten();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField", false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      int int0 = arArchiveOutputStream0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField");
      boolean boolean0 = arArchiveOutputStream0.canWriteEntryData(arArchiveEntry0);
      assertTrue(boolean0);
  }
}
