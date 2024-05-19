
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
import org.apache.commons.codec.binary.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = StringUtils.equals((CharSequence) "\u01FF\u997D", (CharSequence) charBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = StringUtils.newStringUtf8((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be(": ");
      String string0 = StringUtils.newStringUtf8(byteArray0);
      assertEquals("\u0000:\u0000 ", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      String string0 = StringUtils.newStringUtf16Le(byteArray0);
      assertEquals("\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = StringUtils.newStringUtf16Be((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = StringUtils.newStringUtf16(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = StringUtils.newStringUsAscii((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be("");
      String string0 = StringUtils.newStringUsAscii(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = StringUtils.newStringIso8859_1((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf8((String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Le((String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Le("");
      String string0 = StringUtils.newStringUtf16Be(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be(": ");
      String string0 = StringUtils.newStringUtf16(byteArray0);
      assertEquals(": ", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be("");
      String string0 = StringUtils.newStringIso8859_1(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16((String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16("Sw Dr8VR.8");
      assertEquals(22, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUsAscii("Sw Dr8VR.8");
      assertEquals(10, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUsAscii("");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesIso8859_1((String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesIso8859_1("");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        StringUtils.newString(byteArray0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringUtils.getBytesUnchecked("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = StringUtils.newString((byte[]) null, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUnchecked((String) null, (String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringUtils.getBytesUnchecked("\u4E47\u5349\u2665\u4055\u6120", "NGSI&e@Ua ");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // NGSI&e@Ua : java.io.UnsupportedEncodingException: NGSI&e@Ua 
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteBuffer byteBuffer0 = StringUtils.getByteBufferUtf8("");
      assertFalse(byteBuffer0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = StringUtils.equals((CharSequence) "\uFFFD", (CharSequence) charBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) ":Y~kk3k");
      boolean boolean0 = StringUtils.equals((CharSequence) "\u0000\u0000\u001D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", (CharSequence) charBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      boolean boolean0 = StringUtils.equals((CharSequence) charBuffer0, (CharSequence) "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = StringUtils.equals((CharSequence) "", (CharSequence) "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = StringUtils.equals((CharSequence) null, (CharSequence) "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = StringUtils.equals((CharSequence) null, (CharSequence) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = StringUtils.equals((CharSequence) "NGSI&e@Ua ", (CharSequence) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf8("");
      String string0 = StringUtils.newStringUtf8(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16("");
      String string0 = StringUtils.newStringUtf16Le(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ByteBuffer byteBuffer0 = StringUtils.getByteBufferUtf8((String) null);
      assertNull(byteBuffer0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringUtils stringUtils0 = new StringUtils();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesIso8859_1("NGSI&e@Ua ");
      assertEquals(10, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = StringUtils.newStringUtf16((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf8("NGSI&e@Ua ");
      String string0 = StringUtils.newStringUtf16Be(byteArray0);
      assertEquals("\u4E47\u5349\u2665\u4055\u6120", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = StringUtils.newStringUtf16Le((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUsAscii((String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf8("NGSI&e@Ua ");
      String string0 = StringUtils.newStringIso8859_1(byteArray0);
      assertEquals("NGSI&e@Ua ", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf8("NGSI&e@Ua ");
      String string0 = StringUtils.newStringUsAscii(byteArray0);
      assertEquals("NGSI&e@Ua ", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Le(".qpAtJ.3{<");
      // Undeclared exception!
      try { 
        StringUtils.newString(byteArray0, ".qpAtJ.3{<");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // .qpAtJ.3{<: java.io.UnsupportedEncodingException: .qpAtJ.3{<
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be((String) null);
      assertNull(byteArray0);
  }
}
