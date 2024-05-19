
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


package org.apache.commons.compress.compressors.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.HashMap;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream;
import org.apache.commons.compress.compressors.pack200.Pack200Strategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Pack200CompressorOutputStream_ESTest extends Pack200CompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("1m\"");
      Pack200Strategy pack200Strategy0 = Pack200Strategy.IN_MEMORY;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream(mockPrintStream0, pack200Strategy0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Pack200Strategy pack200Strategy0 = Pack200Strategy.IN_MEMORY;
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream((OutputStream) null, pack200Strategy0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream(pipedOutputStream0);
      // Undeclared exception!
      try { 
        pack200CompressorOutputStream0.write((byte[]) null, (-2485), (-2485));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("0lFwyQ[");
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        pack200CompressorOutputStream0.write(byteArray0, 1308, 1853);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("1g`3>$");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream(objectOutputStream0, hashMap0);
      // Undeclared exception!
      try { 
        pack200CompressorOutputStream0.write((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        pack200CompressorOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("pack.field.attribute.");
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream(mockFileOutputStream0);
      try { 
        pack200CompressorOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream(byteArrayOutputStream0, hashMap0);
      // Undeclared exception!
      try { 
        pack200CompressorOutputStream0.finish();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // archive.3E
         //
         verifyException("org.apache.commons.compress.java.util.jar.Pack200", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[7];
      pack200CompressorOutputStream0.write(byteArray0, 5, (int) (byte)0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream((OutputStream) null);
      pack200CompressorOutputStream0.write(5);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream(byteArrayOutputStream0, hashMap0);
      byte[] byteArray0 = new byte[7];
      pack200CompressorOutputStream0.write(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("pack.field.attribute.");
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        pack200CompressorOutputStream0.close();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // archive.3E
         //
         verifyException("org.apache.commons.compress.java.util.jar.Pack200", e);
      }
  }
}
