
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


package org.apache.commons.jxpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.PackageFunctions;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.TypeConverter;
import org.apache.commons.jxpath.util.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PackageFunctions_ESTest extends PackageFunctions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("p;_=@B5~oe@kD/!b", "");
      Object[] objectArray0 = new Object[8];
      TypeUtils.setTypeConverter((TypeConverter) null);
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction("", "p;_=@B5~oe@kD/!b", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("", (String) null);
      Object[] objectArray0 = new Object[6];
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction((String) null, "1n0`DQ6tybL.2kFaO=", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function 1n0`DQ6tybL.2kFaO=; Class '1n0`DQ6tybL.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("{", "{");
      Object[] objectArray0 = new Object[1];
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      QName qName0 = new QName("ZL'>!NO.*dQc7qP(w");
      Locale locale0 = Locale.CHINA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, basicNodeSet0, locale0);
      basicNodeSet0.add((Pointer) nodePointer0);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(objectArray0[0], (Object) null).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      packageFunctions0.getFunction("{", "{", objectArray0);
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction("{", "org.apache.commons.jxpath.PackageFunctions", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function {:org.apache.commons.jxpath.PackageFunctions; Class '{org/apache/commons/jxpath.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("{", "{");
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(object0).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Function function0 = packageFunctions0.getFunction("{", "{", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("{", "{");
      Object[] objectArray0 = new Object[1];
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(objectArray0[0], basicNodeSet0).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      packageFunctions0.getFunction("{", "{", objectArray0);
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction("{", "org.apache.commons.jxpath.PackageFunctions", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function {:org.apache.commons.jxpath.PackageFunctions; Class '{org/apache/commons/jxpath.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("{", "{");
      Set set0 = packageFunctions0.getUsedNamespaces();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) set0;
      Function function0 = packageFunctions0.getFunction("{", "{", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("-W`I`K[", "-W`I`K[");
      Function function0 = packageFunctions0.getFunction("-W`I`K[", "-W`I`K[", (Object[]) null);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("1", "'z{E%eFtED%jnV6");
      Object[] objectArray0 = new Object[7];
      Function function0 = packageFunctions0.getFunction((String) null, (String) null, objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("1", "'z{E%eFtED%jnV6");
      Object[] objectArray0 = new Object[7];
      Function function0 = packageFunctions0.getFunction("", "", objectArray0);
      assertNull(function0);
  }
}
