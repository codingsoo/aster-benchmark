
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
      // Undeclared exception!
      try { 
        MurmurHash2.hash32("D(uvo9z/6_S)$Wf", 0, 1502);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      long long0 = MurmurHash2.hash64(byteArray0, (int) (byte) (-72));
      assertEquals(3885425137352274587L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      long long0 = MurmurHash2.hash64((byte[]) null, 0);
      assertEquals((-7207201254813729732L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long long0 = MurmurHash2.hash64("D(uvo9z/6_S)$Wf");
      assertEquals((-8426266127428543653L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int int0 = MurmurHash2.hash32(byteArray0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int int0 = MurmurHash2.hash32(byteArray0, 1, (-3491));
      assertEquals(1777097523, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = MurmurHash2.hash32(byteArray0, (-1756908916));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int int0 = MurmurHash2.hash32(byteArray0, (int) (byte)1);
      assertEquals(375494588, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)101;
      int int0 = MurmurHash2.hash32(byteArray0, 1);
      assertEquals((-967466694), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash64((byte[]) null, 5446);
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
        MurmurHash2.hash64("t-rq\"F>j{kkaH", 6, 341);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash64((String) null, 776, 776);
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
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash32((byte[]) null, 275646681, (-1493));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        MurmurHash2.hash32(byteArray0, (-2605));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2606
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash32((String) null, (-246), (-246));
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
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, (-1582), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1583
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      long long0 = MurmurHash2.hash64(byteArray0, 0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      long long0 = MurmurHash2.hash64(byteArray0, (int) (byte)6, (-2790));
      assertEquals(1677984130104104145L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, (-61), 125);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -62
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      long long0 = MurmurHash2.hash64(byteArray0, 1, (int) (byte) (-36));
      assertEquals((-7930023001527390879L), long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, (-273), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -274
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, (int) (byte)110, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        MurmurHash2.hash32(byteArray0, (int) (byte) (-79), 2336);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -80
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        MurmurHash2.hash32(byteArray0, (int) (byte)2, 13);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        MurmurHash2.hash32(byteArray0, (-1), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = MurmurHash2.hash32(byteArray0, 0, (-1));
      assertEquals((-1285986640), int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        MurmurHash2.hash32(byteArray0, 2141, (int) (byte)16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash32((byte[]) null, 1326694685);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, 692);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      long long0 = MurmurHash2.hash64("N'y`05!?YFBV^i&");
      assertEquals(8484893752636818978L, long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, (-3491), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3492
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash64((byte[]) null, 4, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      long long0 = MurmurHash2.hash64("%%'%", 1, 1);
      assertEquals(7371902212501747253L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = MurmurHash2.hash32("=Gbsm{;~x/Y;{,)V", 0, 0);
      assertEquals(275646681, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = MurmurHash2.hash32("N'y`05!?YFBV^i&");
      assertEquals((-1773449344), int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = MurmurHash2.hash32("\"?j@hC", (int) (byte)1, (int) (byte)1);
      assertEquals((-323429624), int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      long long0 = MurmurHash2.hash64("5L;R~oH=cs", 0, 0);
      assertEquals((-7207201254813729732L), long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = MurmurHash2.hash32("5L;R~oH=cs");
      assertEquals(708354369, int0);
  }
}
