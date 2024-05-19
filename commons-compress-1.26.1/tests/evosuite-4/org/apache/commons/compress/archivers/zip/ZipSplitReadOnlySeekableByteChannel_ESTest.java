
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
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.nio.channels.NonReadableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Stack;
import java.util.Vector;
import org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipSplitReadOnlySeekableByteChannel_ESTest extends ZipSplitReadOnlySeekableByteChannel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path[] pathArray0 = new Path[1];
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Class<File> class0 = File.class;
      ServiceLoader<File> serviceLoader0 = ServiceLoader.load(class0);
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forFiles((File) mockFile0, (Iterable<File>) serviceLoader0);
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[1];
      seekableByteChannelArray0[0] = seekableByteChannel0;
      SeekableByteChannel seekableByteChannel1 = ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
      assertSame(seekableByteChannel1, seekableByteChannel0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Class<File> class0 = File.class;
      ServiceLoader<File> serviceLoader0 = ServiceLoader.load(class0);
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forFiles((File) mockFile0, (Iterable<File>) serviceLoader0);
      ArrayList<SeekableByteChannel> arrayList0 = new ArrayList<SeekableByteChannel>(928);
      SeekableByteChannel seekableByteChannel1 = ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannel0, (Iterable<SeekableByteChannel>) arrayList0);
      assertSame(seekableByteChannel0, seekableByteChannel1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Path[] pathArray0 = new Path[2];
      MockFile mockFile0 = new MockFile("]*uf;?Y", "Negative position: ");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Path[] pathArray0 = new Path[0];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Path[] pathArray0 = new Path[6];
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      pathArray0[1] = path0;
      pathArray0[2] = pathArray0[1];
      pathArray0[3] = pathArray0[0];
      pathArray0[4] = path0;
      pathArray0[5] = path0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OpenOption[] openOptionArray0 = new OpenOption[0];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) null, openOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // paths must not be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("wF)");
      Path path0 = mockFile0.toPath();
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(path0, (Iterable<Path>) path0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((Path) null, (Iterable<Path>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // paths
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(path0, (Iterable<Path>) path0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Negative position: ", false);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[6];
      seekableByteChannelArray0[0] = (SeekableByteChannel) fileChannel0;
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
        fail("Expecting exception: NonReadableChannelException");
      
      } catch(NonReadableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[0];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("java.util.Arrays$ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Negative position: ", false);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[6];
      seekableByteChannelArray0[0] = (SeekableByteChannel) fileChannel0;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Negative position: ");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Negative position: ", false);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      ArrayDeque<SeekableByteChannel> arrayDeque0 = new ArrayDeque<SeekableByteChannel>();
      arrayDeque0.add(fileChannel0);
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels((SeekableByteChannel) fileChannel0, (Iterable<SeekableByteChannel>) arrayDeque0);
        fail("Expecting exception: NonReadableChannelException");
      
      } catch(NonReadableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Negative3 position: ", false);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      ArrayDeque<SeekableByteChannel> arrayDeque0 = new ArrayDeque<SeekableByteChannel>();
      mockFileOutputStream0.close();
      arrayDeque0.add(fileChannel0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels((SeekableByteChannel) fileChannel0, (Iterable<SeekableByteChannel>) arrayDeque0);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Stack<SeekableByteChannel> stack0 = new Stack<SeekableByteChannel>();
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels((SeekableByteChannel) null, (Iterable<SeekableByteChannel>) stack0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // lastSegmentChannel
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Negative3 position: ", false);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Negative3 position: ");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      ArrayDeque<SeekableByteChannel> arrayDeque0 = new ArrayDeque<SeekableByteChannel>();
      arrayDeque0.add(fileChannel0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels((SeekableByteChannel) fileChannel0, (Iterable<SeekableByteChannel>) arrayDeque0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      File[] fileArray0 = new File[4];
      MockFile mockFile0 = new MockFile("", "");
      fileArray0[0] = (File) mockFile0;
      File file0 = MockFile.createTempFile("org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel", "", fileArray0[0]);
      fileArray0[1] = file0;
      fileArray0[2] = file0;
      fileArray0[3] = file0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      File[] fileArray0 = new File[5];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      File[] fileArray0 = new File[0];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      File[] fileArray0 = new File[2];
      fileArray0[0] = (File) mockFile0;
      fileArray0[1] = (File) mockFile0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel", "B%0A&jxq! ");
      Class<File> class0 = File.class;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ServiceLoader<File> serviceLoader0 = ServiceLoader.load(class0, classLoader0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles((File) mockFile0, (Iterable<File>) serviceLoader0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.archivers.zip.ZipLong", "org.apache.commons.compress.archivers.zip.ZipLong");
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(file0, (Iterable<File>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // files
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(path0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(path0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/FilenameUtils
         //
         verifyException("org.apache.commons.compress.utils.FileNameUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment((File) mockFile0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/FilenameUtils
         //
         verifyException("org.apache.commons.compress.utils.FileNameUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Stack<SeekableByteChannel> stack0 = new Stack<SeekableByteChannel>();
      LinkedHashSet<FileChannel> linkedHashSet0 = new LinkedHashSet<FileChannel>();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$1", true);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      linkedHashSet0.add(fileChannel0);
      stack0.addAll((Collection<? extends SeekableByteChannel>) linkedHashSet0);
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(stack0);
        fail("Expecting exception: NonReadableChannelException");
      
      } catch(NonReadableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      linkedList0.add((SeekableByteChannel) null);
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector<SeekableByteChannel> vector0 = new Vector<SeekableByteChannel>();
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(vector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Stack<Path> stack0 = new Stack<Path>();
      MockFile mockFile0 = new MockFile(";nYFWNgg");
      Path path0 = mockFile0.toPath();
      stack0.add(path0);
      OpenOption[] openOptionArray0 = new OpenOption[0];
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) stack0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ArrayList<Path> arrayList0 = new ArrayList<Path>();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) arrayList0, openOptionArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[1];
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
      assertNull(seekableByteChannel0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forPaths(path0, (Iterable<Path>) path0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Path[] pathArray0 = new Path[1];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[6];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      File[] fileArray0 = new File[1];
      MockFile mockFile0 = new MockFile("");
      fileArray0[0] = (File) mockFile0;
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      ArrayDeque<File> arrayDeque0 = new ArrayDeque<File>(457);
      arrayDeque0.add(mockFile0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles((File) mockFile0, (Iterable<File>) arrayDeque0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Class<File> class0 = File.class;
      ServiceLoader<File> serviceLoader0 = ServiceLoader.load(class0);
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forFiles((File) mockFile0, (Iterable<File>) serviceLoader0);
      ArrayList<SeekableByteChannel> arrayList0 = new ArrayList<SeekableByteChannel>();
      arrayList0.add(seekableByteChannel0);
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(arrayList0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel", e);
      }
  }
}
