
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
import java.nio.channels.SeekableByteChannel;
import org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BoundedArchiveInputStream_ESTest extends BoundedArchiveInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(2480L, 2480L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        boundedSeekableByteChannelInputStream0.read(byteArray0, 7, 633);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // offset or len are out of bounds
         //
         verifyException("org.apache.commons.compress.utils.BoundedArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(2479L, 2479L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[8];
      int int0 = boundedSeekableByteChannelInputStream0.read(byteArray0, (int) (byte)83, (int) (byte) (-44));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = null;
      try {
        boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(148L, (-692L), (SeekableByteChannel) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid length of stream at offset=148, length=-692
         //
         verifyException("org.apache.commons.compress.utils.BoundedArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(2949L, 2949L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        boundedSeekableByteChannelInputStream0.read(byteArray0, 0, (int) (byte)3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(1724L, 1724L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        boundedSeekableByteChannelInputStream0.read(byteArray0, 219, 219);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // offset or len are out of bounds
         //
         verifyException("org.apache.commons.compress.utils.BoundedArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(2479L, 2479L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        boundedSeekableByteChannelInputStream0.read(byteArray0, (int) (byte) (-44), 633);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // offset or len are out of bounds
         //
         verifyException("org.apache.commons.compress.utils.BoundedArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(606L, 606L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        boundedSeekableByteChannelInputStream0.read(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(0L, 0L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[4];
      int int0 = boundedSeekableByteChannelInputStream0.read(byteArray0, 3015, (int) (byte)0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream((-346L), 1L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[2];
      int int0 = boundedSeekableByteChannelInputStream0.read(byteArray0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(1L, 1L, (SeekableByteChannel) null);
      // Undeclared exception!
      try { 
        boundedSeekableByteChannelInputStream0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(0L, 0L, (SeekableByteChannel) null);
      int int0 = boundedSeekableByteChannelInputStream0.read();
      assertEquals((-1), int0);
  }
}
