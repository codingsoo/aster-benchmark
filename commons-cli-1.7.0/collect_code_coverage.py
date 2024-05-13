import pandas as pd

def calculate_coverage(csv_file_path):
    # Read the CSV data into a DataFrame
    df = pd.read_csv(csv_file_path)

    # Calculate total covered and missed for each coverage type
    total_instruction_covered = df['INSTRUCTION_COVERED'].sum()
    total_instruction_missed = df['INSTRUCTION_MISSED'].sum()
    total_branch_covered = df['BRANCH_COVERED'].sum()
    total_branch_missed = df['BRANCH_MISSED'].sum()
    total_line_covered = df['LINE_COVERED'].sum()
    total_line_missed = df['LINE_MISSED'].sum()
    total_method_covered = df['METHOD_COVERED'].sum()
    total_method_missed = df['METHOD_MISSED'].sum()

    # Calculate coverage percentages
    instruction_coverage = total_instruction_covered / (total_instruction_covered + total_instruction_missed)
    branch_coverage = total_branch_covered / (total_branch_covered + total_branch_missed)
    line_coverage = total_line_covered / (total_line_covered + total_line_missed)
    method_coverage = total_method_covered / (total_method_covered + total_method_missed)

    # Print results
    print(f"Instruction Coverage: {instruction_coverage:.2%}")
    print(f"Branch Coverage: {branch_coverage:.2%}")
    print(f"Line Coverage: {line_coverage:.2%}")
    print(f"Method Coverage: {method_coverage:.2%}")

# Example usage, assuming your CSV file is named 'jacoco_report.csv'
csv_file_path = 'target/site/jacoco/jacoco.csv'
calculate_coverage(csv_file_path)
