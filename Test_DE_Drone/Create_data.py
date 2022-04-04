import pandas as pd
import names
import numpy as np
from random_word import RandomWords
import random


def create_df(n_rows):
    df = pd.DataFrame(index = np.arange(n_rows), columns = ['Nom', 'Score_peace', 'Longitude', 'Latitude', 'Words_heard'])
    return df


def create_list_words(n_words):
    L = []
    for i in range(1,n_words):
        rw = RandomWords()
        a = str(rw.get_random_word())
        L.append(a)
    return L


def create_rows(df):
    for i in range(0,len(df)):
        df['Latitude'][i] = round(random.uniform(-100, 100), 4)
        df['Longitude'][i] = round(random.uniform(-100, 100), 4)
        df['Nom'][i] = names.get_first_name()
        df['Score_peace'][i] = np.random.randint(10,100)
        df['Words_heard'][i] = RandomWords().get_random_words(limit = np.random.randint(3,6))
        print(df['Words_heard'][i])
        print(i)
    return df
    

def final():
    df = create_df(1000)
    df = create_rows(df)
    df.index.names = ['Id']
    df.to_csv('/Users/hatimmanowaraly/Desktop/EFREIM1/Data_Engineering/Project/data.csv')


final()

