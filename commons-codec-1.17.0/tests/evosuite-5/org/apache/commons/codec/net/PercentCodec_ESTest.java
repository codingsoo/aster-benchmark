
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


package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.net.PercentCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PercentCodec_ESTest extends PercentCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)43;
      PercentCodec percentCodec0 = new PercentCodec(byteArray0, false);
      byte[] byteArray1 = percentCodec0.encode(byteArray0);
      assertArrayEquals(new byte[] {(byte)37, (byte)48, (byte)48, (byte)37, (byte)50, (byte)66}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      PercentCodec percentCodec0 = new PercentCodec(byteArray0, true);
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte)39;
      byteArray1[4] = (byte)43;
      byte[] byteArray2 = percentCodec0.decode(byteArray1);
      byte[] byteArray3 = percentCodec0.encode(byteArray2);
      assertArrayEquals(new byte[] {(byte)39, (byte)0, (byte)0, (byte)0, (byte)43, (byte)0}, byteArray3);
      assertEquals(6, byteArray3.length);
      assertArrayEquals(new byte[] {(byte)39, (byte)0, (byte)0, (byte)0, (byte)32, (byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      PercentCodec percentCodec0 = new PercentCodec(byteArray0, true);
      byte[] byteArray1 = new byte[6];
      byteArray1[1] = (byte)101;
      byte[] byteArray2 = percentCodec0.decode(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)101, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      PercentCodec percentCodec0 = new PercentCodec(byteArray0, false);
      byte[] byteArray1 = percentCodec0.encode(byteArray0);
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      PercentCodec percentCodec0 = new PercentCodec(byteArray0, true);
      byte[] byteArray1 = percentCodec0.decode(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PercentCodec percentCodec0 = new PercentCodec();
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)37;
      try { 
        percentCodec0.decode(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid percent decoding: 
         //
         verifyException("org.apache.commons.codec.net.PercentCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[24];
      byteArray0[4] = (byte) (-13);
      PercentCodec percentCodec0 = null;
      try {
        percentCodec0 = new PercentCodec(byteArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byte must be >= 0
         //
         verifyException("org.apache.commons.codec.net.PercentCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      PercentCodec percentCodec0 = new PercentCodec(byteArray0, true);
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte)39;
      byte[] byteArray2 = percentCodec0.encode(byteArray1);
      assertSame(byteArray2, byteArray1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      PercentCodec percentCodec0 = new PercentCodec(byteArray0, true);
      Object object0 = percentCodec0.encode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PercentCodec percentCodec0 = new PercentCodec((byte[]) null, true);
      Object object0 = new Object();
      try { 
        percentCodec0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type java.lang.Object cannot be Percent encoded
         //
         verifyException("org.apache.commons.codec.net.PercentCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PercentCodec percentCodec0 = new PercentCodec();
      byte[] byteArray0 = percentCodec0.encode((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      PercentCodec percentCodec0 = new PercentCodec(byteArray0, true);
      Object object0 = percentCodec0.decode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PercentCodec percentCodec0 = new PercentCodec();
      try { 
        percentCodec0.decode((Object) percentCodec0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type org.apache.commons.codec.net.PercentCodec cannot be Percent decoded
         //
         verifyException("org.apache.commons.codec.net.PercentCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      PercentCodec percentCodec0 = new PercentCodec(byteArray0, false);
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte)3;
      byte[] byteArray2 = percentCodec0.encode(byteArray1);
      assertEquals(25, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PercentCodec percentCodec0 = new PercentCodec();
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-121);
      byte[] byteArray1 = percentCodec0.encode(byteArray0);
      byte[] byteArray2 = percentCodec0.decode(byteArray1);
      assertEquals(7, byteArray1.length);
      assertNotNull(byteArray2);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-121), (byte)0, (byte)0, (byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PercentCodec percentCodec0 = new PercentCodec((byte[]) null, true);
      byte[] byteArray0 = percentCodec0.decode((byte[]) null);
      assertNull(byteArray0);
  }
}
