
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
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base64InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base64InputStream_ESTest extends Base64InputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Base64InputStream base64InputStream0 = new Base64InputStream(pipedInputStream0, false);
      assertFalse(base64InputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      byte[] byteArray0 = new byte[3];
      Base64InputStream base64InputStream0 = new Base64InputStream(pipedInputStream0, false, 0, byteArray0);
      assertEquals(1, base64InputStream0.available());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 1361);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)95;
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64InputStream base64InputStream0 = null;
      try {
        base64InputStream0 = new Base64InputStream(bufferedInputStream0, true, (-1264), byteArray0, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [_\u0000\u0000\u0000\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte)71;
      Base64InputStream base64InputStream0 = null;
      try {
        base64InputStream0 = new Base64InputStream(pipedInputStream0, false, (-58), byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [\u0000\u0000\u0000\u0000\u0000G\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      byte[] byteArray0 = new byte[3];
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base64InputStream base64InputStream0 = new Base64InputStream(pipedInputStream0, true, (byte)0, byteArray0, codecPolicy0);
      assertFalse(base64InputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 1169);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      Base64InputStream base64InputStream0 = new Base64InputStream(dataInputStream0);
      assertFalse(base64InputStream0.isStrictDecoding());
  }
}
