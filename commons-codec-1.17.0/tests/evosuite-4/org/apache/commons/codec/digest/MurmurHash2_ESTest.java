
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
import org.apache.commons.codec.digest.MurmurHash2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MurmurHash2_ESTest extends MurmurHash2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, 1967);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      long long0 = MurmurHash2.hash64(byteArray0, (int) (byte)0, (-1));
      assertEquals((-7697423613289350095L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      long long0 = MurmurHash2.hash64(byteArray0, (int) (byte) (-40));
      assertEquals(6235472693352398111L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long long0 = MurmurHash2.hash64("SLC3w_L.h\".P;B8_", (int) (byte)0, 8);
      assertEquals(1210535748595722863L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long long0 = MurmurHash2.hash64("l&!/]/`qe@T", 0, 0);
      assertEquals((-7207201254813729732L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = MurmurHash2.hash32(byteArray0, 0, (-325578150));
      assertEquals(1836903258, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = MurmurHash2.hash32(byteArray0, (-1756908916));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int int0 = MurmurHash2.hash32(byteArray0, (-2288));
      assertEquals((-554993309), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = MurmurHash2.hash32("o6E1A![mjzuA/X$", 0, 6);
      assertEquals((-640948116), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash64((byte[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash64((String) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash64((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash32((byte[]) null, 1045);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        MurmurHash2.hash32(byteArray0, (int) (byte)16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash32("n}UO}J,gQPzBu7TJ2", 3302, 4482);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash32((String) null, (-1716), (-1716));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash32((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      long long0 = MurmurHash2.hash64(byteArray0, 5, 306);
      assertEquals(7106335683340842512L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      long long0 = MurmurHash2.hash64(byteArray0, (int) (byte)2, 3302);
      assertEquals(4696629696184164727L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, (-1042), (int) (byte)90);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1043
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, (-6141), 726);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -6142
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash64((byte[]) null, (-887), 1149);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, (-452), (int) (byte)31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -453
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, (int) (byte) (-1), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, 13, 275646681);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      long long0 = MurmurHash2.hash64(byteArray0, 0, (int) (byte)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int int0 = MurmurHash2.hash32(byteArray0, 1, 0);
      assertEquals((-380735811), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        MurmurHash2.hash32(byteArray0, (-1902414998), (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1902414999
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        MurmurHash2.hash32(byteArray0, (-554993309), (int) (byte)66);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -554993310
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = MurmurHash2.hash32(byteArray0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash32((byte[]) null, 552193225, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = MurmurHash2.hash32((byte[]) null, 0);
      assertEquals(275646681, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      long long0 = MurmurHash2.hash64((byte[]) null, 0);
      assertEquals((-7207201254813729732L), long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      long long0 = MurmurHash2.hash64("4acxA?UWTd_9Tp");
      assertEquals(5042265541529743518L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      long long0 = MurmurHash2.hash64("V");
      assertEquals((-8117382115935757430L), long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = MurmurHash2.hash32("4acxA?UWTd_9Tp");
      assertEquals(487731413, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = MurmurHash2.hash32("3+Du");
      assertEquals((-1819674795), int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = MurmurHash2.hash32("o6E1A![mjzuA/X$", 0, 0);
      assertEquals(275646681, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash64("o6E1A![mjzuA/X$", 275646681, 275646681);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = MurmurHash2.hash32("o6E1A![mjzuA/X$");
      assertEquals(552193225, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      long long0 = MurmurHash2.hash64("o6E1A![mjzuA/X$");
      assertEquals((-1398244590419364006L), long0);
  }
}
