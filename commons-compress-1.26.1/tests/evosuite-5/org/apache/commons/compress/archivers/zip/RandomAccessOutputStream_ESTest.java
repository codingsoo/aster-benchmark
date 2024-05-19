
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
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.lang.reflect.Array;
import java.nio.channels.FileChannel;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream;
import org.apache.commons.compress.archivers.zip.SeekableChannelRandomAccessOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RandomAccessOutputStream_ESTest extends RandomAccessOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "");
      Path path0 = mockFile0.toPath();
      LinkedHashSet<OpenOption> linkedHashSet0 = new LinkedHashSet<OpenOption>();
      FileAttribute<Object>[] fileAttributeArray0 = (FileAttribute<Object>[]) Array.newInstance(FileAttribute.class, 0);
      FileChannel fileChannel0 = FileChannel.open(path0, (Set<? extends OpenOption>) linkedHashSet0, (FileAttribute<?>[]) fileAttributeArray0);
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream(fileChannel0);
      long long0 = seekableChannelRandomAccessOutputStream0.position();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "");
      Path path0 = mockFile0.toPath();
      LinkedHashSet<OpenOption> linkedHashSet0 = new LinkedHashSet<OpenOption>();
      FileAttribute<Object>[] fileAttributeArray0 = (FileAttribute<Object>[]) Array.newInstance(FileAttribute.class, 0);
      FileChannel fileChannel0 = FileChannel.open(path0, (Set<? extends OpenOption>) linkedHashSet0, (FileAttribute<?>[]) fileAttributeArray0);
      FileChannel fileChannel1 = fileChannel0.position(676L);
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream(fileChannel1);
      long long0 = seekableChannelRandomAccessOutputStream0.position();
      assertEquals(676L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.SYNC;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(path0, openOptionArray0);
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.writeFully(byteArray0, 0L);
        fail("Expecting exception: NonWritableChannelException");
      
      } catch(NonWritableChannelException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "");
      Path path0 = mockFile0.toPath();
      LinkedHashSet<OpenOption> linkedHashSet0 = new LinkedHashSet<OpenOption>();
      FileAttribute<Object>[] fileAttributeArray0 = (FileAttribute<Object>[]) Array.newInstance(FileAttribute.class, 0);
      FileChannel fileChannel0 = FileChannel.open(path0, (Set<? extends OpenOption>) linkedHashSet0, (FileAttribute<?>[]) fileAttributeArray0);
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        seekableChannelRandomAccessOutputStream0.writeFully(byteArray0, (byte)0);
        fail("Expecting exception: NonWritableChannelException");
      
      } catch(NonWritableChannelException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream((SeekableByteChannel) null);
      byte[] byteArray0 = new byte[11];
      // Undeclared exception!
      try { 
        seekableChannelRandomAccessOutputStream0.writeFully(byteArray0, 1774L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.SeekableChannelRandomAccessOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.SYNC;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(path0, openOptionArray0);
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.writeFully(byteArray0, (-989));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream((SeekableByteChannel) null);
      // Undeclared exception!
      try { 
        seekableChannelRandomAccessOutputStream0.write((-27));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipIoUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "");
      Path path0 = mockFile0.toPath();
      LinkedHashSet<OpenOption> linkedHashSet0 = new LinkedHashSet<OpenOption>();
      FileAttribute<Object>[] fileAttributeArray0 = (FileAttribute<Object>[]) Array.newInstance(FileAttribute.class, 0);
      FileChannel fileChannel0 = FileChannel.open(path0, (Set<? extends OpenOption>) linkedHashSet0, (FileAttribute<?>[]) fileAttributeArray0);
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        seekableChannelRandomAccessOutputStream0.writeFully(byteArray0, (byte) (-127));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "");
      Path path0 = mockFile0.toPath();
      LinkedHashSet<OpenOption> linkedHashSet0 = new LinkedHashSet<OpenOption>();
      FileAttribute<Object>[] fileAttributeArray0 = (FileAttribute<Object>[]) Array.newInstance(FileAttribute.class, 0);
      FileChannel fileChannel0 = FileChannel.open(path0, (Set<? extends OpenOption>) linkedHashSet0, (FileAttribute<?>[]) fileAttributeArray0);
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream(fileChannel0);
      // Undeclared exception!
      try { 
        seekableChannelRandomAccessOutputStream0.write(255);
        fail("Expecting exception: NonWritableChannelException");
      
      } catch(NonWritableChannelException e) {
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream((SeekableByteChannel) null);
      // Undeclared exception!
      try { 
        seekableChannelRandomAccessOutputStream0.position();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.SeekableChannelRandomAccessOutputStream", e);
      }
  }
}
