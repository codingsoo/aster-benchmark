
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
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SeekableByteChannel;
import org.apache.commons.compress.utils.SeekableInMemoryByteChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SeekableInMemoryByteChannel_ESTest extends SeekableInMemoryByteChannel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(0);
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.truncate(2147483647L);
      assertEquals(0L, seekableByteChannel0.position());
      assertEquals(0L, seekableByteChannel0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1073741823);
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(1073741823, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      byte[] byteArray0 = new byte[5];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      seekableInMemoryByteChannel0.position(475L);
      assertEquals(475L, seekableInMemoryByteChannel0.position());
      
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertEquals(0, int0);
      assertEquals(5L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      seekableInMemoryByteChannel0.close();
      seekableInMemoryByteChannel0.truncate(0L);
      assertFalse(seekableInMemoryByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      long long0 = seekableInMemoryByteChannel0.size();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, (int) (byte)0, (int) (byte)0);
      byteBuffer0.compact();
      byteBuffer0.put(byteArray0);
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      seekableInMemoryByteChannel0.position(475L);
      long long0 = seekableInMemoryByteChannel0.position();
      assertEquals(475L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      byte[] byteArray0 = seekableInMemoryByteChannel0.array();
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      // Undeclared exception!
      try { 
        seekableInMemoryByteChannel0.write((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      seekableInMemoryByteChannel0.close();
      try { 
        seekableInMemoryByteChannel0.read(byteBuffer0);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      // Undeclared exception!
      try { 
        seekableInMemoryByteChannel0.read((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      seekableInMemoryByteChannel0.close();
      try { 
        seekableInMemoryByteChannel0.position(1L);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = null;
      try {
        seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = null;
      try {
        seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel((-1042));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      seekableInMemoryByteChannel0.close();
      boolean boolean0 = seekableInMemoryByteChannel0.isOpen();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      boolean boolean0 = seekableInMemoryByteChannel0.isOpen();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(1015);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1015);
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertEquals(1015, byteBuffer0.position());
      assertEquals(1015, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      byte[] byteArray0 = new byte[8];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      seekableInMemoryByteChannel0.write(byteBuffer0);
      seekableInMemoryByteChannel0.truncate(1L);
      assertEquals(1L, seekableInMemoryByteChannel0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(1015);
      // Undeclared exception!
      try { 
        seekableInMemoryByteChannel0.truncate((-443L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Size has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      byte[] byteArray0 = new byte[8];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      seekableInMemoryByteChannel0.write(byteBuffer0);
      ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect((byte)1);
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer1);
      assertEquals(9L, seekableInMemoryByteChannel0.position());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(1);
      byte[] byteArray0 = new byte[6];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals(1, byteBuffer0.position());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      byte[] byteArray0 = new byte[8];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      try { 
        seekableInMemoryByteChannel0.position(2147483654L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Position has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      try { 
        seekableInMemoryByteChannel0.position((long) (-1));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Position has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.position((long) (byte)0);
      assertEquals(0L, seekableByteChannel0.position());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      byte[] byteArray1 = seekableInMemoryByteChannel0.array();
      assertSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(1015);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1015);
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals(0, byteBuffer0.remaining());
      assertEquals(1015, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      long long0 = seekableInMemoryByteChannel0.size();
      assertEquals(4L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      seekableInMemoryByteChannel0.close();
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      try { 
        seekableInMemoryByteChannel0.write(byteBuffer0);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      long long0 = seekableInMemoryByteChannel0.position();
      assertEquals(0L, long0);
  }
}
