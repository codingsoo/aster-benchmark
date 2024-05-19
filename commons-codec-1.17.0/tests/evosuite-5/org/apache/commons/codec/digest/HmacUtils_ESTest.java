
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
import java.util.Enumeration;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HmacUtils_ESTest extends HmacUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = new byte[5];
      String string0 = HmacUtils.hmacSha512Hex(byteArray0, byteArray1);
      assertEquals("c1d673979a16bb6a70861378af69ca8a85061badfe1fab8f6dc237729c90a5156b71919d2515295ea5d33f4b563abb5d7dbd4bf5fd0b982513b57acdf9706f83", string0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha512("CgKQ|J{q", "CgKQ|J{q");
      SecretKeySpec secretKeySpec0 = new SecretKeySpec(byteArray0, 0, 0, "CgKQ|J{q");
      byte[] byteArray1 = secretKeySpec0.getEncoded();
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex(byteArray1, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = HmacUtils.hmacSha512("139ce1f630cbbbcf9636e901b2dc2e74", "139ce1f630cbbbcf9636e901b2dc2e74");
      byte[] byteArray2 = HmacUtils.hmacSha512(byteArray0, byteArray1);
      assertFalse(byteArray2.equals((Object)byteArray1));
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = HmacUtils.hmacSha384Hex("f79b9990cf549e497aa029cfbe7f263a28c1fae6759826c63f0cebf941498dd9", "");
      assertEquals("46cd1242e909fcd91d821c204df74c226c08f3cd4e45e7901245d630b70f27922ade17bbde1791faba6d7a4eea2c4db9", string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = HmacUtils.hmacSha1(byteArray0, byteArray0);
      String string0 = HmacUtils.hmacSha384Hex(byteArray1, byteArray0);
      assertEquals("0da6c82b62fbc4eff9c8172e42f1afd2e1e499ccc49271d0e1b047bb00cc529d9981a6fccf420b32bd47b4307494981a", string0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = HmacUtils.hmacSha1(byteArray0, byteArray0);
      byte[] byteArray2 = HmacUtils.hmacSha384(byteArray0, byteArray1);
      assertFalse(byteArray2.equals((Object)byteArray1));
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = HmacUtils.hmacSha256Hex(".-'1h_8AX~B2r", "0@S:F s");
      assertEquals("0dc7d5a2219fca2cc5c3cb1fbc69990248e1524eaac1efd975089f535736c93f", string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_MD5;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      byte[] byteArray1 = hmacUtils0.hmac(":CB");
      String string0 = HmacUtils.hmacSha256Hex(byteArray0, byteArray1);
      assertEquals("a07c99be54ffb49a86db3f59e50348143a0f72c2bfe16526b1f58974723457a0", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("F*|j,b*c/'HNIi", "6620b31f2924b8c01547745f41825d322336f83ebb13d723678789d554d8a3ef");
      assertEquals(32, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = HmacUtils.hmacSha256(byteArray0, (byte[]) null);
      assertEquals(32, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = HmacUtils.hmacSha1("]|4+}sIqx5", "");
      byte[] byteArray2 = HmacUtils.hmacSha1(byteArray1, byteArray0);
      assertFalse(byteArray2.equals((Object)byteArray1));
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = HmacUtils.hmacMd5(byteArray0, byteArray0);
      byte[] byteArray2 = HmacUtils.hmacMd5(byteArray0, byteArray1);
      assertFalse(byteArray2.equals((Object)byteArray1));
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      boolean boolean0 = HmacUtils.isAvailable("HmacSHA224");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = HmacUtils.hmacSha512Hex(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals("869b81e40c5d97086fcaed2e14edb49ec5db2e4eb5d015b4639cc51098eaa4a4f2155695f831773ad03c716f6f859482cfbf7d0074d4ec7801921fedd07d253d", string0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      byte[] byteArray1 = HmacUtils.hmacSha512(byteArray0, (InputStream) dataInputStream0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = HmacUtils.hmacSha384Hex(byteArray0, (InputStream) sequenceInputStream0);
      assertEquals("6c1f2ee938fad2e24bd91298474382ca218c75db3d83e114b3d4367776d14d3551289e75e8209cd4b792302840234adc", string0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)104, (byte)104);
      String string0 = HmacUtils.hmacSha256Hex(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals("b613679a0814d9ec772f95d778c35fc5ff1697c493715653c6c712144292c5ad", string0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = HmacUtils.hmacSha256(byteArray0, (InputStream) byteArrayInputStream0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = HmacUtils.hmacSha1Hex("/.<fME\u0007u", (String) null);
      assertEquals("b1929a3668e13c29cb47b5fca8deed6a9cfa9e82", string0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray1 = HmacUtils.hmacSha1(byteArray0, (InputStream) sequenceInputStream0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = HmacUtils.hmacMd5Hex(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals("9b0f1ede261efe0a5070928953591a8f", string0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = HmacUtils.hmacMd5(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacMd5("c194497c93515ab72f5fa76b48450b54754ea34d", (String) null);
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha384("Xoi &VK0+Zh#", "Xoi &VK0+Zh#");
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_1;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      String string0 = hmacUtils0.hmacHex(byteArray0);
      assertEquals("5ba909d7de50a47f50c65dc1fe154708bbdcff3f", string0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_512;
      byte[] byteArray0 = new byte[5];
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      String string0 = hmacUtils0.hmacHex("");
      assertEquals("b936cee86c9f87aa5d3c6f2e84cb5a4239a5fe50480a6ec66b70ab5b1f4ac6730c6c515421b327ec1d69402e53dfb49ad7381eb067b338fd7b0cb22247225d47", string0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Mac mac0 = HmacUtils.getHmacSha512(byteArray0);
      assertNotNull(mac0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Mac mac0 = HmacUtils.getHmacSha384(byteArray0);
      assertNotNull(mac0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
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
  public void test028()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.isAvailable((HmacAlgorithms) null);
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
        HmacUtils.isAvailable((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
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
  public void test031()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex(byteArray0, (InputStream) sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex((byte[]) null, (InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      PipedInputStream pipedInputStream0 = new PipedInputStream((byte)11);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      try { 
        HmacUtils.hmacSha512Hex(byteArray0, (InputStream) sequenceInputStream0);
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
        HmacUtils.hmacSha512Hex("", "NULmpbqF@");
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
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex((String) null, (String) null);
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
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512(byteArray1, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
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
  public void test039()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
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
  public void test040()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512((String) null, ".7#6DzGP");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
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
  public void test043()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
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
  public void test044()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha384("3", "org.apache.commons.codec.DecoderException");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2016), 12);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384Hex(byteArray0, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
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
  public void test046()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
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
  public void test048()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384(byteArray0, (InputStream) pipedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384((byte[]) null, (InputStream) mockFileInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      try { 
        HmacUtils.hmacSha384(byteArray0, (InputStream) bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
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
  public void test053()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
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
  public void test055()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex(byteArray0, (InputStream) sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex("", "io0D{Yp3s$Cfl$5");
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
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex((String) null, "OvI{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
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
  public void test059()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-842), 333);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256(byteArray0, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256("", ")p~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256((String) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
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
  public void test064()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex(byteArray0, (InputStream) null);
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
        HmacUtils.hmacSha1Hex("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      try { 
        HmacUtils.hmacSha1(byteArray0, (InputStream) bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
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
  public void test069()  throws Throwable  {
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
  public void test070()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), (-1));
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex(byteArray0, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex((String) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
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
  public void test075()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
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
  public void test076()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5(byteArray0, (InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5((byte[]) null, (InputStream) pushbackInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-35), 4);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5(byteArray0, (InputStream) pushbackInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
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
  public void test080()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate((byte)5);
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
  public void test081()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex((InputStream) sequenceInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_512;
      byte[] byteArray0 = new byte[6];
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      try { 
        hmacUtils0.hmacHex((InputStream) dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha384("3", "o!g.apache.commons6codec.DecoderException");
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      MockFile mockFile0 = new MockFile("3", "ebf405da8af119f063b0fd5499d9af05cfc946606066acec60ad296d6e573dfe1e1e50b77f3d0f531613f2f050d143d824226fda7766c6de2a90ced261684747");
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
  public void test084()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      byte[] byteArray0 = new byte[1];
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
  public void test085()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmac(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      // Undeclared exception!
      try { 
        hmacUtils0.hmac("F6~kmU1R");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      byte[] byteArray0 = new byte[9];
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
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
  public void test088()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "+9C/S^~3G[3N{)");
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
  public void test089()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      MockFile mockFile0 = new MockFile("Odd number of characters.");
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
  public void test090()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getInitializedMac("", byteArray0);
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
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        HmacUtils.getInitializedMac("Zo# m1zEm/?WeW2f", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: Algorithm Zo# m1zEm/?WeW2f not available
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
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
  public void test093()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha384(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
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
  public void test095()  throws Throwable  {
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
  public void test096()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha1(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
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
  public void test098()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getHmacMd5(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
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
  public void test100()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_512;
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
  public void test101()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
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
  public void test102()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_1;
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
  public void test103()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
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
  public void test104()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils("", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: Algorithm  not available
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils("A7Qv[+#p'V-f:6R#", "37aE9B2\f\"m>BWBP");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: Algorithm A7Qv[+#p'V-f:6R# not available
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      byte[] byteArray0 = new byte[5];
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      byte[] byteArray1 = hmacUtils0.hmac((InputStream) sequenceInputStream0);
      assertEquals(32, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmac((InputStream) byteArrayInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_MD5;
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
  public void test109()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      byte[] byteArray0 = new byte[5];
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      String string0 = hmacUtils0.hmacHex((InputStream) sequenceInputStream0);
      assertEquals("b613679a0814d9ec772f95d778c35fc5ff1697c493715653c6c712144292c5ad", string0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, ">LBD:ja]");
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = hmacUtils0.hmac(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      byte[] byteArray0 = new byte[9];
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
  public void test112()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      byte[] byteArray0 = new byte[3];
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, (int) (byte)0, (int) (byte)1);
      byte[] byteArray1 = hmacUtils0.hmac(byteBuffer0);
      assertEquals(28, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex("org.apache.commons.codec.digest.HmacUtils");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("3/f758a92ecd07e7fc83a2a2885f54d7dd8f55a7a042b1fa4a2048d09071e213f32ce0a0c032ded1776349a307803cd8d599448f54880bb9677be7c866709185bf");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "org.apache.commons.codec.DecoderException");
      byte[] byteArray0 = HmacUtils.hmacSha384("3", "org.apache.commons.codec.DecoderException");
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      MockFile mockFile0 = new MockFile("3", "f758a92ecd07e7fc83a2a2885f54d7dd8f55a7a042b1fa4a2048d09071e213f32ce0a0c032ded1776349a307803cd8d599448f54880bb9677be7c866709185bf");
      String string0 = hmacUtils0.hmacHex((File) mockFile0);
      assertEquals("33ec664ea5f40ec4874b4a09a2f92e547491a202619ebee40bbd921d", string0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      File file0 = MockFile.createTempFile("QD{l", "_uE;'5L7k.");
      // Undeclared exception!
      try { 
        hmacUtils0.hmac(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_MD5;
      byte[] byteArray0 = new byte[6];
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      File file0 = MockFile.createTempFile("QD{l", "_uE;'5L7k.");
      byte[] byteArray1 = hmacUtils0.hmac(file0);
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      byte[] byteArray0 = new byte[5];
      Mac mac0 = HmacUtils.getInitializedMac(hmacAlgorithms0, byteArray0);
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Mac mac1 = HmacUtils.updateHmac(mac0, (InputStream) sequenceInputStream0);
      assertSame(mac1, mac0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils("VaV8J", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      String string0 = HmacUtils.hmacSha512Hex("/.<fME\u0007u", "q5wBa^<lDR&Ea");
      assertEquals("93aaa381960cdc4ffbb618c4e359bd463d75b71359db9d8325ca57c72a91b51fc4693429ff8c3d0bfddcbd9c098a1749f41a287d17a719f78fc94dd43240e555", string0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      String string0 = HmacUtils.hmacMd5Hex(byteArray0, byteArray0);
      assertEquals("cbc26d6c1022a9a33b5f5a4c12b99dcd", string0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)104, (byte)104);
      byte[] byteArray1 = HmacUtils.hmacSha384(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals(48, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Mac mac0 = HmacUtils.getHmacSha256(byteArray0);
      Mac mac1 = HmacUtils.updateHmac(mac0, "HMAC_SHA_256");
      assertSame(mac1, mac0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      boolean boolean0 = HmacUtils.isAvailable("x9Ia#>");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        HmacUtils.hmacSha256(byteArray0, (InputStream) mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Mac mac0 = HmacUtils.getHmacSha1(byteArray0);
      assertNotNull(mac0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha512(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha512("CgKQ|J{q", "CgKQ|J{q");
      Mac mac0 = HmacUtils.getHmacSha256(byteArray0);
      Mac mac1 = HmacUtils.updateHmac(mac0, byteArray0);
      assertSame(mac1, mac0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha384("3", "org.apache.commons.codec.DecoderException");
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(dataInputStream0, dataInputStream0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1(byteArray0, (InputStream) sequenceInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = HmacUtils.hmacSha1(byteArray0, byteArray0);
      String string0 = HmacUtils.hmacSha1Hex(byteArray0, byteArray1);
      assertEquals("b91f2ce979dc8dee504bbfc6987ada3445c96c7d", string0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      PipedInputStream pipedInputStream0 = new PipedInputStream((byte)100);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pushbackInputStream0);
      try { 
        HmacUtils.hmacSha512(byteArray0, (InputStream) bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha512("[|v\u0004T?%|T|FZ:U1P4", "");
      String string0 = HmacUtils.hmacSha1Hex(byteArray0, byteArray0);
      assertEquals("606d5131b636fa2068da0aee9a9f0b37682e169b", string0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        HmacUtils.hmacMd5(byteArray0, (InputStream) mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex((byte[]) null, (InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha1("{i@B`qtS_h~+C@(V< ", "org.apache.commons.codec.DecoderException");
      File file0 = MockFile.createTempFile("sc]", "Null key");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0, 2238);
      String string0 = HmacUtils.hmacSha1Hex(byteArray0, (InputStream) bufferedInputStream0);
      assertEquals("c3cf79e53580ddd5c6ba05ac7198e3a7713fa9c4", string0);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      PipedInputStream pipedInputStream0 = new PipedInputStream(1865);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      try { 
        HmacUtils.hmacSha384Hex(byteArray0, (InputStream) bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
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
  public void test138()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      boolean boolean0 = HmacUtils.isAvailable(hmacAlgorithms0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
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
  public void test140()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "+9C/S^~3G[3N{)");
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(2238);
      String string0 = hmacUtils0.hmacHex(byteBuffer0);
      assertEquals("d218beb9d40e699690140d680915e5e2cf15818d93397719786150d4ecae4396", string0);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1611), 1);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex(byteArray0, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha512("[|v\u0004T?%|T|FZ:U1P4", "");
      PipedInputStream pipedInputStream0 = new PipedInputStream(849);
      try { 
        HmacUtils.hmacMd5Hex(byteArray0, (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
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
  public void test144()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
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
  public void test146()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = HmacUtils.hmacSha512(byteArray0, byteArray0);
      String string0 = HmacUtils.hmacMd5Hex(byteArray1, byteArray0);
      assertEquals("ffcb452bf60f61f2a96d2faa4f64e7e0", string0);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Mac mac0 = HmacUtils.getHmacMd5(byteArray0);
      assertNotNull(mac0);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      String string0 = HmacUtils.hmacMd5Hex("${ta+2|,o=3=m;B", "");
      assertEquals("f3664816919926ee7a10214c5fe30ead", string0);
  }
}
