
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
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PushbackInputStream;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base16InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base16InputStream_ESTest extends Base16InputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-34), 0);
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base16InputStream base16InputStream0 = new Base16InputStream(byteArrayInputStream0, true, true, codecPolicy0);
      assertFalse(base16InputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-34), 0);
      Base16InputStream base16InputStream0 = new Base16InputStream(byteArrayInputStream0, false, true);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(base16InputStream0);
      Base16InputStream base16InputStream1 = new Base16InputStream(bufferedInputStream0);
      assertFalse(base16InputStream1.markSupported());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 512);
      Base16InputStream base16InputStream0 = new Base16InputStream(pushbackInputStream0, true);
      assertFalse(base16InputStream0.markSupported());
  }
}
