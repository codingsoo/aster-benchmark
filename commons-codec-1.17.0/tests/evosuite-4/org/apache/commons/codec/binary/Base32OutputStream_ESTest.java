
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
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base32OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base32OutputStream_ESTest extends Base32OutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Base32OutputStream base32OutputStream0 = new Base32OutputStream((OutputStream) null, false);
      assertFalse(base32OutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte)89;
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32OutputStream base32OutputStream0 = null;
      try {
        base32OutputStream0 = new Base32OutputStream(byteArrayOutputStream0, false, 36, byteArray0, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0000\u0000\u0000\u0000Y]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("j|2]y!bpu");
      byte[] byteArray0 = new byte[1];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32OutputStream base32OutputStream0 = new Base32OutputStream(mockFileOutputStream0, false, (-1), byteArray0, codecPolicy0);
      Base32OutputStream base32OutputStream1 = new Base32OutputStream(base32OutputStream0, false, (-3468), byteArray0);
      assertFalse(base32OutputStream1.equals((Object)base32OutputStream0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("j|2]y!bpu");
      byte[] byteArray0 = new byte[1];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32OutputStream base32OutputStream0 = new Base32OutputStream(mockFileOutputStream0, false, (-1), byteArray0, codecPolicy0);
      Base32OutputStream base32OutputStream1 = new Base32OutputStream(base32OutputStream0);
      assertFalse(base32OutputStream1.equals((Object)base32OutputStream0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      Base32OutputStream base32OutputStream0 = null;
      try {
        base32OutputStream0 = new Base32OutputStream(filterOutputStream0, true, 340, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineLength 340 > 0, but lineSeparator is null
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }
}
