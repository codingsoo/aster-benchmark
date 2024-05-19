
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
import java.io.PushbackInputStream;
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
      MessageDigest messageDigest0 = DigestUtils.getShaDigest();
      byte[] byteArray0 = new byte[4];
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, byteArray0);
      assertEquals("SHA-1", messageDigest1.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = DigestUtils.shaHex("");
      assertEquals("da39a3ee5e6b4b0d3255bfef95601890afd80709", string0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = DigestUtils.sha512_256Hex(byteArray0);
      assertEquals("c672b8d1ef56ed28ab87c3622c5114069bdd3ad7b8f9737498d0c01ecef0967a", string0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      String string0 = DigestUtils.sha512_256Hex((InputStream) pushbackInputStream0);
      assertEquals("0e57ba616ed98b87bb4aa050f6d47526f6c73f303798d1e2267f99f145cb2ec6", string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md2("");
      byte[] byteArray1 = DigestUtils.sha512_256(byteArray0);
      assertEquals(32, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      String string0 = DigestUtils.sha384Hex(byteArray0);
      assertEquals("050aeff9930179851a5f8a658945660bfd9ee55dc24aa3478556b35a5666378a89844f96387f82865887f072af5ac8f8", string0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      String string0 = DigestUtils.sha256Hex(byteArray0);
      assertEquals("96a296d224f285c67bee93c30f8a309157f0daa35dc5b87e410b78630a09cfc7", string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = DigestUtils.sha256Hex("");
      assertEquals("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = DigestUtils.sha1Hex((InputStream) sequenceInputStream0);
      assertEquals("da39a3ee5e6b4b0d3255bfef95601890afd80709", string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1173, 0);
      byte[] byteArray1 = DigestUtils.md5((InputStream) byteArrayInputStream0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, 3836);
      String string0 = DigestUtils.md2Hex((InputStream) byteArrayInputStream0);
      assertEquals("fa4cc98e8b10311a8e247dfa5a04efdd", string0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = DigestUtils.md2((InputStream) sequenceInputStream0);
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_256Digest();
      MessageDigest messageDigest1 = DigestUtils.getDigest("", messageDigest0);
      assertSame(messageDigest0, messageDigest1);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getDigest("MD5");
      assertEquals("MD5 Message Digest from SUN, <initialized>\n", messageDigest0.toString());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils("SHA-1");
      byte[] byteArray0 = new byte[9];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      String string0 = digestUtils0.digestAsHex(byteBuffer0);
      assertEquals("c259e771b237769cb6bce9a5ab734c576a6da3e1", string0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd2Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = digestUtils0.digestAsHex((InputStream) sequenceInputStream0);
      assertEquals("8350e5a3e24c153df2275c9f80692773", string0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd2Digest();
      MockFile mockFile0 = new MockFile("SHA-512/224");
      File file0 = MockFile.createTempFile("I_zPGw-oa%%(i~[!", "Y;,", (File) mockFile0);
      byte[] byteArray0 = DigestUtils.digest(messageDigest0, file0);
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha384Digest();
      MockFile mockFile0 = new MockFile("org.apache.commons.codec.binary.Hex");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[2];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.CREATE_NEW;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      openOptionArray0[1] = (OpenOption) standardOpenOption0;
      try { 
        DigestUtils.updateDigest(messageDigest0, path0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha384Digest();
      MockFile mockFile0 = new MockFile(" at index ", ".ABWqOA");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[9];
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
  public void test019()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest((MessageDigest) null, "rW6xAF2m<g+bsX.");
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
  public void test021()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_224Digest();
      MockFile mockFile0 = new MockFile("C (#6!UiX5", "C (#6!UiX5");
      try { 
        DigestUtils.updateDigest(messageDigest0, (File) mockFile0);
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
        DigestUtils.shaHex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_256Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_256Hex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
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
  public void test026()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      try { 
        DigestUtils.sha512_224((InputStream) bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha384Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)13);
      pushbackInputStream0.close();
      try { 
        DigestUtils.sha384Hex((InputStream) pushbackInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha256((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha1Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha1((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        DigestUtils.sha((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md5Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md2Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md2((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(3);
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
  public void test039()  throws Throwable  {
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
  public void test040()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.getDigest("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException:  MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      MockFile mockFile0 = new MockFile("7YU");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[2];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.APPEND;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex(path0, openOptionArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // 'APPEND' not allowed
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd2Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      MockFile mockFile0 = new MockFile("a\nYh=[", "U23+B06");
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
  public void test043()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils("SHA-1");
      OpenOption[] openOptionArray0 = new OpenOption[3];
      // Undeclared exception!
      try { 
        digestUtils0.digest((Path) null, openOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      File file0 = MockFile.createTempFile("[eqHgr3cA", "SHA-256");
      // Undeclared exception!
      try { 
        digestUtils0.digest(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd2Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      MockFile mockFile0 = new MockFile("SHA3-224");
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
  public void test046()  throws Throwable  {
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
  public void test047()  throws Throwable  {
      DigestUtils digestUtils0 = null;
      try {
        digestUtils0 = new DigestUtils("cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
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
  public void test049()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
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
  public void test050()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = DigestUtils.sha384((InputStream) byteArrayInputStream0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      // Undeclared exception!
      try { 
        digestUtils0.digest(byteBuffer0);
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
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224((InputStream) sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha1Digest();
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest(messageDigest0, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = DigestUtils.sha512((InputStream) sequenceInputStream0);
      assertEquals(64, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha1("org.apache.commons.codec.CharEncoding");
      byte[] byteArray1 = DigestUtils.md2(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
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
  public void test057()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md5("SHA3-256");
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512_256("t5_CL^e)");
      assertEquals(32, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      MockFile mockFile0 = new MockFile("yoWuXb5J@Rfr\u0006?Y", "");
      File file0 = MockFile.createTempFile("yoWuXb5J@Rfr\u0006?Y", "", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      byte[] byteArray0 = DigestUtils.sha1((InputStream) mockFileInputStream0);
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
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
  public void test061()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha384("");
      byte[] byteArray1 = DigestUtils.sha512_224(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
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
  public void test063()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256("ZhsI&OIAH9E}`6%\"w");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha384("");
      byte[] byteArray1 = DigestUtils.sha384(byteArray0);
      assertEquals(48, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = DigestUtils.sha512(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = DigestUtils.md5(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1533);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 1533);
      try { 
        DigestUtils.sha256((InputStream) pushbackInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = DigestUtils.sha256(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(34);
      try { 
        DigestUtils.sha1Hex((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
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
  public void test071()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md2("");
      byte[] byteArray1 = DigestUtils.sha1(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
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
  public void test073()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      String string0 = DigestUtils.sha1Hex(byteArray0);
      assertEquals("7722745105e9e02e8f1aaf17f7b3aac5c56cd805", string0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512("Y;,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224("SHA3-256");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, byteBuffer0);
      assertSame(messageDigest0, messageDigest1);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        digestUtils0.digest((InputStream) byteArrayInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha384Digest();
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, "d<r|']0Yi_tL");
      assertSame(messageDigest0, messageDigest1);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_256((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
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
  public void test081()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512_224("iD6r}sN-^9x");
      assertEquals(28, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_224Digest();
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
  public void test083()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      try { 
        digestUtils0.digest(path0, openOptionArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/9s/n46_h6v14tz3gvv43tjl9mth0000gq/T/[eqHgr3cA0SHA-256");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "[eqHgr3cA");
      File file0 = MockFile.createTempFile("[eqHgr3cA", "SHA-256");
      // Undeclared exception!
      try { 
        digestUtils0.digest(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      boolean boolean0 = DigestUtils.isAvailable("MD5");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      boolean boolean0 = DigestUtils.isAvailable("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha1Digest();
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        DigestUtils.digest(messageDigest0, path0, (OpenOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      MessageDigest messageDigest0 = DigestUtils.getSha256Digest();
      byte[] byteArray1 = DigestUtils.digest(messageDigest0, byteArray0);
      assertEquals(32, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha256Hex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224Hex(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)13);
      String string0 = DigestUtils.sha512Hex((InputStream) pushbackInputStream0);
      assertEquals("5ea71dc6d0b4f57bf39aadd07c208c35f06cd2bac5fde210397f70de11d439c62ec1cdf3183758865fd387fcea0bada2f6c37a4a17851dd1d78fefe6f204ee54", string0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
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
  public void test093()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha384("");
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
  public void test094()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      String string0 = DigestUtils.shaHex(byteArray0);
      assertEquals("a10909c2cdcaf5adb7e6b092a4faba558b62bd96", string0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512Hex("9a4569d3fbf8f0bd2ffb47c01ef873e39144f803ad90e574c23c0271b2d0fedcf29ee2e40dc3c6117d3d91a3b59f3603");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.shaHex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = DigestUtils.sha512Hex("HJ=82X*}Tb*");
      assertEquals("0e1754cb57d940c98fdc1ffd86d5d7f672319cbecffe1b60a84813518847621b8b846b4d2f13bdf561a86840ee27ecb094450b3deed26f1aa0919889a7faca05", string0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256Hex((InputStream) pipedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256((InputStream) pipedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      String string0 = digestUtils0.digestAsHex("ZBoBnq;$!V");
      assertEquals("1b3e9b162c8ded30d402a90d40fcbf8ea3423697584667e560f57a57433fe0a6c0a056c19ccee02fc8f658498fc9c3d23817c0e27605a13131ed5c4e760af9b6", string0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_256Digest();
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
  public void test102()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      String string0 = DigestUtils.sha512Hex(byteArray0);
      assertEquals("76afca18a9b81ffb967ffcf0460ed221c3605d3820057214d785fa88259bb5cb729576178e6edb0134f645d2e2e92cbabf1333462f3b9058692c950f51c64a92", string0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md5((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      String string0 = DigestUtils.sha384Hex("f60fca2370f6ae385c271eb3b3951239");
      assertEquals("9a4569d3fbf8f0bd2ffb47c01ef873e39144f803ad90e574c23c0271b2d0fedcf29ee2e40dc3c6117d3d91a3b59f3603", string0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), (byte) (-1));
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pushbackInputStream0);
      String string0 = DigestUtils.sha512_224Hex((InputStream) bufferedInputStream0);
      assertEquals("6ed0dd02806fa89e25de060c19d3ac86cabb87d6a0ddd05c333b84f4", string0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512Hex(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha256Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
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
  public void test109()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha384("");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = DigestUtils.sha((InputStream) byteArrayInputStream0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha384Hex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
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
  public void test112()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils("SHA-1");
      MessageDigest messageDigest0 = digestUtils0.getMessageDigest();
      assertEquals("SHA-1", messageDigest0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils("SHA-384");
      File file0 = MockFile.createTempFile("SHA3-512", "SHA3-512");
      String string0 = digestUtils0.digestAsHex(file0);
      assertEquals("38b060a751ac96384cd9327eb1b1e36a21fdb71114be07434c0cc7bf63f6e1da274edebfe76f65fbd51ad2f14898b95b", string0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = DigestUtils.sha512_224((InputStream) byteArrayInputStream0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getDigest("", (MessageDigest) null);
      assertNull(messageDigest0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224Hex((InputStream) sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Y;,");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("Y;,");
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
  public void test118()  throws Throwable  {
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
  public void test119()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      try { 
        DigestUtils.sha512_256Hex((InputStream) dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha256("A9@e+b[");
      String string0 = DigestUtils.sha512_224Hex(byteArray0);
      assertEquals("3789d17858463f782f84ea356574cfbe19c56cd495e1d58f6cffc224", string0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384((InputStream) mockFileInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      String string0 = DigestUtils.md5Hex(byteArray0);
      assertEquals("7319468847d7b1aee40dbf5dd963c999", string0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256Hex((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha("I_zPGw-oa%%(i~[!");
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224Hex("SHA-1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = DigestUtils.shaHex((InputStream) byteArrayInputStream0);
      assertEquals("77ce0377defbd11b77b1f4ad54ca40ea5ef28490", string0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      String string0 = DigestUtils.sha512_256Hex("");
      assertEquals("c672b8d1ef56ed28ab87c3622c5114069bdd3ad7b8f9737498d0c01ecef0967a", string0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      String string0 = DigestUtils.sha512_224Hex("$>UUQluz\"Z Pss#l");
      assertEquals("74320620e6b286f1983eb714846da2544fa24eb0dcfb47320c522eed", string0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384("SHA3-512");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_256Hex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1533);
      try { 
        DigestUtils.sha256Hex((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      String string0 = DigestUtils.md2Hex(".");
      assertEquals("f2f86d6bdd231f23b356f858191b3887", string0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = DigestUtils.md2Hex(byteArray0);
      assertEquals("d0f0946bb28387b056a70ec7e8b67edb", string0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        digestUtils0.digest(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      String string0 = DigestUtils.sha1Hex("b5becd90ed58b1fe2cb6bc9eab97f34ddec60528");
      assertEquals("1bd7b22a33e2cb66139d0e2fdbc30a0623e66db3", string0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512("SHA3-512");
      assertEquals(64, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getShaDigest();
      MockFile mockFile0 = new MockFile("Output array is not large enough to accommodate decoded data.");
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest(messageDigest0, path0, (OpenOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = DigestUtils.sha(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha384("");
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
  public void test141()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      byte[] byteArray0 = new byte[2];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
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
  public void test142()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)13);
      String string0 = DigestUtils.sha384Hex((InputStream) pushbackInputStream0);
      assertEquals("1dd6f7b457ad880d840d41c961283bab688e94e4b59359ea45686581e90feccea3c624b1226113f824f315eb60ae0a7c", string0);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      String string0 = DigestUtils.md5Hex("[eqHgr3cA");
      assertEquals("f28cd66272b78ef115afd4d4cddb6176", string0);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils("SHA-384");
      byte[] byteArray0 = digestUtils0.digest("SHA-384");
      assertEquals(48, byteArray0.length);
  }
}
