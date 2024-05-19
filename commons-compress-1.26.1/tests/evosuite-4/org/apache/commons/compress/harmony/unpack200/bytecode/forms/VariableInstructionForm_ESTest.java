
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
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-430), "iflt");
      int[] intArray0 = new int[12];
      intArray0[1] = (-1);
      intArray0[3] = (-430);
      intArray0[2] = (-1);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes(0, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(iflt) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(24, (String) null);
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite4Bytes((-714), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm(null) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(0, "@e");
      int[] intArray0 = new int[9];
      tableSwitchForm0.setRewrite4Bytes((-2712), 0, intArray0);
      assertArrayEquals(new int[] {(-1), 255, 245, 104, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(146, "aload_0");
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes(1315, 146, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(aload_0) with an int at position 146 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-1235), ",9w}ZJ]ze5_Y{v'=C");
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite2Bytes(294, 2537, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(,9w}ZJ]ze5_Y{v'=C) with an int at position 2537 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WideForm wideForm0 = new WideForm(1, "@t-7vgxA'L,AZY");
      int[] intArray0 = new int[3];
      wideForm0.setRewrite2Bytes(1, 1, intArray0);
      assertArrayEquals(new int[] {0, 0, 1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WideForm wideForm0 = new WideForm((-1049), "");
      // Undeclared exception!
      try { 
        wideForm0.setRewrite4Bytes((-3320), (int[]) null);
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
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(0, "@e");
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes(297, 0, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(3, (String) null);
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes(3, 3, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WideForm wideForm0 = new WideForm((-810), "{]6E?9PaHj");
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        wideForm0.setRewrite2Bytes((-3783), 0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(0, "dQEP&\"SI;gz");
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes(0, (-175), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(dQEP&\"SI;gz) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(1661, "iflt");
      int[] intArray0 = new int[16];
      intArray0[1] = (-1);
      intArray0[2] = (-1);
      intArray0[3] = (-1);
      intArray0[4] = (-1);
      tableSwitchForm0.setRewrite4Bytes(1661, intArray0);
      assertEquals((-1), tableSwitchForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(1661, "iflt");
      int[] intArray0 = new int[16];
      intArray0[1] = (-1);
      intArray0[2] = (-1);
      intArray0[3] = (-1);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes(1661, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(iflt) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-13), "");
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite2Bytes((-13), (-13), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm() but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm((-1005), "HcMy$0 UHos'=5K_&8y");
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite2Bytes((-1005), 2469, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }
}
