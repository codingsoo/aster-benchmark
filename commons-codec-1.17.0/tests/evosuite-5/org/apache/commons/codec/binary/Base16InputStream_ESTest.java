
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
import java.io.InputStream;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base16InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base16InputStream_ESTest extends Base16InputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Base16InputStream base16InputStream0 = new Base16InputStream((InputStream) null);
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16InputStream base16InputStream1 = new Base16InputStream(base16InputStream0, false, false, codecPolicy0);
      assertEquals(1, base16InputStream1.available());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Base16InputStream base16InputStream0 = new Base16InputStream((InputStream) null, false, false);
      assertEquals(1, base16InputStream0.available());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Base16InputStream base16InputStream0 = new Base16InputStream((InputStream) null);
      Base16InputStream base16InputStream1 = new Base16InputStream(base16InputStream0, true);
      assertFalse(base16InputStream1.equals((Object)base16InputStream0));
  }
}
