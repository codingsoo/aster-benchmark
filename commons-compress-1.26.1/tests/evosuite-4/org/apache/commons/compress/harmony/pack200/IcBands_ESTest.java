
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
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
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
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 1000);
      // Undeclared exception!
      try { 
        icBands0.addInnerClass("qjK%+-kP", (String) null, (String) null, (-1717986916));
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
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 1);
      // Undeclared exception!
      try { 
        icBands0.addInnerClass("$]", "$]", "", (-729));
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
      CPUTF8 cPUTF8_0 = new CPUTF8("$]");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 0, (CPClass) null, cPUTF8_0);
      boolean boolean0 = icBands_IcTuple0.isAnonymous();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 703, cPClass0, cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple1 = new IcBands.IcTuple(cPClass0, 316, cPClass0, cPUTF8_0);
      boolean boolean0 = icBands_IcTuple0.equals(icBands_IcTuple1);
      assertFalse(boolean0);
      assertFalse(icBands_IcTuple1.equals((Object)icBands_IcTuple0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("-\"J:rNpEA0_u J");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 0, (CPClass) null, cPUTF8_0);
      boolean boolean0 = icBands_IcTuple0.equals(icBands_IcTuple0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 0, cPClass0, cPUTF8_0);
      // Undeclared exception!
      try { 
        icBands_IcTuple0.compareTo((IcBands.IcTuple) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IcBands$IcTuple", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("$]");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 0, (CPClass) null, cPUTF8_0);
      int int0 = icBands_IcTuple0.compareTo(icBands_IcTuple0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ic_flags");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 1916, cPClass0, cPUTF8_0);
      String string0 = icBands_IcTuple0.toString();
      assertEquals("ic_flags", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 0);
      MockFile mockFile0 = new MockFile("Writing internal class bands...");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      icBands0.pack(mockPrintStream0);
      assertEquals(0L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 87);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        icBands0.pack(pipedOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 87
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 1);
      File file0 = MockFile.createTempFile("Wrote ", "GB");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
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
  public void test11()  throws Throwable  {
      IcBands icBands0 = new IcBands((SegmentHeader) null, (CpBands) null, (-2032));
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
  public void test12()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 0);
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
  public void test13()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      CPUTF8 cPUTF8_0 = new CPUTF8("y>D(^5v*%1%-6d;}/");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 1000);
      IcBands.IcTuple icBands_IcTuple0 = icBands0.getIcTuple(cPClass0);
      assertNull(icBands_IcTuple0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 968);
      // Undeclared exception!
      try { 
        icBands0.addInnerClass((String) null, (String) null, "r!f-us&^_?/b^Gq", 968);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, (-814));
      // Undeclared exception!
      try { 
        icBands0.addInnerClass("]", "", "", (-814));
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
      CPUTF8 cPUTF8_0 = new CPUTF8("y>D(^5v*%1%-6d;}/");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 1000, cPClass0, cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple1 = new IcBands.IcTuple(cPClass0, 1000, cPClass0, cPUTF8_0);
      assertTrue(icBands_IcTuple1.equals((Object)icBands_IcTuple0));
      
      CPUTF8 cPUTF8_1 = new CPUTF8("Wb j(m7B#?E**!?N");
      icBands_IcTuple1.N = cPUTF8_1;
      boolean boolean0 = icBands_IcTuple0.equals(icBands_IcTuple1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("y>D(^5v*%1%-6d;}/");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 1000, cPClass0, cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple1 = new IcBands.IcTuple(cPClass0, 1000, (CPClass) null, cPUTF8_0);
      boolean boolean0 = icBands_IcTuple0.equals(icBands_IcTuple1);
      assertFalse(icBands_IcTuple1.equals((Object)icBands_IcTuple0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("y>D(^5v*%1%-6d;}/");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 1000, cPClass0, cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple1 = new IcBands.IcTuple(cPClass0, 1000, cPClass0, cPUTF8_0);
      assertTrue(icBands_IcTuple1.equals((Object)icBands_IcTuple0));
      
      icBands_IcTuple1.F = 1408;
      boolean boolean0 = icBands_IcTuple0.equals(icBands_IcTuple1);
      assertFalse(icBands_IcTuple1.equals((Object)icBands_IcTuple0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("-\"J:rNpEA0_u J");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 0, (CPClass) null, cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple1 = new IcBands.IcTuple((CPClass) null, 0, cPClass0, cPUTF8_0);
      boolean boolean0 = icBands_IcTuple0.equals(icBands_IcTuple1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("y>D(^5v*%1%-6d;}/");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple(cPClass0, 1000, cPClass0, cPUTF8_0);
      Object object0 = new Object();
      boolean boolean0 = icBands_IcTuple0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, (-79));
      icBands0.finaliseBands();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 1000);
      List<IcBands.IcTuple> list0 = icBands0.getInnerClassesForOuter("y>D(^5v*%1%-6d;}/");
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("~Yv !s+U(':$~Yv !s+U(':");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      IcBands.IcTuple icBands_IcTuple0 = new IcBands.IcTuple((CPClass) null, 1000, cPClass0, cPUTF8_0);
      // Undeclared exception!
      try { 
        icBands_IcTuple0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IcBands$IcTuple", e);
      }
  }
}
