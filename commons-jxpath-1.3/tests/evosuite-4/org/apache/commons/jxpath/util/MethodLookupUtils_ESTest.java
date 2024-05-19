
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.util.MethodLookupUtils;
import org.apache.commons.jxpath.util.TypeConverter;
import org.apache.commons.jxpath.util.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MethodLookupUtils_ESTest extends MethodLookupUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<NodeSetContext> class0 = NodeSetContext.class;
      Object[] objectArray0 = new Object[2];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) class0;
      Class<Object> class1 = Object.class;
      Method method0 = MethodLookupUtils.lookupMethod(class1, "", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod(class0, (String) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Class<Object> class0 = Object.class;
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor((Class) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<NodeSetContext> class0 = NodeSetContext.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor(class0, objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[8];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<NodeSetContext> class0 = NodeSetContext.class;
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) methodLookupUtils0;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) class0;
      objectArray0[2] = objectArray0[0];
      Class<NodeSetContext> class1 = NodeSetContext.class;
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      doReturn(objectArray0[2]).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      MethodLookupUtils.lookupMethod(class0, "wait", objectArray0);
      MethodLookupUtils.lookupMethod(class1, (String) null, objectArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "toString", objectArray0);
      assertFalse(method0.isVarArgs());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<NodeSetContext> class0 = NodeSetContext.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "z*U*)50Jk]Cy+G", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      Method method0 = MethodLookupUtils.lookupMethod(class0, "toString", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<NodeSetContext> class0 = NodeSetContext.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "z*U*)50Jk]Cy+G", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "toString", (Object[]) null);
      assertFalse(method0.isBridge());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<Object> class0 = Object.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "~[N#J<eF~]#HM", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<NodeSetContext> class0 = NodeSetContext.class;
      Object[] objectArray0 = new Object[1];
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = (Object) constructor0;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "org.apache.commons.jxpath.util.MethodLookupUtils", objectArray1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[0];
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertEquals("public java.lang.Object()", constructor0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<NodeSetContext> class0 = NodeSetContext.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, (Object[]) null);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) methodLookupUtils0;
      Class<Object> class0 = Object.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "~[N#J<eF~]#HM", objectArray0);
      assertNull(method0);
  }
}
