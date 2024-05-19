
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
import java.nio.file.spi.FileSystemProvider;
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
      doReturn(2679, 0).when(fileChannel0).write(any(java.nio.ByteBuffer.class) , anyLong());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[3];
      try { 
        fileRandomAccessOutputStream0.writeFully(byteArray0, 0L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to fully write to file: written=0
         //
         verifyException("org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[3];
      fileRandomAccessOutputStream0.write(byteArray0, (int) (byte)1, (int) (byte)0);
      assertEquals(0L, fileRandomAccessOutputStream0.position());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.writeFully((byte[]) null, 522, 522, (long) 522);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.writeFully(byteArray0, (int) (byte)111, 3349, (long) 3349);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.write((byte[]) null, (-2957), (-2957));
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
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.write(byteArray0, (-2092), (int) (byte)10);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(fileChannel0).toString();
      doReturn(0).when(fileChannel0).write(any(java.nio.ByteBuffer.class));
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[7];
      try { 
        fileRandomAccessOutputStream0.write(byteArray0, (int) (byte)1, (int) (byte)1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to fully write: channel=null length=1 written=0
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipIoUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(fileChannel0).write(any(java.nio.ByteBuffer.class) , anyLong());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[3];
      try { 
        fileRandomAccessOutputStream0.writeFully(byteArray0, 2679);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to fully write to file: written=0
         //
         verifyException("org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(fileChannel0).write(any(java.nio.ByteBuffer.class) , anyLong());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[3];
      try { 
        fileRandomAccessOutputStream0.writeFully(byteArray0, 1, 1, (long) (-2092));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to fully write to file: written=0
         //
         verifyException("org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[3];
      fileRandomAccessOutputStream0.writeFully(byteArray0, 1, 0, (long) (-2092));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      doReturn("").when(fileChannel0).toString();
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      FileChannel fileChannel1 = fileRandomAccessOutputStream0.channel();
      assertSame(fileChannel1, fileChannel0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      long long0 = fileRandomAccessOutputStream0.position();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      FileSystem fileSystem0 = mock(FileSystem.class, new ViolatedAssumptionAnswer());
      doReturn((FileSystemProvider) null).when(fileSystem0).provider();
      Path path0 = mock(Path.class, new ViolatedAssumptionAnswer());
      doReturn(fileSystem0).when(path0).getFileSystem();
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
  public void test15()  throws Throwable  {
      FileSystemProvider fileSystemProvider0 = mock(FileSystemProvider.class, new ViolatedAssumptionAnswer());
      doReturn((FileChannel) null).when(fileSystemProvider0).newFileChannel(any(java.nio.file.Path.class) , anySet() , any(java.nio.file.attribute.FileAttribute[].class));
      FileSystem fileSystem0 = mock(FileSystem.class, new ViolatedAssumptionAnswer());
      doReturn(fileSystemProvider0).when(fileSystem0).provider();
      Path path0 = mock(Path.class, new ViolatedAssumptionAnswer());
      doReturn(fileSystem0).when(path0).getFileSystem();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = null;
      try {
        fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(path0, openOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // channel
         //
         verifyException("java.util.Objects", e);
      }
  }
}
