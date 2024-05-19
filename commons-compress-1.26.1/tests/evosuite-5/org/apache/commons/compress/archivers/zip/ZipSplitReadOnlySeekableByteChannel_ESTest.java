
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
import java.nio.channels.FileChannel;
import java.nio.channels.NonReadableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.ServiceLoader;
import java.util.Stack;
import java.util.TreeSet;
import org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipSplitReadOnlySeekableByteChannel_ESTest extends ZipSplitReadOnlySeekableByteChannel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Path[] pathArray0 = new Path[1];
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Path[] pathArray0 = new Path[7];
      MockFile mockFile0 = new MockFile("u/7E4:4<W@[{[");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((Path[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Path[] pathArray0 = new Path[8];
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      pathArray0[1] = path0;
      pathArray0[2] = pathArray0[1];
      pathArray0[3] = pathArray0[0];
      pathArray0[4] = pathArray0[3];
      pathArray0[5] = pathArray0[0];
      pathArray0[6] = path0;
      pathArray0[7] = pathArray0[5];
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<Path> arrayList0 = new ArrayList<Path>();
      arrayList0.add((Path) null);
      OpenOption[] openOptionArray0 = new OpenOption[3];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) arrayList0, openOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile((String) null, "ABkxD<g%`:k$E`:@F");
      Path path0 = mockFile0.toPath();
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(path0, (Iterable<Path>) path0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(path0, (Iterable<Path>) path0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[4];
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("wQ-&TCAs0QTA81K", true);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      TreeSet<Path> treeSet0 = new TreeSet<Path>();
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forPaths(path0, (Iterable<Path>) treeSet0);
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[21];
      seekableByteChannelArray0[0] = seekableByteChannel0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<SeekableByteChannel> class0 = SeekableByteChannel.class;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ServiceLoader<SeekableByteChannel> serviceLoader0 = ServiceLoader.load(class0, classLoader0);
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels((SeekableByteChannel) null, (Iterable<SeekableByteChannel>) serviceLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // lastSegmentChannel
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      TreeSet<Path> treeSet0 = new TreeSet<Path>();
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forPaths(path0, (Iterable<Path>) treeSet0);
      PriorityQueue<SeekableByteChannel> priorityQueue0 = new PriorityQueue<SeekableByteChannel>();
      priorityQueue0.add(seekableByteChannel0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannel0, (Iterable<SeekableByteChannel>) priorityQueue0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      File[] fileArray0 = new File[2];
      MockFile mockFile0 = new MockFile("~*<h;uhC;h6x");
      fileArray0[0] = (File) mockFile0;
      fileArray0[1] = (File) mockFile0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles((File[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // files must not be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      File file0 = MockFile.createTempFile("uR'a9", "uR'a9");
      TreeSet<File> treeSet0 = new TreeSet<File>();
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(file0, (Iterable<File>) treeSet0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      TreeSet<File> treeSet0 = new TreeSet<File>();
      treeSet0.add(mockFile0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles((File) mockFile0, (Iterable<File>) treeSet0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment((Path) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("=UTo.V?JHRq", "=UTo.V?JHRq");
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
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("channels", "#wD%wab_Mn,mW~");
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
  public void test21()  throws Throwable  {
      ArrayList<SeekableByteChannel> arrayList0 = new ArrayList<SeekableByteChannel>(1815);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("dZ.2>oP@l-')wCq6;v");
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      arrayList0.add((SeekableByteChannel) fileChannel0);
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(arrayList0);
        fail("Expecting exception: NonReadableChannelException");
      
      } catch(NonReadableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel((List<SeekableByteChannel>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // channels must not be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Stack<SeekableByteChannel> stack0 = new Stack<SeekableByteChannel>();
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(stack0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Class<File> class0 = File.class;
      ServiceLoader<File> serviceLoader0 = ServiceLoader.load(class0);
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forFiles((File) mockFile0, (Iterable<File>) serviceLoader0);
      Stack<SeekableByteChannel> stack0 = new Stack<SeekableByteChannel>();
      stack0.add(seekableByteChannel0);
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(stack0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArrayList<Path> arrayList0 = new ArrayList<Path>();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      arrayList0.add(path0);
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) arrayList0, openOptionArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ArrayList<Path> arrayList0 = new ArrayList<Path>();
      OpenOption[] openOptionArray0 = new OpenOption[0];
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
  public void test27()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[1];
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
      assertNull(seekableByteChannel0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ArrayList<SeekableByteChannel> arrayList0 = new ArrayList<SeekableByteChannel>(1815);
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(arrayList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      File[] fileArray0 = new File[9];
      fileArray0[0] = (File) mockFile0;
      fileArray0[1] = (File) mockFile0;
      fileArray0[2] = (File) mockFile0;
      fileArray0[3] = (File) mockFile0;
      fileArray0[4] = (File) mockFile0;
      fileArray0[5] = (File) mockFile0;
      fileArray0[6] = (File) mockFile0;
      fileArray0[7] = (File) mockFile0;
      fileArray0[8] = (File) mockFile0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      File[] fileArray0 = new File[1];
      fileArray0[0] = (File) mockFile0;
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[21];
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
  public void test33()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      TreeSet<Path> treeSet0 = new TreeSet<Path>();
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forPaths(path0, (Iterable<Path>) treeSet0);
      PriorityQueue<SeekableByteChannel> priorityQueue0 = new PriorityQueue<SeekableByteChannel>();
      SeekableByteChannel seekableByteChannel1 = ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannel0, (Iterable<SeekableByteChannel>) priorityQueue0);
      assertSame(seekableByteChannel0, seekableByteChannel1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<File> class0 = File.class;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ServiceLoader<File> serviceLoader0 = ServiceLoader.load(class0, classLoader0);
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles((File) null, (Iterable<File>) serviceLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // lastSegmentFile
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
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
