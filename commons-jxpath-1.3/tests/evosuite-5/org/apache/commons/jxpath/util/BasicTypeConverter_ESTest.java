
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


package org.apache.commons.jxpath.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import org.apache.commons.jxpath.util.BasicTypeConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BasicTypeConverter_ESTest extends BasicTypeConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicTypeConverter.ValuePointer basicTypeConverter_ValuePointer0 = new BasicTypeConverter.ValuePointer((Object) null);
      Object object0 = basicTypeConverter_ValuePointer0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Class<Byte> class0 = Byte.class;
      // Undeclared exception!
      try { 
        basicTypeConverter0.convertStringToPrimitive((Object) null, class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Byte byte0 = new Byte((byte)0);
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        basicTypeConverter0.convertStringToPrimitive(byte0, class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Byte cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      // Undeclared exception!
      try { 
        basicTypeConverter0.canCreateCollection((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-1));
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      // Undeclared exception!
      try { 
        basicTypeConverter0.canConvert(byte0, (Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      // Undeclared exception!
      try { 
        basicTypeConverter0.allocateCollection((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Object object0 = new Object();
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        basicTypeConverter0.canConvert(object0, class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicTypeConverter.ValuePointer basicTypeConverter_ValuePointer0 = new BasicTypeConverter.ValuePointer("{object of type java.lang.Object}");
      String string0 = basicTypeConverter_ValuePointer0.asPath();
      assertEquals("'{object of type java.lang.Object}'", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-1));
      BasicTypeConverter.ValuePointer basicTypeConverter_ValuePointer0 = new BasicTypeConverter.ValuePointer(byte0);
      String string0 = basicTypeConverter_ValuePointer0.asPath();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicTypeConverter.ValuePointer basicTypeConverter_ValuePointer0 = new BasicTypeConverter.ValuePointer((Object) null);
      String string0 = basicTypeConverter_ValuePointer0.asPath();
      assertEquals("null()", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashSet<Byte> linkedHashSet0 = new LinkedHashSet<Byte>();
      BasicTypeConverter.ValuePointer basicTypeConverter_ValuePointer0 = new BasicTypeConverter.ValuePointer(linkedHashSet0);
      String string0 = basicTypeConverter_ValuePointer0.asPath();
      assertEquals("{object of type java.util.LinkedHashSet}", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      Byte byte0 = new Byte((byte)2);
      linkedList0.addFirst(byte0);
      BasicTypeConverter.ValueNodeSet basicTypeConverter_ValueNodeSet0 = new BasicTypeConverter.ValueNodeSet(linkedList0);
      List list0 = basicTypeConverter_ValueNodeSet0.getPointers();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashSet<Byte> linkedHashSet0 = new LinkedHashSet<Byte>();
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>(linkedHashSet0);
      BasicTypeConverter.ValueNodeSet basicTypeConverter_ValueNodeSet0 = new BasicTypeConverter.ValueNodeSet(linkedList0);
      basicTypeConverter_ValueNodeSet0.getPointers();
      List list0 = basicTypeConverter_ValueNodeSet0.getPointers();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      // Undeclared exception!
      try { 
        basicTypeConverter0.unmodifiableCollection((Collection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      LinkedHashSet<Byte> linkedHashSet0 = new LinkedHashSet<Byte>();
      TreeSet<Byte> treeSet0 = new TreeSet<Byte>(linkedHashSet0);
      Collection collection0 = basicTypeConverter0.unmodifiableCollection(treeSet0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      BasicTypeConverter.ValueNodeSet basicTypeConverter_ValueNodeSet0 = new BasicTypeConverter.ValueNodeSet(linkedList0);
      List list0 = basicTypeConverter_ValueNodeSet0.getPointers();
      Collection collection0 = basicTypeConverter0.unmodifiableCollection(list0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      LinkedHashSet<Byte> linkedHashSet0 = new LinkedHashSet<Byte>();
      Collection collection0 = basicTypeConverter0.unmodifiableCollection(linkedHashSet0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Class<Byte> class0 = Byte.class;
      // Undeclared exception!
      try { 
        basicTypeConverter0.allocateCollection(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create collection of type: class java.lang.Byte; java.lang.Byte
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        basicTypeConverter0.allocateCollection(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create collection of type: byte
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Class<Byte> class0 = Byte.class;
      boolean boolean0 = basicTypeConverter0.canCreateCollection(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Class<Byte> class0 = Byte.TYPE;
      boolean boolean0 = basicTypeConverter0.canCreateCollection(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Class<Byte> class0 = Byte.class;
      Object object0 = basicTypeConverter0.convertNullToPrimitive(class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Class<Byte> class0 = Byte.TYPE;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        basicTypeConverter0.convert(object0, class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      LinkedHashSet<Byte> linkedHashSet0 = new LinkedHashSet<Byte>();
      Class<Byte> class0 = Byte.class;
      Number number0 = basicTypeConverter0.allocateNumber(class0, 240.8);
      BasicTypeConverter.ValuePointer basicTypeConverter_ValuePointer0 = new BasicTypeConverter.ValuePointer(linkedHashSet0);
      linkedHashSet0.add((Byte) number0);
      Object object0 = basicTypeConverter_ValuePointer0.getNode();
      Object object1 = basicTypeConverter0.convert(object0, class0);
      assertEquals((byte) (-16), object1);
      assertNotNull(object1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      LinkedHashSet<Byte> linkedHashSet0 = new LinkedHashSet<Byte>();
      BasicTypeConverter.ValuePointer basicTypeConverter_ValuePointer0 = new BasicTypeConverter.ValuePointer(linkedHashSet0);
      Class<Byte> class0 = Byte.TYPE;
      Object object0 = basicTypeConverter_ValuePointer0.getNode();
      // Undeclared exception!
      try { 
        basicTypeConverter0.convert(object0, class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Class<Byte> class0 = Byte.TYPE;
      Object object0 = basicTypeConverter0.convert((Object) null, class0);
      assertNotNull(object0);
      assertEquals((byte)0, object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Class<Byte> class0 = Byte.class;
      Object object0 = basicTypeConverter0.convert((Object) null, class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-1));
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Class<Byte> class0 = Byte.class;
      Object object0 = basicTypeConverter0.convert(byte0, class0);
      assertEquals((byte) (-1), object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Class<Byte> class0 = Byte.TYPE;
      TreeSet<TreeSet<Byte>> treeSet0 = new TreeSet<TreeSet<Byte>>();
      boolean boolean0 = basicTypeConverter0.canConvert(treeSet0, class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-1));
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Class<Byte> class0 = Byte.class;
      boolean boolean0 = basicTypeConverter0.canConvert(byte0, class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BasicTypeConverter.ValuePointer basicTypeConverter_ValuePointer0 = new BasicTypeConverter.ValuePointer((Object) null);
      Object object0 = basicTypeConverter_ValuePointer0.getRootNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = new Object();
      BasicTypeConverter.ValuePointer basicTypeConverter_ValuePointer0 = new BasicTypeConverter.ValuePointer(object0);
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        basicTypeConverter0.canConvert(basicTypeConverter_ValuePointer0, class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BasicTypeConverter.ValuePointer basicTypeConverter_ValuePointer0 = new BasicTypeConverter.ValuePointer((Object) null);
      // Undeclared exception!
      try { 
        basicTypeConverter_ValuePointer0.setValue((Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-1));
      BasicTypeConverter.ValuePointer basicTypeConverter_ValuePointer0 = new BasicTypeConverter.ValuePointer(byte0);
      Object object0 = new Object();
      int int0 = basicTypeConverter_ValuePointer0.compareTo(object0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashSet<Byte> linkedHashSet0 = new LinkedHashSet<Byte>();
      BasicTypeConverter.ValuePointer basicTypeConverter_ValuePointer0 = new BasicTypeConverter.ValuePointer(linkedHashSet0);
      Object object0 = basicTypeConverter_ValuePointer0.clone();
      assertSame(object0, basicTypeConverter_ValuePointer0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Class<Byte> class0 = Byte.class;
      boolean boolean0 = basicTypeConverter0.canConvert((Object) null, class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      BasicTypeConverter.ValueNodeSet basicTypeConverter_ValueNodeSet0 = new BasicTypeConverter.ValueNodeSet(linkedList0);
      List list0 = basicTypeConverter_ValueNodeSet0.getValues();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      BasicTypeConverter.ValueNodeSet basicTypeConverter_ValueNodeSet0 = new BasicTypeConverter.ValueNodeSet(linkedList0);
      List list0 = basicTypeConverter_ValueNodeSet0.getNodes();
      assertTrue(list0.isEmpty());
  }
}