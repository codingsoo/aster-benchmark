
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


package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystem;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FileRandomAccessOutputStream_ESTest extends FileRandomAccessOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[3];
      fileRandomAccessOutputStream0.write(byteArray0, 2, 0);
      assertEquals(0L, fileRandomAccessOutputStream0.position());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.writeFully((byte[]) null, (-1), (-1), (long) (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.writeFully(byteArray0, (int) (byte)84, (int) (byte) (-56), (-1392L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(fileChannel0).toString();
      doReturn(0).when(fileChannel0).write(any(java.nio.ByteBuffer.class));
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[3];
      try { 
        fileRandomAccessOutputStream0.write(byteArray0, 1, 1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to fully write: channel=null length=1 written=0
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipIoUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.write((byte[]) null, 721, (int) (byte)32);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = null;
      try {
        fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream((FileChannel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // channel
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      doReturn(2, 1371, (-183)).when(fileChannel0).write(any(java.nio.ByteBuffer.class) , anyLong());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[9];
      try { 
        fileRandomAccessOutputStream0.writeFully(byteArray0, 0L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to fully write to file: written=-183
         //
         verifyException("org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(fileChannel0).write(any(java.nio.ByteBuffer.class) , anyLong());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[3];
      try { 
        fileRandomAccessOutputStream0.writeFully(byteArray0, (int) (byte)1, (int) (byte)1, (long) (byte)2);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to fully write to file: written=0
         //
         verifyException("org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[3];
      fileRandomAccessOutputStream0.writeFully(byteArray0, 0, 0, (long) 0);
      assertEquals(0L, fileRandomAccessOutputStream0.position());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(fileChannel0).toString();
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      FileChannel fileChannel1 = fileRandomAccessOutputStream0.channel();
      assertFalse(fileChannel1.isOpen());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      long long0 = fileRandomAccessOutputStream0.position();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.channels.spi.AbstractInterruptibleChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Path path0 = mock(Path.class, new ViolatedAssumptionAnswer());
      doReturn((FileSystem) null).when(path0).getFileSystem();
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = null;
      try {
        fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(path0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.channels.FileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Path path0 = mock(Path.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = null;
      try {
        fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(path0, (OpenOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.channels.FileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.write(byteArray0, (-830), 1063);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }
}
