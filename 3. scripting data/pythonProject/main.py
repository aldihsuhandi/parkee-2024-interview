import pandas as pd

dataframes = []
branches = ['branch_a.csv', 'branch_b.csv', 'branch_c.csv']

for branch in branches:
    dataframe = pd.read_csv(branch)
    dataframes.append(dataframe)

branch_dataframe = pd.concat(dataframes, ignore_index=True)
print(branch_dataframe.columns)

branch_dataframe = branch_dataframe.dropna(subset=['transaction_id', 'date', 'customer_id']).groupby(
    'transaction_id').apply(
    lambda df: df.iloc[df['date'].argmax()])
print(branch_dataframe.values)

total_sales_dataframe = branch_dataframe.groupby('branch').size().to_frame(name='total_sales').reset_index()
print(total_sales_dataframe.columns)
print(total_sales_dataframe.values)
total_sales_dataframe.to_csv('total_sales_per_branch.csv', index=False)
