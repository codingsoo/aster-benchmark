
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
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.pack200.SegmentHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SegmentHeader_ESTest extends SegmentHeader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setDeflate_hint(true);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.harmony.pack200.BandSet");
      segmentHeader0.pack(mockPrintStream0);
      segmentHeader0.pack(mockPrintStream0);
      assertTrue(segmentHeader0.have_file_options());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setFile_count((-2454));
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.harmony.pack200.BandSet");
      segmentHeader0.pack(mockPrintStream0);
      assertFalse(segmentHeader0.have_class_flags_hi());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setCp_Double_count((-760));
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.harmony.pack200.Codec");
      segmentHeader0.pack(mockPrintStream0);
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      segmentHeader0.setCp_Long_count((-1));
      segmentHeader0.pack(byteArrayOutputStream0);
      assertEquals(20, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\uFFFD\r\u0007\uFFFD\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setCp_Float_count((-304));
      MockPrintStream mockPrintStream0 = new MockPrintStream("p6X");
      segmentHeader0.pack(mockPrintStream0);
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setCp_Int_count((-2454));
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.harmony.pack200.BandSet");
      segmentHeader0.pack(mockPrintStream0);
      assertEquals(0, segmentHeader0.getArchive_modtime());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setAttribute_definition_count((-2338));
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      segmentHeader0.pack(byteArrayOutputStream0);
      assertEquals(20, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\uFFFD\r\u0007\uFFFD\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.addMajorVersion(254);
      segmentHeader0.addMajorVersion(254);
      segmentHeader0.addMajorVersion(1373);
      MockFile mockFile0 = new MockFile("", "org.apache.commons.compress.harmony.pack200.SegmentHeader$1");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      segmentHeader0.pack(mockPrintStream0);
      assertEquals(254, segmentHeader0.getDefaultMajorVersion());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.addMajorVersion(128);
      segmentHeader0.addMajorVersion((-559));
      assertEquals(128, segmentHeader0.getDefaultMajorVersion());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setHave_method_flags_hi(true);
      boolean boolean0 = segmentHeader0.have_method_flags_hi();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setHave_field_flags_hi(true);
      boolean boolean0 = segmentHeader0.have_field_flags_hi();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setHave_code_flags_hi(true);
      boolean boolean0 = segmentHeader0.have_code_flags_hi();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setHave_class_flags_hi(true);
      boolean boolean0 = segmentHeader0.have_class_flags_hi();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.addMajorVersion((-2785));
      int int0 = segmentHeader0.getDefaultMajorVersion();
      assertEquals((-2785), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.appendBandCodingSpecifier(2403);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.harmony.pack200.SegmentHeader$Counter", true);
      try { 
        segmentHeader0.pack(mockFileOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value 2403
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      // Undeclared exception!
      try { 
        segmentHeader0.pack((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.SegmentHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        segmentHeader0.pack(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setHave_code_flags_hi(true);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.harmony.pack200.BandSet");
      segmentHeader0.pack(mockPrintStream0);
      assertTrue(segmentHeader0.have_code_flags_hi());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setHave_method_flags_hi(true);
      MockFile mockFile0 = new MockFile("B$9_]", "B$9_]");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      segmentHeader0.pack(dataOutputStream0);
      assertTrue(segmentHeader0.have_method_flags_hi());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setHave_field_flags_hi(true);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.harmony.pack200.BandSet");
      segmentHeader0.pack(mockPrintStream0);
      assertTrue(segmentHeader0.have_field_flags_hi());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setFile_count(254);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.harmony.pack200.BandSet");
      segmentHeader0.pack(mockPrintStream0);
      segmentHeader0.pack(mockPrintStream0);
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.harmony.pack200.BandSet");
      segmentHeader0.setHave_all_code_flags(false);
      segmentHeader0.pack(mockPrintStream0);
      assertFalse(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setCp_Long_count(254);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      segmentHeader0.pack(mockPrintStream0);
      assertEquals(25, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\uFFFD\r\u0007\uFFFD\uFFFD\u0000\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setCp_Int_count(254);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.harmony.pack200.BandSet");
      segmentHeader0.pack(mockPrintStream0);
      assertFalse(segmentHeader0.have_method_flags_hi());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      boolean boolean0 = segmentHeader0.have_all_code_flags();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      boolean boolean0 = segmentHeader0.have_file_options();
      assertTrue(segmentHeader0.have_all_code_flags());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.have_method_flags_hi();
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.have_class_flags_hi();
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setAttribute_definition_count(1);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.harmony.pack200.BandSet");
      segmentHeader0.pack(mockPrintStream0);
      assertFalse(segmentHeader0.have_method_flags_hi());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setHave_class_flags_hi(true);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      segmentHeader0.pack(pipedOutputStream0);
      assertTrue(segmentHeader0.have_class_flags_hi());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setCp_Utf8_count((-288));
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setCp_Method_count(0);
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.getDefaultMajorVersion();
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setCp_Signature_count(254);
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setIc_count(0);
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setCp_Imethod_count((-1));
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.have_code_flags_hi();
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int int0 = segmentHeader0.getArchive_modtime();
      assertTrue(segmentHeader0.have_all_code_flags());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setCp_Descr_count(1083);
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setClass_count(421);
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      boolean boolean0 = segmentHeader0.have_file_modtime();
      assertTrue(segmentHeader0.have_all_code_flags());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.appendBandCodingSpecifier(5);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.harmony.pack200.BandSet");
      segmentHeader0.pack(mockPrintStream0);
      segmentHeader0.pack(mockPrintStream0);
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.addMajorVersion(254);
      int int0 = segmentHeader0.getDefaultMajorVersion();
      assertEquals(254, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      assertTrue(segmentHeader0.have_all_code_flags());
      
      segmentHeader0.setHave_all_code_flags(false);
      boolean boolean0 = segmentHeader0.have_all_code_flags();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setCp_Class_count((-1));
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.have_file_size_hi();
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setCp_String_count(4131);
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setCp_Double_count(8);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.harmony.pack200.Codec");
      segmentHeader0.pack(mockPrintStream0);
      assertFalse(segmentHeader0.have_method_flags_hi());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setCp_Float_count(254);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.harmony.pack200.BandSet");
      segmentHeader0.pack(mockPrintStream0);
      segmentHeader0.pack(mockPrintStream0);
      assertTrue(segmentHeader0.have_file_modtime());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.setCp_Field_count(1083);
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      segmentHeader0.have_field_flags_hi();
      assertTrue(segmentHeader0.have_all_code_flags());
  }
}
