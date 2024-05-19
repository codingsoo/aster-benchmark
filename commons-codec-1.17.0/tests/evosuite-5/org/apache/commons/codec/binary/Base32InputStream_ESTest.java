
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
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base32InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base32InputStream_ESTest extends Base32InputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      byte[] byteArray0 = new byte[4];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32InputStream base32InputStream0 = new Base32InputStream(pipedInputStream0, true, (-1), byteArray0, codecPolicy0);
      Base32InputStream base32InputStream1 = new Base32InputStream(base32InputStream0, true);
      assertEquals(1, base32InputStream1.available());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)100;
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32InputStream base32InputStream0 = null;
      try {
        base32InputStream0 = new Base32InputStream(pipedInputStream0, true, 1, byteArray0, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [d]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)97;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)11, (-1966));
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      Base32InputStream base32InputStream0 = null;
      try {
        base32InputStream0 = new Base32InputStream(pushbackInputStream0, true, (byte)11, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [a\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      byte[] byteArray0 = new byte[4];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32InputStream base32InputStream0 = new Base32InputStream(pipedInputStream0, true, (-1), byteArray0, codecPolicy0);
      Base32InputStream base32InputStream1 = new Base32InputStream(base32InputStream0, true, (byte)2, byteArray0);
      assertFalse(base32InputStream1.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Base32InputStream base32InputStream0 = new Base32InputStream(pipedInputStream0);
      assertFalse(base32InputStream0.isStrictDecoding());
  }
}
