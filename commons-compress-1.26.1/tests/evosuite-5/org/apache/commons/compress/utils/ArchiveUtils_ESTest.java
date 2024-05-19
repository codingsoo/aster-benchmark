
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
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArchiveUtils_ESTest extends ArchiveUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 1195018015);
      String string0 = ArchiveUtils.toString((ArchiveEntry) cpioArchiveEntry0);
      assertEquals("- 1195018015 ", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte) (-56);
      boolean boolean0 = ArchiveUtils.isEqualWithNull(byteArray0, 84446, (byte)0, byteArray0, (byte)0, 65);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = new byte[8];
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqualWithNull(byteArray0, (-2225), (-2225), byteArray1, (byte) (-2), 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2227
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-14);
      byte[] byteArray1 = new byte[1];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, byteArray1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[4];
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqualWithNull(byteArray1, 527, (byte)30, byteArray0, (byte)91, (-1566));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1039
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-10);
      boolean boolean0 = ArchiveUtils.isArrayZero(byteArray0, 601);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = ArchiveUtils.isArrayZero(byteArray0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = ArchiveUtils.toAsciiString(byteArray0, 0, 1);
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      String string0 = ArchiveUtils.toAsciiString(byteArray0, (int) (byte)0, 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = ArchiveUtils.toAsciiString(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = ArchiveUtils.sanitize("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = ArchiveUtils.matchAsciiBuffer("", byteArray0, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = ArchiveUtils.matchAsciiBuffer("", byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[8];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, byteArray1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[0];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray1, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, (-2729), (int) (byte)0, byteArray0, (-2614), (int) (byte)0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.toString((ArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        ArchiveUtils.toAsciiString(byteArray0, 0, (-1162));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.toAsciiString((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.toAsciiBytes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.sanitize((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        ArchiveUtils.matchAsciiBuffer((String) null, byteArray0, (int) (byte)0, (int) (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        ArchiveUtils.matchAsciiBuffer("%AUxK;U|IG3..FN", byteArray0, (-1122), 1022);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1122
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        ArchiveUtils.matchAsciiBuffer((String) null, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqualWithNull((byte[]) null, 77, 0, (byte[]) null, 32767, 100);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual((byte[]) null, 0, 0, (byte[]) null, 0, 32, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual((byte[]) null, (int) (byte)70, (int) (byte)118, (byte[]) null, (int) (byte)118, (int) (byte)70);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual(byteArray0, 63, (int) (byte)60, byteArray0, 0, (int) (byte)45);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 63
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.isArrayZero((byte[]) null, 45);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)22;
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, (int) (byte)76, (int) (byte)0, byteArray0, 0, 8, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, (-208), 0, byteArray0, (int) (byte)0, (-801), false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = ArchiveUtils.isEqual((byte[]) null, 0, 0, (byte[]) null, 0, 0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = ArchiveUtils.toAsciiBytes("org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, (int) (byte)0, 63, byteArray1, 0, (int) (byte)1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual(byteArray0, (int) (byte)0, 103, byteArray0, (int) (byte)0, (int) (byte)32, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      boolean boolean0 = ArchiveUtils.matchAsciiBuffer("+gZ#c", byteArray0, (int) (byte)0, (int) (byte)0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      String string0 = ArchiveUtils.toString((ArchiveEntry) cpioArchiveEntry0);
      assertEquals("d       0 ", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = ArchiveUtils.sanitize("\u0000\uFFFD\u0000E\u0006\u0000");
      assertEquals("???E??", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, (int) (byte) (-72), (-1), byteArray0, (int) (byte)6, (int) (byte)0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)82;
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, (int) (byte)0, (int) (byte)82, byteArray0, (-1548), (int) (byte)0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, (int) (byte)0, 1, byteArray0, (int) (byte)0, (int) (byte)0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, byteArray0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)82;
      boolean boolean0 = ArchiveUtils.isArrayZero(byteArray0, 1195018015);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        ArchiveUtils.isArrayZero(byteArray0, 1195018015);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = ArchiveUtils.isArrayZero(byteArray0, (-1523));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = ArchiveUtils.toAsciiBytes("");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      String string0 = ArchiveUtils.toAsciiString(byteArray0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual((byte[]) null, (byte[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = ArchiveUtils.matchAsciiBuffer("b}K", byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = ArchiveUtils.isEqualWithNull((byte[]) null, 0, 0, (byte[]) null, 693, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, 605, 0, (byte[]) null, 88, (int) (byte)7);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.toAsciiString((byte[]) null, 749, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
