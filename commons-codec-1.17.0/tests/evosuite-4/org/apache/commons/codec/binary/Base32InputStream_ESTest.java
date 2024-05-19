
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


package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base32InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base32InputStream_ESTest extends Base32InputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Enumeration<Base32InputStream> enumeration0 = (Enumeration<Base32InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      Base32InputStream base32InputStream0 = new Base32InputStream(bufferedInputStream0, false);
      assertFalse(base32InputStream0.markSupported());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32InputStream base32InputStream0 = new Base32InputStream((InputStream) null, true, 2739, byteArray0, codecPolicy0);
      assertTrue(base32InputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Enumeration<Base32InputStream> enumeration0 = (Enumeration<Base32InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte)61;
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32InputStream base32InputStream0 = null;
      try {
        base32InputStream0 = new Base32InputStream(sequenceInputStream0, false, 61, byteArray0, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0000\u0000\u0000\u0000\u0000\u0000\u0000=]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)74;
      Base32InputStream base32InputStream0 = null;
      try {
        base32InputStream0 = new Base32InputStream((InputStream) null, true, (byte)99, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0000J\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Base32InputStream base32InputStream0 = new Base32InputStream(byteArrayInputStream0);
      Base32InputStream base32InputStream1 = new Base32InputStream(base32InputStream0, false, (-863), byteArray0);
      assertFalse(base32InputStream1.isStrictDecoding());
  }
}
