
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
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream((-1953L), 1L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[19];
      // Undeclared exception!
      try { 
        boundedSeekableByteChannelInputStream0.read(byteArray0, (int) (byte)19, (int) (byte)19);
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
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(257L, 257L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[1];
      int int0 = boundedSeekableByteChannelInputStream0.read(byteArray0, (int) (byte)0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = null;
      try {
        boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream((-1353L), (-794L), (SeekableByteChannel) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid length of stream at offset=-1353, length=-794
         //
         verifyException("org.apache.commons.compress.utils.BoundedArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(1L, 1L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        boundedSeekableByteChannelInputStream0.read(byteArray0, (int) (byte)1, 173);
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
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(257L, 257L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        boundedSeekableByteChannelInputStream0.read(byteArray0, (int) (byte)0, 12);
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
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(1L, 1L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[1];
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
  public void test06()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(475L, 475L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        boundedSeekableByteChannelInputStream0.read(byteArray0, (int) (byte) (-1), (int) (byte)51);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // offset or len are out of bounds
         //
         verifyException("org.apache.commons.compress.utils.BoundedArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream((-1953L), 1L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        boundedSeekableByteChannelInputStream0.read(byteArray0, (int) (byte)19, (int) (byte)19);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // offset or len are out of bounds
         //
         verifyException("org.apache.commons.compress.utils.BoundedArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(0L, 0L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[9];
      int int0 = boundedSeekableByteChannelInputStream0.read(byteArray0, (int) (byte) (-23), (int) (byte)0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(0L, 0L, (SeekableByteChannel) null);
      int int0 = boundedSeekableByteChannelInputStream0.read();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream((-1953L), 1L, (SeekableByteChannel) null);
      byte[] byteArray0 = new byte[7];
      int int0 = boundedSeekableByteChannelInputStream0.read(byteArray0, (int) (byte) (-111), (int) (byte) (-111));
      assertEquals(0, int0);
  }
}
