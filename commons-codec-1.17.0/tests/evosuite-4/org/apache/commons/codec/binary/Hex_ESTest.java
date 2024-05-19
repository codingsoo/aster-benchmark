
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


package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.commons.codec.binary.Hex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Hex_ESTest extends Hex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      char[] charArray0 = new char[4];
      Hex.encodeHex(byteArray0, (int) (byte)11, (-8), false, charArray0, 12);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Hex.toDigit('0', (byte) (-65));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Hex.toDigit('3', (-1));
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = Hex.encodeHexString(byteArray0, true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(51);
      Hex hex0 = new Hex();
      hex0.encode(byteBuffer0);
      String string0 = Hex.encodeHexString(byteBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hex hex0 = new Hex();
      char[] charArray0 = new char[18];
      ByteBuffer byteBuffer0 = hex0.DEFAULT_CHARSET.encode("");
      char[] charArray1 = Hex.encodeHex(byteBuffer0, charArray0);
      byte[] byteArray0 = Hex.decodeHex(charArray1);
      char[] charArray2 = Hex.encodeHex(byteArray0, charArray0);
      assertNotSame(charArray0, charArray2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      char[] charArray0 = Hex.encodeHex(byteArray0, (int) (byte)0, 0, true);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = Hex.encodeHex(byteArray0);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(439);
      char[] charArray0 = new char[1];
      char[] charArray1 = Hex.encodeHex(byteBuffer0, charArray0);
      assertEquals("java.nio.HeapByteBuffer[pos=439 lim=439 cap=439]", byteBuffer0.toString());
      assertNotSame(charArray0, charArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, 1, 0);
      char[] charArray0 = Hex.encodeHex(byteBuffer0, true);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hex hex0 = new Hex();
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = hex0.encode(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1061);
      Hex.encodeHexString(byteBuffer0, true);
      Hex hex0 = new Hex();
      byte[] byteArray0 = hex0.encode(byteBuffer0);
      String string0 = Hex.encodeHexString(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = new byte[3];
      int int0 = Hex.decodeHex(charArray0, byteArray0, (-3569));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, 1, 4);
      char[] charArray0 = Hex.encodeHex(byteBuffer0);
      assertArrayEquals(new char[] {'0', '0', '0', '0', '0', '0', '0', '0'}, charArray0);
      
      byte[] byteArray1 = Hex.decodeHex(charArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = Hex.decodeHex("1000");
      assertArrayEquals(new byte[] {(byte)16, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Hex hex0 = new Hex();
      byte[] byteArray1 = hex0.decode(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hex hex0 = new Hex();
      ByteBuffer byteBuffer0 = hex0.DEFAULT_CHARSET.encode("0800");
      byte[] byteArray0 = hex0.decode(byteBuffer0);
      assertEquals(4, byteBuffer0.position());
      assertArrayEquals(new byte[] {(byte)8, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Charset charset0 = Hex.DEFAULT_CHARSET;
      ByteBuffer byteBuffer0 = charset0.encode("oy?oq,.QWCaR\"{");
      Hex.encodeHexString(byteBuffer0, false);
      Hex hex0 = new Hex(charset0);
      hex0.decode(byteBuffer0);
      assertEquals(14, byteBuffer0.position());
      assertFalse(byteBuffer0.hasRemaining());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        Hex.toDigit('n', (-611));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Illegal hexadecimal character n at index -611
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHexString((byte[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHexString((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHexString((ByteBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHexString((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteArray0, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)113;
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteArray0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHex((byte[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHex((byte[]) null, 2623, 665, false, (char[]) null, 2623);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteArray0, (int) (byte)1, 894, false, charArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHex((byte[]) null, 0, 967, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteArray0, (-1008), (-1008), true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        Hex.encodeHex((ByteBuffer) null, charArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Charset charset0 = Hex.DEFAULT_CHARSET;
      ByteBuffer byteBuffer0 = charset0.encode("oy?oq,.QWCaR\"{");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteBuffer0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHex((ByteBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHex((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Hex hex0 = new Hex((Charset) null);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        hex0.encode(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Hex hex0 = new Hex();
      // Undeclared exception!
      try { 
        hex0.encode((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Hex hex0 = new Hex();
      Object object0 = new Object();
      try { 
        hex0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.Object cannot be cast to [B
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        Hex.decodeHex(charArray0, (byte[]) null, 11);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '1';
      charArray0[1] = '1';
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        Hex.decodeHex(charArray0, byteArray0, (-18));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -18
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.decodeHex((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      try { 
        Hex.decodeHex("UTF-8");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Odd number of characters.
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.decodeHex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Hex hex0 = new Hex();
      byte[] byteArray0 = new byte[3];
      try { 
        hex0.decode(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Odd number of characters.
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Hex hex0 = new Hex(charset0);
      // Undeclared exception!
      try { 
        hex0.decode((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Hex hex0 = new Hex();
      // Undeclared exception!
      try { 
        hex0.decode((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Hex hex0 = new Hex();
      // Undeclared exception!
      try { 
        hex0.decode((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Hex hex0 = null;
      try {
        hex0 = new Hex("sV3");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // sV3
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Hex hex0 = null;
      try {
        hex0 = new Hex((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Hex hex0 = new Hex();
      try { 
        hex0.decode((Object) hex0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.apache.commons.codec.binary.Hex cannot be cast to [C
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(51);
      ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(51);
      char[] charArray0 = Hex.encodeHex(byteBuffer0, true);
      Hex hex0 = new Hex();
      byte[] byteArray0 = hex0.encode(byteBuffer1);
      int int0 = Hex.decodeHex(charArray0, byteArray0, 1);
      assertEquals(51, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = new byte[4];
      try { 
        Hex.decodeHex(charArray0, byteArray0, 49);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Odd number of characters.
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(51);
      Hex.encodeHex(byteBuffer0, true);
      char[] charArray0 = Hex.encodeHex(byteBuffer0);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Hex hex0 = new Hex(charset0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "UTF-8");
      ByteBuffer byteBuffer0 = charset0.encode(charBuffer0);
      try { 
        hex0.decode(byteBuffer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Odd number of characters.
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Hex hex0 = new Hex("UTF-8");
      assertEquals("UTF-8", hex0.getCharsetName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(51);
      Hex hex0 = new Hex();
      byte[] byteArray0 = hex0.encode(byteBuffer0);
      byte[] byteArray1 = hex0.decode(byteArray0);
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteArray1, 1, 56, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 51
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      char[] charArray0 = new char[4];
      char[] charArray1 = Hex.encodeHex(byteArray0, charArray0);
      assertEquals(8, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(51);
      Hex hex0 = new Hex();
      byte[] byteArray0 = hex0.encode(byteBuffer0);
      char[] charArray0 = Hex.encodeHex(byteArray0);
      assertEquals(204, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(51);
      String string0 = Hex.encodeHexString(byteBuffer0);
      assertEquals("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Hex hex0 = new Hex();
      // Undeclared exception!
      try { 
        hex0.encode((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Hex hex0 = new Hex();
      Object object0 = hex0.encode((Object) "C~lmr~pA(M)TnX");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Hex hex0 = new Hex();
      byte[] byteArray0 = new byte[5];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      hex0.encode((Object) byteBuffer0);
      assertEquals(5, byteBuffer0.position());
      assertEquals("java.nio.HeapByteBuffer[pos=5 lim=5 cap=5]", byteBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(51);
      Hex hex0 = new Hex();
      hex0.encode(byteBuffer0);
      String string0 = Hex.encodeHexString(byteBuffer0, true);
      assertEquals(0, byteBuffer0.remaining());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Hex hex0 = new Hex();
      Object object0 = hex0.decode((Object) "1000");
      try { 
        hex0.decode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Illegal hexadecimal character \u0010 at index 0
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Hex hex0 = new Hex();
      char[] charArray0 = new char[18];
      ByteBuffer byteBuffer0 = hex0.DEFAULT_CHARSET.encode("");
      char[] charArray1 = Hex.encodeHex(byteBuffer0, charArray0);
      byte[] byteArray0 = Hex.decodeHex(charArray1);
      try { 
        Hex.decodeHex(charArray0, byteArray0, 9);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Output array is not large enough to accommodate decoded data.
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      char[] charArray0 = new char[3];
      try { 
        Hex.decodeHex(charArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Odd number of characters.
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Hex hex0 = new Hex();
      String string0 = hex0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Hex hex0 = new Hex((Charset) null);
      Charset charset0 = hex0.getCharset();
      assertNull(charset0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = Hex.encodeHexString(byteArray0, false);
      assertEquals("000000", string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(51);
      Hex hex0 = new Hex();
      byte[] byteArray0 = hex0.encode(byteBuffer0);
      byte[] byteArray1 = hex0.encode(byteArray0);
      assertEquals(204, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      byte[] byteArray0 = Hex.decodeHex("");
      char[] charArray0 = Hex.encodeHex(byteArray0, false);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(51);
      Hex hex0 = new Hex();
      byte[] byteArray0 = hex0.encode(byteBuffer0);
      String string0 = Hex.encodeHexString(byteArray0);
      //  // Unstable assertion: assertEquals("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Hex hex0 = new Hex();
      String string0 = hex0.getCharsetName();
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(51);
      Hex hex0 = new Hex();
      byte[] byteArray0 = hex0.encode(byteBuffer0);
      char[] charArray0 = Hex.encodeHex(byteArray0, 51, 51, true);
      assertEquals(102, charArray0.length);
      assertEquals(102, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Hex hex0 = new Hex();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)0);
      Object object0 = hex0.decode((Object) byteBuffer0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      char[] charArray0 = Hex.encodeHex(byteArray0, true);
      assertArrayEquals(new char[] {'0', '0', '0', '0', '0', '0'}, charArray0);
      assertEquals(6, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Hex hex0 = null;
      try {
        hex0 = new Hex("2J ,ZKCikGD>");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 2J ,ZKCikGD>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }
}
