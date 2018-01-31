"""This code won't run since csv files are not available on this device"""

import pandas as pd

def get_max_close(symbol):
    """Return the maximum closing value for stock indicated by symbol.
    Note: Data for a stock is stored in file: data/<symbol>.csv
    """
    df = pd.read_csv("data/{}.csv".format(symbol)) #read in data
    return df['Close'].max() #compute and return max

def get_mean_volume(symbol):
    """Return the mean volume for stock indicated by symbol.
        Note: Data for a stock is stored in file: data/<symbol>.csv
        """
    df = pd.read_csv("data/{}.csv".format(symbol))  # read in data
    # TODO: Compute and return the mean volume for this stock
    return df['Volume'].mean()

def test_run():
    """Function called by Test Run."""
    for symbol in ['AAPL', 'IBM']:
        print('Max Close')
        print(symbol, get_max_close(symbol))
        print("Mean Volume")
        print(symbol, get_mean_volume(symbol))

if __name__ == "__main__":
    test_run()


