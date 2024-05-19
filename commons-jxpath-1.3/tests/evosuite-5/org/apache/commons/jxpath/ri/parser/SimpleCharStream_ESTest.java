
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


package org.apache.commons.jxpath.ri.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.util.Enumeration;
import org.apache.commons.jxpath.ri.parser.SimpleCharStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SimpleCharStream_ESTest extends SimpleCharStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      simpleCharStream0.bufpos = (int) (byte)0;
      simpleCharStream0.backup(1);
      simpleCharStream0.adjustBeginLineColumn(0, (byte)60);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(mockFileInputStream0, 1377, 1377, 1377);
      simpleCharStream0.adjustBeginLineColumn(0, 115);
      assertEquals(115, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.inBuf = (-3267);
      simpleCharStream0.backup((-1880));
      simpleCharStream0.adjustBeginLineColumn((-3267), 1203);
      assertEquals(1879, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 2485, 2485);
      simpleCharStream0.inBuf = (-1889);
      simpleCharStream0.adjustBeginLineColumn(0, 0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 112, 3721);
      StringReader stringReader0 = new StringReader("pw<NOI8U^+1pXK!4y");
      simpleCharStream0.ReInit((Reader) stringReader0, 10, 112);
      simpleCharStream0.BeginToken();
      simpleCharStream0.GetSuffix(112);
      assertEquals(112, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 4081);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, (-1744), 685);
      char[] charArray0 = simpleCharStream0.GetSuffix(1);
      assertEquals(1, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 112, 3721);
      StringReader stringReader0 = new StringReader("pw<NOI8U^+1pXK!4y");
      simpleCharStream0.ReInit((Reader) stringReader0, 10, 112);
      simpleCharStream0.BeginToken();
      simpleCharStream0.GetImage();
      assertEquals(0, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(mockFileInputStream0);
      simpleCharStream0.backup(994);
      simpleCharStream0.readChar();
      assertEquals(3102, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("|\"(]y\"3C*hY0s'");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.backup((-2241));
      simpleCharStream0.BeginToken();
      simpleCharStream0.GetSuffix(2241);
      assertEquals(1, simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"AnptgW[XF#a");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2048, 2594, 2594);
      simpleCharStream0.FillBuff();
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">z!3iKV");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      simpleCharStream0.bufpos = 0;
      simpleCharStream0.ExpandBuff(true);
      assertEquals(4096, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" 7)-V01");
      stringReader0.read();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 810, 4096, 810);
      char char0 = simpleCharStream0.readChar();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals('7', char0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"AnptgW[XF#a");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2048, 2594, 2594);
      simpleCharStream0.ReInit((Reader) stringReader0, 10, 2594);
      simpleCharStream0.backup(2594);
      simpleCharStream0.getLine();
      assertEquals(1501, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("'");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.BeginToken();
      int int0 = simpleCharStream0.getEndLine();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"AnptgW[XF#a");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2048, 2594, 2594);
      simpleCharStream0.ReInit((Reader) stringReader0, 10, 2594);
      simpleCharStream0.backup(2594);
      simpleCharStream0.getEndColumn();
      assertEquals(1501, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("qWqR9#Roj");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2699, 1691);
      simpleCharStream0.backup(4068);
      simpleCharStream0.getColumn();
      assertEquals(27, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("'");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.BeginToken();
      int int0 = simpleCharStream0.getBeginLine();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("R H2-4-T=~$iV)5");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-3732), 1);
      int[] intArray0 = new int[9];
      intArray0[0] = (-3732);
      simpleCharStream0.bufline = intArray0;
      int int0 = simpleCharStream0.getBeginLine();
      assertEquals((-3732), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      char[] charArray0 = simpleCharStream0.GetSuffix(0);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0, 0);
      String string0 = simpleCharStream0.GetImage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 112, 3721);
      StringReader stringReader0 = new StringReader("pw<NOI8U^+1pXK!4y");
      simpleCharStream0.ReInit((Reader) stringReader0, 10, 112);
      simpleCharStream0.BeginToken();
      int int0 = simpleCharStream0.getLine();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 2455, 2455, 2455);
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      char[] charArray0 = new char[5];
      simpleCharStream0.buffer = charArray0;
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("x_,2aevXU@");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.getLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Z/MbkYG8");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1196), 4095, 0);
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.getColumn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Wh`7u~o$[");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.getBeginLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 2531, 0);
      // Undeclared exception!
      try { 
        simpleCharStream0.getBeginLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(mockFileInputStream0, (-1013), 1, (-1013));
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.getBeginColumn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0, 0);
      // Undeclared exception!
      try { 
        simpleCharStream0.getBeginColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.adjustBeginLineColumn(0, (byte)60);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      int[] intArray0 = new int[0];
      simpleCharStream0.bufcolumn = intArray0;
      // Undeclared exception!
      try { 
        simpleCharStream0.adjustBeginLineColumn(57, 57);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('c');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0, 0);
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('6');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((InputStream) null, 0, 0, (-1665));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      // Undeclared exception!
      try { 
        simpleCharStream0.GetSuffix((-1902));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      char[] charArray0 = new char[2];
      simpleCharStream0.buffer = charArray0;
      // Undeclared exception!
      try { 
        simpleCharStream0.GetImage();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 2485, 2485);
      // Undeclared exception!
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-2234), 10, 0);
      // Undeclared exception!
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("#c(A,eG>");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, (-2017), 0);
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, 936);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pushbackInputStream0);
      char[] charArray0 = new char[8];
      simpleCharStream0.buffer = charArray0;
      // Undeclared exception!
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream(stringReader0, (-1), 0, (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null, (-1), 2313, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null, (-402), (-2555));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(dataInputStream0, 1017, 1017);
      simpleCharStream0.ReInit((Reader) null, 0, 1017, 0);
      simpleCharStream0.ReInit((Reader) null, 1, 1, 0);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader("lK=LQ~dzF>:~{CC");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1752), (-1752));
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((Reader) stringReader0, (-1752), (-1752), (-1752));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 2485, 2485);
      PipedInputStream pipedInputStream0 = new PipedInputStream(629);
      simpleCharStream0.ReInit((InputStream) pipedInputStream0, 2048, 0, 629);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      simpleCharStream0.bufpos = (int) (byte)37;
      simpleCharStream0.UpdateLineColumn('[');
      simpleCharStream0.adjustBeginLineColumn(0, (byte)37);
      assertEquals(37, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringReader stringReader0 = new StringReader("|\"(]y\"3C*hY0s'");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.adjustBeginLineColumn((-1), (-1));
      assertEquals((-1), simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      simpleCharStream0.bufpos = (int) (byte)0;
      simpleCharStream0.adjustBeginLineColumn(0, (byte)60);
      assertEquals(60, simpleCharStream0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"AnptgW[XF#a");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2048, 2594, 2594);
      simpleCharStream0.ReInit((Reader) stringReader0, 10, 2594);
      simpleCharStream0.backup(2594);
      simpleCharStream0.GetImage();
      assertEquals(1501, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 2485, 2485);
      PipedInputStream pipedInputStream0 = new PipedInputStream(629);
      simpleCharStream0.ExpandBuff(false);
      simpleCharStream0.ReInit((InputStream) pipedInputStream0, 0, 0);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(mockFileInputStream0, (-1013), 1, (-1013));
      simpleCharStream0.Done();
      StringReader stringReader0 = new StringReader("");
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(dataInputStream0, 1017, 1017);
      simpleCharStream0.maxNextCharInd = 1017;
      char char0 = simpleCharStream0.readChar();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedInputStream0);
      simpleCharStream0.available = 0;
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringReader stringReader0 = new StringReader("#c(A,eG>");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, (-2017), 0);
      // Undeclared exception!
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 1, 1, 1);
      simpleCharStream0.available = 0;
      // Undeclared exception!
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Z/MbkYG8");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1196), 4095, 0);
      simpleCharStream0.readChar();
      int int0 = simpleCharStream0.getEndLine();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals((-1196), int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">z!3iKV");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      // Undeclared exception!
      try { 
        simpleCharStream0.ExpandBuff(true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.GetImage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 2485, 2485);
      simpleCharStream0.getBeginLine();
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, (-139), (-139), (-3745));
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">z!3iKV");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      // Undeclared exception!
      try { 
        simpleCharStream0.getLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"AnptgW[XF#a");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2048, 2594, 2594);
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        simpleCharStream0.getColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(mockFileInputStream0, (-1013), 1, (-1013));
      simpleCharStream0.getBeginColumn();
      assertEquals((-1), simpleCharStream0.bufpos);
  }
}
