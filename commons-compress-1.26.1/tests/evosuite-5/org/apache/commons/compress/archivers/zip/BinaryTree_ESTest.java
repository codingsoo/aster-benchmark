
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


package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.archivers.zip.BinaryTree;
import org.apache.commons.compress.archivers.zip.BitStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BinaryTree_ESTest extends BinaryTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(7);
      binaryTree0.addLeaf(7, 7, 0, 0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(0);
      binaryTree0.addLeaf(0, (-248), 0, 57);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(0);
      // Undeclared exception!
      try { 
        binaryTree0.addLeaf(64, 0, 0, 64);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 64
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(0);
      // Undeclared exception!
      try { 
        binaryTree0.read((BitStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        BinaryTree.decode((InputStream) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-121), (byte)95);
      // Undeclared exception!
      try { 
        BinaryTree.decode(byteArrayInputStream0, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -121
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(0);
      binaryTree0.addLeaf(0, 0, 0, (-6));
      // Undeclared exception!
      try { 
        binaryTree0.addLeaf(0, (-248), 0, 57);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Tree value at index 0 has already been assigned (-6)
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(0);
      binaryTree0.addLeaf(0, 0, 0, 0);
      // Undeclared exception!
      try { 
        binaryTree0.addLeaf(0, 0, 0, 57);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Tree value at index 0 has already been assigned (0)
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(0);
      // Undeclared exception!
      try { 
        binaryTree0.addLeaf(0, (-248), (-4495), 57);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BinaryTree binaryTree0 = null;
      try {
        binaryTree0 = new BinaryTree(1368);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // depth must be bigger than 0 and not bigger than 30 but is 1368
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(16);
      // Undeclared exception!
      try { 
        binaryTree0.addLeaf(16, 16, 16, 16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 139519
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BinaryTree binaryTree0 = null;
      try {
        binaryTree0 = new BinaryTree((-383));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // depth must be bigger than 0 and not bigger than 30 but is -383
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        BinaryTree.decode(byteArrayInputStream0, (byte)63);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/IOUtils
         //
         verifyException("org.apache.commons.compress.utils.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      File file0 = MockFile.createTempFile("0E:c\"h)dPq*5}vl!2=z", "0E:c\"h)dPq*5}vl!2=z", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      // Undeclared exception!
      try { 
        BinaryTree.decode(mockFileInputStream0, (-74));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // totalNumberOfValues must be bigger than 0, is -74
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        BinaryTree.decode(sequenceInputStream0, 1176);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot read the size of the encoded tree, unexpected end of stream
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }
}