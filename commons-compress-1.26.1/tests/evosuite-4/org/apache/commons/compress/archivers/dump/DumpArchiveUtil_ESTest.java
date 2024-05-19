
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


package org.apache.commons.compress.archivers.dump;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.commons.compress.archivers.dump.DumpArchiveUtil;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DumpArchiveUtil_ESTest extends DumpArchiveUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)50;
      // Undeclared exception!
      try { 
        DumpArchiveUtil.calculateChecksum(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[28];
      int int0 = DumpArchiveUtil.getIno(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(zipEncoding0).decode(any(byte[].class));
      byte[] byteArray0 = new byte[7];
      String string0 = DumpArchiveUtil.decode(zipEncoding0, byteArray0, (byte)0, 2993);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      doReturn("").when(zipEncoding0).decode(any(byte[].class));
      byte[] byteArray0 = new byte[2];
      String string0 = DumpArchiveUtil.decode(zipEncoding0, byteArray0, (byte)2, 8);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)110;
      long long0 = DumpArchiveUtil.convert64(byteArray0, (byte)0);
      assertEquals(110L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte) (-58);
      long long0 = DumpArchiveUtil.convert64(byteArray0, (byte)0);
      assertEquals((-4179340454199820288L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int int0 = DumpArchiveUtil.convert32(byteArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)9;
      int int0 = DumpArchiveUtil.convert32(byteArray0, (byte)0);
      assertEquals(589824, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte) (-25);
      int int0 = DumpArchiveUtil.convert32(byteArray0, (byte)0);
      assertEquals((-419430400), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)69;
      int int0 = DumpArchiveUtil.convert16(byteArray0, 0);
      assertEquals(69, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        DumpArchiveUtil.verify(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 24
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        DumpArchiveUtil.getIno((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        DumpArchiveUtil.decode(zipEncoding0, (byte[]) null, 1293, 28);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        DumpArchiveUtil.decode(zipEncoding0, byteArray0, 3177, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        DumpArchiveUtil.convert64((byte[]) null, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        DumpArchiveUtil.convert64(byteArray0, 3419);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3419
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        DumpArchiveUtil.convert32(byteArray0, (byte) (-74));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -74
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        DumpArchiveUtil.convert16((byte[]) null, 1915);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        DumpArchiveUtil.convert16(byteArray0, (byte)64);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 64
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        DumpArchiveUtil.calculateChecksum((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        DumpArchiveUtil.convert32((byte[]) null, (-1909));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = DumpArchiveUtil.verify((byte[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[28];
      boolean boolean0 = DumpArchiveUtil.verify(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[4];
      try { 
        DumpArchiveUtil.decode(zipEncoding0, byteArray0, (byte)113, (byte) (-84));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid offset/length combination
         //
         verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[374];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      doReturn("Xrg.apache.commogs.compress.archihers.dxmp.DumpArchiveUtil").when(zipEncoding0).decode(any(byte[].class));
      String string0 = DumpArchiveUtil.decode(zipEncoding0, byteArray0, (byte)0, 48);
      assertEquals("Xrg.apache.commogs.compress.archihers.dxmp.DumpArchiveUtil", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      int int0 = DumpArchiveUtil.convert16(byteArray0, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      long long0 = DumpArchiveUtil.convert64(byteArray0, (byte)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      // Undeclared exception!
      try { 
        DumpArchiveUtil.getIno(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }
}
