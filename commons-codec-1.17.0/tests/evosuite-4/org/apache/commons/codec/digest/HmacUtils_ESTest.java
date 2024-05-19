
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
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
import java.util.Enumeration;
import javax.crypto.Mac;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HmacUtils_ESTest extends HmacUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      String string0 = HmacUtils.hmacSha512Hex("?OV^5H#xgaZLI", ",");
      assertEquals("d80ecd341cbe57fd61ac5c22fbb517fdb03ddf59591e29111cd4f275b94c34bf3543ddf71fd7e4daa0af8440a387e05340cd55e6efab796dd4af8feb8931ce9d", string0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[7];
      String string0 = HmacUtils.hmacSha512Hex(byteArray1, byteArray0);
      assertEquals("869b81e40c5d97086fcaed2e14edb49ec5db2e4eb5d015b4639cc51098eaa4a4f2155695f831773ad03c716f6f859482cfbf7d0074d4ec7801921fedd07d253d", string0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("3u![zAZy 3d,du*", "3u![zAZy 3d,du*");
      byte[] byteArray1 = HmacUtils.hmacSha384(byteArray0, byteArray0);
      byte[] byteArray2 = HmacUtils.hmacSha512(byteArray1, byteArray0);
      assertFalse(byteArray2.equals((Object)byteArray1));
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[7];
      String string0 = HmacUtils.hmacSha384Hex(byteArray1, byteArray0);
      assertEquals("40e9e315f5e36f844d62e79756cece38d6b1e6d2b068f8a112375f4265f1de8a389b2ab8fc826d5c689461e15d8073ce", string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha384("Null key", "");
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      byte[] byteArray1 = HmacUtils.hmacSha1(byteArray0, byteArray0);
      byte[] byteArray2 = HmacUtils.hmacSha384(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = HmacUtils.hmacSha384("#t<`_<KW108&2", "#t<`_<KW108&2");
      String string0 = HmacUtils.hmacSha256Hex(byteArray1, byteArray0);
      assertEquals("460283bf48d233b545995d7740a57b3ba3a7e35d9e3bc68556b0ea6dffa0f18d", string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = HmacUtils.hmacSha1Hex("b0becb637469948851f5fff9809254c8f8a9af44", "[charsetName=");
      assertEquals("f7cf4d0e7eb566c5bb828c668e5b0a8f882b1c4f", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      String string0 = HmacUtils.hmacSha1Hex(byteArray0, (byte[]) null);
      assertEquals("fbdb1d1b18aa6c08324b7d64b71fb76370690e1d", string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = HmacUtils.hmacMd5(byteArray0, byteArray0);
      byte[] byteArray2 = HmacUtils.hmacSha1(byteArray1, byteArray0);
      assertNotSame(byteArray1, byteArray2);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = HmacUtils.hmacMd5Hex("Odd number of characters.", "TORiky]il:lyTNj");
      assertEquals("da1dcd9c8c051b5efe854b5ccf93fa8e", string0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      byte[] byteArray1 = HmacUtils.hmacSha1(byteArray0, byteArray0);
      String string0 = HmacUtils.hmacMd5Hex(byteArray0, byteArray1);
      assertEquals("b0c387bf11f74815d0808b719c7f7393", string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = HmacUtils.hmacSha256("L2WHbu4c-K; =7A{", "");
      byte[] byteArray2 = HmacUtils.hmacMd5(byteArray1, byteArray0);
      assertNotSame(byteArray0, byteArray2);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Mac mac0 = HmacUtils.getHmacSha1(byteArray0);
      Mac mac1 = HmacUtils.updateHmac(mac0, byteArray0);
      assertSame(mac1, mac0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Mac mac0 = HmacUtils.getHmacSha1(byteArray0);
      Mac mac1 = HmacUtils.updateHmac(mac0, (String) null);
      assertSame(mac0, mac1);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1412), (byte)0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      byte[] byteArray1 = HmacUtils.hmacSha512(byteArray0, (InputStream) dataInputStream0);
      assertEquals(64, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha512("to[E ,", "Bfgc6#,kT@?<r*s");
      assertEquals(64, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = HmacUtils.hmacSha256Hex(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals("b03883baae7ca7c8aa2fbf979a16339bb52df6f47850fe3e0077cecc9cf2958f", string0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      String string0 = hmacUtils0.hmacHex(byteBuffer0);
      assertEquals("0c09796ae7e1421c4aae24b19d32d2e4d4d9f4b8c70786fb31a9d4cb", string0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Mac mac0 = HmacUtils.getInitializedMac("HmacSHA1", byteArray0);
      assertNotNull(mac0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Mac mac0 = HmacUtils.getHmacSha512(byteArray0);
      assertNotNull(mac0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Mac mac0 = HmacUtils.getHmacMd5(byteArray0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      try { 
        HmacUtils.updateHmac(mac0, (InputStream) bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex((String) null, "HMAC_SHA_224");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512((byte[]) null, (InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512("", "b61a5b5d48dfeadce31a20ab1e0ec634b1f267726640914456b8576fcf81884f");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384Hex((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384Hex(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384Hex("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384(byteArray0, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384((byte[]) null, (InputStream) sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        HmacUtils.hmacSha384(byteArray0, (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex((byte[]) null, (InputStream) bufferedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256(byteArray1, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256("", "bOiFjzFE()A");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256((String) null, "I!LRC_}gN*'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      PipedInputStream pipedInputStream0 = new PipedInputStream(102);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      try { 
        HmacUtils.hmacSha1Hex(byteArray0, (InputStream) dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex("", "HmacMD5");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex((String) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      PipedInputStream pipedInputStream0 = new PipedInputStream(46);
      try { 
        HmacUtils.hmacSha1(byteArray0, (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1((String) null, "[charsetName=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("3u![zAZy 3d,du*", "3u![zAZy 3d,du*");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex((byte[]) null, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null, 3);
      try { 
        HmacUtils.hmacMd5Hex(byteArray0, (InputStream) bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex((String) null, "HMAC_SHA_1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      PipedInputStream pipedInputStream0 = new PipedInputStream((byte)77);
      try { 
        HmacUtils.hmacMd5(byteArray0, (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      HmacUtils hmacUtils0 = new HmacUtils();
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_MD5;
      byte[] byteArray0 = new byte[3];
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex((ByteBuffer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Buffer must not be null
         //
         verifyException("javax.crypto.Mac", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      HmacUtils hmacUtils0 = new HmacUtils("HmacSHA1", byteArray0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        hmacUtils0.hmac(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      // Undeclared exception!
      try { 
        hmacUtils0.hmac((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_MD5;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "5aX_`Z2K");
      // Undeclared exception!
      try { 
        hmacUtils0.hmac((ByteBuffer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Buffer must not be null
         //
         verifyException("javax.crypto.Mac", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      // Undeclared exception!
      try { 
        hmacUtils0.hmac("org.apache.commons.codec.digest.HmacUtils");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "]");
      // Undeclared exception!
      try { 
        hmacUtils0.hmac((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        hmacUtils0.hmac((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_1;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "lJUl3Y)BWEU:TjP\u0007");
      // Undeclared exception!
      try { 
        hmacUtils0.hmac((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_384;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, ":I&0c7[E5S");
      MockFile mockFile0 = new MockFile("1efb680f860feeea6559b8ae482b26948cddb2cb");
      try { 
        hmacUtils0.hmac((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getInitializedMac("x4\"{W_|5N", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha1("+[S-7i(@Izx", "+[S-7i(@Izx");
      // Undeclared exception!
      try { 
        HmacUtils.getInitializedMac("Null key", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: Algorithm Null key not available
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha384((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha256(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha256((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha1((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.getHmacMd5((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_384;
      byte[] byteArray0 = new byte[0];
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils(hmacAlgorithms0, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_MD5;
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils(hmacAlgorithms0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils((String) null, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing argument
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils("org.apache.commons.codec.digest.HmacUtils", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: Algorithm org.apache.commons.codec.digest.HmacUtils not available
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils("_}T\"/8|p;", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "HmacSHA1");
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)7, (byte)27);
      byte[] byteArray1 = hmacUtils0.hmac((InputStream) byteArrayInputStream0);
      assertEquals(28, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_384;
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils(hmacAlgorithms0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      byte[] byteArray0 = new byte[7];
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 378);
      String string0 = hmacUtils0.hmacHex((InputStream) bufferedInputStream0);
      assertEquals("2de080491b029c856a04c1074dd37476f80720a8eb95ebb428c4c412f88d84d5", string0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_384;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, ":I&0c7[E5S");
      byte[] byteArray0 = hmacUtils0.hmac("1efb680f860feeea6559b8ae482b26948cddb2cb");
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_1;
      byte[] byteArray0 = new byte[9];
      Mac mac0 = HmacUtils.getInitializedMac(hmacAlgorithms0, byteArray0);
      assertNotNull(mac0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_1;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "lJUl3Y)BWEU:TjP\u0007");
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = hmacUtils0.hmac(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      String string0 = hmacUtils0.hmacHex(byteArray0);
      assertEquals("b31825742c7dffdfdcea617f81eadcfb55e1f85f3a260abf40f38e6d00472c5a", string0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("3u![zAZy 3d,du*", "3u![zAZy 3d,du*");
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_384;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3325);
      byte[] byteArray1 = hmacUtils0.hmac(byteBuffer0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("3u![zAZy 3d,du*", "3u![zAZy 3d,du*");
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_384;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      String string0 = hmacUtils0.hmacHex("3u![zAZy 3d,du*");
      assertEquals("c475b2ecc32dd6a0ad65167ea490c4fc2f80918b1bcb13944995afb0ee3d5a79272a3da17067808da21e0b88ce9048de", string0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      MockFile mockFile0 = new MockFile("Rq|E&");
      File file0 = MockFile.createTempFile("Rq|E&", "LFH8yl", (File) mockFile0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacMd5("FhIq;.PP&K;q#,K3(D", "ZVB8o)JSWx1WUK");
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_1;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      MockFile mockFile0 = new MockFile("ccfb1571745a4d9aa9760f58ea6564d8", "kJH}:KY");
      File file0 = MockFile.createTempFile("kJH}:KY", "=JN\"QL+B/D", (File) mockFile0);
      byte[] byteArray1 = hmacUtils0.hmac(file0);
      assertEquals(20, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Mac mac0 = HmacUtils.getHmacMd5(byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Mac mac1 = HmacUtils.updateHmac(mac0, (InputStream) byteArrayInputStream0);
      assertSame(mac1, mac0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils("%i%JW5<{", "%i%JW5<{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: Algorithm %i%JW5<{ not available
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray1 = HmacUtils.hmacSha384(byteArray0, (InputStream) sequenceInputStream0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex("", "4%l:)de b4t.)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.updateHmac((Mac) null, "org.apache.commons.codec.digest.HmacUtils");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      boolean boolean0 = HmacUtils.isAvailable("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray1 = HmacUtils.hmacSha256(byteArray0, (InputStream) sequenceInputStream0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha512((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      String string0 = HmacUtils.hmacSha256Hex("X", (String) null);
      assertEquals("0423ef0bf17855e7aa58dd2b5c283c9185528d3b05b50cf5a510d57412f2f31b", string0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        HmacUtils.updateHmac((Mac) null, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("3u![zAZy 3d,du*", "3u![zAZy 3d,du*");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = HmacUtils.hmacSha1(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals(20, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("\"R_-g=\"9cYi", "\"R_-g=\"9cYi");
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0, 3325);
      try { 
        HmacUtils.hmacSha512(byteArray0, (InputStream) bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha1("@-*N@g 8I,h^,_?~o", "");
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray1 = HmacUtils.hmacMd5(byteArray0, (InputStream) sequenceInputStream0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      String string0 = HmacUtils.hmacSha384Hex("\"R_-g=\"9cYi", "3u![zAZy 3d,du*");
      assertEquals("0706287c3d371e5da1277559ae2c52e9e32a5d8bf9097cb8cdc7b4822d7b43a5f02f61e1c8e1614b6d238c81fd421139", string0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      MockFile mockFile0 = new MockFile((String) null, "z14GqYZ7(ducV");
      File file0 = MockFile.createTempFile("5aX_`Z2K", "5aX_`Z2K", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      String string0 = HmacUtils.hmacSha1Hex(byteArray0, (InputStream) dataInputStream0);
      assertEquals("fbdb1d1b18aa6c08324b7d64b71fb76370690e1d", string0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("3u![zAZy 3d,du*", "3u![zAZy 3d,du*");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = HmacUtils.hmacSha384Hex(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals("3c45f3858d8447bf6e9cb1c73f908dbbbd0ad138136ca480085c64b74fb5fb204f9476bcd7c11bed2b2e1a42542ddced", string0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Mac mac0 = HmacUtils.getHmacSha384(byteArray0);
      assertNotNull(mac0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_384;
      boolean boolean0 = HmacUtils.isAvailable(hmacAlgorithms0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, 0, 0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = HmacUtils.hmacSha512Hex(byteArray0, (InputStream) sequenceInputStream0);
      assertEquals("b936cee86c9f87aa5d3c6f2e84cb5a4239a5fe50480a6ec66b70ab5b1f4ac6730c6c515421b327ec1d69402e53dfb49ad7381eb067b338fd7b0cb22247225d47", string0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("3u![zAZy 3d,du*", "3u![zAZy 3d,du*");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = HmacUtils.hmacMd5Hex(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals("6fb8fc5bcffc12ece56d6285e857284c", string0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = HmacUtils.hmacSha256(byteArray0, byteArray0);
      assertEquals(32, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "@-*N@g 8I,h^,_?~o");
      MockFile mockFile0 = new MockFile("");
      try { 
        hmacUtils0.hmacHex((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Mac mac0 = HmacUtils.getHmacSha256(byteArray0);
      assertNotNull(mac0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }
}
