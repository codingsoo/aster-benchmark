
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
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0);
      simpleCharStream0.adjustBeginLineColumn(0, (-86));
      assertEquals((-86), simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      int[] intArray0 = new int[4];
      intArray0[0] = (-1);
      simpleCharStream0.bufline = intArray0;
      // Undeclared exception!
      try { 
        simpleCharStream0.adjustBeginLineColumn(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 138, 1406, 138);
      simpleCharStream0.tokenBegin = 1677;
      simpleCharStream0.adjustBeginLineColumn(0, 138);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 793);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 0, (byte) (-83), 0);
      simpleCharStream0.readChar();
      simpleCharStream0.GetSuffix(0);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals((-83), simpleCharStream0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("pfraTes81-$%=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0, 0);
      simpleCharStream0.readChar();
      // Undeclared exception!
      try { 
        simpleCharStream0.GetSuffix(2530);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 831, (-1828), (-1828));
      simpleCharStream0.backup((-1828));
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 4131, 0, 0);
      char[] charArray0 = new char[9];
      simpleCharStream0.buffer = charArray0;
      simpleCharStream0.inBuf = 4131;
      simpleCharStream0.bufpos = 0;
      simpleCharStream0.BeginToken();
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
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("pfraTes81-$%=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0, 0);
      simpleCharStream0.readChar();
      simpleCharStream0.UpdateLineColumn('p');
      assertEquals(0, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ramps7");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, (-2336), 854);
      simpleCharStream0.BeginToken();
      simpleCharStream0.ExpandBuff(true);
      assertEquals((-2336), simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1), (-1));
      simpleCharStream0.backup((-1));
      simpleCharStream0.getEndLine();
      assertEquals(0, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ramps7");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, (-2336), 854);
      simpleCharStream0.ReInit((Reader) stringReader0);
      simpleCharStream0.BeginToken();
      int int0 = simpleCharStream0.getEndLine();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      simpleCharStream0.backup((-1632));
      simpleCharStream0.getEndColumn();
      assertEquals(1631, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("=<.,R>f[jIf](");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1694, 2148, 1694);
      simpleCharStream0.readChar();
      int int0 = simpleCharStream0.getEndColumn();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(2148, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 793);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 0, (byte) (-83), 0);
      simpleCharStream0.readChar();
      int int0 = simpleCharStream0.getEndColumn();
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals((-83), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      simpleCharStream0.backup((-1632));
      simpleCharStream0.getColumn();
      assertEquals(1631, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".R?!i(.Lz");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 224, 224, 1);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      simpleCharStream0.readChar();
      int int0 = simpleCharStream0.getColumn();
      assertEquals(224, simpleCharStream0.getBeginColumn());
      assertEquals(224, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("l0b^4+ozcP");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1891), (-1891));
      simpleCharStream0.readChar();
      int int0 = simpleCharStream0.getColumn();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals((-1891), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 793);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 0, (byte) (-83), 10);
      char[] charArray0 = simpleCharStream0.GetSuffix(10);
      assertEquals(10, charArray0.length);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.backup(1);
      char char0 = simpleCharStream0.BeginToken();
      assertEquals(4095, simpleCharStream0.bufpos);
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 4131, 0, 0);
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 4131, 0, 0);
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndColumn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 3450, 3450);
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.getColumn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, (-2336), 854);
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
  public void test23()  throws Throwable  {
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0);
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.getBeginColumn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, (-2336), 0);
      // Undeclared exception!
      try { 
        simpleCharStream0.getBeginColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 4131, 0, 0);
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('Y');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((Reader) stringReader0, 0, (-365), (-365));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("X)L%TRt'K");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-2200), (-2200));
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((InputStream) null, 4096, (-680), 4096);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 650, 912);
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((InputStream) null, 650, 912);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.GetSuffix(1846);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(dataInputStream0, (-2430), (-2430));
      // Undeclared exception!
      try { 
        simpleCharStream0.GetSuffix((-721));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(dataInputStream0);
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
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1604, 1604, 1604);
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
  public void test34()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null, 8);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedInputStream0, 8, 8);
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.available = (-1);
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
  public void test36()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 4131, 0, 0);
      simpleCharStream0.Done();
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
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1895, 1895);
      simpleCharStream0.readChar();
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
  public void test38()  throws Throwable  {
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 831, (-1828), (-1828));
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("pfraTes81-$%=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0, 0);
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
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream(stringReader0, (-450), (-450), (-450));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null, (-485), 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null, (-3640), (-3640));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("~;9u2P<i\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2048, 2048, 2048);
      simpleCharStream0.ReInit((Reader) stringReader0, 2048, 2048, 2048);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 4131, 0, 0);
      simpleCharStream0.Done();
      StringReader stringReader0 = new StringReader("+[SS-MYK\u0001LxgHWJ");
      simpleCharStream0.ReInit((Reader) stringReader0, 4131, 4131, 4069);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ramps7");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, (-2336), 854);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pushbackInputStream0, (InputStream) null);
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0, 854, 1825, (-1));
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      int[] intArray0 = new int[4];
      intArray0[1] = (-1);
      simpleCharStream0.bufline = intArray0;
      // Undeclared exception!
      try { 
        simpleCharStream0.adjustBeginLineColumn(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ramps7");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 0, (-2336), 857);
      simpleCharStream0.inputStream = (Reader) stringReader0;
      simpleCharStream0.BeginToken();
      simpleCharStream0.adjustBeginLineColumn(1135, 42);
      assertEquals(0, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ramps7");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, (-2336), 854);
      simpleCharStream0.adjustBeginLineColumn((-3168), 10);
      int int0 = simpleCharStream0.getBeginColumn();
      assertEquals((-3167), simpleCharStream0.getBeginLine());
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 793);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 0, (byte) (-83), 0);
      char[] charArray0 = simpleCharStream0.GetSuffix(0);
      assertEquals(0, charArray0.length);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 1);
      simpleCharStream0.backup(562);
      simpleCharStream0.GetImage();
      assertEquals(3533, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ramps7");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, (-2336), 854);
      String string0 = simpleCharStream0.GetImage();
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 831, (-1828), (-1828));
      StringReader stringReader0 = new StringReader("$PF'x}@83[Ei&z$");
      simpleCharStream0.ReInit((Reader) stringReader0, (-1828), (-1828), 831);
      simpleCharStream0.FillBuff();
      char char0 = simpleCharStream0.readChar();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals('$', char0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 4131, 0, 0);
      simpleCharStream0.inBuf = 4131;
      simpleCharStream0.bufpos = 0;
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 4131, 0, 0);
      simpleCharStream0.inBuf = 4131;
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader("o");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 9, 3174);
      simpleCharStream0.prevCharIsCR = true;
      char char0 = simpleCharStream0.readChar();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals('o', char0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1, 1);
      simpleCharStream0.prevCharIsLF = true;
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('7');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 3736, 3736, 0);
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
  public void test59()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 4131, 0, 0);
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
  public void test60()  throws Throwable  {
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, (-1), (-1));
      simpleCharStream0.available = 5712;
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ramps7");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, (-2336), 854);
      simpleCharStream0.getBeginLine();
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ramps7");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, (-2336), 854);
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0);
      StringReader stringReader0 = new StringReader("PWn0B$#\"kf *HV");
      simpleCharStream0.ReInit((Reader) stringReader0, (-86), 0);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ramps7");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, (-2336), 854);
      simpleCharStream0.ReInit((Reader) stringReader0);
      simpleCharStream0.BeginToken();
      int int0 = simpleCharStream0.getBeginLine();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0);
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
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 4131, 0, 0);
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
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 3450, 3450);
      // Undeclared exception!
      try { 
        simpleCharStream0.getColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0);
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0);
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0, 0, 0);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0);
      simpleCharStream0.getBeginColumn();
      assertEquals((-1), simpleCharStream0.bufpos);
  }
}
