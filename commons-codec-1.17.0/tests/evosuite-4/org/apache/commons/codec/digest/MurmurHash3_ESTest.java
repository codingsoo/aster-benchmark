
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
      long long0 = MurmurHash3.hash64((short)3651);
      assertEquals(2002694588455599426L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = MurmurHash3.hash64((-1887L));
      assertEquals(1867308975189504607L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[6] = (byte)8;
      long long0 = MurmurHash3.hash64(byteArray0);
      assertEquals((-3442905881306250676L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-31);
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (int) (byte)0, 1885, (int) (byte) (-96));
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
      byteArray0[0] = (byte) (-117);
      byteArray0[1] = (byte) (-117);
      int int0 = MurmurHash3.hash32(byteArray0);
      assertEquals(1061530945, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-117);
      byteArray0[2] = (byte) (-117);
      int int0 = MurmurHash3.hash32(byteArray0);
      assertEquals(344939046, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[14];
      byteArray0[0] = (byte)44;
      int int0 = murmurHash3_IncrementalHash32x86_0.finalise(1, 1, byteArray0, 1);
      assertEquals(225728081, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      // Undeclared exception!
      try { 
        murmurHash3_IncrementalHash32x86_0.add(byteArray0, (-2616), 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[14];
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (-1), (-4723));
      assertEquals(0, murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-121);
      long long0 = MurmurHash3.hash64(byteArray0, (int) (byte)1, (int) (byte)1, 0);
      assertEquals(5979409155272964609L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long long0 = MurmurHash3.hash64((byte[]) null, 0, 0, 1607);
      assertEquals((-5238323131481559256L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      long long0 = MurmurHash3.hash64(byteArray0, 33, (int) (byte) (-120));
      assertEquals((-855106080267946875L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      long long0 = MurmurHash3.hash64((short)1);
      assertEquals((-3032679231428807052L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      long long0 = MurmurHash3.hash64(0L);
      assertEquals((-8620514229188030809L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      long long0 = MurmurHash3.hash64(461845907);
      assertEquals((-2652936652257239277L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int int0 = MurmurHash3.hash32x86(byteArray0, 14, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = MurmurHash3.hash32x86(byteArray0, 0, (-1232448288), (int) (byte)49);
      assertEquals((-2008658516), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-33);
      byteArray0[1] = (byte) (-71);
      byteArray0[2] = (byte)59;
      byteArray0[3] = (byte)75;
      byteArray0[5] = (byte)75;
      byteArray0[6] = (byte) (-1);
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals(1369811720, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = MurmurHash3.hash32(byteArray0, (int) (byte)0, (-1400), 1);
      assertEquals(1982020390, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = MurmurHash3.hash32(byteArray0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = MurmurHash3.hash32((byte[]) null, 0, (-1));
      assertEquals((-2114883783), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int int0 = MurmurHash3.hash32(byteArray0, (int) (byte)1);
      assertEquals(500407381, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = MurmurHash3.hash32(byteArray0, (int) (byte)0);
      assertEquals((-965378730), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = MurmurHash3.hash32("0njYf0");
      assertEquals((-860557512), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = MurmurHash3.hash32(0L, 0L, 0);
      assertEquals((-2127245832), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = MurmurHash3.hash32((-81L), 966L);
      assertEquals((-582996612), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = MurmurHash3.hash32(1L, 0);
      assertEquals(1759100286, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = MurmurHash3.hash32(0L);
      assertEquals(1754797035, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0, (int) (byte)0, (int) (byte)0, (int) (byte)0);
      assertArrayEquals(new long[] {0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (-1484), 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1483
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86((byte[]) null, (-348), 246, 246);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null, 4184, 4184);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (int) (byte) (-18), (int) (byte)10);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -19
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null, 535);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
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
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128x64((byte[]) null, (-70), (-70), 4);
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
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128((byte[]) null, 0, 1, 336);
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
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (-1), (-1), 459);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, 53, (int) (byte) (-109), 1262);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -57
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (int) (byte) (-106), (int) (byte) (-106), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -213
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, 467, (-1355), (int) (byte) (-80));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -889
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash64((byte[]) null, 1631, (-2030843254), 1631);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86(byteArray0, 0, (-1), (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86(byteArray0, (int) (byte)79, (-1930), (int) (byte)79);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1852
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86(byteArray0, 0, (int) (byte)73, 2163);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = MurmurHash3.hash32(byteArray0, 0, (int) (byte)1, (-1939));
      assertEquals((-1826340180), int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null, 0, (-5009), (-5009));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (-772), (-702), (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1475
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (int) (byte) (-1), (int) (byte)89, 889);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = MurmurHash3.hash32(byteArray0, 0, 1115);
      assertEquals(42545669, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      int int0 = MurmurHash3.hash32(2562L, 2881L, 104729);
      assertEquals(2132763860, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      long long0 = MurmurHash3.hash64(byteArray0, (int) (byte)0, (int) (byte)0, (int) (byte)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, 3027, (-1308), (-783));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1718
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      long long0 = MurmurHash3.hash64(byteArray0);
      assertEquals(1187580377513868106L, long0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      long long0 = MurmurHash3.hash64(byteArray0, (int) (byte)0, 2);
      assertEquals(1896840250637076998L, long0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int int0 = MurmurHash3.hash32x86(byteArray0, 0, 0, 1);
      assertEquals(1364076727, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals((-229235619), int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86(byteArray0, 1542, 1, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1542
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int int0 = MurmurHash3.hash32(byteArray0, (-124), (-124), (-124));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = MurmurHash3.hash32(byteArray0);
      assertEquals(635985630, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      long[] longArray0 = MurmurHash3.hash128(byteArray0, (-1), (int) (byte)0, (int) (byte) (-128));
      assertArrayEquals(new long[] {4401935399273608478L, 7669902723578809638L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("lbqO'*&//!NG7?>");
      assertArrayEquals(new long[] {7109283339322901429L, 1810199238356354353L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {(-3000820830465498359L), (-9001794993049765007L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        MurmurHash3.hash128(byteArray0, (int) (byte)11, 12, (int) (byte)55);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 22
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("o#g.apayhe.commons.codec.digest.MurmurHash3");
      assertArrayEquals(new long[] {(-3159078440125078277L), 2151695842022511951L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        MurmurHash3.hash128x64(byteArray0, (int) (byte)0, (int) (byte) (-38), 2008);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -39
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("]~}J7)Jje");
      assertArrayEquals(new long[] {(-7985936468966013576L), 4753990587842463724L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {9027482631457916009L, 8186123583793453213L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {4486029925370145800L, 4555443921775884483L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {(-3485513579396041028L), 6383328099726337777L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {(-8134343811225465012L), 4068162993924431541L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {3478107235931676136L, 1799588050966717275L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[14];
      int int0 = murmurHash3_IncrementalHash32x86_0.finalise(1, 1, byteArray0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)0, 5);
      assertEquals(760066800, murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[3];
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 748, (byte)0);
      assertEquals(0, murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.start((byte)75);
      assertEquals(1531168180, murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[4];
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 1, 1);
      // Undeclared exception!
      try { 
        murmurHash3_IncrementalHash32x86_0.add(byteArray0, 1, 31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      int int0 = murmurHash3_IncrementalHash32x86_0.end();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("org.apache.commons.codec.digest.MurmurHash3$IncrementalHash32");
      assertArrayEquals(new long[] {(-742232871320251871L), 3514328791191277926L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      int int0 = MurmurHash3.hash32("org.apache.commons.codec.digest.MurmurHash3");
      assertEquals(794771396, int0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {(-6740669540557935164L), 6418926938960070244L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (int) (byte)63);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      long long0 = MurmurHash3.hash64((-1047));
      assertEquals(3805947825141395223L, long0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {(-863911184844273265L), 3307197894665247746L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash64((byte[]) null, (-277569433), (-1323));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      int int0 = MurmurHash3.hash32((long) (byte)0, (-1L));
      assertEquals(1920356946, int0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      int int0 = MurmurHash3.hash32((-49064778989728572L));
      assertEquals((-1707623145), int0);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      int int0 = MurmurHash3.hash32((-1225L), (-1676));
      assertEquals((-2126570011), int0);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int int0 = MurmurHash3.hash32(byteArray0);
      assertEquals((-1424967105), int0);
  }
}
