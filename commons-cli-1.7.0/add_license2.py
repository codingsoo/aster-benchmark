import os

# Define the directory where the .java files are located
directory = "src/test/java/org/apache/commons/cli"

# Define the new license text to be inserted
new_license_text = """
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
"""

# Function to update the license in a .java file
def update_license_in_file(file_path):
    try:
        # Read the existing content of the file
        with open(file_path, 'r', encoding='utf-8') as file:
            content = file.read()
        content = content.replace(", separateClassLoader = true", "")
        # Find the first occurrence of '/*' and replace it
        start_index = content.find('/*')
        if start_index != -1:
            end_index = content.find('*/', start_index) + 2
            new_content = content[:start_index] + new_license_text + content[end_index:]

            # Write the new content back to the file
            with open(file_path, 'w', encoding='utf-8') as file:
                file.write(new_content)
            return True
        else:
            return False
    except Exception as e:
        print(f"Error processing file {file_path}: {e}")
        return False

# Walk through the directory and update all .java files
def update_java_files(directory):
    updated_files = 0
    for root, dirs, files in os.walk(directory):
        for file in files:
            if file.endswith('.java'):
                file_path = os.path.join(root, file)
                if update_license_in_file(file_path):
                    updated_files += 1

    return updated_files

# Run the update function and print the result
total_updated = update_java_files(directory)
print(f"Total .java files updated: {total_updated}")

