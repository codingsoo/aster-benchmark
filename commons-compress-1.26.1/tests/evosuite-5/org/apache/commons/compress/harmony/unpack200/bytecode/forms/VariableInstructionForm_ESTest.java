
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


package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class VariableInstructionForm_ESTest extends VariableInstructionForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(222, "");
      int[] intArray0 = new int[4];
      intArray0[0] = (-1);
      intArray0[1] = (-2002);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite4Bytes((-1), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm() but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(2784, "V");
      int[] intArray0 = new int[6];
      intArray0[1] = (-2787);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes(2784, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(V) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WideForm wideForm0 = new WideForm(3541, "Af*rB%qTn*`JMx");
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        wideForm0.setRewrite4Bytes(0, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm(Af*rB%qTn*`JMx) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WideForm wideForm0 = new WideForm(72, "");
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        wideForm0.setRewrite4Bytes(141, 65280, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm() with an int at position 65280 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(59, "");
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite2Bytes(1, 59, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm() with an int at position 59 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WideForm wideForm0 = new WideForm(0, "h]V5YOV9$PS-");
      int[] intArray0 = new int[9];
      wideForm0.setRewrite2Bytes(2055, 0, intArray0);
      assertArrayEquals(new int[] {8, 7, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(2579, (String) null);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes(2579, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WideForm wideForm0 = new WideForm(0, "");
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        wideForm0.setRewrite4Bytes(0, 0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(155, "");
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite2Bytes(155, 155, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-3), " but there is no room for 4 bytes");
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes((-3), (-3), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm( but there is no room for 4 bytes) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[11];
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-3168), "6sX1}h&g`|U\"%=");
      tableSwitchForm0.setRewrite4Bytes((-3168), 0, intArray0);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes((-3168), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(6sX1}h&g`|U\"%=) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WideForm wideForm0 = new WideForm(0, "h]V5YOV9$PS-");
      // Undeclared exception!
      try { 
        wideForm0.setRewrite4Bytes((-19), 24, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(0, "?q(D1Wu;Z`-PO");
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite2Bytes(0, 0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(222, "");
      int[] intArray0 = new int[12];
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite2Bytes(222, (-1718), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm() but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }
}
