import pandas as pd
import requests
from tabulate import tabulate

country = 'United States'
base_url = 'http://universities.hipolabs.com/search'

http_response = requests.get(base_url, params={"country": country})
if http_response.status_code != 200:
    exit()

json_body = http_response.content.decode('utf-8')
# print(len(json_body))
universities_data = pd.read_json(json_body).dropna(subset='state-province').drop('alpha_two_code', axis=1)

print(tabulate(universities_data, headers=universities_data.columns, tablefmt='grid', showindex=False))
