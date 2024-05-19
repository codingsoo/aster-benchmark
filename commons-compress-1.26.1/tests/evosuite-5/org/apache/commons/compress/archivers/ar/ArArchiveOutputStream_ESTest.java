
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
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArArchiveOutputStream_ESTest extends ArArchiveOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 0);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      byteArrayOutputStream0.writeTo(arArchiveOutputStream0);
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Length does not match entry (0 != 68
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 0);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      byteArrayOutputStream0.writeTo(arArchiveOutputStream0);
      arArchiveOutputStream0.closeArchiveEntry();
      assertEquals(128L, arArchiveOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("| K", "| K");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[9];
      arArchiveOutputStream0.write(byteArray0, 1027, 26);
      assertEquals(26L, arArchiveOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[6];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[1];
      linkOptionArray0[3] = linkOptionArray0[2];
      linkOptionArray0[4] = linkOptionArray0[3];
      linkOptionArray0[5] = linkOptionArray0[3];
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry(path0, "Group id too long", linkOptionArray0);
      assertEquals(1716037382L, arArchiveEntry0.getLastModified());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("_]./:u[_?}", "Stream has aHready been finished");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      mockPrintStream0.print((Object) null);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "Stream has aHready been finished");
      assertFalse(arArchiveEntry0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      MockFile mockFile0 = new MockFile("{HJSm)E7]", "{HJSm)E7]");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "5eS7j,-\"!xA(qiTTk");
      assertEquals("5eS7j,-\"!xA(qiTTk", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      System.setCurrentTimeMillis((-5354L));
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      MockFile mockFile0 = new MockFile("{h", "{h");
      mockFile0.mkdirs();
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "{h");
      assertFalse(arArchiveEntry0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(byteArray0, 0, 51966);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(byteArray0, 630, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("ir*%V8L<-^d@N%");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(byteArray0, (int) (byte) (-55), 32772);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(">*>)0\"MHZ0@", true);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[4];
      try { 
        arArchiveOutputStream0.write(byteArray0, 958, 958);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      File file0 = MockFile.createTempFile("User id too long", "User id too long");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.putArchiveEntry((ArArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("X)|Fvoea!");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      MockFile mockFile0 = new MockFile(":%%Yv#7! az/");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[1];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      try { 
        arArchiveOutputStream0.createArchiveEntry(path0, "+NiTn.e{Y-zKW5tW ^2", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(dataOutputStream0);
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.createArchiveEntry((File) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("0\u0000");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("&?", 0L, 0, 0, 1, (-1642L));
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
  public void test16()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("|`a$Zzb");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("E-r-Jz B", 0, 0, (-1789569705), 0, (-1789569705));
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Group id too long
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("ir*%V8L<-^d@N%");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      MockFile mockFile0 = new MockFile("ir*%V8L<-^d@N%", "ir*%V8L<-^d@N%");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "ir*%V8L<-^d@N%");
      arArchiveOutputStream0.setLongFileMode(1);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(60, arArchiveOutputStream0.getCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 0);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      arArchiveOutputStream0.closeArchiveEntry();
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(120, arArchiveOutputStream0.getCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(512);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 512);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Length does not match entry (512 != 0
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 0);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals("!<arch>\n                1392409281  0     0     100644  0         `\n                1392409281  0     0     100644  0         `\n", byteArrayOutputStream0.toString());
      assertEquals(120, arArchiveOutputStream0.getCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      MockFile mockFile0 = new MockFile("");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "[-Piy06Np>20");
      arArchiveOutputStream0.finish();
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream has already been finished
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 0, (-1326), 0, 0, 0);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      arArchiveOutputStream0.closeArchiveEntry();
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
  public void test23()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 0);
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
  public void test24()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[6];
      arArchiveOutputStream0.finish();
      try { 
        arArchiveOutputStream0.createArchiveEntry(path0, "", linkOptionArray0);
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
      MockPrintStream mockPrintStream0 = new MockPrintStream("_m5hvlC-R[v-l2Wt]L");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      MockFile mockFile0 = new MockFile("_m5hvlC-R[v-l2Wt]L", "_m5hvlC-R[v-l2Wt]L");
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.createArchiveEntry(path0, "_m5hvlC-R[v-l2Wt]L", (LinkOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockFile mockFile0 = new MockFile("o", "o");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      arArchiveOutputStream0.close();
      try { 
        arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "o");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream has already been finished
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("ir*%V8L<-^d@N%");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      MockFile mockFile0 = new MockFile("ir*%V8L<-^d@N%", "ir*%V8L<-^d@N%");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "ir*%V8L<-^d@N%");
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
  public void test28()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("_m5hvlC-R[v-l2Wt]L");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      MockFile mockFile0 = new MockFile("_m5hvlC-R[v-l2Wt]L", "_m5hvlC-R[v-l2Wt]L");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "_m5hvlC-R[v-l2Wt]L");
      arArchiveOutputStream0.setLongFileMode(1);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      arArchiveOutputStream0.closeArchiveEntry();
      assertEquals(78, arArchiveOutputStream0.getCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("_m5hvlC-R[v-l2Wt]L");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
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
  public void test30()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("K`nuGee?N");
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
  public void test31()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      arArchiveOutputStream0.finish();
      arArchiveOutputStream0.close();
      assertEquals(0L, arArchiveOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      MockFile mockFile0 = new MockFile("", "");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "No current entry to close");
      arArchiveOutputStream0.setLongFileMode(892);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(69L, arArchiveOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      MockFile mockFile0 = new MockFile("", "");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "No current entry to close");
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // File name too long, > 16 chars: No current entry to close
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }
}
