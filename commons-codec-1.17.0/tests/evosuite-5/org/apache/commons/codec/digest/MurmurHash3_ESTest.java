
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


package org.apache.commons.codec.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.digest.MurmurHash3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MurmurHash3_ESTest extends MurmurHash3_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      long long0 = MurmurHash3.hash64(924626559);
      assertEquals(5511318020978815440L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[6] = (byte)41;
      long long0 = MurmurHash3.hash64(byteArray0);
      assertEquals(4128578373984248596L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-52);
      long long0 = MurmurHash3.hash64(byteArray0);
      assertEquals((-7458347696992427973L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (int) (byte)0, 3782, (-2162));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)127;
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals((-164200331), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte) (-65);
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals(285497110, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte) (-2);
      byteArray0[5] = (byte)11;
      int int0 = MurmurHash3.hash32(byteArray0);
      assertEquals((-406271212), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-47);
      byteArray0[2] = (byte) (-47);
      int int0 = MurmurHash3.hash32(byteArray0);
      assertEquals(2121976103, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = MurmurHash3.hash32("-h,Nr K5u-(#(V");
      assertEquals((-290757065), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("org.apache.commons.codec.digest.MurmurHash3$IncrementalHash32x86");
      assertArrayEquals(new long[] {(-2783179072239552784L), (-3136794773785219624L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-126);
      int int0 = murmurHash3_IncrementalHash32x86_0.finalise(3, 3, byteArray0, (byte) (-31));
      assertEquals(0, murmurHash3_IncrementalHash32x86_0.end());
      assertEquals(1184612428, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-10);
      int int0 = murmurHash3_IncrementalHash32x86_0.finalise(3, 3, byteArray0, (byte) (-31));
      assertEquals(0, murmurHash3_IncrementalHash32x86_0.end());
      assertEquals((-1580541045), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[9];
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 0, (byte)0);
      assertEquals(0, murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)1;
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)1, (byte)1);
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)0, 1);
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 1, 1);
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)1, 1);
      assertEquals((-1470041713), murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)1;
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)0, 1);
      // Undeclared exception!
      try { 
        murmurHash3_IncrementalHash32x86_0.add(byteArray0, 1, 82);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)0, 2219);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      long long0 = MurmurHash3.hash64(byteArray0, (int) (byte)1, (int) (byte)0, (int) (byte)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      long long0 = MurmurHash3.hash64(byteArray0, (int) (byte)0, 0, (int) (byte) (-33));
      assertEquals((-5566334976243213605L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)2;
      long long0 = MurmurHash3.hash64(byteArray0, (int) (byte)0, (int) (byte)2);
      assertEquals((-7598710665394227329L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long long0 = MurmurHash3.hash64((short) (-86));
      assertEquals((-327754298354095635L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      long long0 = MurmurHash3.hash64((long) 628395861);
      assertEquals(7287777026344068995L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      long long0 = MurmurHash3.hash64(12);
      assertEquals((-709071840765723276L), long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)3;
      int int0 = MurmurHash3.hash32x86(byteArray0, (int) (byte)0, 1, (int) (byte)40);
      assertEquals((-149081183), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte) (-122);
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals(2047203118, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = MurmurHash3.hash32(byteArray0, (-1), (int) (byte)0, (int) (byte) (-24));
      assertEquals(1616282554, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int int0 = MurmurHash3.hash32(byteArray0, 0, (-800), (int) (byte)119);
      assertEquals((-1468265541), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = MurmurHash3.hash32(byteArray0, (int) (byte)0, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int int0 = MurmurHash3.hash32(byteArray0, (int) (byte)0, (-1701));
      assertEquals(2097653646, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = MurmurHash3.hash32(byteArray0, 0, (-1364645468));
      assertEquals((-1034716463), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int int0 = MurmurHash3.hash32(byteArray0, (-430675100));
      assertEquals(1618075050, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-1);
      int int0 = MurmurHash3.hash32(byteArray0, 1);
      assertEquals((-1036465288), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = MurmurHash3.hash32("Unprocessed length should be 1, 2, or 3: ");
      assertEquals(1843924902, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = MurmurHash3.hash32(746L, (long) (byte)1, 0);
      assertEquals(1893147367, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = MurmurHash3.hash32((-269L), (-49064778989728563L));
      assertEquals((-774898487), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = MurmurHash3.hash32((-709071840765723276L), 12);
      assertEquals(1980640056, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = MurmurHash3.hash32(1564L);
      assertEquals((-1782960895), int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0, 0, (int) (byte)0, 0);
      assertArrayEquals(new long[] {0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash64((byte[]) null, 4, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (int) (byte)0, (-1501));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1502
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash64((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null, 996, 996, (-445));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null, (-237789309), (-237789309));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null, (-1770));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128x64((byte[]) null, 1075237162, 853, (-4384));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128x64((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        MurmurHash3.hash128(byteArray0, (int) (byte)0, (-862048943), 2607);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -862048944
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (-1501191132), (-1501191132), 9);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1292585031
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (-131), (int) (byte)1, (int) (byte) (-85));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -131
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (int) (byte) (-25), (int) (byte) (-25), (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -51
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, 3, 3, (int) (byte) (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (-1386), (-1386), (int) (byte)43);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2773
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (int) (byte) (-54), (-2947), (int) (byte)102);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3002
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash64((byte[]) null, (-2695), (-1718), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      int int0 = MurmurHash3.hash32x86(byteArray0, (int) (byte)0, 1, (int) (byte)40);
      assertEquals(1862275992, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86(byteArray0, (int) (byte)48, (int) (byte) (-25), 1686);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 22
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86(byteArray0, (-1869), (-498), 2574);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2368
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = MurmurHash3.hash32x86(byteArray0, (int) (byte) (-1), 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86((byte[]) null, 760, 760, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (int) (byte) (-3), (int) (byte) (-3), 2039);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -7
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (int) (byte)13, 2, (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 14
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (-1), (int) (byte) (-37), (int) (byte) (-56));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -39
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int int0 = MurmurHash3.hash32(byteArray0, (int) (byte)0, (int) (byte)0, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (-149081183), (int) (byte)3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -149081184
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      int int0 = MurmurHash3.hash32(4979068215325808786L, 4979068215325808786L, 2);
      assertEquals((-80397765), int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      int int0 = MurmurHash3.hash32((long) (-1347), (-943));
      assertEquals((-1411351682), int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      long long0 = MurmurHash3.hash64(byteArray0, 1, 0, (int) (byte)7);
      assertEquals(8360697188923789789L, long0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        MurmurHash3.hash128x64(byteArray0, (-1), (-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("oI-jD0[tl4!X'#");
      assertArrayEquals(new long[] {979291737852351509L, 7164009495247226851L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("@}BKVme55Wm7`");
      assertArrayEquals(new long[] {840284281159340436L, 5028137285778068270L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("eo3P;-G><XO0");
      assertArrayEquals(new long[] {2040178783974878367L, (-9096965975402140294L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128((byte[]) null, (-677), (-677), (-616));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("Pf36,=E/s0");
      assertArrayEquals(new long[] {(-7844860927040398383L), (-2932357304311830502L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {2945182322382062539L, (-984742418921750958L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("nOC1EV{");
      assertArrayEquals(new long[] {(-4226869823937574278L), 4525638241568454566L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {8735115895426159728L, 5193896931062123826L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("/w|8");
      assertArrayEquals(new long[] {8327788079309259736L, (-4489569373803407173L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      long[] longArray0 = MurmurHash3.hash128(byteArray0, 0, 4, (int) (byte)33);
      assertArrayEquals(new long[] {(-2835628778038573669L), 3715007916056771077L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {3478107235931676136L, 1799588050966717275L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)0, (byte)1);
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)1, (byte)1);
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)0, 1);
      int int0 = murmurHash3_IncrementalHash32x86_0.end();
      assertEquals((-2047822809), int0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)1, (byte)1);
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)0, 1);
      int int0 = murmurHash3_IncrementalHash32x86_0.end();
      assertEquals(821347078, int0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      int int0 = murmurHash3_IncrementalHash32x86_0.finalise(1, (byte)1, byteArray0, (byte)1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)0, 1);
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)0, 1);
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 3, 3);
      assertEquals(760066800, murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)0, (byte) (-2));
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.start((byte) (-19));
      assertEquals((-82958891), murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      int int0 = murmurHash3_IncrementalHash32x86_0.end();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      long long0 = MurmurHash3.hash64((short) (byte)86);
      assertEquals(3810819864255193771L, long0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("pAUu>WK4mtPZmbE&>*Z");
      assertArrayEquals(new long[] {(-4420540126594481069L), 7909344153899703109L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      long long0 = MurmurHash3.hash64(0L);
      assertEquals((-8620514229188030809L), long0);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (int) (byte)34);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {(-2026853825940356636L), (-5807855487305494056L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      long long0 = MurmurHash3.hash64(byteArray0, (int) (byte)0, (int) (byte)2);
      assertEquals(1896840250637076998L, long0);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      int int0 = MurmurHash3.hash32((long) 557450609, (long) (byte) (-49));
      assertEquals(690353911, int0);
  }

  @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      int int0 = MurmurHash3.hash32(0L);
      assertEquals(1754797035, int0);
  }
}
