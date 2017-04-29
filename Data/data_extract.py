#Populate PostgreSQL database with books from CSV

from sqlalchemy import create_engine
import pandas as pd
import psycopg2

df = pd.read_csv('books.csv')
engine = create_engine("postgresql://postgres:2511@localhost:5432/library")
df.to_sql("library", engine)