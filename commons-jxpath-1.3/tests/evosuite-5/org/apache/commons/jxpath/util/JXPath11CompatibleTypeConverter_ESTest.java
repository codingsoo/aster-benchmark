
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
import java.util.LinkedList;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.util.BasicTypeConverter;
import org.apache.commons.jxpath.util.JXPath11CompatibleTypeConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPath11CompatibleTypeConverter_ESTest extends JXPath11CompatibleTypeConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter0 = new JXPath11CompatibleTypeConverter();
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Collection collection0 = jXPath11CompatibleTypeConverter0.unmodifiableCollection(linkedList0);
      linkedList0.add((Object) jXPath11CompatibleTypeConverter0);
      Class<BasicNodeSet> class0 = BasicNodeSet.class;
      basicNodeSet0.getValues();
      Object object0 = new Object();
      Class<Object> class1 = Object.class;
      jXPath11CompatibleTypeConverter0.convertStringToPrimitive(object0, class1);
      Class<Object> class2 = Object.class;
      jXPath11CompatibleTypeConverter0.convert((Object) null, class2);
      Class<Object> class3 = Object.class;
      Object object1 = jXPath11CompatibleTypeConverter0.convert(linkedList0, class3);
      jXPath11CompatibleTypeConverter0.allocateNumber(class0, 1.0);
      linkedList0.offerFirst(object1);
      linkedList0.addAll(collection0);
      jXPath11CompatibleTypeConverter0.canConvert(basicNodeSet0, class0);
      // Undeclared exception!
      try { 
        jXPath11CompatibleTypeConverter0.canConvert(linkedList0, class0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter0 = new JXPath11CompatibleTypeConverter();
      Class<Object> class0 = Object.class;
      Object object0 = new Object();
      jXPath11CompatibleTypeConverter0.convert(object0, class0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      Object object1 = jXPath11CompatibleTypeConverter0.convert(basicNodeSet0, class0);
      // Undeclared exception!
      try { 
        jXPath11CompatibleTypeConverter0.canConvert(object1, (Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.JXPath11CompatibleTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter0 = new JXPath11CompatibleTypeConverter();
      Class<Object> class0 = Object.class;
      Object object0 = new Object();
      Object object1 = new Object();
      jXPath11CompatibleTypeConverter0.convert(object1, class0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      Object object2 = jXPath11CompatibleTypeConverter0.convert(basicNodeSet0, class0);
      jXPath11CompatibleTypeConverter0.canConvert(object2, class0);
      Class<BasicNodeSet> class1 = BasicNodeSet.class;
      // Undeclared exception!
      try { 
        jXPath11CompatibleTypeConverter0.convert(object2, (Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.JXPath11CompatibleTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter0 = new JXPath11CompatibleTypeConverter();
      Class<Object> class0 = Object.class;
      jXPath11CompatibleTypeConverter0.convertNullToPrimitive(class0);
      Class<Object> class1 = Object.class;
      jXPath11CompatibleTypeConverter0.convert((Object) null, class1);
      JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter1 = new JXPath11CompatibleTypeConverter();
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      Object object0 = new Object();
      BasicTypeConverter.ValuePointer basicTypeConverter_ValuePointer0 = new BasicTypeConverter.ValuePointer(object0);
      basicNodeSet0.add((Pointer) basicTypeConverter_ValuePointer0);
      Class<Object> class2 = Object.class;
      BasicNodeSet basicNodeSet1 = new BasicNodeSet();
      basicNodeSet0.add((NodeSet) basicNodeSet1);
      Object object1 = jXPath11CompatibleTypeConverter1.convert(basicNodeSet0, class2);
      Object object2 = jXPath11CompatibleTypeConverter0.convert(object1, class2);
      assertSame(object2, basicNodeSet0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter0 = new JXPath11CompatibleTypeConverter();
      Class<Object> class0 = Object.class;
      Class<Object> class1 = Object.class;
      jXPath11CompatibleTypeConverter0.canCreateCollection(class1);
      jXPath11CompatibleTypeConverter0.allocateNumber(class0, 2210.88979616);
      Object object0 = new Object();
      Class<Object> class2 = Object.class;
      jXPath11CompatibleTypeConverter0.canConvert(object0, class2);
      Class<BasicNodeSet> class3 = BasicNodeSet.class;
      // Undeclared exception!
      try { 
        jXPath11CompatibleTypeConverter0.convert(object0, class3);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter0 = new JXPath11CompatibleTypeConverter();
      Class<Object> class0 = Object.class;
      jXPath11CompatibleTypeConverter0.convertNullToPrimitive(class0);
      jXPath11CompatibleTypeConverter0.convertStringToPrimitive((Object) null, class0);
      Class<Object> class1 = Object.class;
      jXPath11CompatibleTypeConverter0.convert((Object) null, class1);
      jXPath11CompatibleTypeConverter0.convert(class1, class1);
      Class<Object> class2 = Object.class;
      Class<Object> class3 = Object.class;
      jXPath11CompatibleTypeConverter0.convertNullToPrimitive(class3);
      Class<Object> class4 = Object.class;
      jXPath11CompatibleTypeConverter0.canConvert((Object) null, class4);
      jXPath11CompatibleTypeConverter0.canConvert((Object) null, class2);
      jXPath11CompatibleTypeConverter0.convertNullToPrimitive(class2);
      jXPath11CompatibleTypeConverter0.canConvert((Object) null, class0);
      jXPath11CompatibleTypeConverter0.convertNullToPrimitive(class0);
      jXPath11CompatibleTypeConverter0.canConvert((Object) null, class2);
      Class<BasicNodeSet> class5 = BasicNodeSet.class;
      // Undeclared exception!
      try { 
        jXPath11CompatibleTypeConverter0.canConvert(class3, class5);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter0 = new JXPath11CompatibleTypeConverter();
      LinkedList<BasicNodeSet> linkedList0 = new LinkedList<BasicNodeSet>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      linkedList0.containsAll(linkedList1);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      linkedList0.add(basicNodeSet0);
      linkedList0.spliterator();
      jXPath11CompatibleTypeConverter0.unmodifiableCollection(linkedList0);
      Class<BasicNodeSet> class0 = BasicNodeSet.class;
      jXPath11CompatibleTypeConverter0.convertNullToPrimitive(class0);
      jXPath11CompatibleTypeConverter0.canConvert((Object) null, class0);
      Object object0 = new Object();
      Class<Object> class1 = Object.class;
      jXPath11CompatibleTypeConverter0.canConvert((Object) null, class1);
      Class<Object> class2 = Object.class;
      jXPath11CompatibleTypeConverter0.convertStringToPrimitive(object0, class2);
      Class<Object> class3 = Object.class;
      jXPath11CompatibleTypeConverter0.convert((Object) null, class3);
      jXPath11CompatibleTypeConverter0.convert((Object) null, class2);
      Class<Object> class4 = Object.class;
      boolean boolean0 = jXPath11CompatibleTypeConverter0.canConvert((Object) null, class4);
      assertTrue(boolean0);
      
      jXPath11CompatibleTypeConverter0.convert(class3, class1);
      Object object1 = new Object();
      jXPath11CompatibleTypeConverter0.convert(object1, class2);
      Class<Object> class5 = Object.class;
      jXPath11CompatibleTypeConverter0.convert((Object) null, class5);
      BasicNodeSet basicNodeSet1 = new BasicNodeSet();
      BasicNodeSet basicNodeSet2 = new BasicNodeSet();
      Class<Object> class6 = Object.class;
      jXPath11CompatibleTypeConverter0.convertStringToPrimitive(basicNodeSet2, class6);
      BasicNodeSet basicNodeSet3 = new BasicNodeSet();
      Class<Object> class7 = Object.class;
      jXPath11CompatibleTypeConverter0.convertStringToPrimitive(basicNodeSet3, class7);
      BasicTypeConverter.ValuePointer basicTypeConverter_ValuePointer0 = new BasicTypeConverter.ValuePointer((Object) null);
      basicNodeSet1.remove(basicTypeConverter_ValuePointer0);
      BasicTypeConverter.ValuePointer basicTypeConverter_ValuePointer1 = new BasicTypeConverter.ValuePointer((Object) null);
      basicNodeSet1.remove(basicTypeConverter_ValuePointer1);
      boolean boolean1 = jXPath11CompatibleTypeConverter0.canConvert(basicNodeSet1, class5);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter0 = new JXPath11CompatibleTypeConverter();
      Class<Object> class0 = Object.class;
      Object object0 = new Object();
      jXPath11CompatibleTypeConverter0.convert(object0, class0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      Object object1 = jXPath11CompatibleTypeConverter0.convert(basicNodeSet0, class0);
      jXPath11CompatibleTypeConverter0.canConvert(object1, class0);
      Class<BasicNodeSet> class1 = BasicNodeSet.class;
      jXPath11CompatibleTypeConverter0.convert(object1, class1);
      // Undeclared exception!
      try { 
        jXPath11CompatibleTypeConverter0.canConvert(object0, class1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }
}
