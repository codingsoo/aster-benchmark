
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


package org.apache.commons.compress.harmony.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import org.apache.commons.compress.harmony.pack200.CPClass;
import org.apache.commons.compress.harmony.pack200.CPUTF8;
import org.apache.commons.compress.harmony.pack200.CpBands;
import org.apache.commons.compress.harmony.pack200.IcBands;
import org.apache.commons.compress.harmony.pack200.SegmentHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class IcBands_ESTest extends IcBands_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        icBands0.addInnerClass("CV[~v60Lgu", (String) null, (String) null, Integer.MIN_VALUE);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IcBands", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IcBands icBands0 = new IcBands((SegmentHeader) null, (CpBands) null, 1297);
      // Undeclared exception!
      try { 
        icBands0.addInnerClass("ic_flags", "ic_flags", "Pe*9A.-", (-2205));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IcBands", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, (-1768));
      // Undeclared exception!
      try { 
        icBands0.addInnerClass("n :", "<WPO(lk9m", "", 23);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IcBands", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ic_flags");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPClass cPClass1 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass1, 3078, cPClass0, cPUTF8_0);
      String string0 = icBands_IcTuple0.toString();
      assertEquals("ic_flags", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("K[&=");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple((CPClass) null, (-3058), cPClass0, (CPUTF8) null);
      // Undeclared exception!
      try { 
        icBands_IcTuple0.isAnonymous();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IcBands$IcTuple", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("P'1PpZn.X");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 3440, cPClass0, cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple1 = new IcBands.IcTuple(cPClass0, 3440, cPClass0, cPUTF8_0);
      boolean boolean0 = icBands_IcTuple0.equals(icBands_IcTuple1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("P'PpZnX");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, (-2713), cPClass0, cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple1 = new IcBands.IcTuple(cPClass0, 0, cPClass0, cPUTF8_0);
      boolean boolean0 = icBands_IcTuple0.equals(icBands_IcTuple1);
      assertFalse(boolean0);
      assertFalse(icBands_IcTuple1.equals((Object)icBands_IcTuple0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("P'1P^pZn.X");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 3440, cPClass0, cPUTF8_0);
      CPClass cPClass1 = new CPClass(cPUTF8_0);
      icBands_IcTuple0.C2 = cPClass1;
      boolean boolean0 = icBands_IcTuple0.equals(icBands_IcTuple0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("r'.KmI+^l. w=}LyW&");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 192, cPClass0, cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple1 = new IcBands.IcTuple((CPClass) null, 192, (CPClass) null, cPUTF8_0);
      // Undeclared exception!
      try { 
        icBands_IcTuple0.compareTo(icBands_IcTuple1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ic_flags");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 1297, cPClass0, cPUTF8_0);
      CPClass cPClass1 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple1 = new IcBands.IcTuple(cPClass1, 3078, cPClass0, cPUTF8_0);
      int int0 = icBands_IcTuple1.compareTo(icBands_IcTuple0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(" bytes from ic_outer_class[");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 0, cPClass0, cPUTF8_0);
      boolean boolean0 = icBands_IcTuple0.isAnonymous();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IcBands icBands0 = new IcBands((SegmentHeader) null, (CpBands) null, (-2272));
      File file0 = MockFile.createTempFile("b\"LPMU$LB_<YF7*lA", "!j@VaYdl-@#LRUv");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      icBands0.pack(dataOutputStream0);
      assertEquals(0L, file0.length());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, (-1798));
      icBands0.finaliseBands();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 1297);
      MockFile mockFile0 = new MockFile("S");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      // Undeclared exception!
      try { 
        icBands0.pack(mockFileOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1297
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, (-1805629561));
      File file0 = MockFile.createTempFile("?cLflags", "?cLflags");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      try { 
        icBands0.pack(mockFileOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, (-1805629561));
      // Undeclared exception!
      try { 
        icBands0.pack((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IcBands", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ic_flags");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands icBands0 = new IcBands((SegmentHeader) null, (CpBands) null, 1297);
      IcBands.IcTuple icBands_IcTuple0 = icBands0.getIcTuple(cPClass0);
      assertNull(icBands_IcTuple0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 36);
      // Undeclared exception!
      try { 
        icBands0.addInnerClass((String) null, (String) null, "D", 36);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("P'1P^pZn.X");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 3440, cPClass0, cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple1 = new IcBands.IcTuple(cPClass0, 3440, cPClass0, cPUTF8_0);
      assertTrue(icBands_IcTuple1.equals((Object)icBands_IcTuple0));
      
      CPClass cPClass1 = new CPClass(cPUTF8_0);
      icBands_IcTuple1.C2 = cPClass1;
      boolean boolean0 = icBands_IcTuple0.equals(icBands_IcTuple1);
      assertFalse(icBands_IcTuple1.equals((Object)icBands_IcTuple0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("P'1PpZn.X");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 3440, cPClass0, cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple1 = new IcBands.IcTuple(cPClass0, 0, cPClass0, cPUTF8_0);
      boolean boolean0 = icBands_IcTuple0.equals(icBands_IcTuple1);
      assertFalse(boolean0);
      assertFalse(icBands_IcTuple1.equals((Object)icBands_IcTuple0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ic_flags");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 1297, cPClass0, cPUTF8_0);
      CPClass cPClass1 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple1 = new IcBands.IcTuple(cPClass1, 3078, cPClass0, cPUTF8_0);
      boolean boolean0 = icBands_IcTuple0.equals(icBands_IcTuple1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ic_flags");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 1297, cPClass0, cPUTF8_0);
      Object object0 = new Object();
      boolean boolean0 = icBands_IcTuple0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IcBands icBands0 = new IcBands((SegmentHeader) null, (CpBands) null, 3930);
      // Undeclared exception!
      try { 
        icBands0.finaliseBands();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IcBands", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IcBands icBands0 = new IcBands((SegmentHeader) null, (CpBands) null, 1297);
      List<IcBands.IcTuple> list0 = icBands0.getInnerClassesForOuter((String) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("$K[&=$");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, (-3058), cPClass0, cPUTF8_0);
      // Undeclared exception!
      try { 
        icBands_IcTuple0.isAnonymous();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
