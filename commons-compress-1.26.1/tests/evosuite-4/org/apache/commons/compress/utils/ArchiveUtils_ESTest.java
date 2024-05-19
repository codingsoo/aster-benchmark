
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
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
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
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("!J", 8589934591L, (byte)0, (-372), 155, (-372));
      String string0 = ArchiveUtils.toString((ArchiveEntry) arArchiveEntry0);
      assertEquals("- 8589934591 !J", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-30);
      boolean boolean0 = ArchiveUtils.isEqualWithNull(byteArray0, (byte)0, 141, byteArray0, 0, (byte)0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual(byteArray0, 0, 321, byteArray0, (-1278), (int) (byte)0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[3];
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqualWithNull(byteArray1, 0, 21589, byteArray0, (-288), (-2489));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2489
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[4];
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual(byteArray1, (int) (byte)95, (int) (byte)95, byteArray0, 831, 32767);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 95
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-100);
      boolean boolean0 = ArchiveUtils.isArrayZero(byteArray0, 1091);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      boolean boolean0 = ArchiveUtils.isArrayZero(byteArray0, (-1146));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = ArchiveUtils.toAsciiBytes(", originalCrc32=");
      String string0 = ArchiveUtils.toAsciiString(byteArray0, (int) (byte)9, 7);
      assertEquals("lCrc32=", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      String string0 = ArchiveUtils.toAsciiString(byteArray0, (int) (byte)0, 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = ArchiveUtils.toAsciiBytes("");
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
      byte[] byteArray0 = new byte[4];
      boolean boolean0 = ArchiveUtils.matchAsciiBuffer("bnBVze~Wf^", byteArray0, (int) (byte)1, (-1146));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = ArchiveUtils.toAsciiBytes("");
      boolean boolean0 = ArchiveUtils.matchAsciiBuffer("", byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-62);
      boolean boolean0 = ArchiveUtils.isEqualWithNull(byteArray0, 0, (byte)0, byteArray0, (byte)0, 504);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)46;
      byte[] byteArray1 = new byte[1];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, byteArray1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[0];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, byteArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, (int) (byte) (-60), (int) (byte) (-60), byteArray0, 1, (int) (byte) (-60));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.toAsciiString((byte[]) null, 50, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.toAsciiString((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        ArchiveUtils.matchAsciiBuffer((String) null, byteArray0, 0, 2000);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        ArchiveUtils.matchAsciiBuffer("])j", byteArray0, (int) (byte) (-96), 1777);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -96
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.matchAsciiBuffer("org.apache.commons.compress.utils.ArchiveUtils", (byte[]) null);
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
        ArchiveUtils.isEqualWithNull((byte[]) null, 3157, 3157, (byte[]) null, 3157, 0);
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
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual((byte[]) null, 258, 0, (byte[]) null, 0, (-3203), true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual((byte[]) null, 509, 0, byteArray0, 4196, 849, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4196
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual(byteArray0, 0, 1644, byteArray0, (int) (byte)7, 2055);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.isArrayZero((byte[]) null, 92);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, (int) (byte)0, (int) (byte)0, byteArray0, (int) (byte)0, 1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, (int) (byte) (-124), 504, byteArray0, 748, 0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, (int) (byte)0, 0, byteArray0, 32, (int) (byte)0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = ArchiveUtils.toAsciiBytes("|Jna");
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, 1, 602, byteArray0, 0, 1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = ArchiveUtils.matchAsciiBuffer("", (byte[]) null, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockFile mockFile0 = new MockFile((String) null, "");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      String string0 = ArchiveUtils.toString((ArchiveEntry) cpioArchiveEntry0);
      assertEquals("d       0 ", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = ArchiveUtils.sanitize("\u0000\u0000\u0000\u0000\uFFFD>");
      assertEquals("?????>", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte)13;
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, 759, (int) (byte)0, byteArray0, (int) (byte)0, (int) (byte)13, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = ArchiveUtils.toAsciiBytes("|Jna");
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, 0, 602, byteArray0, 0, 1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = new byte[1];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray1, byteArray0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, (int) (byte)0, 1, byteArray0, 0, (int) (byte)0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)13;
      boolean boolean0 = ArchiveUtils.isArrayZero(byteArray0, (byte)13);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        ArchiveUtils.isArrayZero(byteArray0, (byte)13);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = ArchiveUtils.isArrayZero(byteArray0, (byte)0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      String string0 = ArchiveUtils.toAsciiString(byteArray0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, byteArray0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = ArchiveUtils.matchAsciiBuffer("9I|g8>Vp?>,AH?", byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      boolean boolean0 = ArchiveUtils.isEqualWithNull(byteArray0, (byte)0, (byte)0, byteArray0, 0, (byte)0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = ArchiveUtils.toAsciiBytes("|Jna");
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, 63, 63, byteArray0, 32, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = ArchiveUtils.toAsciiBytes("|Jna");
      // Undeclared exception!
      try { 
        ArchiveUtils.toAsciiString(byteArray0, 255, 1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
