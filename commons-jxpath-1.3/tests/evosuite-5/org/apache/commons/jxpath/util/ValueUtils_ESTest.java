
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
import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.apache.commons.jxpath.util.ValueUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ValueUtils_ESTest extends ValueUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException((String) null);
      IndexOutOfBoundsException indexOutOfBoundsException1 = new IndexOutOfBoundsException();
      ValueUtils.setValue((Object) indexOutOfBoundsException0, 0, (Object) indexOutOfBoundsException1);
      assertNotSame(indexOutOfBoundsException0, indexOutOfBoundsException1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        ValueUtils.remove(object0, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No such element at index 1
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        ValueUtils.expandCollection(object0, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.Object into a collection of size 1
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = ValueUtils.getValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException();
      // Undeclared exception!
      try { 
        ValueUtils.setValue((Object) indexOutOfBoundsException0, (PropertyDescriptor) null, (-1), (Object) indexOutOfBoundsException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) null, (PropertyDescriptor) null, 2668);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueUtils.getIndexedPropertyLength((Object) null, (IndexedPropertyDescriptor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        ValueUtils.getDynamicPropertyHandler(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot allocate dynamic property handler of class java.lang.annotation.Annotation; java.lang.annotation.Annotation
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueUtils.getCollectionHint((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Method method0 = ValueUtils.getAccessibleMethod((Method) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException();
      IndexOutOfBoundsException indexOutOfBoundsException1 = (IndexOutOfBoundsException)ValueUtils.getValue((Object) indexOutOfBoundsException0);
      assertNull(indexOutOfBoundsException1.getMessage());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException();
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) indexOutOfBoundsException0, (PropertyDescriptor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueUtils.getDynamicPropertyHandler((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      IndexedPropertyDescriptor indexedPropertyDescriptor0 = new IndexedPropertyDescriptor("<<undefined source>>", (Method) null, (Method) null, (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.setValue(object0, (PropertyDescriptor) indexedPropertyDescriptor0, 1, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot access property: java.lang.Object.<<undefined source>>; No read method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IndexedPropertyDescriptor indexedPropertyDescriptor0 = new IndexedPropertyDescriptor("o8L", (Method) null, (Method) null, (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) null, (PropertyDescriptor) indexedPropertyDescriptor0, 593);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot access property: null.o8L; No read method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueUtils.setValue((Object) null, (PropertyDescriptor) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PropertyDescriptor propertyDescriptor0 = new PropertyDescriptor("Cannot create collection of type: ", (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.setValue((Object) ",*a(//SdC", propertyDescriptor0, (Object) "Cannot create collection of type: ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot modify property: java.lang.String.Cannot create collection of type: ; No write method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IndexedPropertyDescriptor indexedPropertyDescriptor0 = new IndexedPropertyDescriptor("rD%gTZKO!&", (Method) null, (Method) null, (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) null, (PropertyDescriptor) indexedPropertyDescriptor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot access property: null.rD%gTZKO!&; No read method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ValueUtils.setValue((Object) null, (-287), (Object) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<IndexOutOfBoundsException> class0 = IndexOutOfBoundsException.class;
      Class class1 = (Class)ValueUtils.getValue((Object) class0, 0);
      assertFalse(class1.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = ValueUtils.getValue((Object) null, 280);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException();
      // Undeclared exception!
      try { 
        ValueUtils.remove(indexOutOfBoundsException0, 2336);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No such element at index 2336
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = ValueUtils.remove((Object) null, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ValueUtils valueUtils0 = new ValueUtils();
      // Undeclared exception!
      try { 
        ValueUtils.remove(valueUtils0, (-511));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot remove org.apache.commons.jxpath.util.ValueUtils[-511]
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueUtils.expandCollection((byte)13, (byte)10);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.Byte into a collection of size 10
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object object0 = ValueUtils.expandCollection((Object) null, 1811);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ValueUtils valueUtils0 = new ValueUtils();
      // Undeclared exception!
      try { 
        ValueUtils.expandCollection(valueUtils0, (-28));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // adjustment of org.apache.commons.jxpath.util.ValueUtils@1 to size -28 is not an expansion
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Iterator iterator0 = ValueUtils.iterate((Object) null);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException();
      Iterator iterator0 = ValueUtils.iterate(indexOutOfBoundsException0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = ValueUtils.getLength((Object) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      int int0 = ValueUtils.getLength(object0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = new Object();
      IndexedPropertyDescriptor indexedPropertyDescriptor0 = new IndexedPropertyDescriptor("8+Vi:C;h", (Method) null, (Method) null, (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.getIndexedPropertyLength(object0, indexedPropertyDescriptor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No indexed read method for property 8+Vi:C;h
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      int int0 = ValueUtils.getCollectionHint(class0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<IndexOutOfBoundsException> class0 = IndexOutOfBoundsException.class;
      int int0 = ValueUtils.getCollectionHint(class0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = ValueUtils.isCollection((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ValueUtils valueUtils0 = new ValueUtils();
      boolean boolean0 = ValueUtils.isCollection(valueUtils0);
      assertFalse(boolean0);
  }
}
