
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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import org.apache.commons.compress.utils.CountingOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CountingOutputStream_ESTest extends CountingOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("`EP& `B");
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[4];
      countingOutputStream0.write(byteArray0, (-619), (int) (byte) (-76));
      long long0 = countingOutputStream0.getBytesWritten();
      assertEquals((-76L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CountingOutputStream countingOutputStream0 = new CountingOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        countingOutputStream0.write(byteArray0, 388, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.CountingOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        countingOutputStream0.write(byteArray0, 0, 555);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        countingOutputStream0.write(byteArray0, (-1), 1162);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.evosuite.runtime.vfs.VFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = MockFile.createTempFile("r`(Qof'VJk2]", "r`(Qof'VJk2]");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[2];
      try { 
        countingOutputStream0.write(byteArray0, (int) (byte)115, 537);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CountingOutputStream countingOutputStream0 = new CountingOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        countingOutputStream0.write(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.CountingOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.utils.CountingOutputStream");
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[2];
      countingOutputStream0.close();
      try { 
        countingOutputStream0.write(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CountingOutputStream countingOutputStream0 = new CountingOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        countingOutputStream0.write((int) (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.CountingOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("F8&e!~@hp)!]U", "");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockFileOutputStream0);
      mockFile0.delete();
      try { 
        countingOutputStream0.write(1215);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("V6r-7rv#Lc&");
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      countingOutputStream0.write(byteArray0, (int) (byte)1, (int) (byte)31);
      long long0 = countingOutputStream0.getBytesWritten();
      assertEquals(31L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockPrintStream0);
      countingOutputStream0.count((-1L));
      assertEquals(0L, countingOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("V6r-7rv#Lc&");
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockPrintStream0);
      countingOutputStream0.write((-1790));
      assertEquals(1L, countingOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("V6r-7rv#Lc&");
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      countingOutputStream0.write(byteArray0);
      assertEquals(6L, countingOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("F8&e!~@hp)!]U", "");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockFileOutputStream0);
      long long0 = countingOutputStream0.getBytesWritten();
      assertEquals(0L, long0);
  }
}
