"""This code won't run since the AAPL.csv is not available on this device"""

import pandas as pd


def test_run():
    """Function called by Test Run."""
    df = pd.read_csv("data/AAPL.csv")
    # TODO: Print last 5 rows of the data frame
    print(df.tail())
    # df.tail() stands for the 5 last rows of the data frame
    # df.tail(n) stands for the n last rows of the data frame
    # df.head() stands for the 5 first rows of the data frame
    # df stands for all the rows of the data frame

if __name__ == "__main__":
    test_run()


