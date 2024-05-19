
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


package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BoundedSeekableByteChannelInputStream_ESTest extends BoundedSeekableByteChannelInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(0L, 0L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[4];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, 0, 0);
      // Undeclared exception!
      try { 
        boundedSeekableByteChannelInputStream0.read((-1L), byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = null;
      try {
        boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(993L, (-2507L), (SeekableByteChannel) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid length of stream at offset=993, length=-2507
         //
         verifyException("org.apache.commons.compress.utils.BoundedArchiveInputStream", e);
      }
  }
}