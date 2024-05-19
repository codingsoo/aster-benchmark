
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


package org.apache.commons.codec.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.util.Enumeration;
import org.apache.commons.codec.digest.DigestUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DigestUtils_ESTest extends DigestUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, byteBuffer0);
      assertSame(messageDigest1, messageDigest0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512_256("[charsetName=");
      assertEquals(32, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = DigestUtils.sha512Hex((InputStream) byteArrayInputStream0);
      assertEquals("b8244d028981d693af7b456af8efa4cad63d282e19ff14942c246e50d9351d22704a802a71c3580b6370de4ceb293c324a8423342557d4e5c38438f0e36910ee", string0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = DigestUtils.sha512(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      String string0 = DigestUtils.sha384Hex(byteArray0);
      assertEquals("b56705a73cf280f06d3a6b482c441a3d280c930d0c44b04f364dcdcedcfbc47cf3645a71da7b97f9e5d3a0924f6b9634", string0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = DigestUtils.sha1Hex((InputStream) byteArrayInputStream0);
      assertEquals("05fe405753166f125559e7c9ac558654f107c7e9", string0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("wD{@>6ji]");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "i*R=={|t,z");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("wD{@>6ji]");
      DigestUtils.sha1((InputStream) mockFileInputStream0);
      assertEquals((-2), mockFileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = DigestUtils.sha(byteArray0);
      assertEquals(20, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md5("&/^}`303ud%6Zkxwrz");
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getDigest("(P>?3mL", (MessageDigest) null);
      assertNull(messageDigest0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getDigest("MD5");
      assertEquals("MD5", messageDigest0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      String string0 = digestUtils0.digestAsHex((InputStream) byteArrayInputStream0);
      assertEquals("693e9af84d3dfcc71e640e005bdc5e2e", string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      File file0 = MockFile.createTempFile("[charsetName=", "5edcd3270620e2b363381a8404ab28fa");
      String string0 = digestUtils0.digestAsHex(file0);
      assertEquals("d41d8cd98f00b204e9800998ecf8427e", string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha1Digest();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      byte[] byteArray0 = DigestUtils.digest(messageDigest0, byteBuffer0);
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_224Digest();
      File file0 = MockFile.createTempFile("/Hym#k*;", "/Hym#k*;");
      byte[] byteArray0 = DigestUtils.digest(messageDigest0, file0);
      assertEquals(28, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest((MessageDigest) null, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512Digest();
      MockFile mockFile0 = new MockFile("", "'vJQ;,).dY,wNx");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      try { 
        DigestUtils.updateDigest(messageDigest0, path0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_224Digest();
      MockFile mockFile0 = new MockFile("", "]");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[8];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.APPEND;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest(messageDigest0, path0, openOptionArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // 'APPEND' not allowed
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest((MessageDigest) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_224Digest();
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest(messageDigest0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_256Digest();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
      try { 
        DigestUtils.updateDigest(messageDigest0, (InputStream) pushbackInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      MockFile mockFile0 = new MockFile("E#cH");
      try { 
        DigestUtils.updateDigest((MessageDigest) null, (File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.shaHex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_256Hex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_256((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        DigestUtils.sha512_256((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_224((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_224((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        DigestUtils.sha512((InputStream) mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha384Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha384Hex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha384((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha384((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha256((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha1Hex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha1Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha1((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md5Hex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md5((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md2Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md2Hex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        DigestUtils.md2Hex((InputStream) mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md2((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md2((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        DigestUtils.md2((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.getDigest((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.getDigest("')hW");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: ')hW MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DigestUtils digestUtils0 = new DigestUtils();
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[5];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.WRITE;
      openOptionArray0[3] = (OpenOption) standardOpenOption0;
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex(path0, openOptionArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // 'WRITE' not allowed
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils((MessageDigest) null);
      MockFile mockFile0 = new MockFile("", "(");
      try { 
        digestUtils0.digestAsHex((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        DigestUtils.digest((MessageDigest) null, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_256Digest();
      MockFile mockFile0 = new MockFile("MD2");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[2];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.WRITE;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      // Undeclared exception!
      try { 
        DigestUtils.digest(messageDigest0, path0, openOptionArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // 'WRITE' not allowed
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_256Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      MockFile mockFile0 = new MockFile("SHA3-256");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[5];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.APPEND;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      // Undeclared exception!
      try { 
        digestUtils0.digest(path0, openOptionArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // 'APPEND' not allowed
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      DigestUtils digestUtils0 = null;
      try {
        digestUtils0 = new DigestUtils((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      DigestUtils digestUtils0 = null;
      try {
        digestUtils0 = new DigestUtils("09849bb381a9a4323e5926a342b9b43ae652d2c15b3443cd6e3a339170121766ecf54a7f1758810dce1d3152b6437bd16a600650e206cf316ca411ed0eb0eebc");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: 09849bb381a9a4323e5926a342b9b43ae652d2c15b3443cd6e3a339170121766ecf54a7f1758810dce1d3152b6437bd16a600650e206cf316ca411ed0eb0eebc MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha256Digest();
      File file0 = MockFile.createTempFile("6$G^J|M7A9]/u%LaT_", "6$G^J|M7A9]/u%LaT_", (File) null);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, (InputStream) mockFileInputStream0);
      assertEquals("SHA-256 Message Digest from SUN, <initialized>\n", messageDigest1.toString());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      File file0 = MockFile.createTempFile("D?LM/I|hdEC4u\"x", "D?LM/I|hdEC4u\"x");
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, file0);
      assertEquals("MD5 Message Digest from SUN, <initialized>\n", messageDigest1.toString());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512("SHA-512/224");
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha1Digest();
      MockFile mockFile0 = new MockFile("'vJQ;,).dY,wNx");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest(messageDigest0, path0, openOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512((InputStream) sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      try { 
        DigestUtils.sha384((InputStream) bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      MockFile mockFile0 = new MockFile("4#5:w(JVwCC", "");
      File file0 = MockFile.createTempFile("4#5:w(JVwCC", "", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224((InputStream) mockFileInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_224Digest();
      byte[] byteArray0 = new byte[5];
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, byteArray0);
      assertSame(messageDigest0, messageDigest1);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha384Digest();
      assertEquals("SHA-384 Message Digest from SUN, <initialized>\n", messageDigest0.toString());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = DigestUtils.sha512((InputStream) sequenceInputStream0);
      assertEquals(64, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha("SHA3-256");
      byte[] byteArray1 = DigestUtils.md2(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.getSha3_256Digest();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_256((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      File file0 = MockFile.createTempFile("6$G^J|M7A9]/u%LaT_", "6$G^J|M7A9]/u%LaT_", (File) null);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      byte[] byteArray0 = DigestUtils.sha512_224((InputStream) mockFileInputStream0);
      assertEquals(28, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
      try { 
        DigestUtils.sha1((InputStream) pushbackInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils("SHA-512");
      MockFile mockFile0 = new MockFile("xo&z/Q0r`Nn}+E)h(0");
      try { 
        digestUtils0.digest((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.getSha3_384Digest();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = DigestUtils.sha512_224(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha384("");
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = DigestUtils.sha384(byteArray0);
      assertEquals(48, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = DigestUtils.md5(byteArray0);
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = DigestUtils.sha256((InputStream) byteArrayInputStream0);
      assertEquals(32, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = DigestUtils.sha256(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = DigestUtils.sha1(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha1Hex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_256Digest();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        DigestUtils.digest(messageDigest0, (InputStream) dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha256("org.apache.commons.codec.CharEncoding");
      assertEquals(32, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.getSha3_512Digest();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha1("");
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha("SHA3-256");
      String string0 = DigestUtils.sha1Hex(byteArray0);
      assertEquals("91f49f1fad0e14cba716d37a99436acece522ada", string0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512("[charsetName=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224("org.apache.commons.codec.EncoderException");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      // Undeclared exception!
      try { 
        digestUtils0.digest("n0TW/bty>wTt xto");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        digestUtils0.digest((InputStream) dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_256Digest();
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, "org.apache.commons.codec.EncoderException");
      assertEquals("SHA-512/256 Message Digest from SUN, <in progress>\n", messageDigest1.toString());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = DigestUtils.sha512_256(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.getSha3_224Digest();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("wD{@>6ji]");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "i*R=={|t,z");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("wD{@>6ji]");
      DigestUtils.md5((InputStream) mockFileInputStream0);
      assertEquals((-2), mockFileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512_224("");
      assertEquals(28, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd2Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = digestUtils0.digest(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512Digest();
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      try { 
        DigestUtils.updateDigest(messageDigest0, path0, openOptionArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/9s/n46_h6v14tz3gvv43tjl9mth0000gq/T/Hf0Hf");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      File file0 = MockFile.createTempFile("Hf", "Hf");
      try { 
        DigestUtils.updateDigest(messageDigest0, file0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      boolean boolean0 = DigestUtils.isAvailable("MD5");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      boolean boolean0 = DigestUtils.isAvailable("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      MessageDigest messageDigest0 = DigestUtils.getSha256Digest();
      byte[] byteArray1 = DigestUtils.digest(messageDigest0, byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("wD{@>6ji]");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "i*R=={|t,z");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("wD{@>6ji]");
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384Hex((InputStream) mockFileInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      String string0 = DigestUtils.sha256Hex(byteArray0);
      assertEquals("837885c8f8091aeaeb9ec3c3f85a6ff470a415e610b8ba3e49f9b33c9cf9d619", string0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512Digest();
      // Undeclared exception!
      try { 
        DigestUtils.digest(messageDigest0, (File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224Hex((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512Hex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = DigestUtils.md2Hex((InputStream) sequenceInputStream0);
      assertEquals("8350e5a3e24c153df2275c9f80692773", string0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      String string0 = DigestUtils.md2Hex("Kf>Tko bL;@3J:$d");
      assertEquals("7301d64a1d327c8fe44bc61062bfa50e", string0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      MessageDigest messageDigest0 = DigestUtils.getSha512Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      String string0 = digestUtils0.digestAsHex(byteArray0);
      assertEquals("b6814eb4bf32768b13c7a5dc04f7efb18d5fbb48f561505511567f7ef183a03b776a097aff26f098703766e1c97940c087e3e0a4f6e2ad60646ec9d3218c6aed", string0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256Hex(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      String string0 = DigestUtils.shaHex(byteArray0);
      assertEquals("a770e927c71c77a0a9ba32e12cd7eae07148f0e7", string0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512Hex("9f979f458a4449d99a1d930aab5c22b287a516301eb926ee9426b8f59ac22e0f");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(65);
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      String string0 = DigestUtils.shaHex("m=Q");
      assertEquals("d5af98dc7933b2870a9067eacf6bdbde142ffbf9", string0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256Hex((InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256((InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_224Digest();
      // Undeclared exception!
      try { 
        DigestUtils.digest(messageDigest0, (ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      String string0 = DigestUtils.sha512Hex(byteArray0);
      assertEquals("65faa9d920e0e9cff43fc3f30ab02ba2e8cf6f4643b58f7c1e64583fbec8a268e677b0ec4d54406e748becb53fda210f5d4f39cf2a5014b1ca496b0805182649", string0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      File file0 = MockFile.createTempFile("6$G^J|M7A9]/u%LaT_", "6$G^J|M7A9]/u%LaT_", (File) null);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      String string0 = DigestUtils.sha384Hex((InputStream) mockFileInputStream0);
      assertEquals("38b060a751ac96384cd9327eb1b1e36a21fdb71114be07434c0cc7bf63f6e1da274edebfe76f65fbd51ad2f14898b95b", string0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = DigestUtils.sha512_256Hex((InputStream) byteArrayInputStream0);
      assertEquals("57635d1312569b5a4c4c26fd7b5df0ed403045e9608e9b14eae870588848e4d9", string0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      File file0 = MockFile.createTempFile("6$G^J|M7A9]/u%LaT_", "6$G^J|M7A9]/u%LaT_", (File) null);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      byte[] byteArray0 = DigestUtils.md2((InputStream) mockFileInputStream0);
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha384Hex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384Hex(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      MessageDigest messageDigest0 = digestUtils0.getMessageDigest();
      assertNull(messageDigest0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      File file0 = MockFile.createTempFile("/1l5@Z~", "fba159821a1caaa288b964b91605498ca11d798e089d4dd2368a2957954e0fc332d2412a5f35d54bf0354a9efabe489e");
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_224Hex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      MockFile mockFile0 = new MockFile("/C2SRxLj+", "]{!(uA.n.cK1");
      File file0 = MockFile.createTempFile("]{!(uA.n.cK1", "/C2SRxLj+", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512Hex((InputStream) mockFileInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_256Digest();
      MessageDigest messageDigest1 = DigestUtils.getDigest("", messageDigest0);
      assertEquals("SHA-512/256", messageDigest1.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 650);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224Hex((InputStream) bufferedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512Hex((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      File file0 = MockFile.createTempFile("6$G^J|M7A9]/u%LaT_", "6$G^J|M7A9]/u%LaT_", (File) null);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      String string0 = DigestUtils.md5Hex((InputStream) mockFileInputStream0);
      assertEquals("d41d8cd98f00b204e9800998ecf8427e", string0);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384Hex("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex((InputStream) sequenceInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_256((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      String string0 = DigestUtils.sha512_224Hex(byteArray0);
      assertEquals("763f90c3901fe2da63b6d254307dd5fda19cb8f6e605d32131911ed0", string0);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384((InputStream) sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      String string0 = DigestUtils.md5Hex(byteArray0);
      assertEquals("f1d3ff8443297732862df21dc4e57262", string0);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256Hex("SHA-512/224");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      String string0 = DigestUtils.sha256Hex("38b060a751ac96384cd9327eb1b1e36a21fdb71114be07434c0cc7bf63f6e1da274edebfe76f65fbd51ad2f14898b95b");
      assertEquals("f170a4803c7e3adec5dcaca121063864601c436f0135422acca1d33efb3aa4b9", string0);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224Hex(")2?yZO)CLP#nN+qHb5");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      File file0 = MockFile.createTempFile("6$G^J|M7A9]/u%LaT_", "6$G^J|M7A9]/u%LaT_", (File) null);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      String string0 = DigestUtils.shaHex((InputStream) mockFileInputStream0);
      assertEquals("da39a3ee5e6b4b0d3255bfef95601890afd80709", string0);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      String string0 = DigestUtils.sha512_256Hex("");
      assertEquals("c672b8d1ef56ed28ab87c3622c5114069bdd3ad7b8f9737498d0c01ecef0967a", string0);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      String string0 = DigestUtils.sha512_224Hex("");
      assertEquals("6ed0dd02806fa89e25de060c19d3ac86cabb87d6a0ddd05c333b84f4", string0);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = DigestUtils.sha512_256Hex(byteArray0);
      assertEquals("c672b8d1ef56ed28ab87c3622c5114069bdd3ad7b8f9737498d0c01ecef0967a", string0);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha256Hex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md2("t\"");
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      String string0 = DigestUtils.md2Hex(byteArray0);
      assertEquals("ed14013cd2c469d43fad41914a687780", string0);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      // Undeclared exception!
      try { 
        digestUtils0.digest((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      String string0 = DigestUtils.sha1Hex("");
      assertEquals("da39a3ee5e6b4b0d3255bfef95601890afd80709", string0);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      String string0 = DigestUtils.sha512Hex("MD2");
      assertEquals("09849bb381a9a4323e5926a342b9b43ae652d2c15b3443cd6e3a339170121766ecf54a7f1758810dce1d3152b6437bd16a600650e206cf316ca411ed0eb0eebc", string0);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getShaDigest();
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest(messageDigest0, (ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      String string0 = DigestUtils.md5Hex("");
      assertEquals("d41d8cd98f00b204e9800998ecf8427e", string0);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha256Digest();
      // Undeclared exception!
      try { 
        DigestUtils.digest(messageDigest0, (RandomAccessFile) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      // Undeclared exception!
      try { 
        digestUtils0.digest((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      String string0 = DigestUtils.sha384Hex("");
      assertEquals("38b060a751ac96384cd9327eb1b1e36a21fdb71114be07434c0cc7bf63f6e1da274edebfe76f65fbd51ad2f14898b95b", string0);
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md5((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils("SHA-512");
      String string0 = digestUtils0.digestAsHex("SHA-512");
      assertEquals("33f63bc374f428f597d7f7ba7cc1e21a0b4b44faa727f7c052c5ad0b1aa5303884ea5919a53c0d32b5591f4ded381da16b67f6a2170d81058d7e9bb2ad4a215b", string0);
  }
}
