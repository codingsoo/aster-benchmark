
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


package org.apache.commons.compress.archivers.ar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Locale;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArArchiveOutputStream_ESTest extends ArArchiveOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(8);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      arArchiveOutputStream0.setLongFileMode(8);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("5t", 0);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(60, arArchiveOutputStream0.getCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("'8+m");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      MockFile mockFile0 = new MockFile("PT4d?>}^p5q?", "PT4d?>}^p5q?");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "'8+m");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      byte[] byteArray0 = new byte[7];
      arArchiveOutputStream0.write((int) (byte)0);
      arArchiveOutputStream0.write(byteArray0, 104223930, (-2558));
      arArchiveOutputStream0.closeArchiveEntry();
      assertEquals((-2497), arArchiveOutputStream0.getCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("#1/", false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[7];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOption0;
      linkOptionArray0[3] = linkOption0;
      linkOptionArray0[4] = linkOption0;
      linkOptionArray0[5] = linkOptionArray0[0];
      linkOptionArray0[6] = linkOption0;
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry(path0, ":Kwojq :y:Bn'1", linkOptionArray0);
      assertEquals(0, arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("<_IoPN\"&|v2M<6MhR");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      Locale locale0 = Locale.FRENCH;
      Object[] objectArray0 = new Object[9];
      PrintStream printStream0 = mockPrintStream0.format(locale0, "h$.o#DBhCjVhNf2<W+H", objectArray0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(printStream0);
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "<_IoPN\"&|v2M<6MhR");
      assertEquals(19L, arArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(byteArray0, (int) (byte)13, (int) (byte)25);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(15);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(byteArray0, 56, (-200));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("qDz+RVw{6-", true);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(byteArray0, (-796), (int) (byte)1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("#1/", false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[6];
      try { 
        arArchiveOutputStream0.write(byteArray0, (int) (byte)76, (int) (byte) (-58));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      MockFile mockFile0 = new MockFile("+3oFjv!neO_Cs;/");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      MockFile mockFile0 = new MockFile("NGW bT418c", "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[2];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      try { 
        arArchiveOutputStream0.createArchiveEntry(path0, "", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("cQdq}C*PXk+");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.createArchiveEntry((File) null, "Unreadable TAR archive. Offset and numbytes for sparse block in ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Ed", false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      MockFile mockFile0 = new MockFile("Ed");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "Ed");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      try { 
        arArchiveOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // This archive contains unclosed entries.
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(pipedOutputStream0);
      MockFile mockFile0 = new MockFile("o'5");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "#B%%;N/fGz;H;HI>IcK");
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // File name too long, > 16 chars: #B%%;N/fGz;H;HI>IcK
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("'8+m");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      arArchiveOutputStream0.setLongFileMode((-1009));
      MockFile mockFile0 = new MockFile("", "");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "'8+m");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(60L, arArchiveOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("'8+m");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      MockFile mockFile0 = new MockFile("", "");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "'8+m");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      byte[] byteArray0 = new byte[7];
      arArchiveOutputStream0.write(byteArray0, 104223930, (-2558));
      try { 
        arArchiveOutputStream0.putArchiveEntry((ArArchiveEntry) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Length does not match entry (0 != -2558
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      arArchiveOutputStream0.finish();
      try { 
        arArchiveOutputStream0.putArchiveEntry((ArArchiveEntry) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream has already been finished
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      File file0 = MockFile.createTempFile("No current entry to close", "No current entry to close");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(filterOutputStream0, 420);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(bufferedOutputStream0);
      arArchiveOutputStream0.finish();
      try { 
        arArchiveOutputStream0.finish();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // This archive has already been finished
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("'8+m");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      MockFile mockFile0 = new MockFile("", "");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "'8+m");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      try { 
        arArchiveOutputStream0.finish();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // This archive contains unclosed entries.
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Ed");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      arArchiveOutputStream0.close();
      LinkOption[] linkOptionArray0 = new LinkOption[5];
      MockFile mockFile0 = new MockFile("Ed", "?Hn?m].HxOre)6");
      Path path0 = mockFile0.toPath();
      try { 
        arArchiveOutputStream0.createArchiveEntry(path0, "JCc\"YG:W*VY!f\"", linkOptionArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream has already been finished
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      MockFile mockFile0 = new MockFile("NGW bT418c", "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[2];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.createArchiveEntry(path0, "", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("T");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      arArchiveOutputStream0.finish();
      try { 
        arArchiveOutputStream0.createArchiveEntry((File) null, "This archive contains unclosed entries.");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream has already been finished
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("'8+m");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      MockFile mockFile0 = new MockFile("PT4d?>}^p5q?", "PT4d?>}^p5q?");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "'8+m");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      arArchiveOutputStream0.write((int) (byte)0);
      arArchiveOutputStream0.closeArchiveEntry();
      assertEquals(61L, arArchiveOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("LZMA2");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("uF.w", 0, 1, 12, 2059, 12);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      arArchiveOutputStream0.closeArchiveEntry();
      try { 
        arArchiveOutputStream0.closeArchiveEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // No current entry to close
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      try { 
        arArchiveOutputStream0.closeArchiveEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // No current entry to close
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("*w1u\"f$2'hawBy6T!A");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      arArchiveOutputStream0.close();
      try { 
        arArchiveOutputStream0.closeArchiveEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream has already been finished
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      arArchiveOutputStream0.finish();
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("'8+m");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      MockFile mockFile0 = new MockFile("PT4d?>}^p5q?", "PT4d?>}^p5q?");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "'8+m");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(120, arArchiveOutputStream0.getCount());
  }
}
