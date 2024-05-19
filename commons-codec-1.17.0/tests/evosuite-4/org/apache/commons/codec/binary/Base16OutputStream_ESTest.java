
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
import java.io.ByteArrayOutputStream;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base16OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base16OutputStream_ESTest extends Base16OutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      Base16OutputStream base16OutputStream0 = new Base16OutputStream(byteArrayOutputStream0, false, false);
      assertFalse(base16OutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base16OutputStream base16OutputStream0 = new Base16OutputStream(byteArrayOutputStream0, false, false, codecPolicy0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(base16OutputStream0, false);
      Base16OutputStream base16OutputStream1 = new Base16OutputStream(mockPrintStream0, false);
      assertFalse(base16OutputStream1.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base16OutputStream base16OutputStream0 = new Base16OutputStream(byteArrayOutputStream0, false, false, codecPolicy0);
      Base16OutputStream base16OutputStream1 = new Base16OutputStream(base16OutputStream0);
      assertFalse(base16OutputStream1.equals((Object)base16OutputStream0));
  }
}